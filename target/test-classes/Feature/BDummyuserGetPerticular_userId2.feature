#Author: your.email@your.domain.com
Feature: Get DummyGetperticularUserID API test scenarios

 
  Scenario: GET DummyGetAllUsers API test scenario
    Given AllreadyCreated  GetperticularUserID payload
    When  GetperticularUserID API using GET method
     Then The "Get" GetperticularUserID API call got success with status code 200
     Then The "content-type" GetperticularUserID API  varify Responce_Header "application/json; charset=utf-8",
     Then The "server" GetperticularUserID API  varify Responce_Header "railway",
     Then The "id" varify GetperticularUserID responce 5
     Then The "firstName" varify GetperticularUser responce "Mavis"
     Then The "lastName" varify GetperticularUser responce "Schultz"
     Then The "maidenName" varify GetperticularUser responce "Yundt"
     Then The "age" varify GetperticularUserID responce 38
     Then The "gender" varify GetperticularUser responce "male"
     Then The "email" varify GetperticularUser responce "kmeus4@upenn.edu"
     Then The "phone" varify GetperticularUser responce "+372 285 771 1911"
     Then The "username" varify GetperticularUser responce "kmeus4"
     Then The "password" varify GetperticularUser responce "aUTdmmmbH"
     Then The "bloodGroup" varify GetperticularUser responce "O+"
     Then The "eyeColor" varify GetperticularUser responce "Brown"
     Then The "haircolor" varify GetperticularUser responce "Brown"
     Then The "hairtype" varify GetperticularUser responce "Curly"
     Then The "address" varify GetperticularUser responce "2721 Lindsay Avenue"
     Then The "city" varify GetperticularUser responce "Louisville"
     Then The "lat" varify GetperticularUser responcee 38.263794
     Then The "lng" varify GetperticularUser responcee -85.70024
     Then The "macAddress" varify GetperticularUser responce "F8:04:9E:ED:C0:68"
     Then The "university" varify GetperticularUser responce "Estonian University of Life Sciences"
     Then The "cardExpire" varify GetperticularUser responce "01/24"
     Then The "cardNumber" varify GetperticularUser responce "4917245076693618"
     Then The "cardType" varify GetperticularUser responce "visa-electron"
     Then The "currency" varify GetperticularUser responce "Euro"
     Then The "iban" varify GetperticularUser responce "IT41 T114 5127 716J RGYB ZRUX DSJ"
     Then The "Company_address" varify GetperticularUser responce "8398 West Denton Lane"
     Then The "Company_city" varify GetperticularUser responce "Glendale"
     Then The "Company_lat" varify GetperticularUser responcee 33.515354
     Then The "Company_lng" varify GetperticularUser responcee 112.240814
     Then The "postalCode" varify GetperticularUser responce "40206"
     Then The "state" varify GetperticularUser responce "KY"
    
    
    
    
    
    
 