package ch.agilesolutions.jboss.dto;

public class DeployRequest {
	
	private String group;
	
	private String artefact;
		
	private String version;

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public String getArtefact() {
		return artefact;
	}

	public void setArtefact(String artefact) {
		this.artefact = artefact;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

}
