package mockserver_with_RequestSpec_ResponseSpec;

import static io.restassured.RestAssured.*;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class User_API_Get_Service_MockServer2 {

	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		
		RequestSpecification request= new RequestSpecBuilder()
				.setBaseUri("https://8662d543-e59e-4b49-949b-8dffa4f50e03.mock.pstmn.io")
				.setContentType(ContentType.JSON)
				.build();
									
		
		ResponseSpecification response = new ResponseSpecBuilder()
									.expectStatusCode(200).build();
		
		String apiResponse=given().spec(request)
		.when().get("users/1")
		.then().extract().response().asString();
		
		System.out.println(apiResponse);
		
		// getting data extracted from JSONPath, ObjectMapper,and POJO
		// fetch data using ObjectMapper Class
		
		ObjectMapper mapper= new ObjectMapper();
		Map<String,Object> map= mapper.readValue(apiResponse, Map.class);
		
		//we can not write like 
		//String id= map.get("id")  // because it returns object so printing directly in sysout
				
		System.out.println(map.get("id"));
		System.out.println(map.get("name"));
	
		// if you want to store this in variable the user ObjectMapper like below
		//where user is a pojo class
		User user=mapper.readValue(apiResponse, User.class);
		String name= user.getName();
		String city = user.getAddress().getCity();
		System.out.println("name is "+ name + " and city is "+city);
	}

}
