package api_basic_codes;

import io.restassured.path.json.JsonPath;

public class HandlingMultiLayerJson
{
	public static String data()
	{
		return 
				"{\r\n"
				+ "  \"user\": {\r\n"
				+ "    \"id\": 123,\r\n"
				+ "    \"name\": \"Aditi Sharma\",\r\n"
				+ "    \"contact\": {\r\n"
				+ "      \"email\": \"aditi@email.com\",\r\n"
				+ "      \"phone\": \"+91-9876543210\",\r\n"
				+ "      \"address\": {\r\n"
				+ "        \"street\": \"123 MG Road\",\r\n"
				+ "        \"city\": \"Delhi\",\r\n"
				+ "        \"pincode\": \"110001\"\r\n"
				+ "      }\r\n"
				+ "    },\r\n"
				+ "    \"skills\": [\r\n"
				+ "      {\r\n"
				+ "        \"name\": \"Java\",\r\n"
				+ "        \"level\": \"Expert\"\r\n"
				+ "      },\r\n"
				+ "      {\r\n"
				+ "        \"name\": \"Python\", \r\n"
				+ "        \"level\": \"Beginner\"\r\n"
				+ "      }\r\n"
				+ "    ],\r\n"
				+ "    \"company\": {\r\n"
				+ "      \"name\": \"Tech Corp\",\r\n"
				+ "      \"department\": {\r\n"
				+ "        \"name\": \"Engineering\",\r\n"
				+ "        \"team\": \"Backend\"\r\n"
				+ "      }\r\n"
				+ "    }\r\n"
				+ "  }\r\n"
				+ "}";
	}
	
	public static void main(String args[])
	{
		String data=data();
		System.out.println(data);
		JsonPath js= new JsonPath(data);
		String id=js.getString("user.id");
		String email= js.getString("user.contact.email");
		String city=js.getString("user.contact.address.city");
		String skillLevel= js.getString("user.skills[0].level");
		System.out.println(id);
		System.out.println(email);
		System.out.println(city);
		System.out.println(skillLevel);
	}
}
