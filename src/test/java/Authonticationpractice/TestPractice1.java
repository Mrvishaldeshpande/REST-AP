package Authonticationpractice;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;
public class TestPractice1 {
	
	@Test
	public void test() 
	{
		//API key
		//API Secret key
		//Access Token
		//Access Token secret
		given().auth().oauth("", "", "", "").when().post();
		
	}
}
