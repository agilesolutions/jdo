package ch.agilesolutions.jboss.view;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;
import javax.el.ExpressionFactory;
import javax.el.MethodExpression;
import javax.el.ValueExpression;
import javax.enterprise.context.SessionScoped;
import javax.faces.FacesException;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.component.UISelectItems;
import javax.faces.component.UIViewRoot;
import javax.faces.component.html.HtmlInputSecret;
import javax.faces.context.FacesContext;
import javax.faces.event.AjaxBehaviorEvent;
import javax.inject.Inject;
import javax.inject.Named;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang.WordUtils;
import org.primefaces.component.autocomplete.AutoComplete;
import org.primefaces.component.outputlabel.OutputLabel;
import org.primefaces.component.selectbooleancheckbox.SelectBooleanCheckbox;
import org.primefaces.component.selectonemenu.SelectOneMenu;
import org.primefaces.context.RequestContext;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.event.NodeSelectEvent;
import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;

import ch.agilesolutions.jboss.data.DomainDao;
import ch.agilesolutions.jboss.data.HpsmDao;
import ch.agilesolutions.jboss.data.JiraDao;
import ch.agilesolutions.jboss.data.NexusDao;
import ch.agilesolutions.jboss.data.ProfileDao;
import ch.agilesolutions.jboss.model.Artefact;
import ch.agilesolutions.jboss.model.Deployment;
import ch.agilesolutions.jboss.model.Domains;
import ch.agilesolutions.jboss.model.Environment;
import ch.agilesolutions.jboss.model.JiraProject;
import ch.agilesolutions.jboss.model.JiraTicket;
import ch.agilesolutions.jboss.model.Profile;
import ch.agilesolutions.jboss.model.Tree;
import ch.agilesolutions.jboss.process.ImportJson;
import ch.agilesolutions.jboss.process.ImportXML;
import ch.agilesolutions.jboss.process.Packager;
import ch.agilesolutions.jboss.process.TemplateProcessor;
import ch.agilesolutions.jboss.util.Reflect;

/**
 * managed bean handling JBoss profile page CRUD.
 * 
 * @author as
 */
@Named
@SessionScoped
public class ProfileController extends AbstractController implements Serializable {

	// --- Fields

	private static final long serialVersionUID = 1L;

	@Inject
	private ProfileDao profileDao;

	@Inject
	private DomainDao domainDao;

	@Inject
	private TemplateProcessor templateProcessor;

	@Inject
	private ImportJson importJson;

	@Inject
	private ImportXML importXML;

	@Inject
	private NexusDao nexusDao;

	@Inject
	private JiraDao jiraDao;

	@Inject
	private HpsmDao hpsmDao;

	@Inject
	private Packager packager;

	private List<Profile> profiles;

	private Profile profile = new Profile();

	private Class<?> classifier = null;

	private Object classifierInstance = null;

	private TreeNode root;

	private TreeNode selectedNode;

	private String domain = "";

	private String host = "";

	private Domains domains = new Domains();

	private String title;

	private String script;

	private Deployment deployment = new Deployment();

	private List<Artefact> artefacts = new ArrayList<Artefact>();

	private Artefact selectedArtefact = new Artefact();

	private List<JiraTicket> jiraTickets;

	List<JiraProject> jiraProjects = new ArrayList<>();

	private JiraTicket selectedTicket;
	
	private String feedback;

	// --- Constructors

	@PostConstruct
	private void populateProfiles() {

		profiles = new ArrayList<Profile>();

		try {

			jiraProjects = jiraDao.getProjects();

			profiles = profileDao.findAll();

			root = createTree(profiles);

			domains = domainDao.get();

		} catch (Exception e) {
			submitMessage(FacesMessage.SEVERITY_ERROR, "Failure : Exception occured while populating profile view...", e, false);
		}
		submitMessage(FacesMessage.SEVERITY_INFO, profiles.size() + " record(s) retrieved...", true);
	}

	// Action methods

	private Method getAggregateMethod(Object instance) {

		for (Method method : Reflect.getAggregateMethods(Profile.class)) {

			// http://www.javacodegeeks.com/2013/12/advanced-java-generics-retreiving-generic-type-arguments.html
			Type myclass = method.getGenericReturnType();

			ParameterizedType parameterizedType = (ParameterizedType) myclass;

			Class<?> rob = (Class<?>) parameterizedType.getActualTypeArguments()[0];

			if (instance.getClass().getSimpleName().equals(rob.getSimpleName())) {
				return method;
			}

		}

		return null;

	}

