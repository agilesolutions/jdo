package ch.agilesolutions.jboss.rest;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import com.wordnik.swagger.annotations.ApiResponse;
import com.wordnik.swagger.annotations.ApiResponses;

import ch.agilesolutions.jboss.data.ProfileDao;
import ch.agilesolutions.jboss.model.Profile;

@Stateless
@Path("/profiles")
@Api(value = "/profiles", description = "All REST operations on profile!")
public class ProfileResource {

	@Inject
	private ProfileDao profileDao;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value = "List", notes = "List all profiles")
	@ApiParam(name="host", required=true, access="static")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK"), @ApiResponse(code = 500, message = "Something wrong in Server") })
	public List<Profile> listProfilesbyQuery(@QueryParam("hostname") String hostName) {

		return profileDao.findAll();
	}

}
