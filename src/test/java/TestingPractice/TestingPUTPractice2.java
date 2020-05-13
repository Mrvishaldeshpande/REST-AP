package TestingPractice;

import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static org.hamcrest.Matchers.*;

public class TestingPUTPractice2 {
	
	@Test
	public void test() 
	{
		RestAssured.baseURI="http://localhost:3000/posts";
			
		String expectedprice="200";
		given().log().all().
		contentType("application/json").body("{\r\n" + 
				"    \"id\": \"35\",\r\n" + 
				"    \"title\": \"rest2\",\r\n" + 
				"    \"author\": \"vishal\",\r\n" + 
				"  \"price\": \"200\"}").
		
		when().put("/35").
		
		then().log().all().
		assertThat().statusCode(200).and().body("author", equalTo("vishal")).header("Content-Length", equalTo("76"));
	
		
		String change=given().when().get("/35").then().assertThat().statusCode(200).extract().response().asString();
		
		JsonPath jk= new  JsonPath(change);
		String Actualprice=jk.getString("price");
		
		Assert.assertEquals(Actualprice, expectedprice);
		
	}
	
	
	
	
	
	
	

}