	/**
	 * http://www.primefaces.org/showcase/ui/data/treetable/contextMenu.xhtml
	 * 
	 * @param profiles
	 * @return
	 */
	public TreeNode createTree(List<Profile> profiles) {

		TreeNode root = new DefaultTreeNode(new Tree("name", "description", Profile.class), null);

		for (Profile profile : profiles) {
			TreeNode profileNode = new DefaultTreeNode(profile, root);
			// process datasources
			Reflect.getComponents(Profile.class).stream().forEach(m -> {

				// http://www.javacodegeeks.com/2013/12/advanced-java-generics-retreiving-generic-type-arguments.html
				Type myclass = m.getGenericReturnType();

				ParameterizedType parameterizedType = (ParameterizedType) myclass;

				Class<?> rob = (Class<?>) parameterizedType.getActualTypeArguments()[0];

				TreeNode propertiesNode = new DefaultTreeNode(new Tree(rob.getSimpleName(), "-", rob), profileNode);

				try {
					List<Object> components = (List<Object>) m.invoke(profile);

					if (components != null) {
						components.stream().forEach(c -> {
							TreeNode propertyNode = new DefaultTreeNode(c, propertiesNode);
						});
					}

				} catch (Exception e) {
					e.printStackTrace();
				}

			});

		}

		return root;
	}

	public void onNodeSelect(NodeSelectEvent event) {

		script = "";

		classifierInstance = event.getTreeNode().getData();

		classifier = classifierInstance.getClass();

		FacesMessage message = null;

		if (classifierInstance instanceof Profile) {
			profile = (Profile) classifierInstance;
			message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Selected profile ", profile.getName());
		} else if (classifierInstance instanceof Tree) {
			classifier = ((Tree) classifierInstance).getClassifier();
			message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Selected component ", classifierInstance.getClass().getSimpleName());
		} else {

			classifierInstance = event.getTreeNode().getData();
			profile = (Profile) event.getTreeNode().getParent().getParent().getData();
			message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Selected " + classifier.getSimpleName(), classifierInstance.toString());

		}

		FacesContext.getCurrentInstance().addMessage(null, message);

	}

