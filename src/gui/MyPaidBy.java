package gui;

public class MyPaidBy {
	String VehicleVIN, CustomerName, Receipt;
	int RepairID;
	public MyPaidBy(String VehicleVIN, int RepairID, String CustomerName, String Receipt) {
		this.VehicleVIN = VehicleVIN;
		this.CustomerName = CustomerName;
		this.Receipt = Receipt;
		this.RepairID = RepairID;
	}
	public String getVehicleVIN() {
		return this.VehicleVIN;
	}
	public String getCustomerName() {
		return this.CustomerName;
	}
	public String getReceipt() {
		return this.Receipt;
	}
	public int getRepairID() {
		return this.RepairID;
	}
}
