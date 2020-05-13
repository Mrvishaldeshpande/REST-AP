package TestingPractice2;

import Payload.JiraPayload;
import Payload.TestingPayload;
import io.restassured.path.json.JsonPath;

public class Testcase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JsonPath j = new JsonPath(JiraPayload.payload());
		System.out.println(j.get("issues.size"));
		System.out.println(j.get("issues[0].id"));
		int count=j.get("issues.size");
	
	for(int i=0;i<count;i++) 
	{
		System.out.println(j.get("issues["+i+"].id"));
	}
	
	
	
	}

}