	public void deleteComponent() {

		if (profile == null) {
			submitMessage(FacesMessage.SEVERITY_INFO, "Please select a Profile first...", true);
			return;
		}

		try {
			if (classifierInstance instanceof Profile) {

				profileDao.delete((Profile) classifierInstance);

			} else {
				Method method = getAggregateMethod(classifierInstance);

				List<Object> list = (List<Object>) method.invoke(profile, null);

				list.remove(classifierInstance);

				this.profile = profileDao.save(this.profile);

			}

		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		refreshProfiles();
		
		submitMessage(FacesMessage.SEVERITY_INFO, String.format("Profile %s updated...", profile.getName()), true);

	}

	public void addComponent() {

		if (profile == null) {
			submitMessage(FacesMessage.SEVERITY_INFO, "Please select a Profile first...", true);
			return;
		}

		try {
			classifierInstance = Class.forName(classifier.getName()).newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Map<String, Object> options = new HashMap<String, Object>();
		options.put("draggable", true);
		options.put("resizable", false);
		options.put("closable", true);
		options.put("contentWidth", 790);

		title = "add new " + classifier.getSimpleName().toLowerCase();

		if (classifierInstance instanceof Deployment) {
			options.put("contentHeight", 600);
			deployment = new Deployment();
			showDeployment();

		} else {
			options.put("contentHeight", Reflect.getAttributes(classifier).size() * 60);
			RequestContext.getCurrentInstance().openDialog("viewComponent", options, null);

		}

	}

	public void updateComponent() {

		Map<String, Object> options = new HashMap<String, Object>();
		options.put("draggable", true);
		options.put("resizable", false);
		options.put("closable", true);
		options.put("contentWidth", 790);

		title = "update " + classifier.getSimpleName().toLowerCase();

		if (classifierInstance instanceof Deployment) {

			try {
				BeanUtils.copyProperties(deployment, classifierInstance);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			options.put("contentHeight", 600);

			showDeployment();

		} else {
			options.put("contentHeight", Reflect.getAttributes(classifier).size() * 60);
			RequestContext.getCurrentInstance().openDialog("viewComponent", options, null);

		}

	}

	/**
	 * 
	 * 
	 * http://stackoverflow.com/questions/8509270/programmatically-getting- uicomponents-of-a-jsf-view-in-beans-constructor
	 * 
	 * preRenderComponent preRenderView postAddToView preValidate postValidate
	 */
	public void renderForm() {

		UIViewRoot root = FacesContext.getCurrentInstance().getViewRoot();
		UIComponent component = getUIComponentOfId(root, "injectPoint");

		List<Method> methods = Reflect.getAttributes(classifier);

		// render panel grid content
		methods.stream().forEach(m -> {
			// set the label
			String name = WordUtils.uncapitalize(m.getName().substring(3));
			OutputLabel label = new OutputLabel();
			label.setValue(name);
			component.getChildren().add(label);

			switch (Reflect.getType(m)) {
				case INPUT:
					UIComponent ip = new UIInput();
					ip.getAttributes().put("size", Reflect.getLength(m));
					ip.getAttributes().put("required", Reflect.isRequired(m));
					ip.setValueExpression("value", createValueExpression(String.format("#{profileController.classifierInstance.%s}", name), String.class));
					component.getChildren().add(ip);
					break;
				case OUTPUT:
					UIComponent op = new UIInput();
					op.getAttributes().put("size", Reflect.getLength(m));
					op.setValueExpression("value", createValueExpression(String.format("#{profileController.classifierInstance.%s}", name), String.class));
					component.getChildren().add(op);
					break;
				case LIST:
					SelectOneMenu ls = new SelectOneMenu();
					ls.setValueExpression("value", createValueExpression(String.format("#{profileController.classifierInstance.%s}", name), String.class));
					UISelectItems items = new UISelectItems();
					items.setValueExpression("value", createValueExpression(String.format("#{profileController.%ss}", name), List.class));
					;
					ls.getChildren().add(items);

					component.getChildren().add(ls);
					break;
				case AUTOCOMPLETE:
					AutoComplete ac = new AutoComplete();
					ac.setValueExpression("value", createValueExpression(String.format("#{profileController.classifierInstance.%s}", name), String.class));
					// http://forum.primefaces.org/viewtopic.php?f=3&t=19348
					MethodExpression completeMethod = createMethodExpression(String.format("#{profileController.complete%s}", m.getName().substring(3)), List.class, String.class);
					ac.setCompleteMethod(completeMethod);
					ac.setAutocomplete("on");

					component.getChildren().add(ac);
					break;
				case PASSWORD:
					UIInput pw = new HtmlInputSecret();
					pw.setConverter(new PasswordConverter());
					pw.setValueExpression("value", createValueExpression(String.format("#{profileController.classifierInstance.%s}", name), String.class));

					component.getChildren().add(pw);
					break;
				case CHECKBOX:
					SelectBooleanCheckbox chk = new SelectBooleanCheckbox();
					chk.getAttributes().put("size", Reflect.getLength(m));
					chk.setValueExpression("value", createValueExpression(String.format("#{profileController.classifierInstance.%s}", name), String.class));
					component.getChildren().add(chk);
					break;
				default:
					break;
			}

		});

	}

	public void closeView() {
		RequestContext.getCurrentInstance().closeDialog("viewComponent");

	}

	public void closeNEXUSView() {
		RequestContext.getCurrentInstance().closeDialog("viewNEXUS");

	}

	public void closePackagingView() {
		RequestContext.getCurrentInstance().closeDialog("viewPackaging");

	}

	public void updateProfile() {

		FacesMessage message = null;

		clearMessages();

		try {

			if (classifierInstance instanceof Profile) {

				this.profile = (Profile) classifierInstance;

			} else {

				Method method = getAggregateMethod(classifierInstance);

				List<Object> list = (List<Object>) method.invoke(profile, null);

				if (!list.contains(classifierInstance)) {
					list.add(classifierInstance);

				}

			}

			this.profile = profileDao.save(this.profile);

			message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Update instance " + classifier.getSimpleName(), classifierInstance.toString());

			FacesContext.getCurrentInstance().addMessage(null, message);

		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		refreshProfiles();

		RequestContext.getCurrentInstance().closeDialog("viewComponent");

		submitMessage(FacesMessage.SEVERITY_INFO, String.format("Profile %s updated...", profile.getName()), true);

	}

	public void removeProfile() {
		clearMessages();
		try {
			profileDao.delete(this.profile);
			submitMessage(FacesMessage.SEVERITY_INFO, this.profile.getDescription() + " removed from the database...", true);
		} catch (Exception e) {
			submitMessage(FacesMessage.SEVERITY_ERROR, "Failure : Exception occured while removing profile from database...", e, false);
		}
		// refresh table
		refreshProfiles();

	}

	public void refreshProfiles() {

		try {
			profiles = profileDao.findAll();

			root = createTree(profiles);

		} catch (Exception e) {
			submitMessage(FacesMessage.SEVERITY_ERROR, "Failure : Exception occured while refreshing profiles from database...", e, false);
		}
	}

	public void updateDomain() {

		FacesMessage message = null;

		clearMessages();

		try {

			domains.getInstances().put(domain, domain);

			domainDao.save(domains);

			message = new FacesMessage(FacesMessage.SEVERITY_INFO, String.format("Domain %s saved", domain), domain);

			FacesContext.getCurrentInstance().addMessage(null, message);

		} catch (Exception e) {
			submitMessage(FacesMessage.SEVERITY_ERROR, "Failure : Exception occured while updating domain...", e, false);
		}

	}

	public void deleteDomain() {

		FacesMessage message = null;

		clearMessages();

		try {

			domains.getInstances().remove(domain);

			domainDao.save(domains);

			message = new FacesMessage(FacesMessage.SEVERITY_INFO, String.format("Domain %s saved", domain), domain);

			FacesContext.getCurrentInstance().addMessage(null, message);

		} catch (Exception e) {
			submitMessage(FacesMessage.SEVERITY_ERROR, "Failure : Exception occured while removing domain...", e, false);
		}

	}

	public List<String> getEnvironments() {

		List<String> environments = new ArrayList<>();

		for (Environment environment : Environment.values()) {
			environments.add(environment.toString());
		}

		return environments;
	}

	public String getScript() {

		return this.script;

	}

	public void generateCLI() {

		if (profile != null && profile.getName() != null) {
			try {
				script = templateProcessor.renderTemplate(profile);
			} catch (Exception e) {
				script = String.format("Failure : Exception occured while generating CLI batch script : %s", e.getMessage());
			}
		} else {
			script = "no profile selected for generation!";
		}

	}

	/**
	 * JSF validate profile environment prefix.
	 * 
	 * @param context
	 * @param toValidate
	 * @param value
	 */
	public void validateEnvironment(FacesContext context, UIComponent toValidate, Object value) {

		for (Environment environment : Environment.values()) {
			if (environment.name().equalsIgnoreCase((String) value)) {
				return;
			}
		}
		submitMessage(FacesMessage.SEVERITY_WARN, "Environment ID does not exist!\nPlease specify a valid Environment", false);
		((UIInput) toValidate).setValid(false);

	}

	public List<Profile> getProfiles() {
		return profiles;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	public TreeNode getRoot() {
		return root;
	}

	public TreeNode getSelectedNode() {
		return selectedNode;
	}

	public void setSelectedNode(TreeNode selectedNode) {

		this.selectedNode = selectedNode;

	}

	public void selectDomain(final AjaxBehaviorEvent event) {

		String selection = (String) event.getComponent().getAttributes().get("value");

		try {

			if (selection.toLowerCase().equals("all")) {
				profiles = profileDao.findAll();

			} else {
				profiles = profileDao.findByDomain(selection);
			}

			root = createTree(profiles);

		} catch (Exception e) {
			submitMessage(FacesMessage.SEVERITY_ERROR, "Failure : Exception occured while refreshing profiles from database...", e, false);
		}

	}


	public void selectHost(final AjaxBehaviorEvent event) {

		host = (String) event.getComponent().getAttributes().get("value");

		
	}

	public void selectDomainName(final AjaxBehaviorEvent event) {

		domain = (String) event.getComponent().getAttributes().get("value");

		
	}

	
	public Domains getDomains() {
		return domains;
	}

	public void setDomains(Domains domains) {
		this.domains = domains;
	}

	public List<String> completeDomain(String query) {

		List<String> nodeList = new ArrayList<>();

		for (String node : domains.getInstances().keySet()) {
			if (node.toLowerCase().startsWith(query.toLowerCase())) {
				nodeList.add(node);
			}
		}

		return nodeList;

	}

	public List<String> completeHostName(String query) {

		List<String> nodeList = new ArrayList<>();

		for (String node : hpsmDao.getHosts()) {
			if (node.toLowerCase().startsWith(query.toLowerCase())) {
				nodeList.add(node);
			}
		}

		return nodeList;

	}

	public List<String> completeJiraKey(String query) {

		List<String> nodeList = new ArrayList<>();

		for (JiraProject project : jiraProjects) {
			if (project.getKey().toLowerCase().startsWith(query.toLowerCase())) {
				nodeList.add(project.getKey());
			}
		}

		return nodeList;

	}

	public String getTitle() {
		return title;
	}

	public Object getClassifierInstance() {
		return classifierInstance;
	}

	public void setClassifierInstance(Object classifierInstance) {
		this.classifierInstance = classifierInstance;
	}

	public Class<?> getClassifier() {
		return classifier;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		if (domain != null) {
			this.domain = domain.toLowerCase();
		}
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		if (host != null) {
			this.host = host.toLowerCase();
		}
	}

	// Helpers
	// -----------------------------------------------------------------------------------
	private ValueExpression createValueExpression(String valueExpression, Class<?> valueType) {
		FacesContext facesContext = FacesContext.getCurrentInstance();
		return facesContext.getApplication().getExpressionFactory().createValueExpression(facesContext.getELContext(), valueExpression, valueType);
	}

	private static MethodExpression createMethodExpression(String valueExpression, Class<?> expectedReturnType, Class<?>... parameterTypes) {
		MethodExpression methodExpression = null;
		try {
			FacesContext fc = FacesContext.getCurrentInstance();
			ExpressionFactory factory = fc.getApplication().getExpressionFactory();
			methodExpression = factory.createMethodExpression(fc.getELContext(), valueExpression, expectedReturnType, parameterTypes);
		} catch (Exception e) {
			throw new FacesException("Method expression '" + valueExpression + "' could not be created.");
		}

		return methodExpression;
	}

	private UIComponent getUIComponentOfId(UIComponent root, String id) {
		if (root.getId().equals(id)) {
			return root;
		}
		if (root.getChildCount() > 0) {
			for (UIComponent subUiComponent : root.getChildren()) {
				UIComponent returnComponent = getUIComponentOfId(subUiComponent, id);
				if (returnComponent != null) {
					return returnComponent;
				}
			}
		}
		return null;
	}

	/**
	 * Action method backing up the import profile from JSON script JSF popup.
	 * 
	 * @param event
	 */
	public void upload(FileUploadEvent event) {


		try {

			feedback = importXML.importProfile(event.getFile().getInputstream(), domain, host);

		} catch (Exception e) {
			submitMessage(FacesMessage.SEVERITY_WARN, "Error occurred during JSON upload...", e, false);
		}

		submitMessage(FacesMessage.SEVERITY_INFO, String.format("JBoss config file %s imported successfully", event.getFile().getFileName()), true);

	}

	/**
	 * Action method backing up the import profile from JSON script JSF popup.
	 * 
	 * @param event
	 */
	public void uploadResource(FileUploadEvent event) {

		if (profile == null) {
			submitMessage(FacesMessage.SEVERITY_INFO, "Please select a Profile first...", true);
			return;
		}

		try {

			importJson.generateResource(event.getFile().getInputstream(), profile);

		} catch (Exception e) {
			submitMessage(FacesMessage.SEVERITY_WARN, "Error occurred during JSON upload...", e, false);
		}

		submitMessage(FacesMessage.SEVERITY_INFO, event.getFile().getFileName() + " successfully imported", true);

	}

	public Deployment getDeployment() {
		return deployment;
	}

	public void setDeployment(Deployment deployment) {
		this.deployment = deployment;
	}

	public List<Artefact> getArtefacts() {
		return artefacts;
	}

	public void setArtefacts(List<Artefact> artefacts) {
		this.artefacts = artefacts;
	}

	public Artefact getSelectedArtefact() {
		return selectedArtefact;
	}

	public List<JiraTicket> getJiraTickets() {
		return jiraDao.getAllTickets(profile.getJiraKey());
	}

	public void setJiraTickets(List<JiraTicket> jiraTickets) {
		this.jiraTickets = jiraTickets;
	}

	public JiraTicket getSelectedTicket() {

		return selectedTicket;
	}

	public void setSelectedTicket(JiraTicket selectedTicket) {

		submitMessage(FacesMessage.SEVERITY_WARN, "You selected JIRA ticket " + selectedTicket.getId(), true);

		this.selectedTicket = selectedTicket;
	}

	public void setSelectedArtefact(Artefact selectedArtefact) {
		this.selectedArtefact = selectedArtefact;
		if (selectedArtefact != null) {
			((Deployment) classifierInstance).setArtifact(this.selectedArtefact.getArtifactId());
			((Deployment) classifierInstance).setName(this.selectedArtefact.getArtifactId());
			((Deployment) classifierInstance).setDescription(String.format("%s.%s-%s", selectedArtefact.getGroupId(), selectedArtefact.getArtifactId(), selectedArtefact.getVersion()));
			((Deployment) classifierInstance).setGroupIdentification(this.selectedArtefact.getGroupId());
			((Deployment) classifierInstance).setVersion(this.selectedArtefact.getVersion());
			((Deployment) classifierInstance).setType(this.selectedArtefact.getPackaging());

			try {
				BeanUtils.copyProperties(deployment, classifierInstance);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			deployment.setArtifact(this.selectedArtefact.getArtifactId());
			deployment.setName(this.selectedArtefact.getArtifactId());
			deployment.setDescription(String.format("%s.%s-%s", selectedArtefact.getGroupId(), selectedArtefact.getArtifactId(), selectedArtefact.getVersion()));
			deployment.setGroupIdentification(this.selectedArtefact.getGroupId());
			deployment.setVersion(this.selectedArtefact.getVersion());
			deployment.setType(this.selectedArtefact.getPackaging());
		}

	}

	public void showNexus() {

		Map<String, Object> options = new HashMap<String, Object>();
		options.put("draggable", true);
		options.put("resizable", false);
		options.put("closable", true);
		options.put("contentWidth", 790);
		options.put("contentHeight", 500);

		RequestContext.getCurrentInstance().openDialog("viewNEXUS", options, null);
	}

	public void showPackaging() {

		Map<String, Object> options = new HashMap<String, Object>();
		options.put("draggable", true);
		options.put("resizable", false);
		options.put("closable", true);
		options.put("contentWidth", 990);
		options.put("contentHeight", 500);

		RequestContext.getCurrentInstance().openDialog("viewPackaging", options, null);
	}

	public void showDeployment() {

		this.artefacts.clear();

		Map<String, Object> options = new HashMap<String, Object>();
		options.put("draggable", true);
		options.put("resizable", false);
		options.put("closable", true);
		options.put("contentWidth", 790);
		options.put("contentHeight", 500);

		RequestContext.getCurrentInstance().openDialog("viewDeployment", options, null);
	}

	public void searchNexus() {

		if (profile == null) {
			submitMessage(FacesMessage.SEVERITY_INFO, "Please select a Profile first...", true);
			return;
		}

		this.artefacts.clear();
		try {
			artefacts = nexusDao.listArtefacts(deployment.getGroupIdentification(), deployment.getArtifact(), deployment.getType());

		} catch (Exception e) {
			submitMessage(FacesMessage.SEVERITY_ERROR, "Failure : Exception occured while retrieving all deployments from Nexus repository...", e, false);
		}

		submitMessage(FacesMessage.SEVERITY_INFO, String.format("%s artefacts found on NEXUS", artefacts.size()), true);

	}

	public void searchDeployment() {

		this.artefacts.clear();
		try {
			artefacts = nexusDao.listArtefacts(deployment.getGroupIdentification(), deployment.getArtifact(), deployment.getType());

		} catch (Exception e) {
			submitMessage(FacesMessage.SEVERITY_ERROR, "Failure : Exception occured while retrieving all deployments from Nexus repository...", e, false);
		}

		submitMessage(FacesMessage.SEVERITY_INFO, String.format("%s artefacts found on NEXUS", artefacts.size()), true);

	}

	public void addDeployment() {

		Deployment deployment = new Deployment();

		deployment.setArtifact(selectedArtefact.getArtifactId());
		deployment.setName(selectedArtefact.getArtifactId());
		deployment.setGroupIdentification(selectedArtefact.getGroupId());
		deployment.setType(selectedArtefact.getPackaging());
		deployment.setVersion(selectedArtefact.getVersion());
		deployment.setDescription(String.format("%s.%s.%s-%s", selectedArtefact.getGroupId(), selectedArtefact.getArtifactId(), selectedArtefact.getPackaging(), selectedArtefact.getVersion()));

		profile.getDeployments().add(deployment);

		profileDao.save(profile);

	}

	public List<String> getDrivers() {

		return profile.getDrivers().stream().map(d -> d.getName()).collect(Collectors.toList());

	}

	/**
	 * Generate RPM package for current selected profile.
	 */
	public void generateRPM() {

		if (this.selectedTicket == null) {
			this.selectedTicket = new JiraTicket("N/A", "No JIRA ticket selected", "closed");
		}

		String response = packager.generate(profile);

		submitMessage(FacesMessage.SEVERITY_INFO, String.format("RPM package created and published to NEXUS with status %s", response), true);

	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}


}
