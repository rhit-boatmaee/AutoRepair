package gui;

public class MyHas {
	String VehicleVIN;
	int RepairID, TaskId;
	public MyHas(String VehicleVIN, int RepairID, int TaskID) {
		this.VehicleVIN = VehicleVIN;
		this.RepairID = RepairID;
		this.TaskId = TaskID;
	}
	public String getVehicleVin() {
		return this.VehicleVIN;
	}
	public int getRepairID() {
		return this.RepairID;
	}
	public int getTaskID() {
		return this.TaskId;
	}
	
}
