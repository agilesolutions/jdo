package ch.agilesolutions.jboss.process;

import java.io.InputStream;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

import org.slf4j.Logger;

import ch.agilesolutions.jboss.data.ProfileDao;
import ch.agilesolutions.jboss.model.Datasource;
import ch.agilesolutions.jboss.model.Driver;
import ch.agilesolutions.jboss.model.Environment;
import ch.agilesolutions.jboss.model.Profile;
import ch.agilesolutions.jboss.model.SystemProperty;

@Stateless
public class ImportXML {

	@Inject
	private ProfileDao profileDao;

	@Inject
	private Logger logger;

	public String importProfile(InputStream is, String profileName, String domainName, String host) {

		StringBuilder consoleOutput = new StringBuilder();

		Profile profile = new Profile();

		profile.setDomain(domainName);
		profile.setName(profileName);
		profile.setDescription(String.format("%s@%s", domainName, host));
		profile.setHostName(host);
		profile.setEnvironment(Environment.SIT.name());

		try {

			XMLInputFactory xmlif = XMLInputFactory.newInstance();
			xmlif.setProperty(XMLInputFactory.IS_REPLACING_ENTITY_REFERENCES, Boolean.TRUE);
			xmlif.setProperty(XMLInputFactory.IS_SUPPORTING_EXTERNAL_ENTITIES, Boolean.FALSE);
			// set the IS_COALESCING property to true to get whole text data as one event.
			xmlif.setProperty(XMLInputFactory.IS_COALESCING, Boolean.TRUE);

			try {
				XMLEventReader eventReader = null;

				eventReader = xmlif.createXMLEventReader("standalone.xml", is);

				// iterate as long as there are more events on the input stream
				while (eventReader.hasNext()) {

					XMLEvent event = eventReader.nextEvent();
					if (event.isStartElement()) {
						if (hasStartTagName(event, "driver")) {
							processDriver(profile, eventReader, event, consoleOutput);
						} else if (hasStartTagName(event, "datasource")) {
							processDatasource(profile, eventReader, event, consoleOutput);
						} else if (hasStartTagName(event, "xa-datasource")) {
							processXADatasource(profile, eventReader, event, consoleOutput);
						} else if (hasStartTagName(event, "system-properties")) {
							processSystemProperties(profile, eventReader, event, consoleOutput);
							// } else if (hasStartTagName(event, "mail-session")) {
							// processMailSession(synchronizedMaster, eventReader, event, consoleOutput);
						}
					}
				}

				profileDao.save(profile, String.format("New profile %s imported through standalone.xml", profile.getName()));

			} catch (XMLStreamException ex) {
				System.out.println(ex.getMessage());

				if (ex.getNestedException() != null) {
					ex.getNestedException().printStackTrace();
				}
			}

		} catch (Exception ex) {
			throw new IllegalStateException(ex);
		}
		
		return consoleOutput.toString();
		
	}

	private boolean hasStartTagName(XMLEvent e, String name) {
		return e.asStartElement().getName().getLocalPart().equals(name);
	}

	private boolean hasEndTagName(XMLEvent e, String name) {
		return e.asEndElement().getName().getLocalPart().equals(name);
	}

	/**
	 * 
	 * parse Driver elements.
	 * 
	 * @param rdr
	 *            event stream.
	 * @param event
	 *            on start XML element for Driver.
	 * @throws Exception
	 *             any STAX exception occurred.
	 */
	private void processDriver(Profile profile, XMLEventReader rdr, XMLEvent event, StringBuilder consoleOutput) throws Exception {

		Driver driver = new Driver();

		driver.setName(getAttribute(event, "name"));

		driver.setDescription(getAttribute(event, "name"));

		driver.setModuleName(getAttribute(event, "module"));

		while (rdr.hasNext()) {
			XMLEvent e = rdr.nextEvent();

			if (e.isStartElement()) {
				// process attributes
				if (hasStartTagName(e, "xa-datasource-class")) {
					driver.setClassName(getCharacters(rdr));
					// process elements
					while (rdr.hasNext()) {
						XMLEvent classEvent = rdr.nextEvent();
						if (classEvent.isEndElement()) {
							if (hasEndTagName(classEvent, "xa-datasource-class")) {
								break;
							}
						}

					}

				}
			}

			if (e.isEndElement()) {
				if (hasEndTagName(e, "driver")) {
					break;
				}
			}
		}
		// only persist if there is no existing driver with same module name
		if (!profile.getDrivers().contains(driver)) {
			consoleOutput.append("Imported driver : " + driver.getName() + "\n");
			profile.getDrivers().add(driver);
		}

	}

