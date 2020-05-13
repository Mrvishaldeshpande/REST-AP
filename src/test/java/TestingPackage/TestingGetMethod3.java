package TestingPackage;

import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.BeforeMethod;

import Utility.Finish;
import Utility.Start;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestingGetMethod3 {
	
	private RequestSpecification request;
	private Response sendclick;

	//

	@Test
	public void test ()
	{
		request =RestAssured.given();
		
		sendclick =request.get("http://localhost:3000/posts");
		
		int status =sendclick.getStatusCode();
		String response =sendclick.asString();
		System.out.println(status);
		Assert.assertEquals(200, status);
		System.out.println(response);
	
	
	
	
	
	
	
	
	
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
