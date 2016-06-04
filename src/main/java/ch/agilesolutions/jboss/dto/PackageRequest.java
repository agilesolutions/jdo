package ch.agilesolutions.jboss.dto;

public class PackageRequest {
	
	private String domain;
	
	private String profileName;
		
	private String jiraTicket;

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getProfileName() {
		return profileName;
	}

	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}

	public String getJiraTicket() {
		return jiraTicket;
	}

	public void setJiraTicket(String jiraTicket) {
		this.jiraTicket = jiraTicket;
	}

}
