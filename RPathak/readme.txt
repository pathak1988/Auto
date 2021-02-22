RPathak Project--

This is a selenium BDD cucumber, Maven project implements POM design pattern.

Structure-

PageObjects Package- This package contains reusable page wise code.
test.runner package- This package contains the runner class which glue the feature file with step-definition
feature- contains all the feature files.
glueCode- StepTest this package contains all the step-definitions which internally calls methods in page object class
Hooks - Hooks contains the steps needs to be executed runs before and after scenarios
utilities- This package contains the utilities like screenshot capture code and Browser manager.
Driver folder- contains firefox driver(other drivers can be added)
Screenshots folder- contains all the screenshots
Target/cucumber reports- this folder contains the latest report.

Running the Test-

From Junit- 
Import the project in eclipse

* Eclipse should have Eclipse-cucumber plugin

Go to any of the runner class, right click and run as junit(we need to configure from RunConfiguration).

Go to the project directory from terminal and hit the following commands
* `mvn test (defualt will run on local firefox browser) as other drivers are not added, but handled inside the BrowserManger and can be executed if required.`

Salient features of this framework-

1. Modularity
2. Reusable code- page class/methods, utilities etc.
3. easy maintainable - implementation of POM concept enables that.
4.easily configurable- browsers, utilities etc.
5. provides screenshots with timestamps
6.cucumber reporting.
7. easy binding
8. gives flexibility to the testers writing code in parallel- easy to integrate.



Further Improvements-

There can be many improvements-

1. More code re-usability can be achived, similar and all the basic/frequently used methods/actions can be separately and locators can be supplied from page class as the method parameter.
    eg:- a single parametrized method for click operation which takes loacators and its type as parameter. etc.
2. More browsers can be added to test browser compatibility or else can be integrated to browserstack/sauce labs
3. Exception handling can be done in a better way for easy debugging and maintanance - specific exceptions can be captured.
4. Reporting can be improved and some good reporters can be added eg:- extend reports.
5. can be integrated with jenkins easily with the help of Maven and can be scheduled to run without manual intervention and E-mail sending capability can be addded.
6.If required screenshots comparison can be added when we are running on multiple browsers.
7. Effective validations can be added to the scripts for more robust framework.
8. config files(.properties, .xml, ,excel etc.) etc. can be added and some data can be provided through that, which will make the framework a proper data driven framework.
9. Browserwise/test wise screenshots folder plus screenshot name can be created for easier validations.
10. loggers can be integrated with the framework to obtain better logs.
