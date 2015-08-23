
package localdbservices.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the localdbservices.soap package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SetEvaluatedGoals_QNAME = new QName("http://soap.localdbservices/", "setEvaluatedGoals");
    private final static QName _UpdatePerson_QNAME = new QName("http://soap.localdbservices/", "updatePerson");
    private final static QName _CreateGoalResponse_QNAME = new QName("http://soap.localdbservices/", "createGoalResponse");
    private final static QName _CreateGoal_QNAME = new QName("http://soap.localdbservices/", "createGoal");
    private final static QName _DeleteMeasurement_QNAME = new QName("http://soap.localdbservices/", "deleteMeasurement");
    private final static QName _ReadMeasureTypesByName_QNAME = new QName("http://soap.localdbservices/", "readMeasureTypesByName");
    private final static QName _ReadGoalsByPersonResponse_QNAME = new QName("http://soap.localdbservices/", "readGoalsByPersonResponse");
    private final static QName _UpdateMeasurementResponse_QNAME = new QName("http://soap.localdbservices/", "updateMeasurementResponse");
    private final static QName _ReadLastMeasurementForEachMeasureTypeByPersonResponse_QNAME = new QName("http://soap.localdbservices/", "readLastMeasurementForEachMeasureTypeByPersonResponse");
    private final static QName _DeleteGoal_QNAME = new QName("http://soap.localdbservices/", "deleteGoal");
    private final static QName _DeleteMeasurementResponse_QNAME = new QName("http://soap.localdbservices/", "deleteMeasurementResponse");
    private final static QName _ReadMeasureTypesById_QNAME = new QName("http://soap.localdbservices/", "readMeasureTypesById");
    private final static QName _ReadLastMeasurementByPersonAndMeasureTypeResponse_QNAME = new QName("http://soap.localdbservices/", "readLastMeasurementByPersonAndMeasureTypeResponse");
    private final static QName _ReadActiveGoalsByPerson_QNAME = new QName("http://soap.localdbservices/", "readActiveGoalsByPerson");
    private final static QName _ReadMeasureTypesByNameResponse_QNAME = new QName("http://soap.localdbservices/", "readMeasureTypesByNameResponse");
    private final static QName _Person_QNAME = new QName("http://soap.localdbservices/", "person");
    private final static QName _ReadMeasurementByIdResponse_QNAME = new QName("http://soap.localdbservices/", "readMeasurementByIdResponse");
    private final static QName _ReadPersonList_QNAME = new QName("http://soap.localdbservices/", "readPersonList");
    private final static QName _ReadActiveGoalsByPersonResponse_QNAME = new QName("http://soap.localdbservices/", "readActiveGoalsByPersonResponse");
    private final static QName _ReadGoalResponse_QNAME = new QName("http://soap.localdbservices/", "readGoalResponse");
    private final static QName _SOAPException_QNAME = new QName("http://soap.localdbservices/", "SOAPException");
    private final static QName _UpdateGoalResponse_QNAME = new QName("http://soap.localdbservices/", "updateGoalResponse");
    private final static QName _ReadLastMeasurementByPersonAndMeasureType_QNAME = new QName("http://soap.localdbservices/", "readLastMeasurementByPersonAndMeasureType");
    private final static QName _SetEvaluatedGoalsResponse_QNAME = new QName("http://soap.localdbservices/", "setEvaluatedGoalsResponse");
    private final static QName _CreatePersonResponse_QNAME = new QName("http://soap.localdbservices/", "createPersonResponse");
    private final static QName _ReadMeasureTypeList_QNAME = new QName("http://soap.localdbservices/", "readMeasureTypeList");
    private final static QName _CreatePerson_QNAME = new QName("http://soap.localdbservices/", "createPerson");
    private final static QName _ReadMeasurementsByPersonAndMeasureTypeResponse_QNAME = new QName("http://soap.localdbservices/", "readMeasurementsByPersonAndMeasureTypeResponse");
    private final static QName _ReadPersonResponse_QNAME = new QName("http://soap.localdbservices/", "readPersonResponse");
    private final static QName _ReadGoal_QNAME = new QName("http://soap.localdbservices/", "readGoal");
    private final static QName _DeletePerson_QNAME = new QName("http://soap.localdbservices/", "deletePerson");
    private final static QName _ReadGoalsByPerson_QNAME = new QName("http://soap.localdbservices/", "readGoalsByPerson");
    private final static QName _DeletePersonResponse_QNAME = new QName("http://soap.localdbservices/", "deletePersonResponse");
    private final static QName _ReadMeasurementsByPersonAndMeasureType_QNAME = new QName("http://soap.localdbservices/", "readMeasurementsByPersonAndMeasureType");
    private final static QName _ReadMeasurementById_QNAME = new QName("http://soap.localdbservices/", "readMeasurementById");
    private final static QName _ReadMeasurementsByPerson_QNAME = new QName("http://soap.localdbservices/", "readMeasurementsByPerson");
    private final static QName _ReadExpiredGoalsByPerson_QNAME = new QName("http://soap.localdbservices/", "readExpiredGoalsByPerson");
    private final static QName _CreateMeasurementResponse_QNAME = new QName("http://soap.localdbservices/", "createMeasurementResponse");
    private final static QName _ReadMeasureTypeListResponse_QNAME = new QName("http://soap.localdbservices/", "readMeasureTypeListResponse");
    private final static QName _ReadPersonListResponse_QNAME = new QName("http://soap.localdbservices/", "readPersonListResponse");
    private final static QName _ReadMeasureTypesByIdResponse_QNAME = new QName("http://soap.localdbservices/", "readMeasureTypesByIdResponse");
    private final static QName _ReadExpiredGoalsByPersonResponse_QNAME = new QName("http://soap.localdbservices/", "readExpiredGoalsByPersonResponse");
    private final static QName _ReadMeasurementsByPersonResponse_QNAME = new QName("http://soap.localdbservices/", "readMeasurementsByPersonResponse");
    private final static QName _ParseException_QNAME = new QName("http://soap.localdbservices/", "ParseException");
    private final static QName _DeleteGoalResponse_QNAME = new QName("http://soap.localdbservices/", "deleteGoalResponse");
    private final static QName _ReadActiveGoalByPersonByMeasureType_QNAME = new QName("http://soap.localdbservices/", "readActiveGoalByPersonByMeasureType");
    private final static QName _CreateMeasurement_QNAME = new QName("http://soap.localdbservices/", "createMeasurement");
    private final static QName _UpdatePersonResponse_QNAME = new QName("http://soap.localdbservices/", "updatePersonResponse");
    private final static QName _UpdateGoal_QNAME = new QName("http://soap.localdbservices/", "updateGoal");
    private final static QName _MeasureType_QNAME = new QName("http://soap.localdbservices/", "MeasureType");
    private final static QName _ReadActiveGoalByPersonByMeasureTypeResponse_QNAME = new QName("http://soap.localdbservices/", "readActiveGoalByPersonByMeasureTypeResponse");
    private final static QName _ReadLastMeasurementForEachMeasureTypeByPerson_QNAME = new QName("http://soap.localdbservices/", "readLastMeasurementForEachMeasureTypeByPerson");
    private final static QName _ReadPerson_QNAME = new QName("http://soap.localdbservices/", "readPerson");
    private final static QName _UpdateMeasurement_QNAME = new QName("http://soap.localdbservices/", "updateMeasurement");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: localdbservices.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link ReadMeasureTypesByNameResponse }
     * 
     */
    public ReadMeasureTypesByNameResponse createReadMeasureTypesByNameResponse() {
        return new ReadMeasureTypesByNameResponse();
    }

    /**
     * Create an instance of {@link ReadActiveGoalsByPerson }
     * 
     */
    public ReadActiveGoalsByPerson createReadActiveGoalsByPerson() {
        return new ReadActiveGoalsByPerson();
    }

    /**
     * Create an instance of {@link ReadGoalResponse }
     * 
     */
    public ReadGoalResponse createReadGoalResponse() {
        return new ReadGoalResponse();
    }

    /**
     * Create an instance of {@link ReadActiveGoalsByPersonResponse }
     * 
     */
    public ReadActiveGoalsByPersonResponse createReadActiveGoalsByPersonResponse() {
        return new ReadActiveGoalsByPersonResponse();
    }

    /**
     * Create an instance of {@link ReadMeasurementByIdResponse }
     * 
     */
    public ReadMeasurementByIdResponse createReadMeasurementByIdResponse() {
        return new ReadMeasurementByIdResponse();
    }

    /**
     * Create an instance of {@link ReadPersonList }
     * 
     */
    public ReadPersonList createReadPersonList() {
        return new ReadPersonList();
    }

    /**
     * Create an instance of {@link ReadLastMeasurementByPersonAndMeasureType }
     * 
     */
    public ReadLastMeasurementByPersonAndMeasureType createReadLastMeasurementByPersonAndMeasureType() {
        return new ReadLastMeasurementByPersonAndMeasureType();
    }

    /**
     * Create an instance of {@link UpdateGoalResponse }
     * 
     */
    public UpdateGoalResponse createUpdateGoalResponse() {
        return new UpdateGoalResponse();
    }

    /**
     * Create an instance of {@link SOAPException }
     * 
     */
    public SOAPException createSOAPException() {
        return new SOAPException();
    }

    /**
     * Create an instance of {@link ReadMeasurementsByPersonAndMeasureTypeResponse }
     * 
     */
    public ReadMeasurementsByPersonAndMeasureTypeResponse createReadMeasurementsByPersonAndMeasureTypeResponse() {
        return new ReadMeasurementsByPersonAndMeasureTypeResponse();
    }

    /**
     * Create an instance of {@link CreatePerson }
     * 
     */
    public CreatePerson createCreatePerson() {
        return new CreatePerson();
    }

    /**
     * Create an instance of {@link ReadMeasureTypeList }
     * 
     */
    public ReadMeasureTypeList createReadMeasureTypeList() {
        return new ReadMeasureTypeList();
    }

    /**
     * Create an instance of {@link CreatePersonResponse }
     * 
     */
    public CreatePersonResponse createCreatePersonResponse() {
        return new CreatePersonResponse();
    }

    /**
     * Create an instance of {@link SetEvaluatedGoalsResponse }
     * 
     */
    public SetEvaluatedGoalsResponse createSetEvaluatedGoalsResponse() {
        return new SetEvaluatedGoalsResponse();
    }

    /**
     * Create an instance of {@link ReadGoalsByPersonResponse }
     * 
     */
    public ReadGoalsByPersonResponse createReadGoalsByPersonResponse() {
        return new ReadGoalsByPersonResponse();
    }

    /**
     * Create an instance of {@link ReadMeasureTypesByName }
     * 
     */
    public ReadMeasureTypesByName createReadMeasureTypesByName() {
        return new ReadMeasureTypesByName();
    }

    /**
     * Create an instance of {@link DeleteMeasurement }
     * 
     */
    public DeleteMeasurement createDeleteMeasurement() {
        return new DeleteMeasurement();
    }

    /**
     * Create an instance of {@link CreateGoal }
     * 
     */
    public CreateGoal createCreateGoal() {
        return new CreateGoal();
    }

    /**
     * Create an instance of {@link CreateGoalResponse }
     * 
     */
    public CreateGoalResponse createCreateGoalResponse() {
        return new CreateGoalResponse();
    }

    /**
     * Create an instance of {@link UpdatePerson }
     * 
     */
    public UpdatePerson createUpdatePerson() {
        return new UpdatePerson();
    }

    /**
     * Create an instance of {@link SetEvaluatedGoals }
     * 
     */
    public SetEvaluatedGoals createSetEvaluatedGoals() {
        return new SetEvaluatedGoals();
    }

    /**
     * Create an instance of {@link DeleteGoal }
     * 
     */
    public DeleteGoal createDeleteGoal() {
        return new DeleteGoal();
    }

    /**
     * Create an instance of {@link ReadLastMeasurementForEachMeasureTypeByPersonResponse }
     * 
     */
    public ReadLastMeasurementForEachMeasureTypeByPersonResponse createReadLastMeasurementForEachMeasureTypeByPersonResponse() {
        return new ReadLastMeasurementForEachMeasureTypeByPersonResponse();
    }

    /**
     * Create an instance of {@link UpdateMeasurementResponse }
     * 
     */
    public UpdateMeasurementResponse createUpdateMeasurementResponse() {
        return new UpdateMeasurementResponse();
    }

    /**
     * Create an instance of {@link ReadLastMeasurementByPersonAndMeasureTypeResponse }
     * 
     */
    public ReadLastMeasurementByPersonAndMeasureTypeResponse createReadLastMeasurementByPersonAndMeasureTypeResponse() {
        return new ReadLastMeasurementByPersonAndMeasureTypeResponse();
    }

    /**
     * Create an instance of {@link ReadMeasureTypesById }
     * 
     */
    public ReadMeasureTypesById createReadMeasureTypesById() {
        return new ReadMeasureTypesById();
    }

    /**
     * Create an instance of {@link DeleteMeasurementResponse }
     * 
     */
    public DeleteMeasurementResponse createDeleteMeasurementResponse() {
        return new DeleteMeasurementResponse();
    }

    /**
     * Create an instance of {@link ReadExpiredGoalsByPersonResponse }
     * 
     */
    public ReadExpiredGoalsByPersonResponse createReadExpiredGoalsByPersonResponse() {
        return new ReadExpiredGoalsByPersonResponse();
    }

    /**
     * Create an instance of {@link ReadMeasureTypesByIdResponse }
     * 
     */
    public ReadMeasureTypesByIdResponse createReadMeasureTypesByIdResponse() {
        return new ReadMeasureTypesByIdResponse();
    }

    /**
     * Create an instance of {@link ReadActiveGoalByPersonByMeasureType }
     * 
     */
    public ReadActiveGoalByPersonByMeasureType createReadActiveGoalByPersonByMeasureType() {
        return new ReadActiveGoalByPersonByMeasureType();
    }

    /**
     * Create an instance of {@link CreateMeasurement }
     * 
     */
    public CreateMeasurement createCreateMeasurement() {
        return new CreateMeasurement();
    }

    /**
     * Create an instance of {@link DeleteGoalResponse }
     * 
     */
    public DeleteGoalResponse createDeleteGoalResponse() {
        return new DeleteGoalResponse();
    }

    /**
     * Create an instance of {@link ParseException }
     * 
     */
    public ParseException createParseException() {
        return new ParseException();
    }

    /**
     * Create an instance of {@link ReadMeasurementsByPersonResponse }
     * 
     */
    public ReadMeasurementsByPersonResponse createReadMeasurementsByPersonResponse() {
        return new ReadMeasurementsByPersonResponse();
    }

    /**
     * Create an instance of {@link ReadActiveGoalByPersonByMeasureTypeResponse }
     * 
     */
    public ReadActiveGoalByPersonByMeasureTypeResponse createReadActiveGoalByPersonByMeasureTypeResponse() {
        return new ReadActiveGoalByPersonByMeasureTypeResponse();
    }

    /**
     * Create an instance of {@link ReadLastMeasurementForEachMeasureTypeByPerson }
     * 
     */
    public ReadLastMeasurementForEachMeasureTypeByPerson createReadLastMeasurementForEachMeasureTypeByPerson() {
        return new ReadLastMeasurementForEachMeasureTypeByPerson();
    }

    /**
     * Create an instance of {@link ReadPerson }
     * 
     */
    public ReadPerson createReadPerson() {
        return new ReadPerson();
    }

    /**
     * Create an instance of {@link MeasureType }
     * 
     */
    public MeasureType createMeasureType() {
        return new MeasureType();
    }

    /**
     * Create an instance of {@link UpdatePersonResponse }
     * 
     */
    public UpdatePersonResponse createUpdatePersonResponse() {
        return new UpdatePersonResponse();
    }

    /**
     * Create an instance of {@link UpdateGoal }
     * 
     */
    public UpdateGoal createUpdateGoal() {
        return new UpdateGoal();
    }

    /**
     * Create an instance of {@link UpdateMeasurement }
     * 
     */
    public UpdateMeasurement createUpdateMeasurement() {
        return new UpdateMeasurement();
    }

    /**
     * Create an instance of {@link DeletePerson }
     * 
     */
    public DeletePerson createDeletePerson() {
        return new DeletePerson();
    }

    /**
     * Create an instance of {@link ReadGoal }
     * 
     */
    public ReadGoal createReadGoal() {
        return new ReadGoal();
    }

    /**
     * Create an instance of {@link ReadPersonResponse }
     * 
     */
    public ReadPersonResponse createReadPersonResponse() {
        return new ReadPersonResponse();
    }

    /**
     * Create an instance of {@link ReadExpiredGoalsByPerson }
     * 
     */
    public ReadExpiredGoalsByPerson createReadExpiredGoalsByPerson() {
        return new ReadExpiredGoalsByPerson();
    }

    /**
     * Create an instance of {@link ReadMeasurementById }
     * 
     */
    public ReadMeasurementById createReadMeasurementById() {
        return new ReadMeasurementById();
    }

    /**
     * Create an instance of {@link ReadMeasurementsByPerson }
     * 
     */
    public ReadMeasurementsByPerson createReadMeasurementsByPerson() {
        return new ReadMeasurementsByPerson();
    }

    /**
     * Create an instance of {@link ReadMeasurementsByPersonAndMeasureType }
     * 
     */
    public ReadMeasurementsByPersonAndMeasureType createReadMeasurementsByPersonAndMeasureType() {
        return new ReadMeasurementsByPersonAndMeasureType();
    }

    /**
     * Create an instance of {@link DeletePersonResponse }
     * 
     */
    public DeletePersonResponse createDeletePersonResponse() {
        return new DeletePersonResponse();
    }

    /**
     * Create an instance of {@link ReadGoalsByPerson }
     * 
     */
    public ReadGoalsByPerson createReadGoalsByPerson() {
        return new ReadGoalsByPerson();
    }

    /**
     * Create an instance of {@link ReadPersonListResponse }
     * 
     */
    public ReadPersonListResponse createReadPersonListResponse() {
        return new ReadPersonListResponse();
    }

    /**
     * Create an instance of {@link ReadMeasureTypeListResponse }
     * 
     */
    public ReadMeasureTypeListResponse createReadMeasureTypeListResponse() {
        return new ReadMeasureTypeListResponse();
    }

    /**
     * Create an instance of {@link CreateMeasurementResponse }
     * 
     */
    public CreateMeasurementResponse createCreateMeasurementResponse() {
        return new CreateMeasurementResponse();
    }

    /**
     * Create an instance of {@link Goal }
     * 
     */
    public Goal createGoal() {
        return new Goal();
    }

    /**
     * Create an instance of {@link Measurement }
     * 
     */
    public Measurement createMeasurement() {
        return new Measurement();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetEvaluatedGoals }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.localdbservices/", name = "setEvaluatedGoals")
    public JAXBElement<SetEvaluatedGoals> createSetEvaluatedGoals(SetEvaluatedGoals value) {
        return new JAXBElement<SetEvaluatedGoals>(_SetEvaluatedGoals_QNAME, SetEvaluatedGoals.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.localdbservices/", name = "updatePerson")
    public JAXBElement<UpdatePerson> createUpdatePerson(UpdatePerson value) {
        return new JAXBElement<UpdatePerson>(_UpdatePerson_QNAME, UpdatePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateGoalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.localdbservices/", name = "createGoalResponse")
    public JAXBElement<CreateGoalResponse> createCreateGoalResponse(CreateGoalResponse value) {
        return new JAXBElement<CreateGoalResponse>(_CreateGoalResponse_QNAME, CreateGoalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateGoal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.localdbservices/", name = "createGoal")
    public JAXBElement<CreateGoal> createCreateGoal(CreateGoal value) {
        return new JAXBElement<CreateGoal>(_CreateGoal_QNAME, CreateGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteMeasurement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.localdbservices/", name = "deleteMeasurement")
    public JAXBElement<DeleteMeasurement> createDeleteMeasurement(DeleteMeasurement value) {
        return new JAXBElement<DeleteMeasurement>(_DeleteMeasurement_QNAME, DeleteMeasurement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadMeasureTypesByName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.localdbservices/", name = "readMeasureTypesByName")
    public JAXBElement<ReadMeasureTypesByName> createReadMeasureTypesByName(ReadMeasureTypesByName value) {
        return new JAXBElement<ReadMeasureTypesByName>(_ReadMeasureTypesByName_QNAME, ReadMeasureTypesByName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadGoalsByPersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.localdbservices/", name = "readGoalsByPersonResponse")
    public JAXBElement<ReadGoalsByPersonResponse> createReadGoalsByPersonResponse(ReadGoalsByPersonResponse value) {
        return new JAXBElement<ReadGoalsByPersonResponse>(_ReadGoalsByPersonResponse_QNAME, ReadGoalsByPersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateMeasurementResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.localdbservices/", name = "updateMeasurementResponse")
    public JAXBElement<UpdateMeasurementResponse> createUpdateMeasurementResponse(UpdateMeasurementResponse value) {
        return new JAXBElement<UpdateMeasurementResponse>(_UpdateMeasurementResponse_QNAME, UpdateMeasurementResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadLastMeasurementForEachMeasureTypeByPersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.localdbservices/", name = "readLastMeasurementForEachMeasureTypeByPersonResponse")
    public JAXBElement<ReadLastMeasurementForEachMeasureTypeByPersonResponse> createReadLastMeasurementForEachMeasureTypeByPersonResponse(ReadLastMeasurementForEachMeasureTypeByPersonResponse value) {
        return new JAXBElement<ReadLastMeasurementForEachMeasureTypeByPersonResponse>(_ReadLastMeasurementForEachMeasureTypeByPersonResponse_QNAME, ReadLastMeasurementForEachMeasureTypeByPersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteGoal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.localdbservices/", name = "deleteGoal")
    public JAXBElement<DeleteGoal> createDeleteGoal(DeleteGoal value) {
        return new JAXBElement<DeleteGoal>(_DeleteGoal_QNAME, DeleteGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteMeasurementResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.localdbservices/", name = "deleteMeasurementResponse")
    public JAXBElement<DeleteMeasurementResponse> createDeleteMeasurementResponse(DeleteMeasurementResponse value) {
        return new JAXBElement<DeleteMeasurementResponse>(_DeleteMeasurementResponse_QNAME, DeleteMeasurementResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadMeasureTypesById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.localdbservices/", name = "readMeasureTypesById")
    public JAXBElement<ReadMeasureTypesById> createReadMeasureTypesById(ReadMeasureTypesById value) {
        return new JAXBElement<ReadMeasureTypesById>(_ReadMeasureTypesById_QNAME, ReadMeasureTypesById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadLastMeasurementByPersonAndMeasureTypeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.localdbservices/", name = "readLastMeasurementByPersonAndMeasureTypeResponse")
    public JAXBElement<ReadLastMeasurementByPersonAndMeasureTypeResponse> createReadLastMeasurementByPersonAndMeasureTypeResponse(ReadLastMeasurementByPersonAndMeasureTypeResponse value) {
        return new JAXBElement<ReadLastMeasurementByPersonAndMeasureTypeResponse>(_ReadLastMeasurementByPersonAndMeasureTypeResponse_QNAME, ReadLastMeasurementByPersonAndMeasureTypeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadActiveGoalsByPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.localdbservices/", name = "readActiveGoalsByPerson")
    public JAXBElement<ReadActiveGoalsByPerson> createReadActiveGoalsByPerson(ReadActiveGoalsByPerson value) {
        return new JAXBElement<ReadActiveGoalsByPerson>(_ReadActiveGoalsByPerson_QNAME, ReadActiveGoalsByPerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadMeasureTypesByNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.localdbservices/", name = "readMeasureTypesByNameResponse")
    public JAXBElement<ReadMeasureTypesByNameResponse> createReadMeasureTypesByNameResponse(ReadMeasureTypesByNameResponse value) {
        return new JAXBElement<ReadMeasureTypesByNameResponse>(_ReadMeasureTypesByNameResponse_QNAME, ReadMeasureTypesByNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Person }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.localdbservices/", name = "person")
    public JAXBElement<Person> createPerson(Person value) {
        return new JAXBElement<Person>(_Person_QNAME, Person.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadMeasurementByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.localdbservices/", name = "readMeasurementByIdResponse")
    public JAXBElement<ReadMeasurementByIdResponse> createReadMeasurementByIdResponse(ReadMeasurementByIdResponse value) {
        return new JAXBElement<ReadMeasurementByIdResponse>(_ReadMeasurementByIdResponse_QNAME, ReadMeasurementByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.localdbservices/", name = "readPersonList")
    public JAXBElement<ReadPersonList> createReadPersonList(ReadPersonList value) {
        return new JAXBElement<ReadPersonList>(_ReadPersonList_QNAME, ReadPersonList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadActiveGoalsByPersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.localdbservices/", name = "readActiveGoalsByPersonResponse")
    public JAXBElement<ReadActiveGoalsByPersonResponse> createReadActiveGoalsByPersonResponse(ReadActiveGoalsByPersonResponse value) {
        return new JAXBElement<ReadActiveGoalsByPersonResponse>(_ReadActiveGoalsByPersonResponse_QNAME, ReadActiveGoalsByPersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadGoalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.localdbservices/", name = "readGoalResponse")
    public JAXBElement<ReadGoalResponse> createReadGoalResponse(ReadGoalResponse value) {
        return new JAXBElement<ReadGoalResponse>(_ReadGoalResponse_QNAME, ReadGoalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SOAPException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.localdbservices/", name = "SOAPException")
    public JAXBElement<SOAPException> createSOAPException(SOAPException value) {
        return new JAXBElement<SOAPException>(_SOAPException_QNAME, SOAPException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateGoalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.localdbservices/", name = "updateGoalResponse")
    public JAXBElement<UpdateGoalResponse> createUpdateGoalResponse(UpdateGoalResponse value) {
        return new JAXBElement<UpdateGoalResponse>(_UpdateGoalResponse_QNAME, UpdateGoalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadLastMeasurementByPersonAndMeasureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.localdbservices/", name = "readLastMeasurementByPersonAndMeasureType")
    public JAXBElement<ReadLastMeasurementByPersonAndMeasureType> createReadLastMeasurementByPersonAndMeasureType(ReadLastMeasurementByPersonAndMeasureType value) {
        return new JAXBElement<ReadLastMeasurementByPersonAndMeasureType>(_ReadLastMeasurementByPersonAndMeasureType_QNAME, ReadLastMeasurementByPersonAndMeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetEvaluatedGoalsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.localdbservices/", name = "setEvaluatedGoalsResponse")
    public JAXBElement<SetEvaluatedGoalsResponse> createSetEvaluatedGoalsResponse(SetEvaluatedGoalsResponse value) {
        return new JAXBElement<SetEvaluatedGoalsResponse>(_SetEvaluatedGoalsResponse_QNAME, SetEvaluatedGoalsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.localdbservices/", name = "createPersonResponse")
    public JAXBElement<CreatePersonResponse> createCreatePersonResponse(CreatePersonResponse value) {
        return new JAXBElement<CreatePersonResponse>(_CreatePersonResponse_QNAME, CreatePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadMeasureTypeList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.localdbservices/", name = "readMeasureTypeList")
    public JAXBElement<ReadMeasureTypeList> createReadMeasureTypeList(ReadMeasureTypeList value) {
        return new JAXBElement<ReadMeasureTypeList>(_ReadMeasureTypeList_QNAME, ReadMeasureTypeList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.localdbservices/", name = "createPerson")
    public JAXBElement<CreatePerson> createCreatePerson(CreatePerson value) {
        return new JAXBElement<CreatePerson>(_CreatePerson_QNAME, CreatePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadMeasurementsByPersonAndMeasureTypeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.localdbservices/", name = "readMeasurementsByPersonAndMeasureTypeResponse")
    public JAXBElement<ReadMeasurementsByPersonAndMeasureTypeResponse> createReadMeasurementsByPersonAndMeasureTypeResponse(ReadMeasurementsByPersonAndMeasureTypeResponse value) {
        return new JAXBElement<ReadMeasurementsByPersonAndMeasureTypeResponse>(_ReadMeasurementsByPersonAndMeasureTypeResponse_QNAME, ReadMeasurementsByPersonAndMeasureTypeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.localdbservices/", name = "readPersonResponse")
    public JAXBElement<ReadPersonResponse> createReadPersonResponse(ReadPersonResponse value) {
        return new JAXBElement<ReadPersonResponse>(_ReadPersonResponse_QNAME, ReadPersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadGoal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.localdbservices/", name = "readGoal")
    public JAXBElement<ReadGoal> createReadGoal(ReadGoal value) {
        return new JAXBElement<ReadGoal>(_ReadGoal_QNAME, ReadGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.localdbservices/", name = "deletePerson")
    public JAXBElement<DeletePerson> createDeletePerson(DeletePerson value) {
        return new JAXBElement<DeletePerson>(_DeletePerson_QNAME, DeletePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadGoalsByPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.localdbservices/", name = "readGoalsByPerson")
    public JAXBElement<ReadGoalsByPerson> createReadGoalsByPerson(ReadGoalsByPerson value) {
        return new JAXBElement<ReadGoalsByPerson>(_ReadGoalsByPerson_QNAME, ReadGoalsByPerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.localdbservices/", name = "deletePersonResponse")
    public JAXBElement<DeletePersonResponse> createDeletePersonResponse(DeletePersonResponse value) {
        return new JAXBElement<DeletePersonResponse>(_DeletePersonResponse_QNAME, DeletePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadMeasurementsByPersonAndMeasureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.localdbservices/", name = "readMeasurementsByPersonAndMeasureType")
    public JAXBElement<ReadMeasurementsByPersonAndMeasureType> createReadMeasurementsByPersonAndMeasureType(ReadMeasurementsByPersonAndMeasureType value) {
        return new JAXBElement<ReadMeasurementsByPersonAndMeasureType>(_ReadMeasurementsByPersonAndMeasureType_QNAME, ReadMeasurementsByPersonAndMeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadMeasurementById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.localdbservices/", name = "readMeasurementById")
    public JAXBElement<ReadMeasurementById> createReadMeasurementById(ReadMeasurementById value) {
        return new JAXBElement<ReadMeasurementById>(_ReadMeasurementById_QNAME, ReadMeasurementById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadMeasurementsByPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.localdbservices/", name = "readMeasurementsByPerson")
    public JAXBElement<ReadMeasurementsByPerson> createReadMeasurementsByPerson(ReadMeasurementsByPerson value) {
        return new JAXBElement<ReadMeasurementsByPerson>(_ReadMeasurementsByPerson_QNAME, ReadMeasurementsByPerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadExpiredGoalsByPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.localdbservices/", name = "readExpiredGoalsByPerson")
    public JAXBElement<ReadExpiredGoalsByPerson> createReadExpiredGoalsByPerson(ReadExpiredGoalsByPerson value) {
        return new JAXBElement<ReadExpiredGoalsByPerson>(_ReadExpiredGoalsByPerson_QNAME, ReadExpiredGoalsByPerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateMeasurementResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.localdbservices/", name = "createMeasurementResponse")
    public JAXBElement<CreateMeasurementResponse> createCreateMeasurementResponse(CreateMeasurementResponse value) {
        return new JAXBElement<CreateMeasurementResponse>(_CreateMeasurementResponse_QNAME, CreateMeasurementResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadMeasureTypeListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.localdbservices/", name = "readMeasureTypeListResponse")
    public JAXBElement<ReadMeasureTypeListResponse> createReadMeasureTypeListResponse(ReadMeasureTypeListResponse value) {
        return new JAXBElement<ReadMeasureTypeListResponse>(_ReadMeasureTypeListResponse_QNAME, ReadMeasureTypeListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.localdbservices/", name = "readPersonListResponse")
    public JAXBElement<ReadPersonListResponse> createReadPersonListResponse(ReadPersonListResponse value) {
        return new JAXBElement<ReadPersonListResponse>(_ReadPersonListResponse_QNAME, ReadPersonListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadMeasureTypesByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.localdbservices/", name = "readMeasureTypesByIdResponse")
    public JAXBElement<ReadMeasureTypesByIdResponse> createReadMeasureTypesByIdResponse(ReadMeasureTypesByIdResponse value) {
        return new JAXBElement<ReadMeasureTypesByIdResponse>(_ReadMeasureTypesByIdResponse_QNAME, ReadMeasureTypesByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadExpiredGoalsByPersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.localdbservices/", name = "readExpiredGoalsByPersonResponse")
    public JAXBElement<ReadExpiredGoalsByPersonResponse> createReadExpiredGoalsByPersonResponse(ReadExpiredGoalsByPersonResponse value) {
        return new JAXBElement<ReadExpiredGoalsByPersonResponse>(_ReadExpiredGoalsByPersonResponse_QNAME, ReadExpiredGoalsByPersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadMeasurementsByPersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.localdbservices/", name = "readMeasurementsByPersonResponse")
    public JAXBElement<ReadMeasurementsByPersonResponse> createReadMeasurementsByPersonResponse(ReadMeasurementsByPersonResponse value) {
        return new JAXBElement<ReadMeasurementsByPersonResponse>(_ReadMeasurementsByPersonResponse_QNAME, ReadMeasurementsByPersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParseException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.localdbservices/", name = "ParseException")
    public JAXBElement<ParseException> createParseException(ParseException value) {
        return new JAXBElement<ParseException>(_ParseException_QNAME, ParseException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteGoalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.localdbservices/", name = "deleteGoalResponse")
    public JAXBElement<DeleteGoalResponse> createDeleteGoalResponse(DeleteGoalResponse value) {
        return new JAXBElement<DeleteGoalResponse>(_DeleteGoalResponse_QNAME, DeleteGoalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadActiveGoalByPersonByMeasureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.localdbservices/", name = "readActiveGoalByPersonByMeasureType")
    public JAXBElement<ReadActiveGoalByPersonByMeasureType> createReadActiveGoalByPersonByMeasureType(ReadActiveGoalByPersonByMeasureType value) {
        return new JAXBElement<ReadActiveGoalByPersonByMeasureType>(_ReadActiveGoalByPersonByMeasureType_QNAME, ReadActiveGoalByPersonByMeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateMeasurement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.localdbservices/", name = "createMeasurement")
    public JAXBElement<CreateMeasurement> createCreateMeasurement(CreateMeasurement value) {
        return new JAXBElement<CreateMeasurement>(_CreateMeasurement_QNAME, CreateMeasurement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.localdbservices/", name = "updatePersonResponse")
    public JAXBElement<UpdatePersonResponse> createUpdatePersonResponse(UpdatePersonResponse value) {
        return new JAXBElement<UpdatePersonResponse>(_UpdatePersonResponse_QNAME, UpdatePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateGoal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.localdbservices/", name = "updateGoal")
    public JAXBElement<UpdateGoal> createUpdateGoal(UpdateGoal value) {
        return new JAXBElement<UpdateGoal>(_UpdateGoal_QNAME, UpdateGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.localdbservices/", name = "MeasureType")
    public JAXBElement<MeasureType> createMeasureType(MeasureType value) {
        return new JAXBElement<MeasureType>(_MeasureType_QNAME, MeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadActiveGoalByPersonByMeasureTypeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.localdbservices/", name = "readActiveGoalByPersonByMeasureTypeResponse")
    public JAXBElement<ReadActiveGoalByPersonByMeasureTypeResponse> createReadActiveGoalByPersonByMeasureTypeResponse(ReadActiveGoalByPersonByMeasureTypeResponse value) {
        return new JAXBElement<ReadActiveGoalByPersonByMeasureTypeResponse>(_ReadActiveGoalByPersonByMeasureTypeResponse_QNAME, ReadActiveGoalByPersonByMeasureTypeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadLastMeasurementForEachMeasureTypeByPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.localdbservices/", name = "readLastMeasurementForEachMeasureTypeByPerson")
    public JAXBElement<ReadLastMeasurementForEachMeasureTypeByPerson> createReadLastMeasurementForEachMeasureTypeByPerson(ReadLastMeasurementForEachMeasureTypeByPerson value) {
        return new JAXBElement<ReadLastMeasurementForEachMeasureTypeByPerson>(_ReadLastMeasurementForEachMeasureTypeByPerson_QNAME, ReadLastMeasurementForEachMeasureTypeByPerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.localdbservices/", name = "readPerson")
    public JAXBElement<ReadPerson> createReadPerson(ReadPerson value) {
        return new JAXBElement<ReadPerson>(_ReadPerson_QNAME, ReadPerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateMeasurement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.localdbservices/", name = "updateMeasurement")
    public JAXBElement<UpdateMeasurement> createUpdateMeasurement(UpdateMeasurement value) {
        return new JAXBElement<UpdateMeasurement>(_UpdateMeasurement_QNAME, UpdateMeasurement.class, null, value);
    }

}
