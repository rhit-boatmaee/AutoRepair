package gui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.*;

public class LoginFrame extends JFrame implements ActionListener {

	Container container = getContentPane();
	JLabel userLabel = new JLabel("USERNAME");
	JLabel passwordLabel = new JLabel("PASSWORD");
	JTextField userTextField = new JTextField();
	JPasswordField passwordField = new JPasswordField();
	JButton loginButton = new JButton("LOGIN");
	JButton resetButton = new JButton("RESET");
	JCheckBox showPassword = new JCheckBox("Show Password");

	JLabel registerLabel = new JLabel("New User? Click the button to register.");
	JButton registerButton = new JButton("REGISTER");
	AppRunner app;

	public LoginFrame(AppRunner application) {
		this.app = application;
		setLayoutManager();
		setLocationAndSize();
		addComponentsToContainer();
		addActionEvent();
	}

	public void setLayoutManager() {
		container.setLayout(null);
	}

	public void setLocationAndSize() {

		registerLabel.setBounds(50, 400, 250, 60);
		registerButton.setBounds(50, 450, 100, 30);
		userLabel.setBounds(50, 150, 100, 30);
		passwordLabel.setBounds(50, 220, 100, 30);
		userTextField.setBounds(150, 150, 150, 30);
		passwordField.setBounds(150, 220, 150, 30);
		showPassword.setBounds(150, 250, 150, 30);
		loginButton.setBounds(50, 300, 100, 30);
		resetButton.setBounds(200, 300, 100, 30);

	}

	public void addComponentsToContainer() {
		container.add(registerButton);
		container.add(registerLabel);
		container.add(userLabel);
		container.add(passwordLabel);
		container.add(userTextField);
		container.add(passwordField);
		container.add(showPassword);
		container.add(loginButton);
		container.add(resetButton);

	}

	public void addActionEvent() {
		loginButton.addActionListener(this);
		resetButton.addActionListener(this);
		showPassword.addActionListener(this);
		registerButton.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// Coding Part of LOGIN button

		if (e.getSource() == registerButton) {
			app.startRegistration();
		}
		if (e.getSource() == loginButton) {
			String userText;
			char[] pwdText;
			String pass = "";
			userText = userTextField.getText();
			pwdText = passwordField.getPassword();

			for (int i = 0; i < pwdText.length; i++) {
				pass += pwdText[i];
			}

			System.out.println(userText + pass);

			LoginInfo loginData = app.startLogin(userText, pass);

			if (loginData.status) {
				JOptionPane.showMessageDialog(this, "Login Successful");
				if(loginData.type == "Manager") {
					app.openManagerFrame();
					this.setVisible(false);
					
				} else if(loginData.type == "Employee") {
					
					app.openEmployeeFrame();
					this.setVisible(false);
					
				} else if(loginData.type == "Customer") {
					app.openCustomerFrame();
					this.setVisible(false);
				}
			} else {
				JOptionPane.showMessageDialog(this, "Login Failed. Please try again.");

			}

		}
		
		if (e.getSource() == resetButton)

		{
			userTextField.setText("");
			passwordField.setText("");
		}
	
		if (e.getSource() == showPassword) {
			if (showPassword.isSelected()) {
				passwordField.setEchoChar((char) 0);
			} else {
				passwordField.setEchoChar('*');
			}

		}
	}

}
