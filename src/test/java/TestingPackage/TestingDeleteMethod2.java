package TestingPackage;
import org.testng.annotations.*;

import Utility.Finish;
import Utility.Start;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class TestingDeleteMethod2 {


	
	private RequestSpecification request;
	private Response send;

	@Test
	public void test() 
	{
		
		request=RestAssured.given();
		send=request.delete("http://localhost:3000/posts/32");
		int status = send.statusCode();
		System.out.println(status);
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
