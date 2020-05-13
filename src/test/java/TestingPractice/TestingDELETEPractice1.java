package TestingPractice;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;

public class TestingDELETEPractice1 {

	public static void main(String[] args) {
		RestAssured.baseURI="http://localhost:3000/posts";

		
		given().log().all().
		
		when().delete("/35").
		
		then().statusCode(200);
		
		
	}

}
