package TestingPractice;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import Payload.PayloadPractice;
import io.restassured.RestAssured;

import static org.hamcrest.Matchers.*;

public class TestingPOSTPracticewithPayload2 {

	
@Test
	public  void main() {
		
		
		RestAssured.baseURI="http://localhost:3000/posts";
		
		
		given().log().all().contentType("application/json").body(PayloadPractice.stringpayload(36, "Account", "CA", 400))
		
	   .when().post().

	    then().log().all().assertThat().statusCode(201).and().body("title", equalTo("Account"));
	   
	   
	}

}
