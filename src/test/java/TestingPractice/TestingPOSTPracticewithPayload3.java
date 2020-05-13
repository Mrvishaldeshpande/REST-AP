package TestingPractice;

import static io.restassured.RestAssured.*;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Payload.PayloadPractice;
import io.restassured.RestAssured;



public class TestingPOSTPracticewithPayload3 {

	
@Test(dataProvider="data")
	public  void main(int id,String title,String author,int price) {
		
		
		RestAssured.baseURI="http://localhost:3000/posts";
		
		
		given().log().all().contentType("application/json").body(PayloadPractice.stringpayload(id, title, author, price))
		
	   .when().post().

	    then().log().all().assertThat().statusCode(201);
	   
	   
	}

@DataProvider(name="data")
public Object[][] getdata() 
		{
		
			return new Object[][] {{39,"tax1","CA",500},{40,"org2","CWA",600}};
		}


}
