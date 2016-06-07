package ch.agilesolutions.jboss.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ejb.Stateless;
import javax.inject.Inject;

import org.slf4j.Logger;

import com.atlassian.jira.rest.client.JiraRestClient;
import com.atlassian.jira.rest.client.NullProgressMonitor;
import com.atlassian.jira.rest.client.domain.BasicIssue;
import com.atlassian.jira.rest.client.domain.BasicProject;
import com.atlassian.jira.rest.client.domain.BasicUser;
import com.atlassian.jira.rest.client.domain.Comment;
import com.atlassian.jira.rest.client.domain.Issue;
import com.atlassian.jira.rest.client.domain.IssueFieldId;
import com.atlassian.jira.rest.client.domain.SearchResult;
import com.atlassian.jira.rest.client.domain.input.ComplexIssueInputFieldValue;
import com.atlassian.jira.rest.client.domain.input.FieldInput;
import com.atlassian.jira.rest.client.domain.input.IssueInputBuilder;

import ch.agilesolutions.jboss.model.JiraProject;
import ch.agilesolutions.jboss.model.JiraTicket;

@Stateless
public class JiraDao {

	@Inject
	private Logger logger;

	//@Inject
	JiraRestClient client;

	final NullProgressMonitor pm = new NullProgressMonitor();

	/**
	 * List all available JIRA projects.
	 * 
	 * @return
	 */
	public List<JiraProject> getProjects() {

		List<JiraProject> projects = new ArrayList<JiraProject>();

		 JiraProject project = new JiraProject("JDO", "JBoss DevOps development process");
		 projects.add(project);

//		try {
//
//			for (final BasicProject prj : client.getProjectClient().getAllProjects(pm)) {
//
//				projects.add(new JiraProject(prj.getKey(), prj.getName()));
//			}
//
//		} catch (Exception e) {
//			logger.warn("Error retrieving projects from JIRA", e);
//			throw new IllegalStateException("Error retrieving projects from JIRA", e);
//		}

		return projects;

	}

	/**
	 * Send comment on JIRA issue, based on its key.
	 * 
	 * @param key
	 * @param comment
	 */
	public void saveComment(String key, String comment) {

//		try {
//			com.atlassian.jira.rest.client.domain.Issue issue = client.getIssueClient().getIssue(key, pm);
//			client.getIssueClient().addComment(pm, issue.getCommentsUri(), Comment.valueOf(comment));
//		} catch (Exception e) {
//			logger.warn("Error submitting comment text to JIRA", e);
//			throw new IllegalStateException("JiraDao:saveComment : error saving comment text on JIRA ticket", e);
//
//		}

	}

	/**
	 * Push JIRA issue to next transition state.
	 * 
	 * 
	 * @param key
	 * @param comment
	 * @throws IllegalStateException
	 */
	public void changeStatus(String key, String comment) {

		// try {
		// IssueRestClient issueRestClient = client.getIssueClient();
		//
		// Issue issue = issueRestClient.getIssue(key, pm);
		//
		// final Iterable<Transition> transitions =
		// issueRestClient.getTransitions(issue, pm);
		//
		// final Transition resolveIssueTransition =
		// getTransitionByName(transitions);
		//
		// if (resolveIssueTransition != null) {
		// final TransitionInput transitionInput = new
		// TransitionInput(resolveIssueTransition.getId(),
		// Comment.valueOf(comment));
		//
		//
		// issueRestClient.transition(issue.getTransitionsUri(),transitionInput
		// , pm);
		// }
		//
		// } catch (Exception e) {
		// logger.warn("UC2-1 error submitting comment text to JIRA", e);
		// throw new IllegalStateException("JiraDao:changeStatus : error while
		// change status on JIRA ticket", e);
		// }

	}

	/**
	 * Retrieve all deployment tickets from a specific jira project.
	 * 
	 * @return list of JPA entity beans representing JIRA projects.
	 * @throws IllegalStateException
	 */
	public List<JiraTicket> getAllTickets(String projectKey) {

		List<JiraTicket> tickets = new ArrayList<JiraTicket>();

		 JiraTicket ticket = new JiraTicket();
		 ticket.setId("JDO-4");
		 ticket.setProject("JDO-4");
		 ticket.setStatus("In Progress");
		 ticket.setSummary("Deployment Kickstart to UAT");
		 tickets.add(ticket);

//		try {
//
//			SearchResult result = client.getSearchClient().searchJql(
//					String.format("project = %s and type = Deployment and status in ('In Progress')", projectKey), pm);
//
//			for (BasicIssue bi : result.getIssues()) {
//
//				Issue issue = client.getIssueClient().getIssue(bi.getKey(), pm);
//
//				JiraTicket ticket = new JiraTicket(bi.getKey(), issue.getDescription(), issue.getStatus().getName());
//
//				tickets.add(ticket);
//
//			}
//
//		} catch (Exception e) {
//
//			logger.warn("Project not found", e);
//
//		}

		return tickets;

	}

	/**
	 * Walk through all JIRA ticket transitions.
	 * 
	 * @param transitions
	 * @return
	 */
	// private static Transition getTransitionByName(Iterable<Transition>
	// transitions) {
	//
	// List<String> values = new ArrayList<String>();
	//
	// for(JiraTransition transition:JiraTransition.values()) {
	// values.add(transition.value());
	// }
	//
	// for (Transition transition : transitions) {
	// if (values.contains(transition.getName())) {
	// return transition;
	// }
	// }
	// return null;
	// }
	//

	public List<Issue> checkClosedTickets() {

		List<Issue> issues = new ArrayList<>();

		SearchResult result = client.getSearchClient()
				.searchJql("project = JPE and status in (Closed,Rejected) and updatedDate > -4h", pm);

		for (BasicIssue bi : result.getIssues()) {

			issues.add(client.getIssueClient().getIssue(bi.getKey(), pm));

		}

		return issues;

	}

	public BasicIssue saveIssue(String msg) throws Exception {

		try {

			// populate issue fields

			// populate issue fields
			com.atlassian.jira.rest.client.domain.input.IssueInputBuilder issueBuilder = new IssueInputBuilder("TEST",
					new Long(27));
			issueBuilder.setDescription("my body");
			issueBuilder.setSummary("my summary");
			issueBuilder.setAssignee(new BasicUser(null, "rong", "rong"));
			Map<String, Object> map = new HashMap<>();

			map.put("originalEstimate", "1h");

			issueBuilder.setFieldInput(
					new FieldInput(IssueFieldId.TIMETRACKING_FIELD, new ComplexIssueInputFieldValue(map)));

			issueBuilder.setFieldValue("labels", Arrays.asList("domain"));

			com.atlassian.jira.rest.client.domain.input.IssueInput issueInput = issueBuilder.build();

			BasicIssue basicIssue = client.getIssueClient().createIssue(issueInput, pm);

			Issue issue = client.getIssueClient().getIssue(basicIssue.getKey(), pm);

			return issue;

		} catch (Exception e) {
			throw new Exception("JiraDao:saveComment : error saving comment text on JIRA ticket", e);

		}

	}

}
