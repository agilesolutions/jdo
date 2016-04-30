package ch.agilesolutions.jboss.model;

import java.util.ArrayList;
import java.util.List;

public class JiraProject {

	String key;

	String name;

	List<JiraTicket> tickets = new ArrayList<JiraTicket>();

	public JiraProject(String key, String name) {
		super();
		this.key = key;
		this.name = name;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<JiraTicket> getTickets() {
		return tickets;
	}

	public void setTickets(List<JiraTicket> tickets) {
		this.tickets = tickets;
	}

}
