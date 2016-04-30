package ch.agilesolutions.jboss.model;

public class JiraTicket  {
	private static final long serialVersionUID = 1L;
	
	private String id;
	
	private String summary;

	private String status;

	private String project;
	
	public JiraTicket(String id, String summary, String status) {
		super();
		this.id = id;
		this.summary = summary;
		this.status = status;
	}
	
	public JiraTicket() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}
}


