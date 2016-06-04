package ch.agilesolutions.jboss.dto;

import java.util.Calendar;

public class ScheduleRequest {
	
	private String group;
	
	private String artefact;
		
	private String version;
	
	private Calendar dateTime;

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

	public Calendar getDateTime() {
		return dateTime;
	}

	public void setDateTime(Calendar dateTime) {
		this.dateTime = dateTime;
	}
	
	

}
