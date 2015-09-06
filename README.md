# VirtualLifeCoach - IntroSDE final project
The VirtualLifeCoach application is a project that can help people achieve their health goals
and have a healhty lifestyle.

Users will be able to monitor their health by storing and managing their measurements and their goals.
According to this information, also, users can be led through a healthy lifestyle and 
helped to achieve their goals thanks to some of the service's features. 
For example, users may be suggested to cook a random healthy meal (according to the user's goals), 
or encouraged with a famous athlete's quote. 
Moreover, they may be advised about their goals' trend and have suggestions to improve their performances,
or be notified whenever their goals expire to be informed about their achievements. 

## Services and architecture
### Services
These are the services I have created for each module. 

* Process Centric module 
  * Process Logic service (REST)
* Business Logic module
  * Linear Fitter service (REST)
* Storage module
  * Local Database service (SOAP)
  * Yummly Adapter service (REST)
  * MotivationalQuotes Adapter service (REST)

### External resources
* Motivational Quotes service (REST)
* [Yummly API][yummly_site] (REST)

### Architecture

In order to make use of the service, the VirtualLifeCoach users need to interact with the **ProcessLogic service**, 
which interacts with the other modules through an orchestration pattern. 
In particular, it interacts with the Storage Services and the Business Logic Services. 

The **Storage Services module** is composed of the EntitiesPublisher SOAP service - that is an interface to the inner database -
and the adapters to the external resources.

The **Business Logic module** is composed of the LinearFitter service, which carries out the task of fitting a set of 
points to a line. This operation is crucial in order for the VirtualLifeCoach to understand how a user is doing with his goals 
and whether he will accomplish them or not.

The **external resources** I decided to use are the Yummly API, which is a rest web service to obtain recipes, and MotivationalQuotes,
a service I created that returns a random motivational quote regarding sports.  
Both of the external resources are accessed by means of an adapter.  
The YummlyAdapter processes Yummly's original output into a smaller form, making it easier to read and to work on.  
The QuotesAdapter service was not necessary, since the Quotes service's output is already easy to use and to understand. 
Still, I decided to create an adapter for it for scalability reasons. 

## Client application
The client application I wrote is an **Android app** that allows to call every exposed method explicitly 
and then shows its outcome on-the-fly.  
Please note that this application is meant as a demonstration of how the VirtualLifeCoach service can be called and
how its output can be processed and visualized.
Ideally, the application should autonomously send the requests (e.g. about the expired goals, or the goals' trends)
and then notify the user about the outcomes, so he will be motivated to continue using the application 
and monitoring his health with the VirtualLifeCoach app. 

## Documentation for the services
The following section show where the documentation for my services is.

* Local Database service - http://docs.localdb1.apiary.io/#
* Motivational Quotes service - http://docs.motivationalquotes.apiary.io/#
* Yummly Adapter service - http://docs.yummlyadapter.apiary.io/#
* MotivationalQuotes Adapter service - http://docs.motivationalquoteadapter.apiary.io/#
* Linear Fitter Service - http://docs.linearfitter.apiary.io/#
* Process Logic service - http://docs.virtuallifecoach2.apiary.io/#

## Contributors to the project
Valentina Caforio worked on this project. 

[yummly_site]: https://developer.yummly.com/
