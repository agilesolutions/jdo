package ch.agilesolutions.jboss.dto;

import java.util.Date;

import microsoft.exchange.webservices.data.core.service.item.EmailMessage;
import microsoft.exchange.webservices.data.property.complex.ItemId;

public class Message {
	
	private String id;
	
	private String subject;
	private String fromAddress;
	private String senderName;
	private String senderID;
	private Date dateTimeCreated;
	private Date dateTimeRecieved;
	private int size; 
	private String body;
	private String assignee;
	private String estimate;
	private EmailMessage emailMessage;
	private ItemId itemId;
	private String jbar;
	private String pkey;


	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getFromAddress() {
		return fromAddress;
	}
	public void setFromAddress(String fromAddress) {
		this.fromAddress = fromAddress;
	}
	public String getSenderName() {
		return senderName;
	}
	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}
	public Date getDateTimeCreated() {
		return dateTimeCreated;
	}
	public void setDateTimeCreated(Date dateTimeCreated) {
		this.dateTimeCreated = dateTimeCreated;
	}
	public Date getDateTimeRecieved() {
		return dateTimeRecieved;
	}
	public void setDateTimeRecieved(Date dateTimeRecieved) {
		this.dateTimeRecieved = dateTimeRecieved;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getAssignee() {
		return assignee;
	}
	public void setAssignee(String assignee) {
		this.assignee = assignee;
	}
	public String getEstimate() {
		return estimate;
	}
	public void setEstimate(String estimate) {
		this.estimate = estimate;
	}
	public EmailMessage getEmailMessage() {
		return emailMessage;
	}
	public void setEmailMessage(EmailMessage emailMessage) {
		this.emailMessage = emailMessage;
	}
	public ItemId getItemId() {
		return itemId;
	}
	public void setItemId(ItemId itemId) {
		this.itemId = itemId;
	}
	public String getJbar() {
		return jbar;
	}
	public void setJbar(String jbar) {
		this.jbar = jbar;
	}
	public String getPkey() {
		return pkey;
	}
	public void setPkey(String pkey) {
		this.pkey = pkey;
	}
	public String getSenderID() {
		return senderID;
	}
	public void setSenderID(String senderID) {
		this.senderID = senderID;
	}

	
	

}
