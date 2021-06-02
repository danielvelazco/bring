## Background

Automation framework for Bring test.  
Stack implemented: Java/Maven/Cucumber.  
POM pattern implemented to set web elements and selectors.  

Project structure is based on the following archetype:  
mvn archetype:generate  
    -DarchetypeGroupId=io.cucumber  
    -DarchetypeArtifactId=cucumber-archetype  
    -DarchetypeVersion=6.10.4  
    -DgroupId=hellocucumber  
    -DartifactId=hellocucumber  
    -Dpackage=hellocucumber  
    -Dversion=1.0.0-SNAPSHOT  
    -DinteractiveMode=false  

## Prerequisites  
1.  Java  
2.  Maven  

## Run test  
1.  Clone this repository  
2.  Run tests:  
    `mvn clean test`  
    
### Notes  

1. Use the webdriver binaries according to the browser installed on the machine where tests will run.  
   In case you need to change it, place the new binaries in the root path of the project.  
