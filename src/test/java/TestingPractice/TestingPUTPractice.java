package TestingPractice;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import static org.hamcrest.Matchers.*;

public class TestingPUTPractice {
	
	@Test
	public void test() 
	{
		RestAssured.baseURI="http://localhost:3000/posts";
			
		
		given().log().all().
		contentType("application/json").body("{\r\n" + 
				"    \"id\": \"35\",\r\n" + 
				"    \"title\": \"rest2\",\r\n" + 
				"    \"author\": \"vishal\",\r\n" + 
				"  \"price\": \"100\"}").
		
		when().put("/35").
		
		then().log().all().
		assertThat().statusCode(200).and().body("author", equalTo("vishal")).header("Content-Length", equalTo("76"));
		
	}
	
	
	
	
	
	
	

}
