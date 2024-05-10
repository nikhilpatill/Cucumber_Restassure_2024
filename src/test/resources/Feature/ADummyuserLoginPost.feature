#Author: your.email@your.domain.com
Feature: Create DummyuserUser API test scenarios

 
  Scenario: Create User API test scenario
    Given Create DummyuserUser payload
    When LoginToken DummyuserUser API using post method
    Then The "post" DummyuserUser API call got success with status code 200
    Then The "id" DummyuserUser API  varify ResponceId 15
    Then The "email" DummyuserUser API  varify Responce_email "kminchelle@qq.com"
    Then The "firstName" DummyuserUser API  varify ResponceId_firstName "Jeanne"
    Then The "lastName" DummyuserUser API  varify Responce_lastName "Halvorson"
    Then The "gender" DummyuserUser API  varify Responce_gender "female"
    Then The "image" DummyuserUser API  varify Responce_image "https://robohash.org/Jeanne.png?set=set4",
    Then The "content-type" DummyuserUser API  varify Responce_Header "application/json; charset=utf-8",
    Then The "server" DummyuserUser API  varify Responce_Header "railway",
    
    
    
    
 