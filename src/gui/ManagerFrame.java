package gui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


import javafx.scene.control.DatePicker;

public class ManagerFrame extends JFrame implements ActionListener {

	JMenuBar toolBar = new JMenuBar();

	JMenu employees = new JMenu("Employees");
	JMenu repairs = new JMenu("Repairs");
	JMenu vehicles = new JMenu("Vehicles");
	JMenu tasks = new JMenu("Tasks");
	JMenu tools = new JMenu("Tools");
	JMenu parts = new JMenu("Parts");

	JMenuItem addEmployee = new JMenuItem("Assign Employee");
//	JMenuItem updateEmployee = new JMenuItem("Update Employee");
	JMenuItem readAssignments = new JMenuItem("Read Assign");

	JMenuItem deleteEmployee = new JMenuItem("Delete Employee");
	JMenuItem readEmployee = new JMenuItem("Read Employee");
	
	JMenuItem addRepair = new JMenuItem("Add Repair");
	JMenuItem updateRepair = new JMenuItem("Update Repair");
	JMenuItem deleteRepair = new JMenuItem("Delete Repair");
	JMenuItem readRepair = new JMenuItem("Read Repair");

	JMenuItem addVehicle = new JMenuItem("Add Vehicle");
	JMenuItem updateVehicle = new JMenuItem("Update Vehicle");
	JMenuItem deleteVehicle = new JMenuItem("Delete Vehicle");
	JMenuItem readVehicles = new JMenuItem("Read Vehicles");

	JMenuItem addTask = new JMenuItem("Add Task");
	JMenuItem updateTask = new JMenuItem("Update Task");
	JMenuItem deleteTask = new JMenuItem("Delete Task");
	JMenuItem readTask = new JMenuItem("Read Task");

	JMenuItem addPart = new JMenuItem("Add Part");
	JMenuItem updatePart = new JMenuItem("Update Part");
	JMenuItem deletePart = new JMenuItem("Delete Part");
	JMenuItem readPart = new JMenuItem("Read Part");

	Container container = getContentPane();
	AppRunner app;
	
	String userName = new String();

	
	public ManagerFrame(AppRunner application, String userText) {
		this.app = application;
		this.userName = userText;
		setLayoutManager();
		setLocationAndSize();
		addComponentsToContainer();
		addMenuItemsToToolBar();
		addActionEvent();
	}

	public void setLayoutManager() {
		container.setLayout(null);
	}

	public void setLocationAndSize() {
		this.setJMenuBar(toolBar);
	}

	public void addMenuItemsToToolBar() {

		toolBar.add(employees);
		toolBar.add(repairs);
		toolBar.add(vehicles);
		toolBar.add(tools);
		toolBar.add(tasks);
		toolBar.add(parts);

		employees.add(addEmployee);
//		employees.add(updateEmployee);
		employees.add(deleteEmployee);
		employees.add(readAssignments);
		employees.add(readEmployee);
		
		vehicles.add(addVehicle);
		vehicles.add(updateVehicle);
		vehicles.add(deleteVehicle);
		vehicles.add(readVehicles);

		tasks.add(addTask);
		tasks.add(updateTask);
		tasks.add(deleteTask);
		tasks.add(readTask);

		repairs.add(addRepair);
		repairs.add(updateRepair);
		repairs.add(deleteRepair);
		repairs.add(readRepair);

		parts.add(addPart);
		parts.add(updatePart);
		parts.add(deletePart);
		parts.add(readPart);

	}

	public void addComponentsToContainer() {

		container.add(toolBar);

	}

