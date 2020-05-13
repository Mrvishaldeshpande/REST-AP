package TestingPackage;



import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestingPutMethod {

	
	private RequestSpecification request;
	private Response response;

	@SuppressWarnings("unchecked")
	@Test
	public void putmethod() 
	{
		
		System.out.println("##############################################################################################################################");
		request =RestAssured.given();
		
		request.header("Content-Type","application/json");
		JSONObject data = new JSONObject ();
		
		
		data.put("author", "vishal");
		data.put("Title", "String");
		
		
		
		request.body(data.toString());
		response =request.put("http://localhost:3000/posts/31");
		
		int status =response.getStatusCode();
		System.out.println(status);
		
		System.out.println("##############################################################################################################################");
		
	
}
	}
