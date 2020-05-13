package TestingPractice;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import Payload.PayloadPractice;
import io.restassured.RestAssured;


public class TestingPOSTPracticewithPayload {

	
@Test
	public  void main() {
		
		
		RestAssured.baseURI="http://localhost:3000/posts";
		
		
		given().log().all().contentType("application/json").body(PayloadPractice.stringpayload())
		
	   .when().post().

	    then().log().all().assertThat().statusCode(201);
	   
	   
	}

}
