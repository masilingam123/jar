package stepdef;

import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import pom.Pom;

public class Stepdef extends Pom{
	Pom pom = new Pom();
	RequestSpecification req;
	Response response;

	@Given("hit API using pom")
	public void hit_api_using_pom() {
		RestAssured.baseURI= pom.PostURL ;
	req=RestAssured.given().header(auth,  "Bearer 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");
	pom.setName("masi");
	pom.setDescription("training purpose");
	pom.setHomepage("www.google.com");
	response = req.header("Content-type","application/json").body(pom).post();
		  
	}
	@Then("verify the reponse")
	public void verify_the_reponse() {
	    response.prettyPrint();
	}
	@Then("assert the response")
	public void assert_the_response() {
		System.out.println(response.jsonPath().getString("id"));
		Assert.assertEquals(pom.getName(), response.jsonPath().getString("name"));

	}
	
	@Given("hit api using target URI")
	public void hit_api_using_target_uri() {
	   RestAssured.baseURI="https://api.github.com/repos/"+ pom.user +"/" + "masi";
	   req = RestAssured.given();
	   response = req.get();
	}
	@Then("verify new repor creation")
	public void verify_new_repor_creation() {
		Assert.assertEquals(response.statusCode(), 200);
	    
	}
	@Then("verify the name")
	public void verify_the_name() {
	    Assert.assertEquals(response.jsonPath().getString("full_name"),pom.user +"/" + "masi");
	}
	
	@Given("create the uri with path parameter")
	public void create_the_uri_with_path_parameter() {
	   RestAssured.baseURI= "https://api.github.com/repos/"+pom.user +"/" + "masi";
	   
	}
	@Then("use authentication")
	public void use_authentication() {
		req = RestAssured.given().header(auth,  "Bearer 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");
	}
	@Then("hit api with delete")
	public void hit_api_with_delete() {
	    response = req.delete();
	    		}
	@Then("verify the response")
	public void verify_the_response() {
	    Assert.assertEquals(response.statusCode(), 204);
	}

	}
