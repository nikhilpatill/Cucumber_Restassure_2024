package Go_RestApi_stepDefination;

import java.util.HashMap;

import java.util.HashMap;

import org.junit.After;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;

import com.mongodb.util.JSON;

import Hashmap_apiBody.ADDNewUser_DummyBody;
import Hashmap_apiBody.Login_UserDummyBody;
import Hashmap_apiBody.createuser;
import PojoClasses.CreateUser_Date;
import PojoClasses.UpdateUser_Date;
import RestAssure_pages.RestApi_User;
import io.cucumber.core.gherkin.messages.internal.gherkin.internal.com.eclipsesource.json.Json;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class dummyADD_NEWUserApi_stepdefinationPost {

	ADDNewUser_DummyBody data = new ADDNewUser_DummyBody();
	static Response res;
	SoftAssert softAssert = new SoftAssert();
	JsonPath jp;

	@Given("Create NEW_DummyuserUser payload")
	public void create_new_dummyuser_user_payload() {
		System.out.println(data.mapLogin_User());

	}

	@When("ADD NEW_DummyuserUser API using post method")
	public void add_new_dummyuser_user_api_using_post_method() {

		baseURI = "https://dummyjson.com/users/add";
		res = given().log().all().header("Authorization",
				"Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MTUsInVzZXJuYW1lIjoia21pbmNoZWxsZSIsImVtYWlsIjoia21pbmNoZWxsZUBxcS5jb20iLCJmaXJzdE5hbWUiOiJKZWFubmUiLCJsYXN0TmFtZSI6IkhhbHZvcnNvbiIsImdlbmRlciI6ImZlbWFsZSIsImltYWdlIjoiaHR0cHM6Ly9yb2JvaGFzaC5vcmcvSmVhbm5lLnBuZz9zZXQ9c2V0NCIsImlhdCI6MTcxNDcxNDA0NiwiZXhwIjoxNzE0NzE3NjQ2fQ.ei8R9jZrJf-of7y3Oqr3uYOFhURzY9u6GIvG-E5ayxk")
				.header("Content-Type", "application/json").contentType(ContentType.JSON).body(data.mapLogin_User())
				.when().post().then().log().all().header("Content-Type", "application/json; charset=utf-8").extract()
				.response();

		jp = new JsonPath(res.asString());

	}

	@Then("The {string} NEW_DummyuserUser API call got success with status code {int}")
	public void the_new_dummyuser_user_api_call_got_success_with_status_code(String Httpmethod, Integer status_code) {

		if (Httpmethod.equalsIgnoreCase("post")) {
			softAssert.assertEquals(res.getStatusCode(), status_code);
		}
		softAssert.assertAll();

	}

	@Then("The {string} NEW_DummyuserUser API  varify Responce_Header {string},")
	public void the_new_dummyuser_user_api_varify_responce_header(String Httpmethod, String responce_header) {

		if (Httpmethod.equalsIgnoreCase("content-type")) {

			softAssert.assertEquals(res.getContentType(), responce_header);
		} else if (Httpmethod.equalsIgnoreCase("server")) {

			softAssert.assertEquals(res.getHeader("server"), responce_header);
		}

		softAssert.assertAll();

	}

	@Then("The {string} varify NEW_DummyuserUser responce {int}")
	public void the_varify_new_dummyuser_user_responce(String httpmethod, Integer user_responce) {

		if (httpmethod.equalsIgnoreCase("id")) {
			softAssert.assertEquals(jp.getInt("id"), user_responce);
		} else if (httpmethod.equalsIgnoreCase("age")) {
			softAssert.assertEquals(jp.getInt("age"), user_responce);
		}

		softAssert.assertAll();

	}

	@Then("The {string} varify NEW_DummyuserUser responce {string}")
	public void the_varify_new_dummyuser_user_responce(String httpmethod, String user_responce) {

		if (httpmethod.equalsIgnoreCase("firstName")) {
			softAssert.assertEquals(jp.getString("firstName"), user_responce);
		} else if (httpmethod.equalsIgnoreCase("lastName")) {
			softAssert.assertEquals(jp.getString("lastName"), user_responce);
		} else if (httpmethod.equalsIgnoreCase("maidenName")) {
			softAssert.assertEquals(jp.getString("maidenName"), user_responce);
		} else if (httpmethod.equalsIgnoreCase("gender")) {
			softAssert.assertEquals(jp.getString("gender"), user_responce);
		} else if (httpmethod.equalsIgnoreCase("email")) {
			softAssert.assertEquals(jp.getString("email"), user_responce);
		} else if (httpmethod.equalsIgnoreCase("phone")) {
			softAssert.assertEquals(jp.getString("phone"), user_responce);
		} else if (httpmethod.equalsIgnoreCase("username")) {
			softAssert.assertEquals(jp.getString("username"), user_responce);
		} else if (httpmethod.equalsIgnoreCase("password")) {
			softAssert.assertEquals(jp.getString("password"), user_responce);
		} else if (httpmethod.equalsIgnoreCase("bloodGroup")) {
			softAssert.assertEquals(jp.getString("bloodGroup"), user_responce);
		} else if (httpmethod.equalsIgnoreCase("eyeColor")) {
			softAssert.assertEquals(jp.getString("eyeColor"), user_responce);
		} else if (httpmethod.equalsIgnoreCase("university")) {
			softAssert.assertEquals(jp.getString("university"), user_responce);
		} else if (httpmethod.equalsIgnoreCase("haircolor")) {
			HashMap<String, Object> hair = jp.get("hair");

			System.out.println("hair :" + hair);
			String color = (String) hair.get("color");
			System.out.println("color : " + color);

			softAssert.assertEquals(color, user_responce);
		}

		else if (httpmethod.equalsIgnoreCase("hairtype")) {
			HashMap<String, Object> hair = jp.get("hair");
			System.out.println("hair : " + hair);

			String type = (String) hair.get("type");
			softAssert.assertEquals(type, user_responce);

		} else if (httpmethod.equalsIgnoreCase("address")) {
			HashMap<String, Object> data = jp.get("address");
			System.out.println("address" + data);

			String address = (String) data.get("address");
			System.out.println("address" + address);
			softAssert.assertEquals(address, user_responce);
		}

		else if (httpmethod.equalsIgnoreCase("city")) {
			HashMap<String, Object> data = jp.get("address");
			System.out.println("address" + data);

			String city = (String) data.get("city");
			System.out.println("city" + city);
			softAssert.assertEquals(city, user_responce);
		} else if (httpmethod.equalsIgnoreCase("cardExpire")) {
			HashMap<String, Object> data = jp.get("bank");
			System.out.println("bank" + data);

			String cardExpire = (String) data.get("cardExpire");
			System.out.println("cardExpire" + cardExpire);
			softAssert.assertEquals(cardExpire, user_responce);
		} else if (httpmethod.equalsIgnoreCase("cardNumber")) {
			HashMap<String, Object> data = jp.get("bank");
			System.out.println("bank" + data);

			String cardNumber = (String) data.get("cardNumber");
			System.out.println("cardNumber" + cardNumber);
			softAssert.assertEquals(cardNumber, user_responce);
		}
		else if (httpmethod.equalsIgnoreCase("cardType")) {
			HashMap<String, Object> data = jp.get("bank");
			System.out.println("bank" + data);

			String cardType = (String) data.get("cardType");
			System.out.println("cardType" + cardType);
			softAssert.assertEquals(cardType, user_responce);
		}
		else if (httpmethod.equalsIgnoreCase("currency")) {
			HashMap<String, Object> data = jp.get("bank");
			System.out.println("bank" + data);

			String currency = (String) data.get("currency");
			System.out.println("currency" + currency);
			softAssert.assertEquals(currency, user_responce);
		}
		
	
	

		softAssert.assertAll();

	}

	@Then("The {string} varify NEW_DummyuserUser responcee {int}")
	public void the_varify_new_dummyuser_user_responcee(String httpmethod, int user_responcee) {

		if (httpmethod.equalsIgnoreCase("lat")) {

			HashMap<String, Object> data = jp.get("address");
			System.out.println("address" + data);

			HashMap<String, Object> data2 = (HashMap<String, Object>) data.get("coordinates");
			System.out.println("coordinates" + data2);

			int lat = (int) data2.get("lat");
			System.out.println("lat :" + lat);

			softAssert.assertEquals(lat, user_responcee);

		} else if (httpmethod.equalsIgnoreCase("lng")) {

			HashMap<String, Object> data = jp.get("address");
			System.out.println("address" + data);

			HashMap<String, Object> data2 = (HashMap<String, Object>) data.get("coordinates");
			System.out.println("coordinates" + data2);

			int lng = (int) data2.get("lng");
			System.out.println("lng :" + lng);

			softAssert.assertEquals(lng, user_responcee);

		}

		softAssert.assertAll();

	}

	@Then("The {string} varify NEW_DummyuserUser responceee {int}")
	public void the_varify_new_dummyuser_user_responceee(String httpmethod, Integer user_responcee) {

		if (httpmethod.equalsIgnoreCase("macAddress")) {
			softAssert.assertEquals(jp.getInt("macAddress"), user_responcee);

		}

		softAssert.assertAll();

	}

}
