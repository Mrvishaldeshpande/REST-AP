package TestingPractice2;



import org.testng.Assert;

import Payload.TestingPayload;
import io.restassured.path.json.JsonPath;

/*1. Print No of courses returned by API

2.Print Purchase Amount

3. Print Title of the first course

4. Print All course titles and their respective Prices

5. Print no of copies sold by RPA Course

6. Verify if Sum of all Course prices matches with Purchase Amount*/

public class Testcase1 {

	
	
	 
	public static void main(String[] args)
	{
		
		
		JsonPath j= new JsonPath(TestingPayload.response());
		int count =j.getInt("courses.size()");
		System.out.println(count);
		int amount =j.getInt("dashboard.purchaseAmount");
		System.out.println(amount);
		
		String firstcourse=j.getString("courses.title[0]");
		System.out.println(firstcourse);
		
			for(int i=0;i<=count-1;i++) 
			{
				System.out.println("Course = "+j.getString("courses.title["+i+"]")+
						"   &   Course price = "+j.getInt("courses.price["+i+"]"));
			}
	
			for(int i=0;i<=count-1;i++) 
			{
				if(j.getString("courses.title["+i+"]").equalsIgnoreCase("RPA")) 
				{
					System.out.println(j.getInt("courses.copies["+i+"]"));
				
				}
			}
	
	
			int sum=0;
			for(int i=0;i<=count-1;i++) 
			{
				int total =j.getInt("courses.price["+i+"]")*j.getInt("courses.copies["+i+"]");
				
				sum=sum+total;
			}
			
			Assert.assertEquals(amount, sum);
		System.out.println(sum);	
	
	}
	
}
