package TestingPackage;

import java.util.HashMap;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestingPostMethod {
	
	public RequestSpecification request;
	public Response response;

	@SuppressWarnings("unchecked")
	@Test
	public void putmethod() 
	{
		
		System.out.println("##############################################################################################################################");
		request =RestAssured.given();
		
		request.header("Content-Type","application/json");
		
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("id", "31");
		map.put("title", "selenium");
		map.put("author", "Naveen K");
		
		
		
		JSONObject data = new JSONObject ();
		
		data.put("id", "30");
		data.put("title", "Excel");
		data.put("author", "vishal");
		
		data.putAll(map);
		
		request.body(data.toString());
		response =request.post("http://localhost:3000/posts");
		
		int status =response.getStatusCode();
		System.out.println(status);
		
		System.out.println("##############################################################################################################################");
		
		
		
		
	}

}
