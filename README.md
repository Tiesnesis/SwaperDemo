# Swaper Demo automation

## Running tests
    Project includes two types of tests - RestAPI and Selenide UI
    
### Running RestAPI tests
`./gradlew cucumberREST`

### Running RestUI tests
`./gradlew cucumberUI`


## Structure 

```|-src
   |---test
   |-----java
   |-------restapiswaper     - RestAPI test project ROOT
   |---------cucumber
   |-----------apiResources    - API Resource clases
   |-----------steps           - Step Definitions  
   |-----------testData        - TestData 
   |-------uiswaper          - UI test project ROOT
   |---------cucumber
   |-----------pages           - Page Objects
   |-----------steps           - Step Definitions 
   |-----------testData        - TestData
   |-----resources
   |-------RestApi           - RestAPI features
   |-------UI                - UI features
   ``` 