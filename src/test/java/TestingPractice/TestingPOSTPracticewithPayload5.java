package TestingPractice;

import static io.restassured.RestAssured.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import POJO.POJO1;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;




public class TestingPOSTPracticewithPayload5 {

	
private String a;

@Test



	public  void main() {
		
		
		RestAssured.baseURI="http://localhost:3000/posts";
		POJO1 p = new POJO1();
		p.setId(42);
		p.setTitle("math");
		p.setAuthor("bhaskar");
		p.setPrice(600);
		
		a=given().log().all().contentType("application/json").body(p)
		
	   .when().post().

	    then().log().all().assertThat().statusCode(201).extract().response().asString();
	   
		JsonPath j= new JsonPath(a);
		String actual=j.getString("title");
		Assert.assertEquals(actual, "math");
	   
		System.out.println("Done");
	}



}
