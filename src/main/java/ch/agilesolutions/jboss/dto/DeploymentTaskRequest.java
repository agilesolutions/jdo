package ch.agilesolutions.jboss.dto;

import ch.agilesolutions.jboss.model.Artefact;
import ch.agilesolutions.jboss.model.Profile;

public class DeploymentTaskRequest {
	
	String host;
	
	Artefact artefact;
	
	Profile profile;
	
	public DeploymentTaskRequest(String host, Profile profile, Artefact artefact) {
		this.host = host;
		this.artefact = artefact;
		this.profile = profile;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public Artefact getArtefact() {
		return artefact;
	}

	public void setArtefact(Artefact artefact) {
		this.artefact = artefact;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}
	
	

}