	private String getAttribute(XMLEvent event, String name) {
		return ((StartElement) event).getAttributeByName(new QName(name)).getValue();
	}

	private String getCharacters(XMLEventReader rdr) throws XMLStreamException {
		XMLEvent e = rdr.nextEvent();
		if (e.isCharacters()) {
			return e.asCharacters().getData();
		} else {
			return null;
		}
	}

	/**
	 * 
	 * Parse system property elements.
	 * 
	 * @param rdr
	 *            event stream.
	 * @param event
	 *            on start XML element for system property.
	 * @throws Exception
	 *             any STAX exception occurred.
	 */
	private void processSystemProperties(Profile profile, XMLEventReader rdr, XMLEvent event, StringBuilder consoleOutput) throws Exception {


		while (rdr.hasNext()) {
			XMLEvent e = rdr.nextEvent();

			if (e.isStartElement()) {
				// process attributes
				if (hasStartTagName(e, "property")) {

					if (getAttribute(e, "name") != null) {
						SystemProperty systemProperty = new SystemProperty();

						systemProperty.setName(getAttribute(e, "name"));

						systemProperty.setValue(getAttribute(e, "value"));
						// only persist if there is no existing property with same name
						if (!profile.getSystemProperties().contains(systemProperty)) {
							profile.getSystemProperties().add(systemProperty);
							consoleOutput.append("Imported systemproperty : " + systemProperty.getName() + "\n");
						}

					}
				}
			}

			if (e.isEndElement()) {
				if (hasEndTagName(e, "system-properties")) {
					break;
				}
			}
		}

	}

	/**
	 * 
	 * Parse datasource elements.
	 * 
	 * @param rdr
	 *            event stream.
	 * @param event
	 *            on start XML element for datasource.
	 * @throws Exception
	 *             any STAX exception occurred.
	 */
	private void processDatasource(Profile profile, XMLEventReader rdr, XMLEvent event, StringBuilder consoleOutput) throws Exception {

		Datasource datasource = new Datasource();

		datasource.setJndiName(getAttribute(event, "jndi-name"));

		datasource.setName(getAttribute(event, "pool-name"));

		while (rdr.hasNext()) {
			XMLEvent e = rdr.nextEvent();

			if (e.isStartElement()) {
				// process attributes
				if (hasStartTagName(e, "connection-url")) {
					datasource.setUrl(getCharacters(rdr));

				} else if (hasStartTagName(e, "datasource-class")) {
					datasource.setDatasourceClass(getCharacters(rdr));
				} else if (hasStartTagName(e, "driver")) {
					datasource.setDriver(getCharacters(rdr));
				} else if (hasStartTagName(e, "security")) {
					// process elements
					while (rdr.hasNext()) {
						XMLEvent securityEvent = rdr.nextEvent();
						if (securityEvent.isStartElement()) {
							if (hasStartTagName(securityEvent, "user-name")) {
								datasource.setUserName(getCharacters(rdr));
							}
							if (hasStartTagName(securityEvent, "password")) {
								datasource.setPassword(encryptPassword(getCharacters(rdr)));
							}
						}
						if (securityEvent.isEndElement()) {
							if (hasEndTagName(securityEvent, "security")) {
								break;
							}
						}

					}

				}
			}

			if (e.isEndElement()) {
				if (hasEndTagName(e, "datasource")) {
					break;
				}
			}
		}
		// only persist if there is no existing datasource with same jndi name
		if (!profile.getDatasources().contains(datasource)) {
			consoleOutput.append("Imported datasource  : " + datasource.getJndiName() + "\n");
			profile.getDatasources().add(datasource);
		}

	}

