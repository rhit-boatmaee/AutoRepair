package gui;

public class MyVehicles {
	String VIN, Model, BodyType;
	int Year, Mileage;
	public MyVehicles(String VIN, int Year,String Model, int Mileage, String BodyType) {
		this.VIN = VIN;
		this.Model = Model;
		this.BodyType = BodyType;
		this.Year = Year;
		this.Mileage = Mileage;
	}
	public int getYear() {
		return this.Year;
	}
	public int getMileage() {
		return this.Mileage;
	}
	public String getVin() {
		return this.VIN;
	}
	public String getModel() {
		return this.Model;
	}
	public String getBodyType() {
		return this.BodyType;
	}
}
