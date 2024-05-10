#Author: your.email@your.domain.com
Feature: ADD NEW_DummyuserUser API test scenarios

 @post
     Scenario: Create NEW_DummyuserUser API test scenario
     Given Create NEW_DummyuserUser payload
     When ADD NEW_DummyuserUser API using post method
     Then The "post" NEW_DummyuserUser API call got success with status code 200
     Then The "content-type" NEW_DummyuserUser API  varify Responce_Header "application/json; charset=utf-8",
     Then The "server" NEW_DummyuserUser API  varify Responce_Header "railway",
     Then The "id" varify NEW_DummyuserUser responce 101
     Then The "firstName" varify NEW_DummyuserUser responce "nikhil"
     Then The "lastName" varify NEW_DummyuserUser responce "patil"
     Then The "maidenName" varify NEW_DummyuserUser responce "ganesh"
     Then The "age" varify NEW_DummyuserUser responce 23
     Then The "gender" varify NEW_DummyuserUser responce "male"
     Then The "email" varify NEW_DummyuserUser responce "nikhil2020@gmail.com"
     Then The "phone" varify NEW_DummyuserUser responce "7798260576"
     Then The "username" varify NEW_DummyuserUser responce "devloper_user"
     Then The "password" varify NEW_DummyuserUser responce "Welcomew"
     Then The "bloodGroup" varify NEW_DummyuserUser responce "A+"
     Then The "eyeColor" varify NEW_DummyuserUser responce "black"
     Then The "haircolor" varify NEW_DummyuserUser responce "black"
     Then The "hairtype" varify NEW_DummyuserUser responce "roundshap"
     Then The "address" varify NEW_DummyuserUser responce "pune wastan highway"
     Then The "city" varify NEW_DummyuserUser responce "mumbai"
     Then The "lat" varify NEW_DummyuserUser responcee 1234
     Then The "lng" varify NEW_DummyuserUser responcee 12345
     Then The "macAddress" varify NEW_DummyuserUser responceee 888
     Then The "university" varify NEW_DummyuserUser responce "pune"
     Then The "cardExpire" varify NEW_DummyuserUser responce "12/2/2024"
     Then The "cardNumber" varify NEW_DummyuserUser responce "12345"
     Then The "cardType" varify NEW_DummyuserUser responce "debitcard"
     Then The "currency" varify NEW_DummyuserUser responce "INR"
     
    
    
    
    
 