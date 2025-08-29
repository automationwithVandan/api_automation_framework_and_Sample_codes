package mock_server_api_with_pojo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import resources.Multi_Layer_JSON_Data;

public class Multi_Layer_JSON_Static_Handler_With_POJO {

	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		
		String data= Multi_Layer_JSON_Data.json_Data_Multi_Layer();
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
