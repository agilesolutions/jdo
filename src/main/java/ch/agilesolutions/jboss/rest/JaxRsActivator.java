package ch.agilesolutions.jboss.rest;

import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * A class extending {@link Application} and annotated with @ApplicationPath is the Java EE 6 "no XML" approach to activating JAX-RS.
 * 
 * <p>
 * Resources are served relative to the servlet path specified in the {@link ApplicationPath} annotation.
 * 
 * read this
 * 
 * http://jmchung.github.io/blog/2013/12/14/integrating-swagger-into-jax-rs-with-java-ee-6-specification/
 * 
 * invoke through /jdo/rest/api-docs
 * </p>
 */
@ApplicationPath("/rest")
public class JaxRsActivator extends Application {

	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> resources = new java.util.HashSet<>();
		resources.add(com.wordnik.swagger.jaxrs.listing.ApiListingResource.class);
		resources.add(com.wordnik.swagger.jaxrs.listing.ApiDeclarationProvider.class);
		resources.add(com.wordnik.swagger.jaxrs.listing.ApiListingResourceJSON.class);
		resources.add(com.wordnik.swagger.jaxrs.listing.ResourceListingProvider.class);
		addRestResourceClasses(resources);
		return resources;
	}

	/**
	 * Do not modify addRestResourceClasses() method. It is automatically populated with all resources defined in the project. If required, comment out calling this method in getClasses().
	 */
	private void addRestResourceClasses(Set<Class<?>> resources) {
		resources.add(ProfileResource.class);
	}

}
