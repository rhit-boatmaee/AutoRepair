package gui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class RegisterFrame extends JFrame implements ActionListener {

	Container container = getContentPane();
	JLabel userNameLabel = new JLabel("USERNAME");
	JLabel userTypeLabel = new JLabel("USERTYPE");
	JLabel newPasswordLabel = new JLabel("PASSWORD");
	JLabel confirmPasswordLabel = new JLabel("CONFIRM PASS");
	

	JTextField userTextField = new JTextField();
	JTextField typeTextField = new JTextField();
	JPasswordField newPasswordField = new JPasswordField();
	JPasswordField confirmPasswordField = new JPasswordField();
	
	
	

	JButton backToLoginButton = new JButton("BACK TO LOGIN");
	JButton completeButton = new JButton("COMPLETE");
	JButton resetButton = new JButton("RESET");
	JCheckBox showPassword = new JCheckBox("Show Password");
	AppRunner app;
	

	public RegisterFrame(AppRunner application) {
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
		userTypeLabel.setBounds(50, 200, 100, 30);
		userNameLabel.setBounds(50, 150, 100, 30);
		confirmPasswordLabel.setBounds(50, 300, 150, 30);
		newPasswordLabel.setBounds(50, 220, 100, 30);
		typeTextField.setBounds(150, 200, 150, 30);
		userTextField.setBounds(150, 150, 150, 30);
		newPasswordField.setBounds(150, 220, 150, 30);
		confirmPasswordField.setBounds(150, 300, 150, 30);
		showPassword.setBounds(150, 250, 150, 30);
		backToLoginButton.setBounds(150, 500, 150, 30);
		completeButton.setBounds(50, 500, 100, 30);
		resetButton.setBounds(200, 350, 100, 30);

	}

	public void addComponentsToContainer() {

		container.add(userNameLabel);
		container.add(newPasswordLabel);
		container.add(confirmPasswordLabel);
		container.add(userTextField);
		container.add(newPasswordField);
		container.add(confirmPasswordField);
		container.add(showPassword);
		container.add(completeButton);
		container.add(resetButton);
		container.add(backToLoginButton);
		container.add(typeTextField);
		container.add(userTypeLabel);

	}

	public void addActionEvent() {
		completeButton.addActionListener(this);
		resetButton.addActionListener(this);
		showPassword.addActionListener(this);
		backToLoginButton.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == completeButton) {
			String userText;
			char[] newPwdText;
			char[] confirmPwdText;
			String newPass = "";
			String confirmPass = "";
			String userType = "";
			
			
			userText = userTextField.getText();
			userType  = typeTextField.getText();
			newPwdText = newPasswordField.getPassword();
			confirmPwdText = confirmPasswordField.getPassword();

			if (newPwdText.length != confirmPwdText.length)
				JOptionPane.showMessageDialog(this, "Passwords Don't Match");

			for (int i = 0; i < newPwdText.length; i++) {
				newPass += newPwdText[i];
				confirmPass += confirmPwdText[i];

			}

			if (!newPass.equals(confirmPass)) {
				JOptionPane.showMessageDialog(this, "Passwords Don't Match");
			} else if (newPass.equals("") || userText.equals("")) {
				JOptionPane.showMessageDialog(this, "Please fill out all forms before continuing.");
			} else {

				System.out.println(userText + newPass);

				boolean registered = app.completeRegistration(userText, newPass, userType);
				JOptionPane.showMessageDialog(this, "Registration Successful. You may now exit this page.");
			}
		}

		if (e.getSource() == backToLoginButton) {
			this.setVisible(false);
		}
	
		if (e.getSource() == resetButton) {
			userTextField.setText("");
			newPasswordField.setText("");
			confirmPasswordField.setText("");
		}
		
		if (e.getSource() == showPassword) {
			if (showPassword.isSelected()) {
				newPasswordField.setEchoChar((char) 0);
			} else {
				newPasswordField.setEchoChar('*');
			}

		}
	}

}
