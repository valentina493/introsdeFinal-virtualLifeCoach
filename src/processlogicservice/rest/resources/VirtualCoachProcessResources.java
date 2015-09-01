package processlogicservice.rest.resources;

import java.awt.geom.Point2D;
import java.io.IOException;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Set;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.PersistenceUnit;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.ProcessingException;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import localdbservices.soap.Goal;
import localdbservices.soap.MeasureType;
import localdbservices.soap.Measurement;
import localdbservices.soap.ParseException_Exception;
import localdbservices.soap.Person;
import localdbservices.soap.SOAPException_Exception;

import org.joda.time.DateTime;
import org.joda.time.Days;
import org.w3c.dom.Document;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import processlogicservice.dao.ExternalServicesInformation;
import processlogicservice.model.LinearFitterComputeYInput;
import processlogicservice.model.MyResponse;
import processlogicservice.model.Quote;
import processlogicservice.model.Recipe;

@Stateless
@LocalBean
@Path("/virtualcoach")
public class VirtualCoachProcessResources {
	final String YUMMLY_DESSERT_ENCODING = "course%5Ecourse-Desserts";
	final String YUMMLY_DESSERT = "treat";

	final String YUMMLY_SALAD_ENCODING = "course%5Ecourse-Salads";
	final String YUMMLY_MAIN_DISH_ENCODING = "course%5Ecourse-Main Dishes";
	final String YUMMLY_SOUP_ENCODING = "course%5Ecourse-Soups";

	final String YUMMLY_SALAD = "salad";
	final String YUMMLY_MAIN_DISH = "main dish";
	final String YUMMLY_SOUP = "soup";

	List<String> yummlyHealthyCoursesForRequests = null;
	List<String> yummlyHealthyCourses = null;

	final String persistenceUnitName = "motivationalQuotesService";
	DocumentBuilder builder;
	Document document;

	final ObjectMapper mapper = new ObjectMapper();
	final SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");

	@Context
	UriInfo uriInfo;
	@Context
	Request request;

	@PersistenceUnit(unitName = persistenceUnitName)
	EntityManager entityManager;

	@PersistenceContext(unitName = persistenceUnitName, type = PersistenceContextType.TRANSACTION)
	private EntityManagerFactory entityManagerFactory;

	public VirtualCoachProcessResources() throws ParserConfigurationException {
		builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		initialiseHealthyCourses();
	}

	private void initialiseHealthyCourses() {
		yummlyHealthyCoursesForRequests = new ArrayList<String>();
		yummlyHealthyCoursesForRequests.add(YUMMLY_MAIN_DISH_ENCODING);
		yummlyHealthyCoursesForRequests.add(YUMMLY_SALAD_ENCODING);
		yummlyHealthyCoursesForRequests.add(YUMMLY_SOUP_ENCODING);

		yummlyHealthyCourses = new ArrayList<String>();
		yummlyHealthyCourses.add(YUMMLY_MAIN_DISH);
		yummlyHealthyCourses.add(YUMMLY_SALAD);
		yummlyHealthyCourses.add(YUMMLY_SOUP);
	}

	@GET
	@Path("/getUser/{personId}")
	public Person getUser(@PathParam("personId") long personId) {
		Person p = null;
		try {
			p = ExternalServicesInformation.instance.entities.readPerson(personId);
		} catch (Exception e) {
			discernAndThrowException(e);
		}
		return p;
	}

	@POST
	@Path("/newUser")
	@Produces(MediaType.APPLICATION_JSON)
	public Person addUser(@QueryParam("firstname") String firstName, @QueryParam("lastname") String lastName,
			@QueryParam("birthdate") String birthdate) {
		if (firstName == null || lastName == null || firstName.isEmpty() || lastName.isEmpty()) {
			// firstname and lastname must be present in the path
			throw new WebApplicationException(Response.Status.BAD_REQUEST);
		}

		Person p = new Person();
		p.setFirstname(firstName);
		p.setLastname(lastName);
		p.setBirthdate(birthdate);

		Person createdP = null;
		try {
			createdP = ExternalServicesInformation.instance.entities.createPerson(p);

		} catch (Exception e) {
			discernAndThrowException(e);
		}
		return createdP;
	}