	public void addActionEvent() {
		addEmployee.addActionListener(this);
		deleteEmployee.addActionListener(this);
		readEmployee.addActionListener(this);
		readAssignments.addActionListener(this);
		addRepair.addActionListener(this);
		readRepair.addActionListener(this);
		readVehicles.addActionListener(this);
		readTask.addActionListener(this);
		readPart.addActionListener(this);
		addVehicle.addActionListener(this);
		addTask.addActionListener(this);
		addPart.addActionListener(this);
		deleteRepair.addActionListener(this);
		deleteVehicle.addActionListener(this);
		deletePart.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		//REPAIRS
		if (e.getSource() == addRepair) {
			this.addRepair();	
		}
		if (e.getSource() == updateRepair) {
			this.updateRepair();
		}
//		if (e.getSource() == deleteRepair) {
//			
//		}
//		if(e.getSource() == readRepair) {
//			
//		}
//		//VEHICLES
//		if (e.getSource() == addVehicle) {
//			
//		}
//		if (e.getSource() == updateVehicle) {
//			
//		}
//		if (e.getSource() == deleteVehicle) {
//			
//		}
//		if (e.getSource() == readVehicles) {
//			
//		}
//		//TASKS
//		if (e.getSource() == addTask) {
//			
//		}
//		if (e.getSource() == updateTask) {
//			
//		}
//		if (e.getSource() == deleteTask) {
//			
//		}
//		if (e.getSource() == readTask) {
//			
//		}
//		//PARTS
//		if (e.getSource() == addPart) {
//			
//		}
//		if (e.getSource() == updatePart) {
//			
//		}
//		if (e.getSource() == deletePart) {
//			
//		}
//		if (e.getSource() == readPart) {
//		
//		}
//		//EMPLOYEES
//		if(e.getSource() == addEmployee) {
//			
//		}
//		if(e.getSource() == updateEmployee) {
//			
//		}
//		if(e.getSource() == readEmployee) {
//			
//		}
//		if(e.getSource() == deleteEmployee) {
//			
//		}
//		//ASSIGN
//		if(e.getSource() == addAssign) {
//			
//		}
//		if(e.getSource() == updateAssign) {
//			
//		}
//		if(e.getSource() == deleteAssign) {
//			
//		}
//		if(e.getSource() == readAssignments) {
//			
//		}
//		//CUSTOMER
//		if(e.getSource() == addCustomer) {
//			
//		}
//		if(e.getSource() == updateCustomer) {
//			
//		}
//		if(e.getSource() == deleteCustomer) {
//			
//		}
//		if(e.getSource() == readCustomer) {
//			
//		}
//		//INSURANCE
//		if(e.getSource() == addInsurance) {
//			
//		}
//		if(e.getSource() == updateInsurance) {
//			
//		}
//		if(e.getSource() == deleteInsurance) {
//			
//		}
//		if(e.getSource() == readInsurance) {
//			
//		}
//		//Orders
//		if(e.getSource() == addOrders) {
//			
//		}
//		if(e.getSource() == updateOrders) {
//			
//		}
//		if(e.getSource() == readOrders) {
//			
//		}
//		if(e.getSource() == deleteOrders) {
//			
//		}
//		//Manager
//		if(e.getSource() == updateManager) {
//			
//		}
//		if(e.getSource() == readManager) {
//			
//		}
//		//For -> 	PartNumber, TaskId
//		//Gets -> 	VIN, RepairID
//		//Has -> 	VehicleVIN, RepairID, TaskId
//		//PaidBy -> VehicleVIN, RepairID, InsuranceClaimNumber, Receipt
//		//PaidFor -> VehicleVIN, RepairID, CustomerUserName, Receipt
//		/*
//		Manager should be able to:
//			-> Add a repair, delete a repair, update a repair, read all repairs
//			-> Add a vehicle, delete a vehicle, update a vehicle, read all vehicles
//			-> Add task, delete a task, update a task, read all tasks
//			-> Add a part, delete a part, update a part, read all parts
//			-> Add a employee, delete a employee, update a employee, read all employees
//			-> Add a customer, delete a customer, update a customer, reall customers
//			-> Add a insurance, delete a insurance, update a insurance, read all insurances
//			-> Add a Order, delete a Order, update a Order, read all orders
//			-> Update your own personal manager information, read all managers
//			-> CREATE A ASSIGN Menu Bar
//				For -> (Assign PartNumber to TaskID)
//				Gets -> (Assign Vehicle to Repair)
//				Has -> (Assign TaskID to Vehicle w/ Repair ID)
//				PaidBy -> (Assign Insur. to Vehicle w/ RepairID)
//				PaidFor -> (Assign Customer to Vehicle w/ RepairID)
//		*/
		//DECLARE
//		//SET
//		//ActionListener ComboBox Add
		//Container
		//this.setTitle("Add Repair");
		/*this.setVisible(true);
		this.setBounds(10, 10, 370, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		*/
		
//		
	}
	
