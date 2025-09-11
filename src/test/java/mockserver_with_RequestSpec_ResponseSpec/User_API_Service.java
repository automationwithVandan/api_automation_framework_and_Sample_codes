package mockserver_with_RequestSpec_ResponseSpec;

import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class User_API_Service {

	public static void main(String[] args) {
		
		Address address= new Address();
		address.setCity("New York");
		address.setStreet("123 Main Street");
		address.setZipcode("10001");
		
		User user= new User();
		user.setId("101");
		user.setActive(true);
		user.setEmail("john.doe@example.com");
		user.setAddress(address);
		
		
		
		RequestSpecification request= new RequestSpecBuilder()
									.setBaseUri("https://8662d543-e59e-4b49-949b-8dffa4f50e03.mock.pstmn.io/")
									.setContentType(ContentType.JSON)
									.setBody(user).build();
		
		ResponseSpecification response= new ResponseSpecBuilder()
									.expectContentType(ContentType.HTML)
									.expectStatusCode(201)
									.build();
		
		given().spec(request)
		.when().post()
		.then().log().all().spec(response);
		
		
		

	}

}