	@PUT
	@Path("/updateUser")
	@Produces(MediaType.APPLICATION_JSON)
	public Person updateUser(@QueryParam("personId") long personId, @QueryParam("firstname") String firstName,
			@QueryParam("lastname") String lastName, @QueryParam("birthdate") String birthdate) {
		if (personId == 0 || firstName == null || firstName.isEmpty() || lastName == null || lastName.isEmpty()) {
			// firstname and lastname must be present in the path: o.w. the entry in the db will be updated with missing attributes
			// personId must be present, otherwise we don't know which person should be updated
			throw new WebApplicationException(Response.Status.BAD_REQUEST);
		}

		Person p = new Person();
		p.setPersonId(personId);
		p.setFirstname(firstName);
		p.setLastname(lastName);
		p.setBirthdate(birthdate);

		Person updatedP = null;
		try {
			updatedP = ExternalServicesInformation.instance.entities.updatePerson(p);
		} catch (Exception e) {
			discernAndThrowException(e);
		}

		return updatedP;
	}

	@DELETE
	@Path("/deleteUser/{personId}")
	public Response deleteUser(@PathParam("personId") long personId) {
		try {
			ExternalServicesInformation.instance.entities.deletePerson(personId);
		} catch (Exception e) {
			discernAndThrowException(e);
		}
		return Response.status(Response.Status.OK).build();
	}

	@POST
	@Path("/newGoal")
	@Produces(MediaType.APPLICATION_JSON)
	public Goal addGoal(@QueryParam("personId") long personId, @QueryParam("measureType") String measureType,
			@QueryParam("minValue") double minValue, @QueryParam("maxValue") double maxValue,
			@QueryParam("deadline") String deadline) throws ParseException {

		if (personId == 0 || measureType == null || measureType.isEmpty() || deadline == null || deadline.isEmpty()
				|| (minValue == 0.0 && maxValue == 0.0) || (minValue >= maxValue)) {
			// personId, measuretype and deadline must be present in the path
			// and at least one of the extremes must be in there
			throw new WebApplicationException(Response.Status.BAD_REQUEST);
		}

		if (maxValue == 0.0) {
			maxValue = Double.POSITIVE_INFINITY;
		}

		if (df.parse(deadline).before(new Date())) {
			throw new WebApplicationException(Response.Status.BAD_REQUEST);
		}

		Goal g = new Goal();
		g.setCreated(df.format(new Date()));
		g.setDeadline(deadline);
		g.setMaxvalue(maxValue);
		g.setMinvalue(minValue);

		try {
			ExternalServicesInformation.instance.entities.readMeasureTypesByName(measureType);
		} catch (Exception e) {
			discernAndThrowException(e);
		}

		Goal createdG = null;
		try {
			createdG = ExternalServicesInformation.instance.entities.createGoal(g, personId, measureType);
		} catch (Exception e) {
			discernAndThrowException(e);
		}
		return createdG;
	}

	@PUT
	@Path("/updateGoal")
	@Produces(MediaType.APPLICATION_JSON)
	public Goal updateGoal(@QueryParam("goalId") long goalId, @QueryParam("minValue") double minValue,
			@QueryParam("maxValue") double maxValue, @QueryParam("deadline") String deadline) {
		if (goalId == 0 || deadline == null || (minValue == 0.0 && maxValue == 0.0) || (minValue >= maxValue)) {
			throw new WebApplicationException(Response.Status.BAD_REQUEST);
		}

		if (maxValue == 0.0) {
			maxValue = Double.POSITIVE_INFINITY;
		}

		//no need to set the measuretype
		Goal g = new Goal();
		g.setGoalId(goalId);
		g.setCreated(df.format(new Date()));
		g.setMaxvalue(maxValue);
		g.setMinvalue(minValue);
		g.setDeadline(deadline);

		Goal updatedG = null;
		try {
			updatedG = ExternalServicesInformation.instance.entities.updateGoal(g);
		} catch (Exception e) {
			discernAndThrowException(e);
		}
		return updatedG;
	}

