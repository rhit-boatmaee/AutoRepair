package gui;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Random;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.swing.*;
import services.DatabaseConnectionService;

class AppRunner {
	private static final Random RANDOM = new SecureRandom();
	private static final Base64.Encoder enc = Base64.getEncoder();
	private static final Base64.Decoder dec = Base64.getDecoder();
	public DatabaseConnectionService dbService = null;

	public AppRunner(DatabaseConnectionService dbService) {
		this.dbService = dbService;

	}

	public void openManagerFrame() {

		ManagerFrame managerFrame = new ManagerFrame(this);
		managerFrame.setTitle("AutoRepair - Manager");
		managerFrame.setVisible(true);
		managerFrame.setBounds(10, 10, 400, 600);
		managerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		managerFrame.setResizable(false);

	}

	protected void openCustomerFrame() {
		CustomerFrame managerFrame = new CustomerFrame(this, null);
		managerFrame.setTitle("AutoRepair - Customer");
		managerFrame.setVisible(true);
		managerFrame.setBounds(10, 10, 400, 600);
		managerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		managerFrame.setResizable(false);
	}

	protected void openEmployeeFrame() {

	}

	public void startRegistration() {
		RegisterFrame registerFrame = new RegisterFrame(this);
		registerFrame.setTitle("Registration Form");
		registerFrame.setVisible(true);
		registerFrame.setBounds(10, 10, 370, 600);
		registerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		registerFrame.setResizable(false);

	}

