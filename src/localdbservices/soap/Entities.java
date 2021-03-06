
package localdbservices.soap;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Entities", targetNamespace = "http://soap.localdbservices/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Entities {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<localdbservices.soap.Measurement>
     * @throws SOAPException_Exception
     */
    @WebMethod
    @WebResult(name = "measurement", targetNamespace = "")
    @RequestWrapper(localName = "readLastMeasurementForEachMeasureTypeByPerson", targetNamespace = "http://soap.localdbservices/", className = "localdbservices.soap.ReadLastMeasurementForEachMeasureTypeByPerson")
    @ResponseWrapper(localName = "readLastMeasurementForEachMeasureTypeByPersonResponse", targetNamespace = "http://soap.localdbservices/", className = "localdbservices.soap.ReadLastMeasurementForEachMeasureTypeByPersonResponse")
    @Action(input = "http://soap.localdbservices/Entities/readLastMeasurementForEachMeasureTypeByPersonRequest", output = "http://soap.localdbservices/Entities/readLastMeasurementForEachMeasureTypeByPersonResponse", fault = {
        @FaultAction(className = SOAPException_Exception.class, value = "http://soap.localdbservices/Entities/readLastMeasurementForEachMeasureTypeByPerson/Fault/SOAPException")
    })
    public List<Measurement> readLastMeasurementForEachMeasureTypeByPerson(
        @WebParam(name = "arg0", targetNamespace = "")
        long arg0)
        throws SOAPException_Exception
    ;

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns localdbservices.soap.Measurement
     * @throws SOAPException_Exception
     */
    @WebMethod
    @WebResult(name = "measurement", targetNamespace = "")
    @RequestWrapper(localName = "readLastMeasurementByPersonAndMeasureType", targetNamespace = "http://soap.localdbservices/", className = "localdbservices.soap.ReadLastMeasurementByPersonAndMeasureType")
    @ResponseWrapper(localName = "readLastMeasurementByPersonAndMeasureTypeResponse", targetNamespace = "http://soap.localdbservices/", className = "localdbservices.soap.ReadLastMeasurementByPersonAndMeasureTypeResponse")
    @Action(input = "http://soap.localdbservices/Entities/readLastMeasurementByPersonAndMeasureTypeRequest", output = "http://soap.localdbservices/Entities/readLastMeasurementByPersonAndMeasureTypeResponse", fault = {
        @FaultAction(className = SOAPException_Exception.class, value = "http://soap.localdbservices/Entities/readLastMeasurementByPersonAndMeasureType/Fault/SOAPException")
    })
    public Measurement readLastMeasurementByPersonAndMeasureType(
        @WebParam(name = "arg0", targetNamespace = "")
        long arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1)
        throws SOAPException_Exception
    ;

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.util.List<localdbservices.soap.Measurement>
     * @throws SOAPException_Exception
     */
    @WebMethod
    @WebResult(name = "measurement", targetNamespace = "")
    @RequestWrapper(localName = "readMeasurementsByPersonAndMeasureType", targetNamespace = "http://soap.localdbservices/", className = "localdbservices.soap.ReadMeasurementsByPersonAndMeasureType")
    @ResponseWrapper(localName = "readMeasurementsByPersonAndMeasureTypeResponse", targetNamespace = "http://soap.localdbservices/", className = "localdbservices.soap.ReadMeasurementsByPersonAndMeasureTypeResponse")
    @Action(input = "http://soap.localdbservices/Entities/readMeasurementsByPersonAndMeasureTypeRequest", output = "http://soap.localdbservices/Entities/readMeasurementsByPersonAndMeasureTypeResponse", fault = {
        @FaultAction(className = SOAPException_Exception.class, value = "http://soap.localdbservices/Entities/readMeasurementsByPersonAndMeasureType/Fault/SOAPException")
    })
    public List<Measurement> readMeasurementsByPersonAndMeasureType(
        @WebParam(name = "arg0", targetNamespace = "")
        long arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1)
        throws SOAPException_Exception
    ;

    /**
     * 
     * @return
     *     returns java.util.List<localdbservices.soap.Person>
     */
    @WebMethod
    @WebResult(name = "person", targetNamespace = "http://soap.localdbservices/")
    @RequestWrapper(localName = "readPersonList", targetNamespace = "http://soap.localdbservices/", className = "localdbservices.soap.ReadPersonList")
    @ResponseWrapper(localName = "readPersonListResponse", targetNamespace = "http://soap.localdbservices/", className = "localdbservices.soap.ReadPersonListResponse")
    @Action(input = "http://soap.localdbservices/Entities/readPersonListRequest", output = "http://soap.localdbservices/Entities/readPersonListResponse")
    public List<Person> readPersonList();

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<localdbservices.soap.Goal>
     * @throws SOAPException_Exception
     */
    @WebMethod
    @WebResult(name = "goal", targetNamespace = "")
    @RequestWrapper(localName = "readGoalsByPerson", targetNamespace = "http://soap.localdbservices/", className = "localdbservices.soap.ReadGoalsByPerson")
    @ResponseWrapper(localName = "readGoalsByPersonResponse", targetNamespace = "http://soap.localdbservices/", className = "localdbservices.soap.ReadGoalsByPersonResponse")
    @Action(input = "http://soap.localdbservices/Entities/readGoalsByPersonRequest", output = "http://soap.localdbservices/Entities/readGoalsByPersonResponse", fault = {
        @FaultAction(className = SOAPException_Exception.class, value = "http://soap.localdbservices/Entities/readGoalsByPerson/Fault/SOAPException")
    })
    public List<Goal> readGoalsByPerson(
        @WebParam(name = "arg0", targetNamespace = "")
        Long arg0)
        throws SOAPException_Exception
    ;

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns localdbservices.soap.Goal
     * @throws SOAPException_Exception
     */
    @WebMethod
    @WebResult(name = "goal", targetNamespace = "")
    @RequestWrapper(localName = "createGoal", targetNamespace = "http://soap.localdbservices/", className = "localdbservices.soap.CreateGoal")
    @ResponseWrapper(localName = "createGoalResponse", targetNamespace = "http://soap.localdbservices/", className = "localdbservices.soap.CreateGoalResponse")
    @Action(input = "http://soap.localdbservices/Entities/createGoalRequest", output = "http://soap.localdbservices/Entities/createGoalResponse", fault = {
        @FaultAction(className = SOAPException_Exception.class, value = "http://soap.localdbservices/Entities/createGoal/Fault/SOAPException")
    })
    public Goal createGoal(
        @WebParam(name = "arg0", targetNamespace = "")
        Goal arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        long arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2)
        throws SOAPException_Exception
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns localdbservices.soap.Goal
     * @throws SOAPException_Exception
     */
    @WebMethod
    @WebResult(name = "goal", targetNamespace = "")
    @RequestWrapper(localName = "readGoal", targetNamespace = "http://soap.localdbservices/", className = "localdbservices.soap.ReadGoal")
    @ResponseWrapper(localName = "readGoalResponse", targetNamespace = "http://soap.localdbservices/", className = "localdbservices.soap.ReadGoalResponse")
    @Action(input = "http://soap.localdbservices/Entities/readGoalRequest", output = "http://soap.localdbservices/Entities/readGoalResponse", fault = {
        @FaultAction(className = SOAPException_Exception.class, value = "http://soap.localdbservices/Entities/readGoal/Fault/SOAPException")
    })
    public Goal readGoal(
        @WebParam(name = "arg0", targetNamespace = "")
        Long arg0)
        throws SOAPException_Exception
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns localdbservices.soap.Goal
     * @throws SOAPException_Exception
     */
    @WebMethod
    @WebResult(name = "goal", targetNamespace = "")
    @RequestWrapper(localName = "updateGoal", targetNamespace = "http://soap.localdbservices/", className = "localdbservices.soap.UpdateGoal")
    @ResponseWrapper(localName = "updateGoalResponse", targetNamespace = "http://soap.localdbservices/", className = "localdbservices.soap.UpdateGoalResponse")
    @Action(input = "http://soap.localdbservices/Entities/updateGoalRequest", output = "http://soap.localdbservices/Entities/updateGoalResponse", fault = {
        @FaultAction(className = SOAPException_Exception.class, value = "http://soap.localdbservices/Entities/updateGoal/Fault/SOAPException")
    })
    public Goal updateGoal(
        @WebParam(name = "arg0", targetNamespace = "")
        Goal arg0)
        throws SOAPException_Exception
    ;

    /**
     * 
     * @param arg0
     * @throws SOAPException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "deleteGoal", targetNamespace = "http://soap.localdbservices/", className = "localdbservices.soap.DeleteGoal")
    @ResponseWrapper(localName = "deleteGoalResponse", targetNamespace = "http://soap.localdbservices/", className = "localdbservices.soap.DeleteGoalResponse")
    @Action(input = "http://soap.localdbservices/Entities/deleteGoalRequest", output = "http://soap.localdbservices/Entities/deleteGoalResponse", fault = {
        @FaultAction(className = SOAPException_Exception.class, value = "http://soap.localdbservices/Entities/deleteGoal/Fault/SOAPException")
    })
    public void deleteGoal(
        @WebParam(name = "arg0", targetNamespace = "")
        Long arg0)
        throws SOAPException_Exception
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns localdbservices.soap.Person
     * @throws SOAPException_Exception
     */
    @WebMethod
    @WebResult(name = "person", targetNamespace = "http://soap.localdbservices/")
    @RequestWrapper(localName = "readPerson", targetNamespace = "http://soap.localdbservices/", className = "localdbservices.soap.ReadPerson")
    @ResponseWrapper(localName = "readPersonResponse", targetNamespace = "http://soap.localdbservices/", className = "localdbservices.soap.ReadPersonResponse")
    @Action(input = "http://soap.localdbservices/Entities/readPersonRequest", output = "http://soap.localdbservices/Entities/readPersonResponse", fault = {
        @FaultAction(className = SOAPException_Exception.class, value = "http://soap.localdbservices/Entities/readPerson/Fault/SOAPException")
    })
    public Person readPerson(
        @WebParam(name = "arg0", targetNamespace = "")
        Long arg0)
        throws SOAPException_Exception
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns localdbservices.soap.Person
     * @throws SOAPException_Exception
     */
    @WebMethod
    @WebResult(name = "person", targetNamespace = "http://soap.localdbservices/")
    @RequestWrapper(localName = "updatePerson", targetNamespace = "http://soap.localdbservices/", className = "localdbservices.soap.UpdatePerson")
    @ResponseWrapper(localName = "updatePersonResponse", targetNamespace = "http://soap.localdbservices/", className = "localdbservices.soap.UpdatePersonResponse")
    @Action(input = "http://soap.localdbservices/Entities/updatePersonRequest", output = "http://soap.localdbservices/Entities/updatePersonResponse", fault = {
        @FaultAction(className = SOAPException_Exception.class, value = "http://soap.localdbservices/Entities/updatePerson/Fault/SOAPException")
    })
    public Person updatePerson(
        @WebParam(name = "arg0", targetNamespace = "")
        Person arg0)
        throws SOAPException_Exception
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns localdbservices.soap.Person
     * @throws SOAPException_Exception
     */
    @WebMethod
    @WebResult(name = "person", targetNamespace = "http://soap.localdbservices/")
    @RequestWrapper(localName = "createPerson", targetNamespace = "http://soap.localdbservices/", className = "localdbservices.soap.CreatePerson")
    @ResponseWrapper(localName = "createPersonResponse", targetNamespace = "http://soap.localdbservices/", className = "localdbservices.soap.CreatePersonResponse")
    @Action(input = "http://soap.localdbservices/Entities/createPersonRequest", output = "http://soap.localdbservices/Entities/createPersonResponse", fault = {
        @FaultAction(className = SOAPException_Exception.class, value = "http://soap.localdbservices/Entities/createPerson/Fault/SOAPException")
    })
    public Person createPerson(
        @WebParam(name = "arg0", targetNamespace = "")
        Person arg0)
        throws SOAPException_Exception
    ;

    /**
     * 
     * @param arg0
     * @throws SOAPException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "deletePerson", targetNamespace = "http://soap.localdbservices/", className = "localdbservices.soap.DeletePerson")
    @ResponseWrapper(localName = "deletePersonResponse", targetNamespace = "http://soap.localdbservices/", className = "localdbservices.soap.DeletePersonResponse")
    @Action(input = "http://soap.localdbservices/Entities/deletePersonRequest", output = "http://soap.localdbservices/Entities/deletePersonResponse", fault = {
        @FaultAction(className = SOAPException_Exception.class, value = "http://soap.localdbservices/Entities/deletePerson/Fault/SOAPException")
    })
    public void deletePerson(
        @WebParam(name = "arg0", targetNamespace = "")
        Long arg0)
        throws SOAPException_Exception
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<localdbservices.soap.Goal>
     * @throws ParseException_Exception
     * @throws SOAPException_Exception
     */
    @WebMethod
    @WebResult(name = "goal", targetNamespace = "")
    @RequestWrapper(localName = "readExpiredGoalsByPerson", targetNamespace = "http://soap.localdbservices/", className = "localdbservices.soap.ReadExpiredGoalsByPerson")
    @ResponseWrapper(localName = "readExpiredGoalsByPersonResponse", targetNamespace = "http://soap.localdbservices/", className = "localdbservices.soap.ReadExpiredGoalsByPersonResponse")
    @Action(input = "http://soap.localdbservices/Entities/readExpiredGoalsByPersonRequest", output = "http://soap.localdbservices/Entities/readExpiredGoalsByPersonResponse", fault = {
        @FaultAction(className = ParseException_Exception.class, value = "http://soap.localdbservices/Entities/readExpiredGoalsByPerson/Fault/ParseException"),
        @FaultAction(className = SOAPException_Exception.class, value = "http://soap.localdbservices/Entities/readExpiredGoalsByPerson/Fault/SOAPException")
    })
    public List<Goal> readExpiredGoalsByPerson(
        @WebParam(name = "arg0", targetNamespace = "")
        Long arg0)
        throws ParseException_Exception, SOAPException_Exception
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<localdbservices.soap.Measurement>
     * @throws SOAPException_Exception
     */
    @WebMethod
    @WebResult(name = "measurement", targetNamespace = "")
    @RequestWrapper(localName = "readMeasurementsByPerson", targetNamespace = "http://soap.localdbservices/", className = "localdbservices.soap.ReadMeasurementsByPerson")
    @ResponseWrapper(localName = "readMeasurementsByPersonResponse", targetNamespace = "http://soap.localdbservices/", className = "localdbservices.soap.ReadMeasurementsByPersonResponse")
    @Action(input = "http://soap.localdbservices/Entities/readMeasurementsByPersonRequest", output = "http://soap.localdbservices/Entities/readMeasurementsByPersonResponse", fault = {
        @FaultAction(className = SOAPException_Exception.class, value = "http://soap.localdbservices/Entities/readMeasurementsByPerson/Fault/SOAPException")
    })
    public List<Measurement> readMeasurementsByPerson(
        @WebParam(name = "arg0", targetNamespace = "")
        long arg0)
        throws SOAPException_Exception
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<localdbservices.soap.Goal>
     * @throws SOAPException_Exception
     */
    @WebMethod
    @WebResult(name = "goal", targetNamespace = "")
    @RequestWrapper(localName = "readActiveGoalsByPerson", targetNamespace = "http://soap.localdbservices/", className = "localdbservices.soap.ReadActiveGoalsByPerson")
    @ResponseWrapper(localName = "readActiveGoalsByPersonResponse", targetNamespace = "http://soap.localdbservices/", className = "localdbservices.soap.ReadActiveGoalsByPersonResponse")
    @Action(input = "http://soap.localdbservices/Entities/readActiveGoalsByPersonRequest", output = "http://soap.localdbservices/Entities/readActiveGoalsByPersonResponse", fault = {
        @FaultAction(className = SOAPException_Exception.class, value = "http://soap.localdbservices/Entities/readActiveGoalsByPerson/Fault/SOAPException")
    })
    public List<Goal> readActiveGoalsByPerson(
        @WebParam(name = "arg0", targetNamespace = "")
        Long arg0)
        throws SOAPException_Exception
    ;

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns localdbservices.soap.Goal
     * @throws SOAPException_Exception
     */
    @WebMethod
    @WebResult(name = "goal", targetNamespace = "")
    @RequestWrapper(localName = "readActiveGoalByPersonByMeasureType", targetNamespace = "http://soap.localdbservices/", className = "localdbservices.soap.ReadActiveGoalByPersonByMeasureType")
    @ResponseWrapper(localName = "readActiveGoalByPersonByMeasureTypeResponse", targetNamespace = "http://soap.localdbservices/", className = "localdbservices.soap.ReadActiveGoalByPersonByMeasureTypeResponse")
    @Action(input = "http://soap.localdbservices/Entities/readActiveGoalByPersonByMeasureTypeRequest", output = "http://soap.localdbservices/Entities/readActiveGoalByPersonByMeasureTypeResponse", fault = {
        @FaultAction(className = SOAPException_Exception.class, value = "http://soap.localdbservices/Entities/readActiveGoalByPersonByMeasureType/Fault/SOAPException")
    })
    public Goal readActiveGoalByPersonByMeasureType(
        @WebParam(name = "arg0", targetNamespace = "")
        Long arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1)
        throws SOAPException_Exception
    ;

    /**
     * 
     * @param arg0
     * @throws SOAPException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "setEvaluatedGoals", targetNamespace = "http://soap.localdbservices/", className = "localdbservices.soap.SetEvaluatedGoals")
    @ResponseWrapper(localName = "setEvaluatedGoalsResponse", targetNamespace = "http://soap.localdbservices/", className = "localdbservices.soap.SetEvaluatedGoalsResponse")
    @Action(input = "http://soap.localdbservices/Entities/setEvaluatedGoalsRequest", output = "http://soap.localdbservices/Entities/setEvaluatedGoalsResponse", fault = {
        @FaultAction(className = SOAPException_Exception.class, value = "http://soap.localdbservices/Entities/setEvaluatedGoals/Fault/SOAPException")
    })
    public void setEvaluatedGoals(
        @WebParam(name = "arg0", targetNamespace = "")
        List<Goal> arg0)
        throws SOAPException_Exception
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns localdbservices.soap.Measurement
     * @throws SOAPException_Exception
     */
    @WebMethod
    @WebResult(name = "measurement", targetNamespace = "")
    @RequestWrapper(localName = "readMeasurementById", targetNamespace = "http://soap.localdbservices/", className = "localdbservices.soap.ReadMeasurementById")
    @ResponseWrapper(localName = "readMeasurementByIdResponse", targetNamespace = "http://soap.localdbservices/", className = "localdbservices.soap.ReadMeasurementByIdResponse")
    @Action(input = "http://soap.localdbservices/Entities/readMeasurementByIdRequest", output = "http://soap.localdbservices/Entities/readMeasurementByIdResponse", fault = {
        @FaultAction(className = SOAPException_Exception.class, value = "http://soap.localdbservices/Entities/readMeasurementById/Fault/SOAPException")
    })
    public Measurement readMeasurementById(
        @WebParam(name = "arg0", targetNamespace = "")
        long arg0)
        throws SOAPException_Exception
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns localdbservices.soap.Measurement
     * @throws SOAPException_Exception
     */
    @WebMethod
    @WebResult(name = "measurement", targetNamespace = "")
    @RequestWrapper(localName = "updateMeasurement", targetNamespace = "http://soap.localdbservices/", className = "localdbservices.soap.UpdateMeasurement")
    @ResponseWrapper(localName = "updateMeasurementResponse", targetNamespace = "http://soap.localdbservices/", className = "localdbservices.soap.UpdateMeasurementResponse")
    @Action(input = "http://soap.localdbservices/Entities/updateMeasurementRequest", output = "http://soap.localdbservices/Entities/updateMeasurementResponse", fault = {
        @FaultAction(className = SOAPException_Exception.class, value = "http://soap.localdbservices/Entities/updateMeasurement/Fault/SOAPException")
    })
    public Measurement updateMeasurement(
        @WebParam(name = "arg0", targetNamespace = "")
        Measurement arg0)
        throws SOAPException_Exception
    ;

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns localdbservices.soap.Measurement
     * @throws SOAPException_Exception
     */
    @WebMethod
    @WebResult(name = "measurement", targetNamespace = "")
    @RequestWrapper(localName = "createMeasurement", targetNamespace = "http://soap.localdbservices/", className = "localdbservices.soap.CreateMeasurement")
    @ResponseWrapper(localName = "createMeasurementResponse", targetNamespace = "http://soap.localdbservices/", className = "localdbservices.soap.CreateMeasurementResponse")
    @Action(input = "http://soap.localdbservices/Entities/createMeasurementRequest", output = "http://soap.localdbservices/Entities/createMeasurementResponse", fault = {
        @FaultAction(className = SOAPException_Exception.class, value = "http://soap.localdbservices/Entities/createMeasurement/Fault/SOAPException")
    })
    public Measurement createMeasurement(
        @WebParam(name = "arg0", targetNamespace = "")
        Measurement arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        long arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2)
        throws SOAPException_Exception
    ;

    /**
     * 
     * @param arg0
     * @throws SOAPException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "deleteMeasurement", targetNamespace = "http://soap.localdbservices/", className = "localdbservices.soap.DeleteMeasurement")
    @ResponseWrapper(localName = "deleteMeasurementResponse", targetNamespace = "http://soap.localdbservices/", className = "localdbservices.soap.DeleteMeasurementResponse")
    @Action(input = "http://soap.localdbservices/Entities/deleteMeasurementRequest", output = "http://soap.localdbservices/Entities/deleteMeasurementResponse", fault = {
        @FaultAction(className = SOAPException_Exception.class, value = "http://soap.localdbservices/Entities/deleteMeasurement/Fault/SOAPException")
    })
    public void deleteMeasurement(
        @WebParam(name = "arg0", targetNamespace = "")
        Long arg0)
        throws SOAPException_Exception
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns localdbservices.soap.MeasureType
     * @throws SOAPException_Exception
     */
    @WebMethod
    @WebResult(name = "measureType", targetNamespace = "")
    @RequestWrapper(localName = "readMeasureTypesById", targetNamespace = "http://soap.localdbservices/", className = "localdbservices.soap.ReadMeasureTypesById")
    @ResponseWrapper(localName = "readMeasureTypesByIdResponse", targetNamespace = "http://soap.localdbservices/", className = "localdbservices.soap.ReadMeasureTypesByIdResponse")
    @Action(input = "http://soap.localdbservices/Entities/readMeasureTypesByIdRequest", output = "http://soap.localdbservices/Entities/readMeasureTypesByIdResponse", fault = {
        @FaultAction(className = SOAPException_Exception.class, value = "http://soap.localdbservices/Entities/readMeasureTypesById/Fault/SOAPException")
    })
    public MeasureType readMeasureTypesById(
        @WebParam(name = "arg0", targetNamespace = "")
        long arg0)
        throws SOAPException_Exception
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns localdbservices.soap.MeasureType
     * @throws SOAPException_Exception
     */
    @WebMethod
    @WebResult(name = "measureType", targetNamespace = "")
    @RequestWrapper(localName = "readMeasureTypesByName", targetNamespace = "http://soap.localdbservices/", className = "localdbservices.soap.ReadMeasureTypesByName")
    @ResponseWrapper(localName = "readMeasureTypesByNameResponse", targetNamespace = "http://soap.localdbservices/", className = "localdbservices.soap.ReadMeasureTypesByNameResponse")
    @Action(input = "http://soap.localdbservices/Entities/readMeasureTypesByNameRequest", output = "http://soap.localdbservices/Entities/readMeasureTypesByNameResponse", fault = {
        @FaultAction(className = SOAPException_Exception.class, value = "http://soap.localdbservices/Entities/readMeasureTypesByName/Fault/SOAPException")
    })
    public MeasureType readMeasureTypesByName(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0)
        throws SOAPException_Exception
    ;

    /**
     * 
     * @return
     *     returns java.util.List<localdbservices.soap.MeasureType>
     */
    @WebMethod
    @WebResult(name = "measureType", targetNamespace = "")
    @RequestWrapper(localName = "readMeasureTypeList", targetNamespace = "http://soap.localdbservices/", className = "localdbservices.soap.ReadMeasureTypeList")
    @ResponseWrapper(localName = "readMeasureTypeListResponse", targetNamespace = "http://soap.localdbservices/", className = "localdbservices.soap.ReadMeasureTypeListResponse")
    @Action(input = "http://soap.localdbservices/Entities/readMeasureTypeListRequest", output = "http://soap.localdbservices/Entities/readMeasureTypeListResponse")
    public List<MeasureType> readMeasureTypeList();

}
