package processlogicservice.rest;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("sdelab/resources")
public class ProcessLogicServiceApplicationConfig extends ResourceConfig {
	public ProcessLogicServiceApplicationConfig() {
		packages("processlogicservice.rest.resources"); // Jersey will load all the resources under this package
	}
}