	private void updateRepair() {
		// TODO Auto-generated method stub
		container.removeAll();
		container.add(toolBar);
		ArrayList<MyVehicles> myVehicles = app.getAllVehicles();
		String[] vehicles = new String[myVehicles.size()]; 
		for (int i = 0; i < myVehicles.size(); i++) {
			vehicles[i] = myVehicles.get(i).getVin();
		}
		ArrayList<MyRepairs> myRepairs = app.getRepairs();
		Integer[] repairIdsd = new Integer[myRepairs.size()];
		for(int i = 0; i<myRepairs.size();i++) {
			repairIdsd[i] = myRepairs.get(i).getID();
		}
		
		Integer[] completion = new Integer[2];
		completion[0] = 0;
		completion[1] = 1;
		
		JLabel IDLabel = new JLabel("ID");
		JComboBox<Integer> IDChooser = new JComboBox<Integer>();
		
		JLabel updatestartDateLabel = new JLabel("Update StartDate");
		JTextField updatestartDateChooser = new JTextField();
		
		JLabel updateendDateLabel = new JLabel("Update EndDate");
		JTextField updateendDateChooser = new JTextField();
		
		JLabel updatedescriptionLabel = new JLabel("Description");
		JTextField updatedescriptionBox =new JTextField(5);
		
		JLabel updatecostLabel = new JLabel("Cost");
		JTextField updatecostField = new JTextField();
		
		JLabel updatediscountLabel = new JLabel("Discount");
		JTextField updatediscountField = new JTextField();
		
		JLabel updatevehiclesLabel = new JLabel("VIN");
		JComboBox<String> updatevehiclesChooser = new JComboBox<String>(vehicles);
		
		JLabel completionLabel = new JLabel("Completion");
		JComboBox<Integer> updateCompletionChooser = new JComboBox<Integer>(completion);
		
		JButton addButton = new JButton("UPDATE");
		
		IDLabel.setBounds(25, 50, 150, 30);
		IDChooser.setBounds(100, 50, 150, 30);
		
		updatestartDateLabel.setBounds(25,100,150,30);
		updateendDateChooser.setBounds(100, 100, 150, 30);
		
		updatedescriptionLabel.setBounds(25,150,150,30);
		updatedescriptionBox.setBounds(100, 150, 150, 60);
		
		updatecostLabel.setBounds(25, 250, 200, 30);
		updatecostField.setBounds(100, 250, 200, 30);
		
		updatediscountLabel.setBounds(25, 300, 150, 30);
		updatediscountField.setBounds(100, 300, 150, 30);
		
		updatevehiclesLabel.setBounds(25, 350, 150, 30);
		updatevehiclesChooser.setBounds(100, 350, 150, 30);
		
		completionLabel.setBounds(25, 400, 150, 30);
		updateCompletionChooser.setBounds(100, 400, 150, 30);
		
		addButton.setBounds(100, 450, 100, 100);
		
		updatevehiclesChooser.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		addButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				int ID = (Integer) IDChooser.getSelectedItem();
				String vehicle = (String) updatevehiclesChooser.getSelectedItem();
				String startDate = updatestartDateChooser.getText();
				String endDate = updateendDateChooser.getText();
				String discount = updatediscountField.getText();
				String totalCost = updatecostField.getText();
				String description = updatedescriptionBox.getText();
				int completion = (Integer)updateCompletionChooser.getSelectedItem();
				try {
				if(ManagerFrame.compareDate(startDate,endDate) && (Integer.parseInt(discount)>0 && Integer.parseInt(discount)<=100)
						&& Integer.parseInt(totalCost) == (int)Integer.parseInt(totalCost)) {
					app.updateRepair(ID, startDate, endDate, description, Integer.parseInt(discount), Integer.parseInt(totalCost), vehicle, completion);
				}
				}catch(NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Fields are incorrect");
				}
			}
		});
		
		container.add(IDChooser);
		container.add(IDLabel);
		
		container.add(updateCompletionChooser);
		container.add(completionLabel);
		
		container.add(updatestartDateChooser);
		container.add(updatestartDateLabel);

		container.add(updateendDateLabel);
		container.add(updateendDateChooser);

		container.add(updatedescriptionLabel);
		container.add(updatedescriptionBox);

		container.add(updatecostField);
		container.add(updatecostLabel);

		container.add(updatevehiclesLabel);
		container.add(updatevehiclesChooser);

		container.add(addButton);

		this.setTitle("Update Repair");
		this.setVisible(true);
		this.setBounds(10, 10, 370, 700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		
	}

	public void addRepair() {
		//StartDate,EndDate, description, Discount, Total Cost, VIN
		container.removeAll();
		container.add(toolBar);
		//Needed for JComboBox<String>
		ArrayList<MyVehicles> myVehicles = app.getAllVehicles();
		String[] vehicles = new String[myVehicles.size()]; 
		for (int i = 0; i < myVehicles.size(); i++) {
			vehicles[i] = myVehicles.get(i).getVin();
		}
		
		//Set up
		JLabel startDateLabel = new JLabel("StartDate");
		JTextField startDateChooser = new JTextField();
		
		JLabel endDateLabel = new JLabel("EndDate");
		JTextField endDateChooser = new JTextField();
		
		JLabel descriptionLabel = new JLabel("Description");
		JTextField descriptionBox =new JTextField(5);
		
		JLabel costLabel = new JLabel("Cost");
		JTextField costField = new JTextField();
		
		JLabel discountLabel = new JLabel("Discount");
		JTextField discountField = new JTextField();
		
		JLabel vehiclesLabel = new JLabel("VIN");
		JComboBox<String> vehiclesChooser = new JComboBox<String>(vehicles);
		
		JButton addButton = new JButton("ADD");
		
		//BOUNDS
		startDateLabel.setBounds(25, 50, 150, 30);
		startDateChooser.setBounds(100, 50, 150, 30);
		
		endDateLabel.setBounds(25,100,150,30);
		endDateChooser.setBounds(100, 100, 150, 30);
		
		descriptionLabel.setBounds(25,150,150,30);
		descriptionBox.setBounds(100, 150, 150, 60);
		
		costLabel.setBounds(25, 250, 200, 30);
		costField.setBounds(100, 250, 200, 30);
		
		discountLabel.setBounds(25, 300, 150, 30);
		discountField.setBounds(100, 300, 150, 30);
		
		vehiclesLabel.setBounds(25, 350, 150, 30);
		vehiclesChooser.setBounds(100, 350, 150, 30);
		
		addButton.setBounds(100, 400, 100, 100);
		
		vehiclesChooser.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		addButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String vehicle = (String) vehiclesChooser.getSelectedItem();
				String startDate = startDateChooser.getText();
				String endDate = endDateChooser.getText();
				String discount = discountField.getText();
				String totalCost = costField.getText();
				String description = descriptionBox.getText();
				try {
				if(ManagerFrame.compareDate(startDate,endDate) && (Integer.parseInt(discount)>0 && Integer.parseInt(discount)<=100)
						&& Integer.parseInt(totalCost) == (int)Integer.parseInt(totalCost)) {
					app.addRepair(vehicle,startDate, endDate, Integer.parseInt(discount), Integer.parseInt(totalCost),description);
					
				}
				}catch(NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Fields are incorrect");
				}
			}
		});
		container.add(startDateChooser);
		container.add(startDateLabel);

		container.add(endDateLabel);
		container.add(endDateChooser);

		container.add(descriptionLabel);
		container.add(descriptionBox);

		container.add(costField);
		container.add(costLabel);

		container.add(vehiclesLabel);
		container.add(vehiclesChooser);

		container.add(addButton);

		this.setTitle("Add Repair");
		this.setVisible(true);
		this.setBounds(10, 10, 370, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
	}

	public void deleteRepair() {
		container.removeAll();
		container.add(toolBar);
		ArrayList<MyRepairs> myRepairs = app.getRepairs();
		Integer[] repairIdsd = new Integer[myRepairs.size()];
		for(int i = 0; i<myRepairs.size();i++) {
			repairIdsd[i] = myRepairs.get(i).getID();
		}
		JLabel idLabel = new JLabel("ID");
		JComboBox<Integer> idChooser = new JComboBox<Integer>(repairIdsd);
		
		JButton deleteButton = new JButton("DELETE");
		
		idLabel.setBounds(25,50,150,30);
		idChooser.setBounds(100, 50, 150, 30);
		
		deleteButton.setBounds(100,350,150,30);
		
		idChooser.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		deleteButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				int id = (Integer)idChooser.getSelectedItem();
				app.deleteRepair(id);
			}
			
		});
		container.add(idLabel);
		container.add(idChooser);
		container.add(deleteButton);
		
		this.setTitle("Delete Repair");
		this.setVisible(true);
		this.setBounds(10, 10, 370, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		
		
	}
	
	public void readAllRepairs() {
		container.removeAll();
		container.add(toolBar);
		JScrollPane myPane = new JScrollPane();
		
		ArrayList<MyRepairs> myRepairs = app.getRepairs();
		JTable myTable = new JTable();
		DefaultTableModel myModel = new DefaultTableModel();
		String[] myColumns = {"ID","StartDate","EndDate","Description","Discount","TotalCost","VIN","Completion"};
		myTable.setModel(myModel);
		myModel.setColumnIdentifiers(myColumns);
		myPane.setViewportView(myTable);
		Object[] myRow = new Object[8];
		for(int i = 0; i<myRepairs.size();i++) {
			myRow[0] = myRepairs.get(i).getID();
			myRow[1] = myRepairs.get(i).getstartDate();
			myRow[2] = myRepairs.get(i).getendDate();
			myRow[3] = myRepairs.get(i).getDescription();
			myRow[4] = myRepairs.get(i).getDiscount();
			myRow[5] = myRepairs.get(i).getTotalCost();
			myRow[6] = myRepairs.get(i).getVIN();
			myRow[7] = myRepairs.get(i).getCompletion();
			myModel.addRow(myRow);
		}
		myTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		for(int i = 0; i<myRow.length;i++) {
			myTable.getColumnModel().getColumn(i).setPreferredWidth(100);
		}
		myPane.setBounds(30, 30, 800, 300);
		container.add(myPane);
		
		this.setTitle("Read Repairs");
		this.setBounds(10, 10, 680, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
	}
	
	
	
	public static boolean validDate(String date) {
		String[] myDate = date.split("-");
		if(myDate.length != 3) {
			return false;
		}
		try {
		//Test on year
		if(myDate[0].length() != 4 || Integer.parseInt(myDate[0])>=Calendar.getInstance().get(Calendar.YEAR)) {
			return false;
		}
		//Test on month
		if(Integer.parseInt(myDate[1])<1 || Integer.parseInt(myDate[1])>12) {
			return false;
		}
		if(Integer.parseInt(myDate[2])<1 || Integer.parseInt(myDate[2])>31) {
			return false;
		}
		}catch(NumberFormatException e) {
			System.out.println("Invalid Date");
			return false;
		}
		return true;
	}
	public static boolean compareDate(String startdate, String endDate) {
		
		if(ManagerFrame.validDate(startdate) && ManagerFrame.validDate(endDate)) {
			String[] myStartDate = startdate.split("-");
			String[] myEndDate = endDate.split("-");
			if(Integer.parseInt(myStartDate[0]) < Integer.parseInt(myEndDate[0])) {
				return true;
			}
			else if(Integer.parseInt(myStartDate[0]) == Integer.parseInt(myEndDate[0])) {
				if(Integer.parseInt(myStartDate[1]) < Integer.parseInt(myEndDate[1])) {
					return true;
				}
				else if(Integer.parseInt(myStartDate[1]) == Integer.parseInt(myEndDate[1])) {
					if(Integer.parseInt(myStartDate[2]) <= Integer.parseInt(myEndDate[2])) {
						return true;
					}
					else {
						return false;
					}
				}
				return false;
			}
			return false;
		}
		return false;
		
		
	}
}
