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
	//	private final String food2forkURI = "http://localhost:8001/food2fork/adapter/";
	private final String yummlyURI = "http://localhost:8002/yummly/adapter/";

	public WebTarget quotesServiceWebTarget;
	public WebTarget linearFitterWebTarget;
	//	public WebTarget food2forkWebTarget;
	public WebTarget yummlyWebTarget;

	//SOAP services
	private EntitiesService entitiesService = new EntitiesService();
	public Entities entities;

	//	private PeopleService peopleService = new PeopleService();
	//	private GoalsService goalsService = new GoalsService();
	//	private MeasurementsService measurementsService = new MeasurementsService();

	//	public People people;
	//	public Goals goals;
	//	public Measurements measurements;

	private ExternalServicesInformation() {
		//		food2forkWebTarget = ClientBuilder.newClient(new ClientConfig()).target(UriBuilder.fromUri(food2forkURI).build());
		yummlyWebTarget = ClientBuilder.newClient(new ClientConfig()).target(UriBuilder.fromUri(yummlyURI).build());
		quotesServiceWebTarget = ClientBuilder.newClient(new ClientConfig()).target(
				UriBuilder.fromUri(quotesServiceURI).build());
		linearFitterWebTarget = ClientBuilder.newClient(new ClientConfig()).target(
				UriBuilder.fromUri(linearFitterURI).build());

		entities = entitiesService.getEntitiesImplPort();
		//		people = peopleService.getPeopleImplPort();
		//		goals = goalsService.getGoalsImplPort();
		//		measurements = measurementsService.getMeasurementsImplPort();

		System.out.println("EVERYTHING WAS SET.");
	}

}
