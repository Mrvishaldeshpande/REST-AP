package TestingPractice;


import org.testng.annotations.Test;

import POJO.POJO1;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;


import static org.hamcrest.Matchers.*;

public class TestingPUTPractice3 {
	
	@Test
	public void test() 
	{
		RestAssured.baseURI="http://localhost:3000/posts";
			
		
		given().log().all().
		contentType("application/json").body("{\r\n" + 
				"    \"id\": \"35\",\r\n" + 
				"    \"title\": \"rest2\",\r\n" + 
				"    \"author\": \"vishal\",\r\n" + 
				"  \"price\": \"500\"}").
		
		when().put("/35").
		
		then().log().all().
		assertThat().statusCode(200).and().body("author", equalTo("vishal")).header("Content-Length", equalTo("76"));
	
		
		POJO1 p=given().when().get("/35").as(POJO1.class);
		
		System.out.println(p.getId());
		System.out.println(p.getTitle());
		System.out.println(p.getAuthor());
		System.out.println(p.getPrice());
		
		System.out.println("@@@@@@@@@");
	}
	
	
	
	
	
	
	

}
