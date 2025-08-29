package mock_server_api_with_pojo;

import java.util.List;

public class User 
{
	String id;
	String name;
	Contact contact;
	List<Skills> skills;
	Company company;
	public void setSkills(List<Skills> skills) {
		this.skills = skills;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Contact getContact() {
		return contact;
	}
	public void setContact(Contact contact) {
		this.contact = contact;
	}
	
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
}
