package TestingPackage;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.*;
import org.testng.annotations.BeforeMethod;

import Utility.Finish;
import Utility.Start;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestingPostMethod3 {
	
	
	private RequestSpecification request;
	private Response send;
	private Map<String,String> m;

	@SuppressWarnings("unchecked")
	@Test
	public void test() 
	{
		
		
		request =RestAssured.given();
		request.header("Content-Type","application/json");
		
		m =new HashMap<String, String>();
		m.put("id", "33");
		m.put("title", "word");
		m.put("author", "vishal");
		
		JSONObject j = new JSONObject();
		j.putAll(m);
		
		request.body(j.toString());
		send=	request.post("http://localhost:3000/posts");
			
		int status =send.getStatusCode();	
		String data =send.asString();
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
