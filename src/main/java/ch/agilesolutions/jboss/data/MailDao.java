package ch.agilesolutions.jboss.data;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.atlassian.jira.rest.client.domain.BasicIssue;
import com.atlassian.jira.rest.client.domain.Issue;

import ch.agilesolutions.jboss.dto.Message;
import microsoft.exchange.webservices.data.core.ExchangeService;
import microsoft.exchange.webservices.data.core.PropertySet;
import microsoft.exchange.webservices.data.core.enumeration.property.BasePropertySet;
import microsoft.exchange.webservices.data.core.enumeration.property.BodyType;
import microsoft.exchange.webservices.data.core.enumeration.property.WellKnownFolderName;
import microsoft.exchange.webservices.data.core.enumeration.search.FolderTraversal;
import microsoft.exchange.webservices.data.core.enumeration.search.ResolveNameSearchLocation;
import microsoft.exchange.webservices.data.core.service.folder.Folder;
import microsoft.exchange.webservices.data.core.service.item.Contact;
import microsoft.exchange.webservices.data.core.service.item.EmailMessage;
import microsoft.exchange.webservices.data.core.service.item.Item;
import microsoft.exchange.webservices.data.core.service.schema.FolderSchema;
import microsoft.exchange.webservices.data.misc.NameResolution;
import microsoft.exchange.webservices.data.misc.NameResolutionCollection;
import microsoft.exchange.webservices.data.property.complex.ItemId;
import microsoft.exchange.webservices.data.property.complex.MessageBody;
import microsoft.exchange.webservices.data.search.FindFoldersResults;
import microsoft.exchange.webservices.data.search.FindItemsResults;
import microsoft.exchange.webservices.data.search.FolderView;
import microsoft.exchange.webservices.data.search.ItemView;
import microsoft.exchange.webservices.data.search.filter.SearchFilter;

@Stateless
public class MailDao {

	private static Integer NUMBER_EMAILS_FETCH = 30;

	@Inject
	ExchangeService service;

