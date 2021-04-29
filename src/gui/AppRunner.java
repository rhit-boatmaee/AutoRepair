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
		managerFrame.setBounds(10, 10, 370, 600);
		managerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		managerFrame.setResizable(false);

	}

	protected void openCustomerFrame() {

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

	public boolean completeRegistration(String username, String password, String userType) {

		System.out.println("Registration completed for " + username);

		byte[] saltPass = this.getNewSalt();
		String hashedPass = this.hashPassword(saltPass, password);

		System.out.println("register" + username + " " + password);
		try {
			Connection c = dbService.getConnection();
			System.out.println(dbService);
			System.out.println(c);
			CallableStatement cs = c.prepareCall(" {? = CALL Register(?,?,?,?)}");
			cs.registerOutParameter(1, Types.INTEGER);
			cs.setString(2, username);
			cs.setBytes(3, saltPass);
			cs.setString(4, hashedPass);
			cs.setString(5,  userType);

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

		System.out.println("login" + username + " " + password);

		String query = "SELECT PasswordSalt, PasswordHash, UserType FROM [Users] WHERE Username = ? ";
		byte[] saltPass = null;
		String hashPass = "";

		Connection c = dbService.getConnection();

		try {
			PreparedStatement s = c.prepareStatement(query);
			s.setString(1, username);
			ResultSet rs = s.executeQuery();
			while (rs.next()) {
				saltPass = rs.getBytes("PasswordSalt");
				hashPass = rs.getString("PasswordHash");
				type = rs.getString("UserType");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		String newHashPass = this.hashPassword(saltPass, password);

		if (newHashPass.equals(hashPass)) {
			return new LoginInfo(true, type);
		}

		System.out.println(newHashPass + " " + hashPass);
		JOptionPane.showMessageDialog(null, "Login Failed");
		return new LoginInfo(false, type);

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

}
