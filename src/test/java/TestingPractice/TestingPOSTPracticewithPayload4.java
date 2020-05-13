package TestingPractice;

import static io.restassured.RestAssured.*;

import java.util.HashMap;


import org.testng.annotations.Test;


import io.restassured.RestAssured;



public class TestingPOSTPracticewithPayload4 {

	
@Test



	public  void main() {
		
		
		RestAssured.baseURI="http://localhost:3000/posts";
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("id", "41");
		map.put("title", "pc");
		map.put("author", "Anish");
		map.put("price", "1000");
		
		given().log().all().contentType("application/json").body( map)
		
	   .when().post().

	    then().log().all().assertThat().statusCode(201);
	   
	   
	}



}
