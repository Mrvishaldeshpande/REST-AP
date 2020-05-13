package TestingPackage;

import java.util.HashMap;

import org.json.simple.JSONObject;
import org.testng.annotations.*;


import Utility.Finish;
import Utility.Start;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestingPutMethod2 {
	
	
	
	private RequestSpecification request;
	private Response send;

	@SuppressWarnings("unchecked")
	@Test
	public void test() 
	{
		request =RestAssured.given();
		request.header("Content-Type","application/json");
		
		HashMap<String, String>m = new HashMap<String, String>();
		m.put("id", "30");
		m.put("title", "Excel");
		m.put("author", "Vishal");
		
		
		
		JSONObject j = new JSONObject();
		j.putAll(m);
		
		request.body(j.toString());
		send=request.put("http://localhost:3000/posts/30");
		int status =send.getStatusCode();
		String data = send.asString();
		System.out.println(status);
		System.out.println(data);
	}
	
	
	
	@BeforeMethod
	public void start() 
	{
		Start.start();
	}
	
	@AfterMethod
	public void finish()
	{
		Finish.finish();
	}


}
