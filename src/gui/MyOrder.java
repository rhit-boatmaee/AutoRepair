package gui;

public class MyOrder {
	String ManagerUserName;
	int PartNumber;
	public MyOrder(String managerUserName, int PartNumber) {
		this.ManagerUserName = managerUserName;
		this.PartNumber = PartNumber;
	}
	
	public String getManagerUserName() {
		return this.ManagerUserName;
	}
	
	public int getPartNumber() {
		return this.PartNumber;
	}
	
}
