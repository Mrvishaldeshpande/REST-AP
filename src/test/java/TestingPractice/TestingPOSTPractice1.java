package TestingPractice;

import static io.restassured.RestAssured.*;


import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.RestAssured;



public class TestingPOSTPractice1 {
	
	
	
	@Test
	public void test () 
	{
		RestAssured.baseURI="http://localhost:3000/posts";
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("id", "34");
		map.put("title", "rest");
		map.put("author", "vishal deshpande");
		
		
		
		given().contentType("application/json").
		body("{\r\n" + 
				"    \"id\": \"35\",\r\n" + 
				"    \"title\": \"rest2\",\r\n" + 
				"    \"author\": \"vishal\"\r\n" + 
				"  }").
		
		
		when().post().
		
		then().log().all().
		assertThat().
		statusCode(201);
		
		
		
		
	}

}
