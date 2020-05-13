package TestingPractice;



import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Utility.Finish;
import Utility.Start;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;


import static io.restassured.RestAssured.*;

import java.util.List;

public class TestingGETPractice1 {

	
	
	private String a;
	public List<Object>     d;

	@Test
	public void test() 
	{
	
	RestAssured.baseURI="http://localhost:3000/posts";
		
	
		a=given().log().all().
		when().get().
		then().log().all().
		assertThat().statusCode(200).extract().asString();
		
		JsonPath jp = new JsonPath(a);
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println(a);
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	
	    d=jp.getList("author");
	    int count =0;
		for(int i=0;i<=d.size()-1;i++) 
		{
			if(d.get(i).equals("vishal")) 
			{
				count=count+1;
			}
		}
	System.out.println(count);
	
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
