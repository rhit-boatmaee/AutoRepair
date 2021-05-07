package gui;

public class MyUser {
	String FirstName,LastName;
	
	public MyUser(String FirstName, String LastName) {
		this.FirstName = FirstName;
		this.LastName = LastName;
	}
	public String getFistName() {
		return this.FirstName;
	}
	
	public String getLastName() {
		return this.LastName;
	}
}