	@DELETE
	@Path("/deleteGoal/{goalId}")
	public Response deleteGoal(@PathParam("goalId") long goalId) {
		if (goalId == 0) {
			throw new WebApplicationException(Response.Status.BAD_REQUEST);
		}
		try {
			ExternalServicesInformation.instance.entities.deleteGoal(goalId);
		} catch (Exception e) {
			discernAndThrowException(e);
		}
		return Response.status(Response.Status.OK).build();
	}

	@POST
	@Path("/newMeasurement")
	@Produces(MediaType.APPLICATION_JSON)
	public Measurement addMeasurement(@QueryParam("personId") long personId,
			@QueryParam("measureType") String measureTypeName, @QueryParam("measuringDate") String measuringDate,
			@QueryParam("value") double value) {
		if (personId == 0 || measureTypeName == null || measureTypeName.isEmpty() || value == 0.0) {
			// they must be present in the path
			// if measuring date is not, just set the current date
			throw new WebApplicationException(Response.Status.BAD_REQUEST);
		}

		Measurement m = new Measurement();
		// don't need to set person and measuretype (trivially, not even id)
		if (measuringDate == null || measuringDate.isEmpty()) {
			measuringDate = df.format(new Date());
		}
		m.setMeasuringDate(measuringDate);
		m.setValue(value);

		Measurement createdM = null;

		try {
			createdM = ExternalServicesInformation.instance.entities.createMeasurement(m, personId, measureTypeName);
		} catch (Exception e) {
			discernAndThrowException(e);
		}
		return createdM;
	}

	@PUT
	@Path("/updateMeasurement")
	@Produces(MediaType.APPLICATION_JSON)
	public Measurement updateMeasurement(@QueryParam("measurementId") long measurementId,
			@QueryParam("measureType") String measureType, @QueryParam("measuringDate") String measuringDate,
			@QueryParam("value") double value) {
		if (measurementId == 0 || value == 0.0 || measureType == null || measureType.isEmpty() || measuringDate == null
				|| measuringDate.isEmpty()) {
			throw new WebApplicationException(Response.Status.BAD_REQUEST);
		}

		MeasureType mt = null;
		try {
			mt = ExternalServicesInformation.instance.entities.readMeasureTypesByName(measureType);
		} catch (Exception e) {
			discernAndThrowException(e);
		}

		Measurement m = new Measurement();
		m.setMeasurementId(measurementId);
		m.setValue(value);
		m.setMeasureType(mt);
		m.setMeasuringDate(measuringDate);

		Measurement updatedM = null;
		try {
			updatedM = ExternalServicesInformation.instance.entities.updateMeasurement(m);
		} catch (Exception e) {
			discernAndThrowException(e);
		}
		return updatedM;
	}

	@DELETE
	@Path("/deleteMeasurement/{measurementId}")
	public Response deleteMeasurement(@PathParam("measurementId") long measurementId) {
		if (measurementId == 0) {
			throw new WebApplicationException(Response.Status.BAD_REQUEST);
		}
		try {
			ExternalServicesInformation.instance.entities.deleteMeasurement(measurementId);
		} catch (Exception e) {
			discernAndThrowException(e);
		}
		return Response.status(Response.Status.OK).build();
	}

	@GET
	@Path("/getGoals/{personId}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Goal> getAllGoalsByPerson(@PathParam("personId") long personId) {
		List<Goal> allGoals = null;

		try {
			allGoals = ExternalServicesInformation.instance.entities.readGoalsByPerson(personId);
		} catch (Exception e) {
			discernAndThrowException(e);
		}
		return allGoals;
	}

	@GET
	@Path("/getActiveGoals/{personId}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Goal> getActiveGoalsByPerson(@PathParam("personId") long personId) {
		List<Goal> allGoals = null;

		try {
			allGoals = ExternalServicesInformation.instance.entities.readActiveGoalsByPerson(personId);
		} catch (Exception e) {
			discernAndThrowException(e);
		}
		return allGoals;
	}

	@GET
	@Path("/getMeasurements/{personId}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Measurement> getAllMeasurementsByPerson(@PathParam("personId") long personId) {
		List<Measurement> allMeasurements = null;

		try {
			allMeasurements = ExternalServicesInformation.instance.entities.readMeasurementsByPerson(personId);
		} catch (Exception e) {
			discernAndThrowException(e);
		}
		return allMeasurements;
	}

