package mock_server_api_with_pojo;

import io.restassured.path.json.JsonPath;
import resources.Multi_Layer_JSON_Data;

public class Multi_Layer_JSON_Static_Handler_Without_POJO {

	public static void main(String[] args) {
			
		String data= Multi_Layer_JSON_Data.json_Data_Multi_Layer();
		//System.out.println(data);
		
		// print user id, email, city , all skill names , company name, and department
		
		JsonPath js= new JsonPath(data);
		
		//print user id 
		String userID=js.getString("user.id");
		System.out.println("User ID => "+userID);

		// print email> 
		String emailID= js.getString("user.contact.email");
		System.out.println("Email is => "+emailID);
		
		// print city
		String city= js.getString("user.contact.address.city");
		System.out.println("City is "+city);
		
		// print all skills
		int skillCount=js.getList("user.skills").size();
		for(int i=0;i<skillCount;i++)
		{
			System.out.println("Skill is => "+js.getString("user.skills["+i+"].name"));
		}
		
		// print company name
		String companyName=js.getString("user.company.name");
		System.out.println("Company Name => "+companyName);
		
		//print department name
		String departmentName= js.getString("user.company.department.name");
		System.out.println("department name => "+departmentName);
	}

}
