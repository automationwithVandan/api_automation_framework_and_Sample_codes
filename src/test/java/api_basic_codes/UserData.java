package api_basic_codes;

public class UserData 
{
	static String email= "Aditi"+System.currentTimeMillis()+"@gmail.com";
	public static String data()
	{
		return "{\r\n"
				+ "\"name\":\"Aditi Sharma\",\r\n"
				+ "\"email\":\""+email+"\",\r\n"
				+ "\"gender\":\"Female\",\r\n"
				+ "\"status\":\"Active\"\r\n"
				+ "}";
	}
}