	@GET
	@Path("/checkGoal/{personId}")
	@Produces(MediaType.APPLICATION_JSON)
	public MyResponse checkHowAGoalIsGoing(@PathParam("personId") long personId) throws ParseException, IOException {
		final int optimalSize = 10;
		MyResponse myresponse = new MyResponse();

		//get list of goals and choose a random one
		List<Goal> activeGoals = null;
		try {
			activeGoals = ExternalServicesInformation.instance.entities.readActiveGoalsByPerson(personId);
		} catch (Exception e) {
			discernAndThrowException(e);
		}

		if (activeGoals.isEmpty()) {
			myresponse.setGeneralComment("You do not have defined any goals yet.");
			return myresponse;
		}

		int randomGoalIndex = new Random().nextInt(activeGoals.size());
		Goal chosenGoal = activeGoals.get(randomGoalIndex);
		String chosenMeasureType = chosenGoal.getMeasureType().getName();

		//get list of measurements for the chosen measuretype
		List<Measurement> measurementsForChosenMeasureType = null;
		try {
			// the list returned is ordered by measuring date in desc order
			measurementsForChosenMeasureType = ExternalServicesInformation.instance.entities
					.readMeasurementsByPersonAndMeasureType(personId, chosenMeasureType);
		} catch (Exception e) {
			discernAndThrowException(e);
		}

		if (measurementsForChosenMeasureType.size() <= 1) {//need at least 2 points
			myresponse.setGeneralComment("You need to add some new measurement for " + chosenMeasureType);
			return myresponse;
		}

		List<Measurement> lastTenMeasurements = measurementsForChosenMeasureType;
		if (measurementsForChosenMeasureType.size() >= optimalSize) {
			lastTenMeasurements = measurementsForChosenMeasureType.subList(0, optimalSize);
		}

		Measurement firstMeasurement = lastTenMeasurements.get(lastTenMeasurements.size() - 1);
		Measurement lastMeasurement = lastTenMeasurements.get(0);

		//compute input
		LinearFitterComputeYInput mObj = prepareInputForLinearFitter(lastTenMeasurements,
				df.parse(firstMeasurement.getMeasuringDate()), df.parse(chosenGoal.getDeadline()));

		//create object and send request
		ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
		String myObjectJson = ow.writeValueAsString(mObj);
		Response response = POSTCaller(ExternalServicesInformation.instance.linearFitterWebTarget, "fit/computeYgivenX",
				MediaType.APPLICATION_JSON, myObjectJson);

		String resp = response.readEntity(String.class);

		JsonNode tree = mapper.readTree(resp);
		double resultY = tree.path("output").asDouble();
		double slope = tree.path("line").path("slope").asDouble();

		//If the projection and the current measurement are in the goal boundaries:
		// keep going like this!

		if (chosenGoal.getMinvalue() <= resultY && resultY <= chosenGoal.getMaxvalue()) { // if the predicted result is in the boundaries
			myresponse.setGeneralComment("Your " + chosenMeasureType
					+ " measurements are pretty good! If you keep going like this, your goal will be achieved!");
			myresponse.setColor("green");
			
		} else if (chosenGoal.getMinvalue() <= lastMeasurement.getValue()
				&& lastMeasurement.getValue() <= chosenGoal.getMaxvalue()) { // if current measurements are in the boundaries (but the prediction is not)
			myresponse.setGeneralComment("Your current " + chosenMeasureType
					+ " measurements are in the goal boundaries! Try to keep it as it is in order to achieve your goal!");
			myresponse.setColor("yellow");
		} else if ((slope > 0.3 && chosenGoal.getMinvalue() > lastMeasurement.getValue())
				|| (slope < -0.3 && chosenGoal.getMaxvalue() < lastMeasurement.getValue())
				|| (slope > -0.3 && slope < 0.3)) { // if the predictions are not part of the goal but the direction is correct
			myresponse.setGeneralComment("Your " + chosenMeasureType
					+ " measurements are okay but you need to push a bit more in order to achieve your goal");
			myresponse.setColor("yellow");

		} else if ((slope < -0.3 && chosenGoal.getMinvalue() > lastMeasurement.getValue())
				|| (slope > 0.3 && chosenGoal.getMaxvalue() < lastMeasurement.getValue())) { // if the direction is wrong
			myresponse.setGeneralComment("Your " + chosenMeasureType
					+ " measurements are pretty far from your goal! You need to put more effort in this!");
			myresponse.setColor("red");
		}

		// get quote from service, process response and add quote to the new response
		Response quoteresponse = GETCaller(ExternalServicesInformation.instance.quotesServiceWebTarget, "/getRandom",
				MediaType.APPLICATION_JSON, null);
		resp = quoteresponse.readEntity(String.class);
		tree = mapper.readTree(resp);
		Quote q = new Quote();
		q.setAuthor(tree.path("author").asText());
		q.setSentence(tree.path("text").asText());

		myresponse.setQuote(q);

		if (myresponse.getColor().contentEquals("green")) {
			myresponse.setRecipe(getRandomTreatRecipe(personId));
		} else if (chosenMeasureType.contentEquals("weight") || chosenMeasureType.contentEquals("assumed energy")) {
			myresponse.setRecipe(getRandomHealthyRecipe(personId));
		} else if (chosenMeasureType.contentEquals("sleeping hours")) {
			if (lastMeasurement.getValue() > chosenGoal.getMaxvalue()) {
				myresponse.setSuggestion(
						"Your last measurement says that you sleep too much! Try to get up earlier in the morning, or go to bed later in the evening.");
			} else if (lastMeasurement.getValue() < chosenGoal.getMinvalue()) {
				myresponse.setSuggestion(
						"Your last measurement says that you sleep too little! Try to get up later in the morning, or go to bed earlier in the evening.");
			}
		} else if (chosenMeasureType.contentEquals("steps")) {
			if (lastMeasurement.getValue() > chosenGoal.getMaxvalue()) {
				myresponse.setSuggestion(
						"Your last measurement says that you walk too much! Try to rest a bit more every day.");
			} else if (lastMeasurement.getValue() < chosenGoal.getMinvalue()) {
				myresponse.setSuggestion(
						"Your last measurement says that you walk too little! Try to go walking more often, or take the stair instead of the lift when possible.");
			}

		} else if (chosenMeasureType.contentEquals("consumed energy")) {
			if (lastMeasurement.getValue() > chosenGoal.getMaxvalue()) {
				myresponse.setSuggestion(
						"Your last measurement says that you consume too much energy! Try to rest a bit more every day.");
			} else if (lastMeasurement.getValue() < chosenGoal.getMinvalue()) {
				myresponse.setSuggestion(
						"Your last measurement says that you consume too little energy! Try to go jogging or swimming or practice your favourite sport.");
			}
		}
		return myresponse;

	}

