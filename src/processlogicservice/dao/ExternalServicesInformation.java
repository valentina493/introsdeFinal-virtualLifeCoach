package processlogicservice.dao;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.UriBuilder;

import localdbservices.soap.Entities;
import localdbservices.soap.EntitiesService;

import org.glassfish.jersey.client.ClientConfig;

public enum ExternalServicesInformation {
	instance;

	//REST services
	//private final String quotesServiceURI = "http://localhost:9090/motivationalquotes/sport/quote";
	private final String quotesServiceURI = "http://localhost:8001/quotes/adapter/";
	private final String linearFitterURI = "http://localhost:9091/linearfitter/"; //business logic
	private final String yummlyURI = "http://localhost:8002/yummly/adapter/";

	public WebTarget quotesServiceWebTarget;
	public WebTarget linearFitterWebTarget;
	public WebTarget yummlyWebTarget;

	//SOAP services
	private EntitiesService entitiesService = new EntitiesService();
	public Entities entities;

	private ExternalServicesInformation() {
		yummlyWebTarget = ClientBuilder.newClient(new ClientConfig()).target(UriBuilder.fromUri(yummlyURI).build());
		quotesServiceWebTarget = ClientBuilder.newClient(new ClientConfig()).target(
				UriBuilder.fromUri(quotesServiceURI).build());
		linearFitterWebTarget = ClientBuilder.newClient(new ClientConfig()).target(
				UriBuilder.fromUri(linearFitterURI).build());

		entities = entitiesService.getEntitiesImplPort();

		System.out.println("EVERYTHING WAS SET.");
	}

}
