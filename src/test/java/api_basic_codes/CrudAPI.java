  package api_basic_codes;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class CrudAPI {

	public static void main(String[] args) {
		
		RestAssured.baseURI="https://gorest.co.in/public/v2/users";
		Map<String,String> headers= new LinkedHashMap<String,String>();
		headers.put("Authorization","Bearer 23242f9267d5fdcc3fb400f4feb27ad574c7448a132693d2176b2c26b4728704");
		headers.put("Content-Type","application/json");
		
		given()
		.headers(headers)
		.body(UserData.data())
		.when().post()
		.then().log().all().assertThat().statusCode(201)
		.body("name",equalTo("Aditi Sharma"));
		

	}

}
