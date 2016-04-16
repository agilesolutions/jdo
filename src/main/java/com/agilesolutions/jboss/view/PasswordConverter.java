package com.agilesolutions.jboss.view;


import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;

import org.slf4j.Logger;

/**
 * 
 * Password JBoss encryption converter, code logic copied from JBoss picket jar files.
 * 
 * @author u24279
 *
 */
@FacesConverter("PasswordConverter")
public class PasswordConverter implements Converter {
	
	@Inject
	Logger LOGGER;


	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String secret) {
		byte kbytes[] = "jaas is the way".getBytes();
		SecretKeySpec key = new SecretKeySpec(kbytes, "Blowfish");
		Cipher cipher;
		try {
			cipher = Cipher.getInstance("Blowfish");
			cipher.init(1, key);
			byte encoding[] = cipher.doFinal(secret.getBytes());
			BigInteger n = new BigInteger(encoding);
			return n.toString(16);
		} catch (NoSuchAlgorithmException e) {
			LOGGER.error("NoSuchAlgorithmException : ", e);
			throw new IllegalStateException(e);
		} catch (NoSuchPaddingException e) {
			LOGGER.error("NoSuchPaddingExceptionn : ", e);
			throw new IllegalStateException(e);
		} catch (InvalidKeyException e) {
			LOGGER.error("InvalidKeyException : ", e);
			throw new IllegalStateException(e);
		} catch (IllegalBlockSizeException e) {
			LOGGER.error("IllegalBlockSizeException : ", e);
			throw new IllegalStateException(e);
		} catch (BadPaddingException e) {
			LOGGER.error("BadPaddingException : ", e);
			throw new IllegalStateException(e);
		}
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object value) {
		
		if (value.toString().length()==0) {
			return "";
		}
		
		byte kbytes[] = "jaas is the way".getBytes();
		SecretKeySpec key = new SecretKeySpec(kbytes, "Blowfish");
		BigInteger n = new BigInteger(value.toString(), 16);
		byte encoding[] = n.toByteArray();
		if (encoding.length % 8 != 0) {
			int length = encoding.length;
			int newLength = (length / 8 + 1) * 8;
			int pad = newLength - length;
			byte old[] = encoding;
			encoding = new byte[newLength];
			for (int i = old.length - 1; i >= 0; i--) {
				encoding[i + pad] = old[i];
			}

			if (n.signum() == -1) {
				for (int i = 0; i < newLength - length; i++) {
					encoding[i] = -1;
				}

			}
		}
		Cipher cipher;
		try {
			cipher = Cipher.getInstance("Blowfish");
			cipher.init(2, key);
			byte decode[] = cipher.doFinal(encoding);
			return new String(decode);
		} catch (NoSuchAlgorithmException e) {
			LOGGER.error("NoSuchAlgorithmException : ", e);
			throw new IllegalStateException(e);
		} catch (NoSuchPaddingException e) {
			LOGGER.error("NoSuchPaddingExceptionn : ", e);
			throw new IllegalStateException(e);
		} catch (InvalidKeyException e) {
			LOGGER.error("InvalidKeyException : ", e);
			throw new IllegalStateException(e);
		} catch (IllegalBlockSizeException e) {
			LOGGER.error("IllegalBlockSizeException : ", e);
			throw new IllegalStateException(e);
		} catch (BadPaddingException e) {
			LOGGER.error("BadPaddingException : ", e);
			throw new IllegalStateException(e);
		}
	}

}
