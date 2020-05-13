package TestingPackage;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestingDeletMethod {
	
	
	public RequestSpecification request;
	public Response response;

	@Test
	public void testingdelete() 
	{
		
		System.out.println("##############################################################################################################################");
		request = RestAssured.given();
		
		response =request.delete("http://localhost:3000/posts/31");
		int status =response.getStatusCode();
		System.out.println(status);
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("##############################################################################################################################");
		System.out.println();System.out.println();System.out.println();
	}

}
