package ch.agilesolutions.jboss.rest;

import java.io.InputStream;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.commons.io.IOUtils;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import com.wordnik.swagger.annotations.ApiResponse;
import com.wordnik.swagger.annotations.ApiResponses;

import ch.agilesolutions.jboss.data.ProfileDao;
import ch.agilesolutions.jboss.dto.DeployRequest;
import ch.agilesolutions.jboss.dto.DeployResponse;
import ch.agilesolutions.jboss.dto.PackageRequest;
import ch.agilesolutions.jboss.dto.PackageResponse;
import ch.agilesolutions.jboss.dto.ScheduleRequest;
import ch.agilesolutions.jboss.dto.ScheduleResponse;
import ch.agilesolutions.jboss.model.Profile;

@Stateless
@Path("/profile")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON })
@Api(value = "/profile", description = "REST API available on JDO")
public class ProfileResource {

	@Inject
	private ProfileDao profileDao;

	@Context
	HttpServletRequest servletRequest;

	@GET
	@Path("/listPerDomain")
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value = "All Profiles for Domain", notes = "List all profiles configured for specific Business Domain")
	@ApiParam(name = "domain", required = true, access = "static")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK"), @ApiResponse(code = 500, message = "Server error, check log files") })
	public List<Profile> listProfilesbyDomain(@QueryParam("domain") String domain) {

		return profileDao.findByDomain(domain);
	}

	@GET
	@Path("/listAll")
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value = "All Profiles", notes = "List all profiles registered on JDO")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK"), @ApiResponse(code = 500, message = "Server error, check log files") })
	public List<Profile> listProfiles() {

		return profileDao.findAll();
	}

	@POST
	@Path("/deploy")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value = "Deploy Profile", notes = "Deploy package from NEXUS.")
	@ApiParam(name = "request", required = true, access = "static")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK"), @ApiResponse(code = 500, message = "Server error, check log files") })

	public Response deployProfile(DeployRequest request) {

		DeployResponse deployResponse = new DeployResponse();

		InputStream stream = servletRequest.getServletContext().getResourceAsStream("/dummyresponse.txt");

		try {

			Thread.sleep(5000);
			deployResponse.setFeedback(IOUtils.toString(stream));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return Response.ok(deployResponse).build();

	}

	@POST
	@Path("/package")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value = "Package Profile", notes = "Generate deployment package for selected profile.")
	@ApiParam(name = "request", required = true, access = "static")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK"), @ApiResponse(code = 500, message = "Server error, check log files") })
	public Response packageProfile(PackageRequest request) {

		PackageResponse packageResponse = new PackageResponse();

		packageResponse.setArtefact("kickstart-uat");
		packageResponse.setGroup("ch.agilesolutions.kickstart-uat");
		packageResponse.setVersion("1.0.0");
		packageResponse.setType("tgz");

		return Response.ok(packageResponse).build();

	}

	@POST
	@Path("/schedule")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value = "Schedule Deployment", notes = "Schedule deployment of package from NEXUS.")
	@ApiParam(name = "request", required = true, access = "static")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK"), @ApiResponse(code = 500, message = "Server error, check log files") })
	public Response scheduleProfile(ScheduleRequest request) {

		ScheduleResponse scheduleResponse = new ScheduleResponse();

		scheduleResponse.setFeedback(String.format("Package %s scheduled for deployment at %s", request.getArtefact(),request.getDateTime()));

		return Response.ok(scheduleResponse).build();

	}

}