	/**
	 * 
	 * Parse XA datasource elements.
	 * 
	 * @param rdr
	 *            event stream.
	 * @param event
	 *            on start XML element for XA datasource.
	 * @throws Exception
	 *             any STAX exception occurred.
	 */
	private void processXADatasource(Profile profile, XMLEventReader rdr, XMLEvent event, StringBuilder consoleOutput) throws Exception {

		Datasource datasource = new Datasource();

		datasource.setJndiName(getAttribute(event, "jndi-name"));

		datasource.setName(getAttribute(event, "pool-name"));

		while (rdr.hasNext()) {
			XMLEvent e = rdr.nextEvent();

			if (e.isStartElement()) {
				// process attributes
				if (hasStartTagName(e, "xa-datasource-property")) {
					datasource.setUrl(getCharacters(rdr).trim());
				} else if (hasStartTagName(e, "xa-datasource-class")) {
					datasource.setDatasourceClass(getCharacters(rdr));
				} else if (hasStartTagName(e, "driver")) {
					datasource.setDriver(getCharacters(rdr));
				} else if (hasStartTagName(e, "security")) {
					// process elements
					while (rdr.hasNext()) {
						XMLEvent securityEvent = rdr.nextEvent();
						if (securityEvent.isStartElement()) {
							if (hasStartTagName(securityEvent, "security-domain")) {
								System.out.println("security-domain : " + getCharacters(rdr));
							}
							if (hasStartTagName(securityEvent, "user-name")) {
								datasource.setUserName(getCharacters(rdr));
							}
							if (hasStartTagName(securityEvent, "password")) {
								datasource.setPassword(encryptPassword(getCharacters(rdr)));
							}
						}
						if (securityEvent.isEndElement()) {
							if (hasEndTagName(securityEvent, "security")) {
								break;
							}
						}

					}

				}
			}

			if (e.isEndElement()) {
				if (hasEndTagName(e, "xa-datasource")) {
					break;
				}
			}
		}

		// only persist if there is no existing datasource with same jndi name
		if (!profile.getDatasources().contains(datasource)) {
			consoleOutput.append("Imported XA datasource : " + datasource.getJndiName() + "\n");
			profile.getDatasources().add(datasource);
		}

	}

	/**
	 * 
	 * 
	 * @param rdr
	 *            event stream.
	 * @param event
	 *            on start XML element for smtp server.
	 * @throws Exception
	 *             any STAX exception occurred.
	 */
	private void processMailSession(Profile profile, XMLEventReader rdr, XMLEvent event, StringBuilder consoleOutput) throws Exception {

		while (rdr.hasNext()) {
			XMLEvent e = rdr.nextEvent();

			if (e.isStartElement()) {
				// process attributes
				if (hasStartTagName(e, "smtp-server")) {
					consoleOutput.append("Imported SMPT server for : " + getAttribute(e, "outbound-socket-binding-ref") + "\n");
					System.out.println("outbound-socket-binding-ref : " + getAttribute(e, "outbound-socket-binding-ref"));
					// System.out.println("tls : " + getAttribute(e, "tls"));

				}
				if (hasStartTagName(e, "login")) {
					System.out.println("name : " + getAttribute(e, "name"));
					System.out.println("password : " + getAttribute(e, "password"));

				}
			}

			if (e.isEndElement()) {
				if (hasEndTagName(e, "smtp-server")) {
					break;
				}
			}
		}
	}

	private String encryptPassword(String password) {

		byte kbytes[] = "jaas is the way".getBytes();
		SecretKeySpec key = new SecretKeySpec(kbytes, "Blowfish");
		Cipher cipher;
		try {
			cipher = Cipher.getInstance("Blowfish");
			cipher.init(1, key);
			byte encoding[] = cipher.doFinal(password.getBytes());
			BigInteger n = new BigInteger(encoding);
			return n.toString(16);
		} catch (NoSuchAlgorithmException e) {
			logger.error("NoSuchAlgorithmException : ", e);
			throw new IllegalStateException(e);
		} catch (NoSuchPaddingException e) {
			logger.error("NoSuchPaddingExceptionn : ", e);
			throw new IllegalStateException(e);
		} catch (InvalidKeyException e) {
			logger.error("InvalidKeyException : ", e);
			throw new IllegalStateException(e);
		} catch (IllegalBlockSizeException e) {
			logger.error("IllegalBlockSizeException : ", e);
			throw new IllegalStateException(e);
		} catch (BadPaddingException e) {
			logger.error("BadPaddingException : ", e);
			throw new IllegalStateException(e);
		}
	}
}
