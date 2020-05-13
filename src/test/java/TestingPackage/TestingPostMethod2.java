package TestingPackage;
import java.util.HashMap;

import org.json.simple.JSONObject;
import org.testng.annotations.*;

import Utility.Finish;
import Utility.Start;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
public class TestingPostMethod2 {
	
	
	
	private RequestSpecification request;
	private Response send;

	@SuppressWarnings("unchecked")
	@Test
	public void test() 
	{
		
		request =RestAssured.given();
		request.header("Content-Type", "application/json");
		
		
		HashMap<String, String> m = new HashMap<String, String>();
		m.put("id", "32");
		m.put("title", "chess");
		m.put("author", "Vishwanath");
		
		
		JSONObject j = new JSONObject();
		j.putAll(m);
		
		System.out.println(j.toString());
		request.body(j.toString());
		send =request.post("http://localhost:3000/posts");
		
		int status =send.getStatusCode();
		System.out.println(status);
		String data = send.asString();
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