	public boolean completeRegistration(String firstName, String lastName, String username, String password, String userType) {

		byte[] saltPass = this.getNewSalt();
		String hashedPass = this.hashPassword(saltPass, password);

		try {
			Connection c = dbService.getConnection();
			System.out.println(dbService);
			System.out.println(c);
			CallableStatement cs = c.prepareCall(" {? = CALL Register(?,?,?,?,?,?)}");
			cs.registerOutParameter(1, Types.INTEGER);
			cs.setString(2, username);
			cs.setString(3, hashedPass);
			cs.setBytes(4, saltPass);
			cs.setString(5, userType);
			cs.setString(6, firstName);
			cs.setString(7, lastName);

			cs.execute();

			int returnCode = cs.getInt(1);
			if (returnCode == 0) {
				JOptionPane.showMessageDialog(null, "Registration Successful");
				return true;
			} else {
				JOptionPane.showMessageDialog(null, "Registration Failed");
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;

	}

	public LoginInfo startLogin(String username, String password) {

		String type = "not yet implemented";
		byte[] saltPass = null;
		String hashPass = "";
		String newHashPass = "";
//		System.out.println("login" + username + " " + password);
		try {
		Connection c = dbService.getConnection();
		CallableStatement cs = c.prepareCall(" {? = CALL LoginChecker(?)}");
		cs.registerOutParameter(1, Types.INTEGER);
		cs.setString(2, username);
		ResultSet rs = cs.executeQuery();
		while (rs.next()) {
			saltPass = rs.getBytes("SaltPass");
			hashPass = rs.getString("HashPass");
			type = rs.getString("UserType");
		}
		newHashPass = this.hashPassword(saltPass, password);
	} catch (SQLException e) {
		e.printStackTrace();
		return new LoginInfo(false, type);
	} catch (NullPointerException e) {
		System.out.println("Login Info is empty");
		return new LoginInfo(false, type);
	}

	if (newHashPass.equals(hashPass)) {
		return new LoginInfo(true, type);
	}

	System.out.println(newHashPass + " " + hashPass);
	JOptionPane.showMessageDialog(null, "Login Failed");
	return new LoginInfo(false, type);
		
		
		


	}

	public boolean addRepair(String vehicle, String startDate, String endDate, int discount, int totalCost,
			String description) {
		
		try {
			Connection c = dbService.getConnection();
			System.out.println(dbService);
			System.out.println(c);
			Random rnd = new Random();
		    int number = rnd.nextInt(999999);
			CallableStatement cs = c.prepareCall(" {? = CALL InsertRepair(?,?,?,?,?,?,?)}");
			cs.registerOutParameter(1, Types.INTEGER);
			cs.setInt(2, number);
			cs.setString(3, startDate);
			cs.setString(4, endDate);
			
			// need to convert discount and totalCost to int
			cs.setString(5, description);
			cs.setInt(6, discount);
			cs.setInt(7, totalCost);
			cs.setString(8, vehicle);

			cs.execute();

			int returnCode = cs.getInt(1);
			if (returnCode == 0) {
				JOptionPane.showMessageDialog(null, "Add Repair Successful");
				return true;
			} else {
				JOptionPane.showMessageDialog(null, "Add Repair Failed Failed");
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true;

	}
	public boolean addVehicle(String VIN, int year, String model, int mileage, String bodyType) {
		// TODO Auto-generated method stub
		
		if(VIN.length() == 0 || model.length() == 0 ) {
			JOptionPane.showMessageDialog(null, "fields can't be left empty");
			return false;
		}
		try {
			Connection c = dbService.getConnection();
			System.out.println(dbService);
			System.out.println(bodyType);
			System.out.println(VIN);
			CallableStatement cs = c.prepareCall(" {? = CALL InsertVehicle(?,?,?,?,?)}");
			cs.registerOutParameter(1, Types.INTEGER);
			cs.setString(2, VIN);
			cs.setInt(3, year);
			cs.setString(4, model);
			cs.setInt(5, mileage);
			cs.setString(6, bodyType);
			cs.execute();

			int returnCode = cs.getInt(1);
			if (returnCode == 0) {
				JOptionPane.showMessageDialog(null, "Add Vehicle Successful");
				return true;
			} else {
				JOptionPane.showMessageDialog(null, "Add Vehicle Failed Failed");
				System.out.println(returnCode);
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true;
	}
	
	public boolean addTool(String Size, String Name, String Brand) {
		// TODO Auto-generated method stub
		try {
			Connection c = dbService.getConnection();

			CallableStatement cs = c.prepareCall(" {? = CALL InsertTool(?,?,?)}");
			cs.registerOutParameter(1, Types.INTEGER);
			cs.setString(2, Size);
			cs.setString(3, Name);
			cs.setString(4, Brand);
			cs.execute();

			int returnCode = cs.getInt(1);
			if (returnCode == 0) {
				JOptionPane.showMessageDialog(null, "Add Tool Successful");
				return true;
			} else {
				JOptionPane.showMessageDialog(null, "Add Tool Failed Failed");
				System.out.println(returnCode);
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true;
	}
	
	public boolean addTask(int ID, String Name, String Description, int Price) {
		// TODO Auto-generated method stub
		try {
			Connection c = dbService.getConnection();

			CallableStatement cs = c.prepareCall(" {? = CALL InsertTask(?,?,?,?)}");
			cs.registerOutParameter(1, Types.INTEGER);
			cs.setInt(2, ID);
			cs.setString(3, Name);
			cs.setString(4, Description);
			cs.setInt(5, Price);
			cs.execute();

			int returnCode = cs.getInt(1);
			if (returnCode == 0) {
				JOptionPane.showMessageDialog(null, "Add Task Successful");
				return true;
			} else {
				JOptionPane.showMessageDialog(null, "Add Task Failed Failed");
				System.out.println(returnCode);
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true;
	}
	
	public boolean addPart(int PartNumber, String Name, int Price) {
		// TODO Auto-generated method stub
		try {
			Connection c = dbService.getConnection();

			CallableStatement cs = c.prepareCall(" {? = CALL InsertPart(?,?,?)}");
			cs.registerOutParameter(1, Types.INTEGER);
			cs.setInt(2, PartNumber);
			cs.setString(3, Name);
			cs.setInt(4, Price);
			cs.execute();

			int returnCode = cs.getInt(1);
			if (returnCode == 0) {
				JOptionPane.showMessageDialog(null, "Add Task Successful");
				return true;
			} else {
				JOptionPane.showMessageDialog(null, "Add Task Failed Failed");
				System.out.println(returnCode);
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true;
	}

	public boolean useApplicationLogins() {
		return true;
	}

	public byte[] getNewSalt() {
		byte[] salt = new byte[16];
		RANDOM.nextBytes(salt);
		return salt;
	}

	public String getStringFromBytes(byte[] data) {
		return enc.encodeToString(data);
	}

	public String hashPassword(byte[] salt, String password) {

		KeySpec spec = new PBEKeySpec(password.toCharArray(), salt, 65536, 128);
		SecretKeyFactory f;
		byte[] hash = null;
		try {
			f = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
			hash = f.generateSecret(spec).getEncoded();
		} catch (NoSuchAlgorithmException e) {
			JOptionPane.showMessageDialog(null, "An error occurred during password hashing. See stack trace.");
			e.printStackTrace();
		} catch (InvalidKeySpecException e) {
			JOptionPane.showMessageDialog(null, "An error occurred during password hashing. See stack trace.");
			e.printStackTrace();
		}
		return getStringFromBytes(hash);
	}

	public ArrayList<String> getVehicles() {

		ArrayList<String> vehicles = new ArrayList<String>();
		try {

			PreparedStatement s = dbService.getConnection().prepareStatement("SELECT VIN FROM VEHICLE");

			ResultSet rs = s.executeQuery();
			while (rs.next()) {

				vehicles.add(rs.getString("VIN"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return vehicles;
	}
	
	
	public ArrayList<MyRepairs> customerViewRepairs(String userName) {
		ArrayList<MyRepairs> myRepairs = new ArrayList<MyRepairs>();
		try {
			PreparedStatement s = dbService.getConnection().prepareStatement("SELECT * FROM REPAIR ");
			ResultSet rs = s.executeQuery();
			while(rs.next()) {
				MyRepairs row = new MyRepairs(rs.getInt("ID"),rs.getString("StartDate"),rs.getString("EndDate"),rs.getString("Description"),rs.getInt("Discount"),rs.getInt("TotalCost"),rs.getString("VIN"));
				myRepairs.add(row);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return myRepairs;
	}
	
	public ArrayList<MyRepairs> getRepairs() {
		ArrayList<MyRepairs> myRepairs = new ArrayList<MyRepairs>();
		try {
			PreparedStatement s = dbService.getConnection().prepareStatement("SELECT * FROM REPAIR");
			ResultSet rs = s.executeQuery();
			while(rs.next()) {
				MyRepairs row = new MyRepairs(rs.getInt("ID"),rs.getString("StartDate"),rs.getString("EndDate"),rs.getString("Description"),rs.getInt("Discount"),rs.getInt("TotalCost"),rs.getString("VIN"));
				myRepairs.add(row);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return myRepairs;
	}
	
	public ArrayList<MyVehicles> getAllVehicles() {
		ArrayList<MyVehicles> myVehiclesList = new ArrayList<MyVehicles>();
		try {
			PreparedStatement s = dbService.getConnection().prepareStatement("SELECT * FROM Vehicle");
			ResultSet rs = s.executeQuery();
			while(rs.next()) {
				MyVehicles row = new MyVehicles(rs.getString("VIN"),rs.getInt("Year"),rs.getString("Model"),rs.getInt("Mileage"),rs.getString("BodyType"));
				myVehiclesList.add(row);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return myVehiclesList;
	}
	
	public ArrayList<MyTasks> getTasks() {
		ArrayList<MyTasks> myTaskList = new ArrayList<MyTasks>();
		try {
			PreparedStatement s = dbService.getConnection().prepareStatement("SELECT * FROM Task");
			ResultSet rs = s.executeQuery();
			while(rs.next()) {
				MyTasks row = new MyTasks(rs.getInt("ID"),rs.getString("Name"),rs.getString("Description"),rs.getInt("Price"));
				myTaskList.add(row);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return myTaskList;
	}
	
	public ArrayList<MyTools> getTools() {
		ArrayList<MyTools> myToolsList = new ArrayList<MyTools>();
		try {
			PreparedStatement s = dbService.getConnection().prepareStatement("SELECT * FROM Tool");
			ResultSet rs = s.executeQuery();
			while(rs.next()) {
				MyTools row = new MyTools(rs.getString("Size"),rs.getString("Name"),rs.getString("Brand"));
				myToolsList.add(row);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return myToolsList;
	}
	
	public ArrayList<MyParts> getParts() {
		ArrayList<MyParts> myPartsList = new ArrayList<MyParts>();
		try {
			PreparedStatement s = dbService.getConnection().prepareStatement("SELECT * FROM Part");
			ResultSet rs = s.executeQuery();
			while(rs.next()) {
				MyParts row = new MyParts(rs.getInt("PartNumber"),rs.getString("Name"),rs.getInt("Price"));
				myPartsList.add(row);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return myPartsList;
	}


	

}
