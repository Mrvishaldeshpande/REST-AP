package TestingPractice;



import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Utility.Finish;
import Utility.Start;
import io.restassured.RestAssured;



import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


import java.util.List;

public class TestingGETPractice3 {

	
	
	private String a;
	public List<Object>     d;

	@Test
	public void test() 
	{
	
	RestAssured.baseURI="http://localhost:3000/posts";
		
	
		a=given().log().all().
		when().get().
		then().log().all().
		assertThat().statusCode(200).
		and().header("Content-Length", equalTo("432")).extract().response().asString();
		
		
	
	    
	    a.toString();
	    
	    System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
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