	public void replyClosedTicket(Issue issue) {

		Folder folder = getFolderByName("TicketCreated");

		try {

			FindItemsResults<Item> results = service.findItems(folder.getId(), new ItemView(NUMBER_EMAILS_FETCH));

			for (Item item : results) {
				if (item.getSubject().equals(issue.getSummary())) {

					PropertySet psPropset = new PropertySet();
					psPropset.setRequestedBodyType(BodyType.Text);
					psPropset.setBasePropertySet(BasePropertySet.FirstClassProperties);
					Item itm = Item.bind(service, item.getId(), psPropset);
					EmailMessage message = EmailMessage.bind(service, itm.getId(), psPropset);

					StringBuilder text = new StringBuilder();

					text.append("Dear Customer.\r\n\r\n");
					text.append("The JIRA ticket related to this original request was closed.\r\n\r\n");

					MessageBody body = new MessageBody(BodyType.Text, text.toString());
					message.reply(body, false);

					moveMessage(itm.getId(), "completed");

				}
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public List<Message> getMessage() {

		List<Message> messages = new ArrayList<>();

		try {

			Folder folder = Folder.bind(service, WellKnownFolderName.Inbox);

			FindItemsResults<Item> results = service.findItems(folder.getId(), new ItemView(NUMBER_EMAILS_FETCH));
			int i = 1;
			for (Item item : results) {
				messages.add(readEmailItem(service, item.getId()));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return messages;

	}

	public void moveMessage(Message message, String folderName) {

		FolderView view = new FolderView(100);
		try {

			view.setPropertySet(new PropertySet(BasePropertySet.IdOnly));
			view.getPropertySet().add(FolderSchema.DisplayName);

			SearchFilter searchFilter = new SearchFilter.IsGreaterThan(FolderSchema.TotalCount, 0);

			view.setTraversal(FolderTraversal.Deep);

			FindFoldersResults findFolderResults = service.findFolders(WellKnownFolderName.Root, searchFilter, view);

			for (Folder folder : findFolderResults) {
				if (folder.getDisplayName().equalsIgnoreCase(folderName)) {
					service.moveItem(message.getItemId(), folder.getId());
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void moveMessage(ItemId id, String folderName) {

		FolderView view = new FolderView(100);
		try {

			view.setPropertySet(new PropertySet(BasePropertySet.IdOnly));
			view.getPropertySet().add(FolderSchema.DisplayName);

			SearchFilter searchFilter = new SearchFilter.IsGreaterThan(FolderSchema.TotalCount, 0);

			view.setTraversal(FolderTraversal.Deep);

			FindFoldersResults findFolderResults = service.findFolders(WellKnownFolderName.Root, searchFilter, view);

			for (Folder folder : findFolderResults) {
				if (folder.getDisplayName().equalsIgnoreCase(folderName)) {
					service.moveItem(id, folder.getId());
				}
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void replyMessage(Message message, BasicIssue issue) {

		StringBuilder text = new StringBuilder();

		text.append("Dear Sender.\r\n\r\n");
		text.append("Your request was assigned to one of our team members. ");

		try {
			MessageBody body = new MessageBody(BodyType.Text, text.toString());
			message.setAssignee(message.getFromAddress());
			message.getEmailMessage().reply(body, false);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * https://social.msdn.microsoft.com/Forums/exchange/en-US/6803d915-e365-49a9-a8c9-043aab9f443d/ews-managed-api-how-to-read-a-html-email-as-only-text-remove-all-the-html-tags-from-an-amail?forum=exchangesvrdevelopment
	 */
	private Message readEmailItem(ExchangeService service, ItemId itemId) {
		Message msg = new Message();
		try {
			PropertySet psPropset = new PropertySet();
			psPropset.setRequestedBodyType(BodyType.Text);
			psPropset.setBasePropertySet(BasePropertySet.FirstClassProperties);
			Item itm = Item.bind(service, itemId, psPropset);
			EmailMessage emailMessage = EmailMessage.bind(service, itm.getId(), psPropset);
			msg.setId(emailMessage.getId().toString());
			msg.setBody(itm.getBody().toString());
			msg.setSubject(emailMessage.getSubject().toString());
			msg.setFromAddress(emailMessage.getFrom().getAddress().toString());
			msg.setSenderName(emailMessage.getSender().getName().toString());
			msg.setDateTimeCreated(emailMessage.getDateTimeCreated());
			msg.setDateTimeRecieved(emailMessage.getDateTimeReceived());
			msg.setSize(emailMessage.getSize());
			msg.setAssignee("assignee id");
			msg.setEstimate("1h");
			msg.setJbar("");
			// msg.setSenderID(getSenderId(emailMessage.getFrom().getAddress().toString()));
			msg.setPkey("jira project key");
			msg.setEmailMessage(emailMessage);
			msg.setItemId(itemId);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return msg;
	}

	private Folder getFolderByName(String name) {

		FolderView view = new FolderView(100);
		try {

			view.setPropertySet(new PropertySet(BasePropertySet.IdOnly));
			view.getPropertySet().add(FolderSchema.DisplayName);

			SearchFilter searchFilter = new SearchFilter.IsGreaterThan(FolderSchema.TotalCount, 0);

			view.setTraversal(FolderTraversal.Deep);

			FindFoldersResults findFolderResults = service.findFolders(WellKnownFolderName.Root, searchFilter, view);

			for (Folder folder : findFolderResults) {
				if (folder.getDisplayName().equalsIgnoreCase(name)) {
					return folder;
				}
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	private String getSenderId(String emailAddress) {

		try {
			PropertySet psPropSet = new PropertySet(BasePropertySet.FirstClassProperties);
			NameResolutionCollection resolvedNames = service.resolveName(emailAddress, ResolveNameSearchLocation.DirectoryOnly, true, psPropSet);

			for (NameResolution nr : resolvedNames) {

				if (nr.getMailbox().getAddress().equals(emailAddress)) {
					Contact contact = nr.getContact();
					return contact.getAlias();
				}

			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return "my alias";

	}

}
