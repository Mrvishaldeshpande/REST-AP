package TestingPackage;
import java.util.HashMap;

import org.json.simple.JSONObject;
import org.testng.annotations.*;

import Utility.Finish;
import Utility.Start;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestingPostMethod1 {
	
	
	
	
	public RequestSpecification request;
	public Response send;

	@SuppressWarnings("unchecked")
	@Test
	public void testingpost() 
	{
		request =RestAssured.given();
		request.header("Content-Type","application/json");
		
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("id", "31");
		map.put("title", "selenium");
		map.put("author", "naveen");
		
		JSONObject j = new JSONObject();
		j.putAll(map);
		
		request.body(j.toString());
		send = request.post("http://localhost:3000/posts");
		
		int status =send.getStatusCode();
		System.out.println(status);
		
		String data =send.asString();
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
