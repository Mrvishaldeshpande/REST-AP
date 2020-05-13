package Payload;

public class PayloadPractice {
	
	
	
	public static String stringpayload() 
	
	{
		return"{\r\n" + 
		"    \"id\": \"35\",\r\n" + 
		"    \"title\": \"rest2\",\r\n" + 
		"    \"author\": \"vishal\",\r\n" + 
		"  \"price\": \"100\"}";
	}
	
	
public static String stringpayload(int id,String title,String author,int price) 
	
	{
		return"{\r\n" + 
		"    \"id\": \""+id+"\",\r\n" + 
		"    \"title\": \""+title+"\",\r\n" + 
		"    \"author\": \""+author+"\",\r\n" + 
		"  \"price\": \""+price+"\"}";
	}
	

}
