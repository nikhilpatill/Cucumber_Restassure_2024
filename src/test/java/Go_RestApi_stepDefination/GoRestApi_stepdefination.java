package Go_RestApi_stepDefination;

import java.util.HashMap;

import org.junit.After;
import org.junit.Assert;

import Hashmap_apiBody.createuser;
import PojoClasses.CreateUser_Date;
import PojoClasses.UpdateUser_Date;
import RestAssure_pages.RestApi_User;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class GoRestApi_stepdefination {

	static Response res;
	static Response res2;
	static int userId;
	static JsonPath jp;
	static JsonPath jp2;
	UpdateUser_Date data;
	RestApi_User user;
	CreateUser_Date Cdata;
	 createuser Mcuser = new createuser();
	
	
	

	/*
	 * @BeforeStep() public void beforeHook() {
	 * System.out.println("before hook each step exicute"); }
	 * 
	 * @AfterStep public void AfterHook() {
	 * System.out.println("after hook each step exicuted"); }
	 */
	@Before("@post")
	public void before1_seanrio() {
		
		   
	
	   
	}

	@io.cucumber.java.After("@delete")
	public void after_seanrio() {
		System.out.println("afterhook each Senario exicute");
	}
	
	

	

	@When("User calls user API using post method")
	public void user_calls_user_api_using_post_method() {
		RestAssured.baseURI = "https://gorest.co.in";
		res = given().log().all()
				.header("Authorization", "Bearer 6bd3410a0fe392bfa0ac4656a8988f5f3c588538b9ecd6fbc406073751d9ccf3")
				.header("Content-Type", "application/json").pathParam("path1", "users").body(Mcuser.mapcreateuser("ram","sham@ttipai","male","active")).when()
				.post("public/v2/{path1}").then().log().all().extract().response();

	}

	@Then("The {string} API call got success with status code {int}")
	public void the_api_call_got_success_with_status_code(String httpmethod, int expected) {
		if (httpmethod.equalsIgnoreCase("post")) {
			Assert.assertEquals(res.getStatusCode(), expected);
		}
		if (httpmethod.equalsIgnoreCase("get"))

		{
			Assert.assertEquals(res.getStatusCode(), expected);
		}
		if (httpmethod.equalsIgnoreCase("put")) {
			Assert.assertEquals(res2.getStatusCode(), expected);
		}
		if (httpmethod.equalsIgnoreCase("delete")) {
			Assert.assertEquals(res.getStatusCode(), expected);
		}

	}

	@Then("{string} in the {string} response body {string}")
	public void in_the_response_body(String key, String httpmethod, String expected) {

		if (httpmethod.equalsIgnoreCase("post")) {
			Assert.assertEquals(jp.getString(key), expected);
		}

		if (httpmethod.equalsIgnoreCase("get")) {
			Assert.assertEquals(jp.getString(key), expected);
		}

		if (httpmethod.equalsIgnoreCase("put")) {
			Assert.assertEquals(jp2.getString(key), expected);
		}

	}

	@Given("User has userId of already created user")
	public void user_has_user_id_of_already_created_user() {

		jp = new JsonPath(res.asString());
		userId = jp.getInt("id");

	}

	@When("User calls user API using get method")
	public void user_calls_user_api_using_get_method() {
		res = given().log().all()
				.header("Authorization", "Bearer 6bd3410a0fe392bfa0ac4656a8988f5f3c588538b9ecd6fbc406073751d9ccf3")
				.pathParam("path1", "users").pathParam("path2", userId).when().get("public/v2/{path1}/{path2}").then()
				.log().all().extract().response();

	}

	@Given("Update user payload {string},{string}")
	public void update_user_payload(String name, String email) {

		user = new RestApi_User();

		data = user.updaate_playload(name, email);

	}
	
		@Given("Create user payload {string},{string},{string},{string}")
		public void create_user_payload(String name, String email, String gender, String status) {
		  
			 user =new RestApi_User();
			
			 Cdata = user.Create_playload(name,  email,  gender,  status);
			
		}




	@When("User calls user API using put method")
	public void user_calls_user_api_using_put_method() {

		RestAssured.baseURI = "https://gorest.co.in";
		res2 = given().log().all()
				.header("Authorization", "Bearer 6bd3410a0fe392bfa0ac4656a8988f5f3c588538b9ecd6fbc406073751d9ccf3")
				.header("Content-Type", "application/json").pathParam("path1", "users").pathParam("path2", userId)
				.body(data).when().put("public/v2/{path1}/{path2}").then().log().all().extract().response();

		jp2 = new JsonPath(res2.asString());

	}

	@When("User calls user API using delete method")
	public void user_calls_user_api_using_delete_method() {

		RestAssured.baseURI = "https://gorest.co.in";
		res = given().log().all()
				.header("Authorization", "Bearer 6bd3410a0fe392bfa0ac4656a8988f5f3c588538b9ecd6fbc406073751d9ccf3")
				.pathParam("path1", "users").pathParam("path2", userId).when().delete("public/v2/{path1}/{path2}")
				.then().log().all().extract().response();

	}

}
