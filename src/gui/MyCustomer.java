package gui;

public class MyCustomer {

	String username;
	int numberOfVisits;
	public MyCustomer(String username, int numberOfVisits) {
		this.username = username;
		this.numberOfVisits = numberOfVisits;
	}
	
	public String getusername() {
		return this.username;
	}
	
	public int getnumberOfVisits() {
		return this.numberOfVisits;
	}
}
