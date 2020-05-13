package TestingPackage;

import org.testng.annotations.*;

import Utility.Finish;
import Utility.Start;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TestingGetmethod1 {
	
	
	private Response send;

	@BeforeMethod
	public void start() 
	{
		Start.start();
	}
	@Test
	public void getmethod() 
	{
		
		send=RestAssured.get("http://localhost:3000/posts");
		
	String	data =send.asString();
		
		System.out.println(data);
	}
	
	@AfterMethod
	public void finish()
	{
		Finish.finish();
	}
	

}
