package gui;

public class MyTools {
	String Size,Name,Brand;
	public MyTools(String Size, String Name, String Brand) {
		this.Size = Size;
		this.Name = Name;
		this.Brand = Brand;
	}
	
	public String getSize() {
		return this.Size;
	}
	
	public String getName() {
		return this.Name;
	}
	
	public String getBrand() {
		return this.Brand;
	}
}
