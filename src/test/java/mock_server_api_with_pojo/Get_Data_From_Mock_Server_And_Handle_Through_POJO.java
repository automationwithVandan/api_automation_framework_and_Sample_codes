package mock_server_api_with_pojo;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Get_Data_From_Mock_Server_And_Handle_Through_POJO {

	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {

		RestAssured.baseURI = "https://87c81064-e30d-4e54-a795-51e6e00ac446.mock.pstmn.io";
		String data = given().headers("Content-Type", "application/json").when().get("/get_employee_details").then()
				.extract().response().asString();
		//System.out.println(data);
		
		ObjectMapper mapper= new ObjectMapper();
		UserContainer userContainer=mapper.readValue(data,UserContainer.class);
		
		System.out.println("user id => "+userContainer.getUser().getId());
		System.out.println("user name =>"+userContainer.getUser().getName());
		System.out.println("user email =>"+userContainer.getUser().getContact().getEmail());
		System.out.println("user contact => "+userContainer.getUser().getContact().getAddress().getCity());
		
		int totalSkills= userContainer.getUser().skills.size();
		for(int i=0;i<totalSkills;i++)
		{
			System.out.println("Skills => "+userContainer.getUser().skills.get(i).getName());
		}
		System.out.println("company name "+userContainer.getUser().getCompany().getName());
		System.out.println("Department "+userContainer.getUser().getCompany().getDepartment().getName());
		

	}

}
