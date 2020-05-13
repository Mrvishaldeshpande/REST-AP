package TestingPackage;

import org.testng.annotations.*;
import org.testng.annotations.BeforeMethod;

import Utility.Finish;
import Utility.Start;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestingGetmethod2 {
	
	
	private RequestSpecification request;
	private Response send;

	@Test
	public void test() 
	{
		request = RestAssured.given();
		send =request.get("http://localhost:3000/posts");
		System.out.println(send.getStatusCode());
		System.out.println(send.asString());
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