	@GET
	@Path("/checkExpiringGoals/{personId}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<ExpiringGoal> checkExpiringGoals(@PathParam("personId") long personId)
			throws ParseException, IOException, ParseException_Exception, SOAPException_Exception {
		List<Goal> expiringGoals = null;
		List<ExpiringGoal> expiringGoalsResponse = new ArrayList<>();

		try {
			expiringGoals = ExternalServicesInformation.instance.entities.readExpiredGoalsByPerson(personId);
		} catch (Exception e) {
			discernAndThrowException(e);
		}

		Measurement m = null;
		for (Goal g : expiringGoals) {

			try {
				m = ExternalServicesInformation.instance.entities.readLastMeasurementByPersonAndMeasureType(personId,
						g.getMeasureType().getName());
			} catch (Exception e) {
				discernAndThrowException(e);
			}
			ExpiringGoal expGoal = new ExpiringGoal(g);
			Date measuringDate = df.parse(m.getMeasuringDate());
			if (m != null && 
					!measuringDate.before(df.parse(g.getCreated())) &&
					!measuringDate.after(df.parse(g.getDeadline()))){
				expGoal.satisfied = (m.getValue() <= g.getMaxvalue() && m.getValue() >= g.getMinvalue());
				expGoal.satisfiable = true;
			} else {
				expGoal.satisfiable = false;
				expGoal.satisfied = false;
			}
			expiringGoalsResponse.add(expGoal);
		}

		ExternalServicesInformation.instance.entities.setEvaluatedGoals(expiringGoals);
		return expiringGoalsResponse;
	}

	@GET
	@Path("/checkOldestMeasurements/{personId}")
	@Produces(MediaType.APPLICATION_JSON)
	public MyResponse checkOldestMeasurements(@PathParam("personId") long personId)
			throws ParseException_Exception, ParseException {
		List<Goal> activeGoals = null;
		MyResponse resp = new MyResponse();

		try {
			activeGoals = ExternalServicesInformation.instance.entities.readActiveGoalsByPerson(personId);
		} catch (Exception e) {
			discernAndThrowException(e);
		}

		if (activeGoals.size() == 0) {
			resp.setGeneralComment(
					"You do not have defined any goals yet. Please add some new ones so you can monitor your health.");
			return resp;
		}

		List<Measurement> lastMeasurements = null;

		try {
			lastMeasurements = ExternalServicesInformation.instance.entities
					.readLastMeasurementForEachMeasureTypeByPerson(personId);
		} catch (Exception e) {
			discernAndThrowException(e);
		}

		// creates a hashmap in order to look for measurements more easily
		// at the same time, it stores the oldest measurement

		HashMap<String, Measurement> map = new HashMap<>();
		Measurement oldestMeasurement = null;
		Date oldestDate = null;
		for (Measurement m : lastMeasurements) {
			map.put(m.getMeasureType().getName(), m);

			if (oldestMeasurement == null) {
				oldestMeasurement = m;
				oldestDate = df.parse(oldestMeasurement.getMeasuringDate());
			} else {

				Date mDate = df.parse(m.getMeasuringDate());

				if (mDate.before(oldestDate)) {
					oldestMeasurement = m;
					oldestDate = mDate;
				}
			}
		}

		// for each goal in activegoals, checks if there is a measurement. 
		// If there aren't any, stop and suggest to add a new measurement for that goal

		for (Goal g : activeGoals) {
			if (!map.containsKey(g.getMeasureType().getName())) {
				resp.setGeneralComment("You do not have any measurements of type " + g.getMeasureType().getName()
						+ ". Please add new ones so you can monitor your health");
				return resp;
			}
			Measurement m = map.get(g.getMeasureType().getName());
			if(df.parse(g.getCreated()).after(df.parse(m.getMeasuringDate()))){
				resp.setGeneralComment("You do not have recent measurements of type " + g.getMeasureType().getName()
						+ ". Please add new ones so you can monitor your health");
				return resp;
			}
		}

		//if every goal has at least a (recent) measurement, just pick the oldest one which was identified before
		resp.setGeneralComment(
				"You have not added a new measurement of type " + oldestMeasurement.getMeasureType().getName()
						+ " for a while. Please add new ones so you can monitor your health");
		return resp;
	}

	@GET
	@Path("/getRandomHealthyRecipe/{personId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Recipe giveRandomHealthyRecipe(@PathParam("personId") long personId)
			throws JsonProcessingException, IOException {
		return getRandomHealthyRecipe(personId);
	}

	@XmlRootElement
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(propOrder = { "goalId", "personId", "measureType", "minvalue", "maxvalue", "created", "deadline",
			"satisfied", "satisfiable" })
	private class ExpiringGoal extends Goal implements Serializable {
		private static final long serialVersionUID = 9097004706280981056L;

		@XmlElement
		boolean satisfied;
		@XmlElement
		boolean satisfiable;

		public ExpiringGoal(Goal g) {
			super();
			this.goalId = g.getGoalId();
			this.personId = g.getPersonId();
			this.measureType = g.getMeasureType();
			this.minvalue = g.getMinvalue();
			this.maxvalue = g.getMaxvalue();
			this.created = g.getCreated();
			this.deadline = g.getDeadline();
		}

	}

	private Recipe requestRecipe(long personId, String course) throws JsonProcessingException, IOException {
		Goal g = null;
		int minCal = 1500, maxCal = 3000;

		try {
			g = ExternalServicesInformation.instance.entities.readActiveGoalByPersonByMeasureType(personId,
					"assumed energy");
		} catch (Exception e) {
			discernAndThrowException(e);
		}
		if (g != null) {
			maxCal = ((Double) g.getMaxvalue()).intValue();
			minCal = ((Double) g.getMinvalue()).intValue();
		}

		HashMap<String, Object> queries = new HashMap<>();
		queries.put("maxCal", maxCal);
		queries.put("minCal", minCal);
		queries.put("course", course);

		Response r = GETCaller(ExternalServicesInformation.instance.yummlyWebTarget, "getRandom",
				MediaType.APPLICATION_JSON, queries);
		String body = r.readEntity(String.class);
		JsonNode tree = mapper.readTree(body);
		Recipe recipe = new Recipe();
		recipe.setId(tree.path("_id").asText());
		recipe.setImageUrl(tree.path("imageUrl").asText());
		recipe.setUrl(tree.path("recipeUrl").asText());
		recipe.setTitle(tree.path("recipeTitle").asText());
		return recipe;
	}

	private Recipe getRandomHealthyRecipe(long personId) throws JsonProcessingException, IOException {
		int randomIndex = new Random().nextInt(yummlyHealthyCoursesForRequests.size());
		Recipe r = requestRecipe(personId, yummlyHealthyCoursesForRequests.get(randomIndex));
		r.setType(yummlyHealthyCourses.get(randomIndex));

		return r;
	}

	private Recipe getRandomTreatRecipe(long personId) throws JsonProcessingException, IOException {
		Recipe r = requestRecipe(personId, YUMMLY_DESSERT_ENCODING);//treat
		r.setType(YUMMLY_DESSERT);

		return r;
	}

	private void discernAndThrowException(Exception e) {
		if (e.getMessage().contains("400")) {
			System.out.println(e.getMessage());
			throw new WebApplicationException(Response.Status.BAD_REQUEST);
		} else if (e.getMessage().contains("404")) {
			System.out.println(e.getMessage());
			throw new WebApplicationException(Response.Status.NOT_FOUND);
		}
	}

	private Response POSTCaller(WebTarget target, String path, String favouriteContentType, String payload) {
		target = target.path(path);
		try {
			Response response = target.request().accept(favouriteContentType)
					.post(Entity.entity(payload, favouriteContentType), Response.class);
			return response;
		} catch (ProcessingException ex) {
			System.out.println("SERVER AT " + target.getUri() + " IS DOWN");
			throw new WebApplicationException(Response.Status.SERVICE_UNAVAILABLE);
		}
	}

	private Response GETCaller(WebTarget target, String path, String acceptedMedia, HashMap<String, Object> queries) {
		target = target.path(path);

		if (queries != null) {
			Set<String> keys = queries.keySet();

			for (String key : keys) {
				target = target.queryParam(key, queries.get(key));
			}
		}
		try {
			Response response = target.request().accept(acceptedMedia).get(Response.class);
			return response;
		} catch (ProcessingException ex) {
			System.out.println("SERVER AT " + target.getUri() + " IS DOWN");
			throw new WebApplicationException(Response.Status.SERVICE_UNAVAILABLE);
		}
	}

	private LinearFitterComputeYInput prepareInputForLinearFitter(List<Measurement> lastTenMeasurements, Date firstdate,
			Date deadlineDate) throws ParseException {
		List<Point2D.Double> inputPoints = new ArrayList<Point2D.Double>();

		for (Measurement mt : lastTenMeasurements) {
			Date newDate = df.parse(mt.getMeasuringDate());
			int days = Math.abs(Days.daysBetween(new DateTime(firstdate), new DateTime(newDate)).getDays());
			inputPoints.add(new Point2D.Double(days, mt.getValue()));
		}

		//compute x
		int x = Math.abs(Days.daysBetween(new DateTime(firstdate), new DateTime(deadlineDate)).getDays());

		LinearFitterComputeYInput mObj = new LinearFitterComputeYInput();
		mObj.setInputPoints(inputPoints);
		mObj.setX(x);

		return mObj;
	}

}
