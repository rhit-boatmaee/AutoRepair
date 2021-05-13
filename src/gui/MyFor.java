package gui;

public class MyFor {

	int TaskID, PartNumber;
	public MyFor(int TaskID, int PartNumber) {
		this.TaskID = TaskID;
		this.PartNumber = PartNumber;
	}
	
	public int getTaskID() {
		return this.TaskID;
	}
	
	public int getPartNumber() {
		return this.PartNumber;
	}
}
