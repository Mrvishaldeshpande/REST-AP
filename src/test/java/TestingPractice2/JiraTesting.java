package TestingPractice2;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.filter.session.SessionFilter;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

import java.util.HashMap;

public class JiraTesting {
	
	HashMap<String, String> idpwd;
	private SessionFilter session;
	private String se;
	@Test
	public void test() 
		
	{
		RestAssured.baseURI="http://localhost:8080/";
		session =new SessionFilter();
		idpwd = new HashMap<String, String>();
		idpwd.put("username", "Mr.vishal.deshpande");
		idpwd.put("password", "Anish@11");
		
		se=given().log().all().contentType("application/json").body(idpwd).when().post("rest/auth/1/session").
		then().assertThat().statusCode(200).extract().response().asString();
		
		JsonPath j = new JsonPath(se);
		
		
		System.out.println("###############################################################################################################################");
		System.out.println(se);
		System.out.println(j.get("session.value"));
		String sessionid=j.get("session.value");
		System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();
		
		
		given().log().all().contentType("application/json").header("coockie",sessionid).
		when().get("rest/api/2/search");
		
		
		
		System.out.println("###############################################################################################################################");
		
		
		
		
	}

}
