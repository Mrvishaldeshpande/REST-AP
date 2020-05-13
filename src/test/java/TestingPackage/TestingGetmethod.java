package TestingPackage;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestingGetmethod {
	
	
	public RequestSpecification Request;
	public Response response;

	@Test
	public void getmethod() 
	{
		
		System.out.println("Start");
		System.out.println("############################################################################################################");
		
		
		response =RestAssured.get("http://localhost:3000/posts");
		String data=response.asString();
		System.out.println(data);
			int status=	response.getStatusCode();
			System.out.println(status );
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("############################################################################################################");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
	}

}
