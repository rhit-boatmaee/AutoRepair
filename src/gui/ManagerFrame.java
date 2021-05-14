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

	JMenu assign = new JMenu("Assign");
	JMenu employees = new JMenu("Employees");
	JMenu customers = new JMenu("Customers");
	JMenu repairs = new JMenu("Repairs");
	JMenu vehicles = new JMenu("Vehicles");
	JMenu tasks = new JMenu("Tasks");
	JMenu parts = new JMenu("Parts");
	JMenu insurance = new JMenu("Insurance");
	JMenu orders = new JMenu("Orders");
	JMenu theFor = new JMenu("For");
	JMenu theGets = new JMenu("Gets");
	JMenu theHas = new JMenu("Has");
	JMenu thePaidBy = new JMenu("PaidBy");
	JMenu thePaidFor = new JMenu("PaidFor");
	JMenu settings = new JMenu("Settings");

	JMenuItem addAssign = new JMenuItem("Assign Task to Employee");
	JMenuItem updateAssign = new JMenuItem("Update Task to Employee");
	JMenuItem deleteAssign = new JMenuItem("Delete Task to Employee");
	JMenuItem readAssign = new JMenuItem("View All Tasks assigned to Employees");

	JMenuItem addEmployee = new JMenuItem("Add Employee");
	JMenuItem deleteEmployee = new JMenuItem("Delete Employee");
	JMenuItem readEmployee = new JMenuItem("View All Employees");
	JMenuItem updateEmployee = new JMenuItem("Update Employee");

	JMenuItem addCustomer = new JMenuItem("Add Customer");
	JMenuItem deleteCustomer = new JMenuItem("Delete Customer");
	JMenuItem readCustomer = new JMenuItem("Read All Customer");
	JMenuItem updateCustomer = new JMenuItem("Update Customer");

	JMenuItem addInsurance = new JMenuItem("Add Insurance");
	JMenuItem deleteInsurance = new JMenuItem("Delete Insurance");
	JMenuItem readInsurance = new JMenuItem("Read All Insurance");
	JMenuItem updateInsurance = new JMenuItem("Update Insurance");

	JMenuItem addOrder = new JMenuItem("Add Order");
	JMenuItem deleteOrder = new JMenuItem("Delete Order");
	JMenuItem readOrder = new JMenuItem("Read All Order");
	JMenuItem updateOrder = new JMenuItem("Update Order");

	JMenuItem addRepair = new JMenuItem("Add Repair");
	JMenuItem updateRepair = new JMenuItem("Update Repair");
	JMenuItem deleteRepair = new JMenuItem("Delete Repair");
	JMenuItem readRepair = new JMenuItem("Read All Repair");

	JMenuItem addVehicle = new JMenuItem("Add Vehicle");
	JMenuItem updateVehicle = new JMenuItem("Update Vehicle");
	JMenuItem deleteVehicle = new JMenuItem("Delete Vehicle");
	JMenuItem readVehicles = new JMenuItem("Read All Vehicles");

	JMenuItem addfor = new JMenuItem("Add for");
	JMenuItem updatefor = new JMenuItem("Update for");
	JMenuItem deletefor = new JMenuItem("Delete for");
	JMenuItem readfor = new JMenuItem("Read All for");

	JMenuItem addGets = new JMenuItem("Add Gets");
	JMenuItem updateGets = new JMenuItem("Update Gets");
	JMenuItem deleteGets = new JMenuItem("Delete Gets");
	JMenuItem readGets = new JMenuItem("Read All Gets");

	JMenuItem addHas = new JMenuItem("Add Has");
	JMenuItem updateHas = new JMenuItem("Update Has");
	JMenuItem deleteHas = new JMenuItem("Delete Has");
	JMenuItem readHas = new JMenuItem("Read All Has");

	JMenuItem addPaidBy = new JMenuItem("Add PaidBy");
	JMenuItem updatePaidBy = new JMenuItem("Update PaidBy");
	JMenuItem deletePaidBy = new JMenuItem("Delete PaidBy");
	JMenuItem readPaidBy = new JMenuItem("Read All PaidBy");

	JMenuItem addPaidFor = new JMenuItem("Add PaidFor");
	JMenuItem updatePaidFor = new JMenuItem("Update PaidFor");
	JMenuItem deletePaidFor = new JMenuItem("Delete PaidFor");
	JMenuItem readPaidFor = new JMenuItem("Read All PaidFor");

	JMenuItem addTask = new JMenuItem("Add Task");
	JMenuItem updateTask = new JMenuItem("Update Task");
	JMenuItem deleteTask = new JMenuItem("Delete Task");
	JMenuItem readTask = new JMenuItem("Read All Task");

	JMenuItem addPart = new JMenuItem("Add Part");
	JMenuItem updatePart = new JMenuItem("Update Part");
	JMenuItem deletePart = new JMenuItem("Delete Part");
	JMenuItem readPart = new JMenuItem("Read All Part");

	JMenuItem updateSettings = new JMenuItem("Update Your Info");
	JMenuItem readMangerInfo = new JMenuItem("Read All Mangers");

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

		toolBar.add(assign);
		toolBar.add(employees);
		toolBar.add(customers);
		toolBar.add(repairs);
		toolBar.add(vehicles);
		toolBar.add(tasks);
		toolBar.add(parts);
		toolBar.add(insurance);
		toolBar.add(settings);
		toolBar.add(theFor);
		toolBar.add(theGets);
		toolBar.add(theHas);
		toolBar.add(thePaidBy);
		toolBar.add(thePaidFor);

		assign.add(addAssign);
		assign.add(updateAssign);
		assign.add(deleteAssign);
		assign.add(readAssign);

		employees.add(addEmployee);
		employees.add(updateEmployee);
		employees.add(deleteEmployee);
		employees.add(readEmployee);

		customers.add(addCustomer);
		customers.add(deleteCustomer);
		customers.add(readCustomer);
		customers.add(updateCustomer);

		insurance.add(addInsurance);
		insurance.add(deleteInsurance);
		insurance.add(readInsurance);
		insurance.add(updateInsurance);

		orders.add(addOrder);
		orders.add(deleteOrder);
		orders.add(readOrder);
		orders.add(updateOrder);

		theFor.add(addfor);
		theFor.add(updatefor);
		theFor.add(deletefor);
		theFor.add(readfor);

		theGets.add(addGets);
		theGets.add(updateGets);
		theGets.add(deleteGets);
		theGets.add(readGets);

		theHas.add(addHas);
		theHas.add(updateHas);
		theHas.add(deleteHas);
		theHas.add(readHas);

		thePaidBy.add(addPaidBy);
		thePaidBy.add(updatePaidBy);
		thePaidBy.add(deletePaidBy);
		thePaidBy.add(readPaidBy);

		thePaidFor.add(addPaidFor);
		thePaidFor.add(updatePaidFor);
		thePaidFor.add(deletePaidFor);
		thePaidFor.add(readPaidFor);

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

		settings.add(updateSettings);
		settings.add(readMangerInfo);

	}

	public void addComponentsToContainer() {

		container.add(toolBar);

	}

	public void addActionEvent() {
		addAssign.addActionListener(this);
		updateAssign.addActionListener(this);
		deleteAssign.addActionListener(this);
		readAssign.addActionListener(this);

		addEmployee.addActionListener(this);
		deleteEmployee.addActionListener(this);
		readEmployee.addActionListener(this);
		updateEmployee.addActionListener(this);

		addCustomer.addActionListener(this);
		deleteCustomer.addActionListener(this);
		readCustomer.addActionListener(this);
		updateCustomer.addActionListener(this);

		addInsurance.addActionListener(this);
		deleteInsurance.addActionListener(this);
		readInsurance.addActionListener(this);
		updateInsurance.addActionListener(this);

		addOrder.addActionListener(this);
		deleteOrder.addActionListener(this);
		readOrder.addActionListener(this);
		updateOrder.addActionListener(this);

		addRepair.addActionListener(this);
		readRepair.addActionListener(this);
		updateRepair.addActionListener(this);
		deleteRepair.addActionListener(this);

		addVehicle.addActionListener(this);
		updateVehicle.addActionListener(this);
		deleteVehicle.addActionListener(this);
		readVehicles.addActionListener(this);

		addfor.addActionListener(this);
		updatefor.addActionListener(this);
		deletefor.addActionListener(this);
		readfor.addActionListener(this);

		addGets.addActionListener(this);
		updateGets.addActionListener(this);
		deleteGets.addActionListener(this);
		readGets.addActionListener(this);

		addHas.addActionListener(this);
		updateHas.addActionListener(this);
		deleteHas.addActionListener(this);
		readHas.addActionListener(this);

		addPaidBy.addActionListener(this);
		updatePaidBy.addActionListener(this);
		deletePaidBy.addActionListener(this);
		readPaidBy.addActionListener(this);

		addPaidFor.addActionListener(this);
		updatePaidFor.addActionListener(this);
		deleteVehicle.addActionListener(this);
		deletePaidFor.addActionListener(this);

		addTask.addActionListener(this);
		updateTask.addActionListener(this);
		deleteTask.addActionListener(this);
		readTask.addActionListener(this);

		addPart.addActionListener(this);
		updatePart.addActionListener(this);
		deletePart.addActionListener(this);
		readPart.addActionListener(this);

		updateSettings.addActionListener(this);
		readMangerInfo.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		// ASSIGN
		if (e.getSource() == addAssign) {

		}
		if (e.getSource() == updateAssign) {

		}
		if (e.getSource() == deleteAssign) {

		}
		if (e.getSource() == readAssign) {

		}
		// EMPLOYEES
		if (e.getSource() == addEmployee) {
			this.addEmployee();
		}
		if (e.getSource() == updateEmployee) {
			this.updateEmployee();
		}
		if (e.getSource() == readEmployee) {
			this.readAllEmployees();
		}
		if (e.getSource() == deleteEmployee) {
			this.deleteEmployee();
		}

		// CUSTOMER
		if (e.getSource() == addCustomer) {
			this.addCustomer();
		}
		if (e.getSource() == updateCustomer) {
			this.updateCustomer();
		}
		if (e.getSource() == deleteCustomer) {
			this.deleteCustomer();
		}
		if (e.getSource() == readCustomer) {
			this.readAllCustomers();
		}
		// INSURANCE
		if (e.getSource() == addInsurance) {
			this.addInsurance();
		}
		if (e.getSource() == updateInsurance) {
			this.updateInsurance();
		}
		if (e.getSource() == deleteInsurance) {
			this.deleteInsurance();
		}
		if (e.getSource() == readInsurance) {
			this.readAllInsurances();
		}
		// Orders
		if (e.getSource() == addOrder) {
			this.addOrder();
		}
		if (e.getSource() == updateOrder) {
			this.updateOrder();
		}
		if (e.getSource() == readOrder) {
			this.readOrders();
		}
		if (e.getSource() == deleteOrder) {
			this.deleteOrder();
		}
		// theFor
		if (e.getSource() == addfor) {

		}
		if (e.getSource() == updatefor) {

		}
		if (e.getSource() == deletefor) {

		}
		if (e.getSource() == readfor) {

		}
		// theHas
		if (e.getSource() == addHas) {

		}
		if (e.getSource() == updateHas) {

		}
		if (e.getSource() == deleteHas) {

		}
		if (e.getSource() == readHas) {

		}
		// thePaidBy
		if (e.getSource() == addPaidBy) {

		}
		if (e.getSource() == updatePaidBy) {

		}
		if (e.getSource() == deletePaidBy) {

		}
		if (e.getSource() == readPaidBy) {

		}
		// thePaidFor
		if (e.getSource() == addPaidFor) {

		}
		if (e.getSource() == updatePaidFor) {

		}
		if (e.getSource() == deletePaidFor) {

		}
		if (e.getSource() == readPaidFor) {

		}
		// REPAIRS
		if (e.getSource() == addRepair) {
			this.addRepair();
		}
		if (e.getSource() == updateRepair) {
			this.updateRepair();
		}
		if (e.getSource() == deleteRepair) {
			this.deleteRepair();
		}
		if (e.getSource() == readRepair) {
			this.readAllRepairs();
		}
		// VEHICLES
		if (e.getSource() == addVehicle) {
			this.addVehicle();
		}
		if (e.getSource() == updateVehicle) {
			this.updateVehicle();
		}
		if (e.getSource() == deleteVehicle) {
			this.deleteVehicle();
		}
		if (e.getSource() == readVehicles) {
			this.readAllVehicle();
		}
		// TASKS
		if (e.getSource() == addTask) {
			this.addTask();
		}
		if (e.getSource() == updateTask) {
			this.updateTask();
		}
		if (e.getSource() == deleteTask) {
			this.deleteTask();
		}
		if (e.getSource() == readTask) {
			this.readAllTasks();
		}
		// PARTS
		if (e.getSource() == addPart) {
			this.addPart();
		}
		if (e.getSource() == updatePart) {
			this.updatePart();
		}
		if (e.getSource() == deletePart) {
			this.deletePart();
		}
		if (e.getSource() == readPart) {
			this.readAllParts();
		}

		// Manager
		if (e.getSource() == updateSettings) {
			this.updatemanager();
		}
		if (e.getSource() == readMangerInfo) {
			this.readallManagers();
		}
	}

	private void updateRepair() {
		container.removeAll();
		container.add(toolBar);

		ArrayList<MyRepairs> myRepairs = app.getRepairs();
		System.out.println("repairs gotten - update" + myRepairs.size());
		Integer[] repairIdsd = new Integer[myRepairs.size()];
		for (int i = 0; i < myRepairs.size(); i++) {
			repairIdsd[i] = myRepairs.get(i).getID();
			System.out.println("id is " + myRepairs.get(i).getID());
		}

		Integer[] completion = new Integer[2];
		completion[0] = 0;
		completion[1] = 1;

		JLabel IDLabel = new JLabel("ID");
		JComboBox<Integer> IDChooser = new JComboBox<Integer>(repairIdsd);

		JLabel updatestartDateLabel = new JLabel("Start Date");
		JTextField updatestartDateChooser = new JTextField();

		JLabel updateendDateLabel = new JLabel("End Date");
		JTextField updateendDateChooser = new JTextField();

		JLabel updatedescriptionLabel = new JLabel("Description");
		JTextField updatedescriptionBox = new JTextField();

		JLabel updatecostLabel = new JLabel("Cost");
		JTextField updatecostField = new JTextField();

		JLabel updatediscountLabel = new JLabel("Discount");
		JTextField updatediscountField = new JTextField();

		JLabel completionLabel = new JLabel("Completion");
		JComboBox<Integer> updateCompletionChooser = new JComboBox<Integer>(completion);

		JButton addButton = new JButton("UPDATE");

		IDLabel.setBounds(25, 50, 150, 30);
		IDChooser.setBounds(100, 50, 150, 30);

		updatestartDateLabel.setBounds(25, 100, 150, 30);
		updateendDateChooser.setBounds(100, 100, 150, 30);

		updatedescriptionLabel.setBounds(25, 150, 150, 30);
		updatedescriptionBox.setBounds(100, 150, 150, 30);

		updatecostLabel.setBounds(25, 250, 200, 30);
		updatecostField.setBounds(100, 250, 200, 30);

		updatediscountLabel.setBounds(25, 300, 150, 30);
		updatediscountField.setBounds(100, 300, 150, 30);

		completionLabel.setBounds(25, 400, 150, 30);
		updateCompletionChooser.setBounds(100, 400, 150, 30);

		addButton.setBounds(100, 450, 100, 100);

		addButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				try {
					int ID = (Integer) IDChooser.getSelectedItem();

					String startDate = ""; // updatestartdate...

					String endDate = updateendDateChooser.getText();
					String discount = updatediscountField.getText();
					String totalCost = updatecostField.getText();
					String description = updatedescriptionBox.getText();
					int completion = (Integer) updateCompletionChooser.getSelectedItem();

					app.updateRepair(ID, startDate, endDate, description, Integer.parseInt(discount),
							Integer.parseInt(totalCost), completion);

				} catch (NumberFormatException e) {
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

		container.add(addButton);

		this.setTitle("Update Repair");
		this.setVisible(true);
		this.setBounds(10, 10, 800, 800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);

	}

	public void addRepair() { // 800x800
		// StartDate,EndDate, description, Discount, Total Cost, VIN
		container.removeAll();
		container.add(toolBar);
		ArrayList<MyVehicles> myVehicles = app.getAllVehicles();
		String[] vehicles = new String[myVehicles.size()];
		for (int i = 0; i < myVehicles.size(); i++) {
			vehicles[i] = myVehicles.get(i).getVin();
		}

		// Set up
		JLabel startDateLabel = new JLabel("StartDate");
		JTextField startDateChooser = new JTextField();

		JLabel endDateLabel = new JLabel("EndDate");
		JTextField endDateChooser = new JTextField();

		JLabel descriptionLabel = new JLabel("Description");
		JTextField descriptionBox = new JTextField(5);

		JLabel costLabel = new JLabel("Cost");
		JTextField costField = new JTextField();

		JLabel discountLabel = new JLabel("Discount");
		JTextField discountField = new JTextField();

		JButton addButton = new JButton("ADD");

		ArrayList<String> cars = app.getVehicles();
		String[] carArray = new String[cars.size()];
		for (int i = 0; i < cars.size(); i++) {
			carArray[i] = cars.get(i);
		}

		JLabel carLabel = new JLabel("Vehicle");
		JComboBox<String> carDropDownBox = new JComboBox<String>(carArray);

		// BOUNDS
		startDateLabel.setBounds(25, 50, 150, 30);
		startDateChooser.setBounds(100, 50, 150, 30);

		endDateLabel.setBounds(25, 100, 150, 30);
		endDateChooser.setBounds(100, 100, 150, 30);

		descriptionLabel.setBounds(25, 150, 150, 30);
		descriptionBox.setBounds(100, 150, 150, 60);

		costLabel.setBounds(25, 250, 200, 30);
		costField.setBounds(100, 250, 200, 30);

		discountLabel.setBounds(25, 300, 150, 30);
		discountField.setBounds(100, 300, 150, 30);

		carLabel.setBounds(25, 350, 150, 30);
		carDropDownBox.setBounds(100, 350, 150, 30);

		addButton.setBounds(100, 400, 100, 100);

		addButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub

				try {
					String startDate = startDateChooser.getText();
					String endDate = endDateChooser.getText();
					String discount = discountField.getText();
					String totalCost = costField.getText();
					String description = descriptionBox.getText();
					String vin = (String) carDropDownBox.getSelectedItem();

					if (ManagerFrame.compareDate(startDate, endDate)) {
						// reject
					}

					if (Integer.parseInt(discount) < 0) {
						JOptionPane.showMessageDialog(null, "Discount can't be less than 0 ");
						return;
					}

					if (Integer.parseInt(discount) > 100) {
						JOptionPane.showMessageDialog(null, "Discount can't be more than 100 ");
						return;
					}

					app.addRepair(startDate, endDate, Integer.parseInt(discount), Integer.parseInt(totalCost),
							description, vin);

				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Please check your inputted information.");
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

		container.add(discountField);
		container.add(discountLabel);

		container.add(carDropDownBox);
		container.add(carLabel);
		container.add(addButton);

		this.setTitle("Add Repair");
		this.setVisible(true);
		this.setBounds(10, 10, 800, 800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
	}

	public void deleteRepair() {
		container.removeAll();
		container.add(toolBar);
		ArrayList<MyRepairs> myRepairs = app.getRepairs();
		Integer[] repairIdsd = new Integer[myRepairs.size()];
		for (int i = 0; i < myRepairs.size(); i++) {
			repairIdsd[i] = myRepairs.get(i).getID();
		}
		JLabel idLabel = new JLabel("ID");
		JComboBox<Integer> idChooser = new JComboBox<Integer>(repairIdsd);

		JButton deleteButton = new JButton("DELETE");

		idLabel.setBounds(25, 50, 150, 30);
		idChooser.setBounds(100, 50, 150, 30);

		deleteButton.setBounds(100, 350, 150, 30);

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
				try {
					int id = (Integer) idChooser.getSelectedItem();
					app.deleteRepair(id);
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Fields are incorrect");
				}
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
		String[] myColumns = { "ID", "StartDate", "EndDate", "Description", "Discount", "TotalCost", "Completion" };
		myTable.setModel(myModel);
		myModel.setColumnIdentifiers(myColumns);
		myPane.setViewportView(myTable);
		Object[] myRow = new Object[7];
		for (int i = 0; i < myRepairs.size(); i++) {
			myRow[0] = myRepairs.get(i).getID();
			myRow[1] = myRepairs.get(i).getstartDate();
			myRow[2] = myRepairs.get(i).getendDate();
			myRow[3] = myRepairs.get(i).getDescription();
			myRow[4] = myRepairs.get(i).getDiscount();
			myRow[5] = myRepairs.get(i).getTotalCost();
			myRow[6] = myRepairs.get(i).getCompletion();
			myModel.addRow(myRow);
		}
		myTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

		for (int i = 0; i < myRow.length; i++) {
			myTable.getColumnModel().getColumn(i).setPreferredWidth(100);
		}
		myPane.setBounds(30, 30, 700, 300);
		container.add(myPane);

		this.setTitle("Read Repairs");
		this.setBounds(10, 10, 800, 800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
	}

	public void addVehicle() { // 800x800
		container.removeAll();
		container.add(toolBar);

		// Set up
		JLabel vinLabel = new JLabel("VIN");
		JTextField vinChooser = new JTextField();

		JLabel yearLabel = new JLabel("Year");
		JTextField yearChooser = new JTextField();

		JLabel modelLabel = new JLabel("Model");
		JTextField ModelChooser = new JTextField(5);

		JLabel mileageLabel = new JLabel("Mileage");
		JTextField mileageChooser = new JTextField();

		JLabel bodyTypeLabel = new JLabel("BodyType");
		JTextField bodyTypeChooser = new JTextField();

		JButton addButton = new JButton("ADD");

		// BOUNDS
		vinLabel.setBounds(25, 50, 150, 30);
		vinChooser.setBounds(100, 50, 150, 30);

		yearLabel.setBounds(25, 100, 150, 30);
		yearChooser.setBounds(100, 100, 150, 30);

		modelLabel.setBounds(25, 150, 150, 30);
		ModelChooser.setBounds(100, 150, 150, 60);

		mileageLabel.setBounds(25, 250, 200, 30);
		mileageChooser.setBounds(100, 250, 200, 30);

		bodyTypeLabel.setBounds(25, 300, 150, 30);
		bodyTypeChooser.setBounds(100, 300, 150, 30);

		addButton.setBounds(100, 400, 100, 100);

		addButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				try {
					String VIN = (String) vinChooser.getText();
					int Year = Integer.parseInt(yearChooser.getText());
					String Model = ModelChooser.getText();
					int Mileage = Integer.parseInt(mileageChooser.getText());
					String BodyType = bodyTypeChooser.getText();

					if (Year > 1800 && Year <= Calendar.getInstance().get(Calendar.YEAR) + 1 && VIN.length() == 17
							&& Model.length() != 0 && Mileage >= 0 && BodyType.length() != 0) {
						app.addVehicle(VIN, Year, Model, Mileage, BodyType);
					} else {
						JOptionPane.showMessageDialog(null, "The Fields are incorrect");
					}
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Fields are incorrect");
				}
			}
		});
		container.add(vinLabel);
		container.add(vinChooser);

		container.add(yearLabel);
		container.add(yearChooser);

		container.add(modelLabel);
		container.add(ModelChooser);

		container.add(mileageLabel);
		container.add(mileageChooser);

		container.add(bodyTypeLabel);
		container.add(bodyTypeChooser);

		container.add(addButton);

		this.setTitle("Add Vehicle");
		this.setVisible(true);
		this.setBounds(10, 10, 800, 800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
	}

	public void updateVehicle() {
		container.removeAll();
		container.add(toolBar);

		ArrayList<MyVehicles> myVehicles = app.getAllVehicles();
		String[] myVins = new String[myVehicles.size()];
		for (int i = 0; i < myVehicles.size(); i++) {
			myVins[i] = myVehicles.get(i).getVin();
		}

		JLabel vinLabel = new JLabel("VIN");
		JComboBox<String> vinChooser = new JComboBox<String>(myVins);

		JLabel yearLabel = new JLabel("Year");
		JTextField yearChooser = new JTextField();

		JLabel modelLabel = new JLabel("Model");
		JTextField ModelChooser = new JTextField(5);

		JLabel mileageLabel = new JLabel("Mileage");
		JTextField mileageChooser = new JTextField();

		JLabel bodyTypeLabel = new JLabel("BodyType");
		JTextField bodyTypeChooser = new JTextField();

		JButton addButton = new JButton("UPDATE");

		vinLabel.setBounds(25, 50, 150, 30);
		vinChooser.setBounds(100, 50, 150, 30);

		yearLabel.setBounds(25, 100, 150, 30);
		yearChooser.setBounds(100, 100, 150, 30);

		modelLabel.setBounds(25, 150, 150, 30);
		ModelChooser.setBounds(100, 150, 150, 60);

		mileageLabel.setBounds(25, 250, 200, 30);
		mileageChooser.setBounds(100, 250, 200, 30);

		bodyTypeLabel.setBounds(25, 300, 150, 30);
		bodyTypeChooser.setBounds(100, 300, 150, 30);

		addButton.setBounds(100, 450, 100, 100);

		addButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				try {
					String VIN = (String) vinChooser.getSelectedItem();

					int Year = Integer.parseInt(yearChooser.getText());
					String Model = ModelChooser.getText();
					int Mileage = Integer.parseInt(mileageChooser.getText());
					String BodyType = bodyTypeChooser.getText();

					if (VIN.length() == 17) {
						app.updateVehicle(VIN, Year, Model, Mileage, BodyType);
					} else {
						JOptionPane.showMessageDialog(null, "Vin is invalid");
					}
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Fields are incorrect");
				}
			}
		});

		container.add(vinLabel);
		container.add(vinChooser);

		container.add(yearLabel);
		container.add(yearChooser);

		container.add(modelLabel);
		container.add(ModelChooser);

		container.add(mileageLabel);
		container.add(mileageChooser);

		container.add(bodyTypeLabel);
		container.add(bodyTypeChooser);

		container.add(addButton);

		this.setTitle("Update Vehicle");
		this.setVisible(true);
		this.setBounds(10, 10, 800, 800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
	}

	public void deleteVehicle() {
		container.removeAll();
		container.add(toolBar);
		ArrayList<MyVehicles> myVehicles = app.getAllVehicles();
		String[] vinNumbers = new String[myVehicles.size()];
		for (int i = 0; i < myVehicles.size(); i++) {
			vinNumbers[i] = myVehicles.get(i).getVin();
		}
		JLabel vinLabel = new JLabel("VIN");
		JComboBox<String> vinChooser = new JComboBox<String>(vinNumbers);

		JButton deleteButton = new JButton("DELETE");

		vinLabel.setBounds(25, 50, 150, 30);
		vinChooser.setBounds(100, 50, 150, 30);

		deleteButton.setBounds(100, 350, 150, 30);

		vinChooser.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub

			}

		});

		deleteButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String id = (String) vinChooser.getSelectedItem();
				if (id.length() != 0) {
					app.deleteVehicle(id);
				} else {
					JOptionPane.showMessageDialog(null, "Fields are incorrect");
				}

			}

		});
		container.add(vinLabel);
		container.add(vinChooser);
		container.add(deleteButton);

		this.setTitle("Delete Vehicle");
		this.setVisible(true);
		this.setBounds(10, 10, 370, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
	}

	public void readAllVehicle() {
		container.removeAll();
		container.add(toolBar);
		JScrollPane myPane = new JScrollPane();

		ArrayList<MyVehicles> myVehicles = app.getAllVehicles();
		JTable myTable = new JTable();
		DefaultTableModel myModel = new DefaultTableModel();
		String[] myColumns = { "VIN", "Year", "Model", "Mileage", "BodyType" };
		myTable.setModel(myModel);
		myModel.setColumnIdentifiers(myColumns);
		myPane.setViewportView(myTable);
		Object[] myRow = new Object[5];
		for (int i = 0; i < myVehicles.size(); i++) {
			myRow[0] = myVehicles.get(i).getVin();
			myRow[1] = myVehicles.get(i).getYear();
			myRow[2] = myVehicles.get(i).getModel();
			myRow[3] = myVehicles.get(i).getMileage();
			myRow[4] = myVehicles.get(i).getBodyType();
			myModel.addRow(myRow);
		}
		myTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

		for (int i = 0; i < myRow.length; i++) {
			myTable.getColumnModel().getColumn(i).setPreferredWidth(100);
		}
		myPane.setBounds(30, 30, 500, 300);
		container.add(myPane);

		this.setTitle("Read Vehicles");
		this.setBounds(10, 10, 680, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
	}

	public void addTask() {
		container.removeAll();
		container.add(toolBar);

		// Set up
		JLabel nameLabel = new JLabel("Name");
		JTextField nameChooser = new JTextField();

		JLabel descriptionLabel = new JLabel("Description");
		JTextField descriptionChooser = new JTextField();

		JLabel priceLabel = new JLabel("Price");
		JTextField priceChooser = new JTextField();

		JButton addButton = new JButton("ADD");

		// BOUNDS
		nameLabel.setBounds(25, 50, 150, 30);
		nameChooser.setBounds(100, 50, 150, 30);

		descriptionLabel.setBounds(25, 100, 150, 30);
		descriptionChooser.setBounds(100, 100, 150, 30);

		priceLabel.setBounds(25, 150, 150, 30);
		priceChooser.setBounds(100, 150, 150, 60);

		addButton.setBounds(100, 400, 100, 100);

		addButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				try {
					String Name = (String) nameChooser.getText();
					String Description = (descriptionChooser.getText());
					int Price = Integer.parseInt(priceChooser.getText());

					if (Name.length() != 0 && Price >= 0) {
						app.addTask(Name, Description, Price);
					} else {
						JOptionPane.showMessageDialog(null, "The Fields are incorrect");
					}
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Fields are incorrect");
				}
			}
		});
		container.add(nameLabel);
		container.add(nameChooser);

		container.add(descriptionLabel);
		container.add(descriptionChooser);

		container.add(priceLabel);
		container.add(priceChooser);

		container.add(addButton);

		this.setTitle("Add Task");
		this.setVisible(true);
		this.setBounds(10, 10, 800, 800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
	}

	public void updateTask() {
		container.removeAll();
		container.add(toolBar);

		ArrayList<MyTasks> myTasks = app.getTasks();
		Integer[] myIDS = new Integer[myTasks.size()];
		for (int i = 0; i < myTasks.size(); i++) {
			myIDS[i] = myTasks.get(i).getID();
		}

		JLabel IDLabel = new JLabel("ID");
		JComboBox<Integer> IDChooser = new JComboBox<Integer>(myIDS);

		JLabel nameLabel = new JLabel("Name");
		JTextField nameChooser = new JTextField();

		JLabel descriptionLabel = new JLabel("Description");
		JTextField descriptionChooser = new JTextField(5);

		JLabel priceLabel = new JLabel("Price");
		JTextField priceChooser = new JTextField();

		JLabel completionLabel = new JLabel("Completion");
		JTextField completionChooser = new JTextField();

		JButton addButton = new JButton("UPDATE");

		IDLabel.setBounds(25, 50, 150, 30);
		IDChooser.setBounds(100, 50, 150, 30);

		nameLabel.setBounds(25, 100, 150, 30);
		descriptionChooser.setBounds(100, 100, 150, 30);

		priceLabel.setBounds(25, 150, 150, 30);
		priceChooser.setBounds(100, 150, 150, 60);

		completionLabel.setBounds(25, 250, 200, 30);
		completionChooser.setBounds(100, 250, 200, 30);

		addButton.setBounds(100, 450, 100, 100);

		IDChooser.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub

			}
		});
		addButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				try {
					Integer ID = (Integer) IDChooser.getSelectedItem();
					String Name = (nameChooser.getText());
					String Description = descriptionChooser.getText();
					int Price = Integer.parseInt(priceChooser.getText());
					int Completion = Integer.parseInt(completionChooser.getText());

					if (Name.length() != 0 && Price > 0 && (Completion == 0 || Completion == 1)) {
						app.updateTask(ID, Name, Description, Price, Completion);
					} else {
						JOptionPane.showMessageDialog(null, "The Fields are incorrect");
					}
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Fields are incorrect");
				}
			}
		});

		container.add(IDLabel);
		container.add(IDChooser);

		container.add(nameLabel);
		container.add(nameChooser);

		container.add(descriptionLabel);
		container.add(descriptionChooser);

		container.add(priceLabel);
		container.add(priceChooser);

		container.add(completionLabel);
		container.add(completionChooser);

		container.add(addButton);

		this.setTitle("Update Task");
		this.setVisible(true);
		this.setBounds(10, 10, 800, 800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
	}

	public void deleteTask() {
		container.removeAll();
		container.add(toolBar);
		ArrayList<MyTasks> myTasks = app.getTasks();
		Integer[] idNumbers = new Integer[myTasks.size()];
		for (int i = 0; i < myTasks.size(); i++) {
			idNumbers[i] = myTasks.get(i).getID();
		}
		JLabel idLabel = new JLabel("ID");
		JComboBox<Integer> idChooser = new JComboBox<Integer>(idNumbers);

		JButton deleteButton = new JButton("DELETE");

		idLabel.setBounds(25, 50, 150, 30);
		idChooser.setBounds(100, 50, 150, 30);

		deleteButton.setBounds(100, 350, 150, 30);

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
				try {
					Integer id = (Integer) idChooser.getSelectedItem();
					app.deleteTask(id);
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Fields are incorrect");
				}

			}

		});
		container.add(idLabel);
		container.add(idChooser);
		container.add(deleteButton);

		this.setTitle("Delete Task");
		this.setVisible(true);
		this.setBounds(10, 10, 800, 800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
	}

	public void readAllTasks() {
		container.removeAll();
		container.add(toolBar);
		JScrollPane myPane = new JScrollPane();

		ArrayList<MyTasks> myTasks = app.getTasks();
		JTable myTable = new JTable();
		DefaultTableModel myModel = new DefaultTableModel();
		String[] myColumns = { "ID", "Name", "Description", "Price", "Completion" };
		myTable.setModel(myModel);
		myModel.setColumnIdentifiers(myColumns);
		myPane.setViewportView(myTable);
		Object[] myRow = new Object[5];
		for (int i = 0; i < myTasks.size(); i++) {
			myRow[0] = myTasks.get(i).getID();
			myRow[1] = myTasks.get(i).getName();
			myRow[2] = myTasks.get(i).getDescription();
			myRow[3] = myTasks.get(i).getPrice();
			myRow[4] = myTasks.get(i).getCompletion();
			myModel.addRow(myRow);
		}
		myTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

		for (int i = 0; i < myRow.length; i++) {
			myTable.getColumnModel().getColumn(i).setPreferredWidth(100);
		}
		myPane.setBounds(30, 30, 500, 300);
		container.add(myPane);

		this.setTitle("Read Tasks");
		this.setBounds(10, 10, 800,800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
	}

	public void addPart() {
		container.removeAll();
		container.add(toolBar);

		// Set up
		JLabel partNumberLabel = new JLabel("PartNumber");
		JTextField partNumberChooser = new JTextField();

		JLabel nameLabel = new JLabel("Name");
		JTextField nameLabelChooser = new JTextField();

		JLabel priceLabel = new JLabel("Price");
		JTextField priceChooser = new JTextField();

		JButton addButton = new JButton("ADD");

		// BOUNDS
		partNumberLabel.setBounds(25, 50, 150, 30);
		partNumberChooser.setBounds(100, 50, 150, 30);

		nameLabel.setBounds(25, 100, 150, 30);
		nameLabelChooser.setBounds(100, 100, 150, 30);

		priceLabel.setBounds(25, 150, 150, 30);
		priceChooser.setBounds(100, 150, 150, 60);

		addButton.setBounds(100, 400, 100, 100);

		addButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				try {
					Integer PartNumber = Integer.parseInt(partNumberChooser.getText());
					String Name = (nameLabelChooser.getText());
					int Price = Integer.parseInt(priceChooser.getText());

					if (Name.length() != 0 && Price >= 0 && PartNumber != null) {
						app.addPart(PartNumber, Name, Price);
					} else {
						JOptionPane.showMessageDialog(null, "The Fields are incorrect");
					}
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Fields are incorrect");
				}
			}
		});
		container.add(partNumberLabel);
		container.add(partNumberChooser);

		container.add(nameLabel);
		container.add(nameLabelChooser);

		container.add(priceLabel);
		container.add(priceChooser);

		container.add(addButton);

		this.setTitle("Add Part");
		this.setVisible(true);
		this.setBounds(10, 10, 800,800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
	}

	public void updatePart() {
		container.removeAll();
		container.add(toolBar);

		ArrayList<MyParts> myParts = app.getParts();
		Integer[] myPartNumbers = new Integer[myParts.size()];
		for (int i = 0; i < myParts.size(); i++) {
			myPartNumbers[i] = myParts.get(i).getPartNumber();
		}

		JLabel partNumberLabel = new JLabel("PartNumber");
		JComboBox<Integer> partNumberChooser = new JComboBox<Integer>(myPartNumbers);

		JLabel nameLabel = new JLabel("Name");
		JTextField nameChooser = new JTextField();

		JLabel priceLabel = new JLabel("Price");
		JTextField priceChooser = new JTextField(5);

		JButton addButton = new JButton("UPDATE");

		partNumberLabel.setBounds(25, 50, 150, 30);
		partNumberChooser.setBounds(100, 50, 150, 30);

		nameLabel.setBounds(25, 100, 150, 30);
		nameChooser.setBounds(100, 100, 150, 30);

		priceLabel.setBounds(25, 150, 150, 30);
		priceChooser.setBounds(100, 150, 150, 60);

		addButton.setBounds(100, 450, 100, 100);

		partNumberChooser.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub

			}
		});
		addButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					// TODO Auto-generated method stub
					Integer PartNumber = (Integer) (partNumberChooser.getSelectedItem());
					int Price = Integer.parseInt(priceChooser.getText());
					String Name = nameChooser.getText();

					if (Price >= 0 && Name.length() != 0) {
						app.updatePart(PartNumber, Name, Price);
					} else {
						JOptionPane.showMessageDialog(null, "The Fields are incorrect");
					}
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Fields are incorrect");
				}
			}
		});

		container.add(partNumberLabel);
		container.add(partNumberChooser);

		container.add(nameLabel);
		container.add(nameChooser);

		container.add(priceLabel);
		container.add(priceChooser);

		container.add(addButton);

		this.setTitle("Update Part");
		this.setVisible(true);
		this.setBounds(10, 10, 800,800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
	}

	public void deletePart() {
		container.removeAll();
		container.add(toolBar);
		ArrayList<MyParts> myParts = app.getParts();
		Integer[] partNumbers = new Integer[myParts.size()];
		for (int i = 0; i < myParts.size(); i++) {
			partNumbers[i] = myParts.get(i).getPartNumber();
		}
		JLabel partNumberLabel = new JLabel("PartNumber");
		JComboBox<Integer> partNumberChooser = new JComboBox<Integer>(partNumbers);

		JButton deleteButton = new JButton("DELETE");

		partNumberLabel.setBounds(25, 50, 150, 30);
		partNumberChooser.setBounds(100, 50, 150, 30);

		deleteButton.setBounds(100, 350, 150, 30);

		partNumberChooser.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub

			}

		});

		deleteButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Integer id = (Integer) partNumberChooser.getSelectedItem();
				if (id != null) {
					app.deletePart(id);
				} else {
					JOptionPane.showMessageDialog(null, "Fields are incorrect");
				}

			}

		});
		container.add(partNumberLabel);
		container.add(partNumberChooser);
		container.add(deleteButton);

		this.setTitle("Delete Part");
		this.setVisible(true);
		this.setBounds(10, 10, 800,800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
	}

	public void readAllParts() {
		container.removeAll();
		container.add(toolBar);
		JScrollPane myPane = new JScrollPane();

		ArrayList<MyParts> myParts = app.getParts();
		JTable myTable = new JTable();
		DefaultTableModel myModel = new DefaultTableModel();
		String[] myColumns = { "PartNumber", "Name", "Price" };
		myTable.setModel(myModel);
		myModel.setColumnIdentifiers(myColumns);
		myPane.setViewportView(myTable);
		Object[] myRow = new Object[3];
		for (int i = 0; i < myParts.size(); i++) {
			myRow[0] = myParts.get(i).getPartNumber();
			myRow[1] = myParts.get(i).getName();
			myRow[2] = myParts.get(i).getPrice();
			myModel.addRow(myRow);
		}
		myTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

		for (int i = 0; i < myRow.length; i++) {
			myTable.getColumnModel().getColumn(i).setPreferredWidth(100);
		}
		myPane.setBounds(30, 30, 300, 300);
		container.add(myPane);

		this.setTitle("Read Parts");
		this.setBounds(10, 10, 800, 800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
	}

	public void addEmployee() { // 800x800
		container.removeAll();
		container.add(toolBar);

		// Set up
		JLabel usernameLabel = new JLabel("Username");
		JTextField usernameChooser = new JTextField();

		JLabel firstnameLabel = new JLabel("First Name");
		JTextField firstnameChooser = new JTextField();

		JLabel lastnameLabel = new JLabel("Last Name");
		JTextField lastnameChooser = new JTextField();

		JButton addButton = new JButton("ADD");

		// BOUNDS
		usernameLabel.setBounds(25, 50, 150, 30);
		usernameChooser.setBounds(100, 50, 150, 30);

		firstnameLabel.setBounds(25, 100, 150, 30);
		firstnameChooser.setBounds(100, 100, 150, 30);

		lastnameLabel.setBounds(25, 150, 150, 30);
		lastnameChooser.setBounds(100, 150, 150, 60);

		addButton.setBounds(100, 400, 100, 100);

		addButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				try {
					String Username = (String) usernameChooser.getText();
					String FirstName = firstnameChooser.getText();
					String LastName = lastnameChooser.getText();

					if (Username.length() != 0 && FirstName.length() != 0 && LastName.length() != 0) {
						app.addEmployee(Username, FirstName, LastName);
					} else {
						JOptionPane.showMessageDialog(null, "The Fields are incorrect");
					}
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Fields are incorrect");
				}
			}
		});
		container.add(usernameLabel);
		container.add(usernameChooser);

		container.add(firstnameLabel);
		container.add(firstnameChooser);

		container.add(lastnameLabel);
		container.add(lastnameChooser);

		container.add(addButton);

		this.setTitle("Add Employee");
		this.setVisible(true);
		this.setBounds(10, 10, 800, 800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
	}

	public void updateEmployee() { // 800x800
		container.removeAll();
		container.add(toolBar);

		ArrayList<MyEmployee> myEmployees = app.getEmployees();
		String[] myUsernames = new String[myEmployees.size()];
		for (int i = 0; i < myEmployees.size(); i++) {
			myUsernames[i] = myEmployees.get(i).getUsername();
		}

		JLabel userNameLabel = new JLabel("Username");
		JComboBox<String> userNameChooser = new JComboBox<String>(myUsernames);

		JLabel firstnameLabel = new JLabel("First Name");
		JTextField firstNameChooser = new JTextField();

		JLabel lastnameLabel = new JLabel("Last Name");
		JTextField lastNameChooser = new JTextField();

		JButton addButton = new JButton("UPDATE");

		userNameLabel.setBounds(25, 50, 150, 30);
		userNameChooser.setBounds(100, 50, 150, 30);

		firstnameLabel.setBounds(25, 100, 150, 30);
		firstNameChooser.setBounds(100, 100, 150, 30);

		lastnameLabel.setBounds(25, 150, 150, 30);
		lastNameChooser.setBounds(100, 150, 150, 60);

		addButton.setBounds(100, 450, 100, 100);

		userNameChooser.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub

			}
		});
		addButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					// TODO Auto-generated method stub
					String Username = (String) userNameChooser.getSelectedItem();
					String FirstName = (firstNameChooser.getText());
					String LastName = lastNameChooser.getText();
					if (Username.length() != 0 && FirstName.length() != 0 && LastName.length() != 0) {
						app.updateEmployee(Username, FirstName, LastName);
					} else {
						JOptionPane.showMessageDialog(null, "The Fields are incorrect");
					}
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Fields are incorrect");
				}
			}
		});

		container.add(userNameLabel);
		container.add(userNameChooser);

		container.add(firstnameLabel);
		container.add(firstNameChooser);

		container.add(lastnameLabel);
		container.add(lastNameChooser);

		container.add(addButton);

		this.setTitle("Update Employee");
		this.setVisible(true);
		this.setBounds(10, 10, 800, 800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
	}

	public void deleteEmployee() { // 800x800
		container.removeAll();
		container.add(toolBar);
		ArrayList<MyEmployee> myEmployees = app.getEmployees();

		String[] userNames = new String[myEmployees.size()];

		for (int i = 0; i < myEmployees.size(); i++) {
			userNames[i] = myEmployees.get(i).getUsername();
		}
		JLabel userNameLabel = new JLabel("Username");

		JComboBox<String> userNameChooser = new JComboBox<String>(userNames);

		JButton deleteButton = new JButton("DELETE");

		userNameLabel.setBounds(25, 50, 150, 30);
		userNameChooser.setBounds(100, 50, 150, 30);

		deleteButton.setBounds(100, 350, 150, 30);

		deleteButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String id = (String) userNameChooser.getSelectedItem();
				if (id != null) {
					app.deleteEmployee(id);
				} else {
					JOptionPane.showMessageDialog(null, "Fields are incorrect");
				}

			}

		});
		container.add(userNameLabel);
		container.add(userNameChooser);
		container.add(deleteButton);

		this.setTitle("Delete Employee");
		this.setVisible(true);
		this.setBounds(10, 10, 800, 800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
	}

	public void readAllEmployees() { // 800x800
		container.removeAll();
		container.add(toolBar);
		JScrollPane myPane = new JScrollPane();

		ArrayList<MyEmployee> myEmployees = app.getEmployees();
		JTable myTable = new JTable();
		DefaultTableModel myModel = new DefaultTableModel();
		String[] myColumns = { "Username" };
		myTable.setModel(myModel);
		myModel.setColumnIdentifiers(myColumns);
		myPane.setViewportView(myTable);
		Object[] myRow = new Object[1];
		for (int i = 0; i < myEmployees.size(); i++) {
			myRow[0] = myEmployees.get(i).getUsername();
			myModel.addRow(myRow);
		}
		myTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

		for (int i = 0; i < myRow.length; i++) {
			myTable.getColumnModel().getColumn(i).setPreferredWidth(100);
		}
		myPane.setBounds(30, 30, 100, 300);
		container.add(myPane);

		this.setTitle("Read Employees");
		this.setBounds(10, 10, 800, 800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
	}

	public void addCustomer() { // 800x800
		container.removeAll();
		container.add(toolBar);
		// Set up
		JLabel usernameLabel = new JLabel("Username");
		JTextField usernameChooser = new JTextField();

		JLabel firstnameLabel = new JLabel("FirstName");
		JTextField firstnameChooser = new JTextField();

		JLabel lastnameLabel = new JLabel("LastName");
		JTextField lastnameChooser = new JTextField();

		JLabel numberVisitsLabel = new JLabel("NumberOfVisits");
		JTextField numberVisitsChooser = new JTextField();

		JButton addButton = new JButton("ADD");

		// BOUNDS
		usernameLabel.setBounds(25, 50, 150, 30);
		usernameChooser.setBounds(100, 50, 150, 30);

		firstnameLabel.setBounds(25, 100, 150, 30);
		firstnameChooser.setBounds(100, 100, 150, 30);

		lastnameLabel.setBounds(25, 150, 150, 30);
		lastnameChooser.setBounds(100, 150, 150, 30);

		numberVisitsLabel.setBounds(25, 200, 150, 30);
		numberVisitsChooser.setBounds(100, 230, 150, 30);

		addButton.setBounds(100, 400, 100, 100);

		addButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				try {
					String Username = (String) usernameChooser.getText();
					String FirstName = firstnameChooser.getText();
					String LastName = lastnameChooser.getText();
					int numberVists = Integer.parseInt(numberVisitsChooser.getText());

					if (Username.length() != 0 && FirstName.length() != 0 && LastName.length() != 0
							&& numberVists >= 0) {
						app.addCustomer(Username, FirstName, LastName, numberVists);
					} else {
						JOptionPane.showMessageDialog(null, "The Fields are incorrect");
					}
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Fields are incorrect");
				}
			}
		});
		container.add(usernameLabel);
		container.add(usernameChooser);

		container.add(firstnameLabel);
		container.add(firstnameChooser);

		container.add(lastnameLabel);
		container.add(lastnameChooser);

		container.add(numberVisitsLabel);
		container.add(numberVisitsChooser);

		container.add(addButton);

		this.setTitle("Add Customer");
		this.setVisible(true);
		this.setBounds(10, 10, 800, 800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
	}

	public void updateCustomer() { // 800x800
		container.removeAll();
		container.add(toolBar);

		ArrayList<MyCustomer> myCustomers = app.getCustomers();
		String[] myUsernames = new String[myCustomers.size()];
		for (int i = 0; i < myCustomers.size(); i++) {
			myUsernames[i] = myCustomers.get(i).getusername();
		}

		JLabel userNameLabel = new JLabel("Username");
		JComboBox<String> userNameChooser = new JComboBox<String>(myUsernames);

		JLabel firstnameLabel = new JLabel("FirstName");
		JTextField firstNameChooser = new JTextField();

		JLabel lastnameLabel = new JLabel("LastName");
		JTextField lastNameChooser = new JTextField();

		JLabel numberVisitsLabel = new JLabel("NumberOfVisits");
		JTextField numberVisitsChooser = new JTextField();

		JButton addButton = new JButton("UPDATE");

		userNameLabel.setBounds(25, 50, 150, 30);
		userNameChooser.setBounds(100, 50, 150, 30);

		firstnameLabel.setBounds(25, 100, 150, 30);
		firstNameChooser.setBounds(100, 100, 150, 30);

		lastnameLabel.setBounds(25, 150, 150, 30);
		lastNameChooser.setBounds(100, 150, 150, 30);

		numberVisitsLabel.setBounds(25, 200, 150, 30);
		numberVisitsChooser.setBounds(100, 200, 150, 30);

		addButton.setBounds(100, 450, 100, 100);

		addButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					String Username = (String) userNameChooser.getSelectedItem();
					String FirstName = (firstNameChooser.getText());
					String LastName = lastNameChooser.getText();
					int numberVisits = Integer.parseInt(numberVisitsChooser.getText());

					if (Username.length() != 0 && FirstName.length() != 0 && LastName.length() != 0
							&& numberVisits > 0) {
						app.updateCustomer(Username, FirstName, LastName, numberVisits);
					} else {
						JOptionPane.showMessageDialog(null, "The Fields are incorrect");
					}
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Fields are incorrect");
				}
			}
		});

		container.add(userNameLabel);
		container.add(userNameChooser);

		container.add(firstnameLabel);
		container.add(firstNameChooser);

		container.add(lastnameLabel);
		container.add(lastNameChooser);

		container.add(numberVisitsLabel);
		container.add(numberVisitsChooser);

		container.add(addButton);

		this.setTitle("Update Customer");
		this.setVisible(true);
		this.setBounds(10, 10, 800, 800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
	}

	public void deleteCustomer() { // 800x800
		container.removeAll();
		container.add(toolBar);
		ArrayList<MyCustomer> myCustomers = app.getCustomers();
		String[] userNames = new String[myCustomers.size()];
		for (int i = 0; i < myCustomers.size(); i++) {
			userNames[i] = myCustomers.get(i).getusername();
		}
		JLabel userNameLabel = new JLabel("Username");
		JComboBox<String> userNameChooser = new JComboBox<String>(userNames);

		JButton deleteButton = new JButton("DELETE");

		userNameLabel.setBounds(25, 50, 150, 30);
		userNameChooser.setBounds(100, 50, 150, 30);

		deleteButton.setBounds(100, 350, 150, 30);

		deleteButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String id = (String) userNameChooser.getSelectedItem();
				if (id != null) {
					app.deleteCustomer(id);
				} else {
					JOptionPane.showMessageDialog(null, "Fields are incorrect");
				}

			}

		});
		container.add(userNameLabel);
		container.add(userNameChooser);
		container.add(deleteButton);

		this.setTitle("Delete Customer");
		this.setVisible(true);
		this.setBounds(10, 10, 800, 800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
	}

	public void readAllCustomers() { // 800x800
		container.removeAll();
		container.add(toolBar);
		JScrollPane myPane = new JScrollPane();

		ArrayList<MyCustomer> myCustomers = app.getCustomers();
		JTable myTable = new JTable();
		DefaultTableModel myModel = new DefaultTableModel();
		String[] myColumns = { "Username", "NumberOfVisits" };
		myTable.setModel(myModel);
		myModel.setColumnIdentifiers(myColumns);
		myPane.setViewportView(myTable);
		Object[] myRow = new Object[2];
		for (int i = 0; i < myCustomers.size(); i++) {
			myRow[0] = myCustomers.get(i).getusername();
			myRow[1] = myCustomers.get(i).getnumberOfVisits();
			myModel.addRow(myRow);
		}
		myTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

		for (int i = 0; i < myRow.length; i++) {
			myTable.getColumnModel().getColumn(i).setPreferredWidth(100);
		}
		myPane.setBounds(30, 30, 200, 300);
		container.add(myPane);

		this.setTitle("Read Customers");
		this.setBounds(10, 10, 800, 800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
	}

	public void addInsurance() {
		container.removeAll();
		container.add(toolBar);

		// Set up
		JLabel claimNumberLabel = new JLabel("ClaimNumber");
		JTextField claimNumberChooser = new JTextField();

		JLabel policyNumberLabel = new JLabel("PolicyNumber");
		JTextField policyNumberChooser = new JTextField();

		JLabel deductibleLabel = new JLabel("Deductible");
		JTextField deductibleChooser = new JTextField();

		JButton addButton = new JButton("ADD");

		// BOUNDS
		claimNumberLabel.setBounds(25, 50, 150, 30);
		claimNumberChooser.setBounds(100, 50, 150, 30);

		policyNumberLabel.setBounds(25, 100, 150, 30);
		policyNumberChooser.setBounds(100, 100, 150, 30);

		deductibleLabel.setBounds(25, 150, 150, 30);
		deductibleChooser.setBounds(100, 150, 150, 60);

		addButton.setBounds(100, 400, 100, 100);

		addButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					String ClaimNumber = (String) claimNumberChooser.getText();
					String PolicyNumber = policyNumberChooser.getText();
					int Deductible = Integer.parseInt(deductibleChooser.getText());

					if (ClaimNumber.length() == 12 && PolicyNumber.length() == 11 && Deductible >= 0) {
						app.addInsurance(ClaimNumber, PolicyNumber, Deductible);
					} else {
						JOptionPane.showMessageDialog(null, "The Fields are incorrect");
					}
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Fields are incorrect");
				}
			}
		});
		container.add(claimNumberLabel);
		container.add(claimNumberChooser);

		container.add(policyNumberLabel);
		container.add(policyNumberChooser);

		container.add(deductibleLabel);
		container.add(deductibleChooser);

		container.add(addButton);

		this.setTitle("Add Insurance");
		this.setVisible(true);
		this.setBounds(10, 10, 800,800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
	}

	public void updateInsurance() {
		container.removeAll();
		container.add(toolBar);

		ArrayList<MyInsurance> myInsurances = app.getInsurance();
		String[] myClaimNumbers = new String[myInsurances.size()];
		for (int i = 0; i < myInsurances.size(); i++) {
			myClaimNumbers[i] = myInsurances.get(i).getClaimNumber();
		}

		JLabel claimNumberLabel = new JLabel("ClaimNumber");
		JComboBox<String> claimNumberChooser = new JComboBox<String>(myClaimNumbers);

		JLabel policyNumberLabel = new JLabel("PolicyNumber");
		JTextField policyNumberChooser = new JTextField();

		JLabel deductibleLabel = new JLabel("Deductible");
		JTextField deductibleChooser = new JTextField();

		JButton addButton = new JButton("UPDATE");

		claimNumberLabel.setBounds(25, 50, 150, 30);
		claimNumberChooser.setBounds(100, 50, 150, 30);

		policyNumberLabel.setBounds(25, 100, 150, 30);
		policyNumberChooser.setBounds(100, 100, 150, 30);

		deductibleLabel.setBounds(25, 150, 150, 30);
		deductibleChooser.setBounds(100, 150, 150, 60);

		addButton.setBounds(100, 450, 100, 100);

	
		addButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
			
				try {
					String ClaimNumber = (String) claimNumberChooser.getSelectedItem();
					String PolicyNumber = (policyNumberChooser.getText());
					int deductible = Integer.parseInt(deductibleChooser.getText());

					if (ClaimNumber.length() != 0 && PolicyNumber.length() != 0 && deductible >= 0) {
						app.updateInsurance(ClaimNumber, PolicyNumber, deductible);
					} else {
						JOptionPane.showMessageDialog(null, "The Fields are incorrect");
					}
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Fields are incorrect");
				}
			}
		});

		container.add(claimNumberLabel);
		container.add(claimNumberChooser);

		container.add(policyNumberLabel);
		container.add(policyNumberChooser);

		container.add(deductibleLabel);
		container.add(deductibleChooser);

		container.add(addButton);

		this.setTitle("Update Insurance");
		this.setVisible(true);
		this.setBounds(10, 10, 800,800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
	}

	public void deleteInsurance() {
		container.removeAll();
		container.add(toolBar);

		ArrayList<MyInsurance> myInsurances = app.getInsurance();
		String[] myClaimNumbers = new String[myInsurances.size()];
		for (int i = 0; i < myInsurances.size(); i++) {
			myClaimNumbers[i] = myInsurances.get(i).getClaimNumber();
		}

		JLabel userNameLabel = new JLabel("ClaimNumber");
		JComboBox<String> userNameChooser = new JComboBox<String>(myClaimNumbers);

		JButton deleteButton = new JButton("DELETE");

		userNameLabel.setBounds(25, 50, 150, 30);
		userNameChooser.setBounds(100, 50, 150, 30);

		deleteButton.setBounds(100, 350, 150, 30);

		userNameChooser.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub

			}

		});

		deleteButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String id = (String) userNameChooser.getSelectedItem();
				if (id != null) {
					app.deleteInsurance(id);
				} else {
					JOptionPane.showMessageDialog(null, "Fields are incorrect");
				}

			}

		});
		container.add(userNameLabel);
		container.add(userNameChooser);
		container.add(deleteButton);

		this.setTitle("Delete Insurance");
		this.setVisible(true);
		this.setBounds(10, 10, 370, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
	}

	public void readAllInsurances() {
		container.removeAll();
		container.add(toolBar);
		JScrollPane myPane = new JScrollPane();

		ArrayList<MyInsurance> myInsurances = app.getInsurance();
		JTable myTable = new JTable();
		DefaultTableModel myModel = new DefaultTableModel();
		String[] myColumns = { "ClaimNumber", "PolicyNumber", "NumberOfVisits" };
		myTable.setModel(myModel);
		myModel.setColumnIdentifiers(myColumns);
		myPane.setViewportView(myTable);
		Object[] myRow = new Object[3];
		for (int i = 0; i < myInsurances.size(); i++) {
			myRow[0] = myInsurances.get(i).getClaimNumber();
			myRow[1] = myInsurances.get(i).getPolicyNumber();
			myRow[2] = myInsurances.get(i).getDeductible();
			myModel.addRow(myRow);
		}
		myTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

		for (int i = 0; i < myRow.length; i++) {
			myTable.getColumnModel().getColumn(i).setPreferredWidth(100);
		}
		myPane.setBounds(30, 30, 300, 300);
		container.add(myPane);

		this.setTitle("Read Insurances");
		this.setBounds(10, 10, 680, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
	}

	public void addOrder() {
		container.removeAll();
		container.add(toolBar);

		ArrayList<MyManager> myManagers = app.getManagers();
		ArrayList<MyParts> myParts = app.getParts();
		String[] myManagerUserNames = new String[myManagers.size()];
		Integer[] partNumbers = new Integer[myParts.size()];
		for (int i = 0; i < myManagers.size(); i++) {
			myManagerUserNames[i] = myManagers.get(i).getUsername();
		}
		for (int i = 0; i < myParts.size(); i++) {
			partNumbers[i] = myParts.get(i).getPartNumber();
		}

		// Set up
		JLabel managerUserNameLabel = new JLabel("ManagerUserName");
		JComboBox<String> managerUserNameChooser = new JComboBox<String>();

		JLabel partNumberLabel = new JLabel("PartNumber");
		JComboBox<Integer> partNumberChooser = new JComboBox<Integer>();

		JButton addButton = new JButton("ADD");

		// BOUNDS
		managerUserNameLabel.setBounds(25, 50, 150, 30);
		managerUserNameChooser.setBounds(100, 50, 150, 30);

		partNumberLabel.setBounds(25, 100, 150, 30);
		partNumberChooser.setBounds(100, 100, 150, 30);

		addButton.setBounds(100, 400, 100, 100);
		managerUserNameChooser.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub

			}

		});
		partNumberChooser.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub

			}

		});

		addButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				try {
					String ManagerUserName = (String) managerUserNameChooser.getSelectedItem();
					Integer PartNumber = (Integer) partNumberChooser.getSelectedItem();

					if (ManagerUserName.length() != 0 && PartNumber != null) {
						app.addOrder(ManagerUserName, (int) PartNumber);
					} else {
						JOptionPane.showMessageDialog(null, "The Fields are incorrect");
					}
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Fields are incorrect");
				}
			}
		});
		container.add(managerUserNameLabel);
		container.add(managerUserNameChooser);

		container.add(partNumberLabel);
		container.add(partNumberChooser);

		container.add(addButton);

		this.setTitle("Add Order");
		this.setVisible(true);
		this.setBounds(10, 10, 370, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
	}

	public void updateOrder() {
		container.removeAll();
		container.add(toolBar);

		ArrayList<MyOrder> myOrders = app.getOrders();
		ArrayList<MyManager> myManagers = app.getManagers();
		ArrayList<MyParts> myParts = app.getParts();
		MyOrder[] beforeCool = new MyOrder[myOrders.size()];
		String[] aftermyManagerUserNames = new String[myManagers.size()];
		Integer[] afterpartNumbers = new Integer[myParts.size()];
		for (int i = 0; i < myOrders.size(); i++) {
			beforeCool[i] = myOrders.get(i);
		}
		for (int i = 0; i < myManagers.size(); i++) {
			aftermyManagerUserNames[i] = myManagers.get(i).getUsername();
		}
		for (int i = 0; i < myParts.size(); i++) {
			afterpartNumbers[i] = myParts.get(i).getPartNumber();
		}
		JLabel beforePartNumberLabel = new JLabel("BeforeOrder");
		JComboBox<MyOrder> beforePartNumberChooser = new JComboBox<MyOrder>(beforeCool);

		JLabel afterManagerUserNameLabel = new JLabel("AfterManagerUserName");
		JComboBox<String> afterManagerUserNameChooser = new JComboBox<String>(aftermyManagerUserNames);

		JLabel afterPartNumberLabel = new JLabel("AfterPartNumber");
		JComboBox<Integer> afterPartNumberChooser = new JComboBox<Integer>(afterpartNumbers);

		JButton addButton = new JButton("UPDATE");

		beforePartNumberLabel.setBounds(25, 50, 150, 30);
		beforePartNumberChooser.setBounds(100, 50, 150, 30);

		afterManagerUserNameLabel.setBounds(25, 100, 150, 30);
		afterManagerUserNameChooser.setBounds(100, 100, 150, 60);

		afterPartNumberLabel.setBounds(25, 150, 150, 30);
		afterPartNumberChooser.setBounds(100, 150, 150, 60);

		addButton.setBounds(100, 450, 100, 100);

		beforePartNumberChooser.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub

			}

		});

		afterManagerUserNameChooser.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub

			}

		});

		afterPartNumberChooser.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub

			}

		});

		addButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				try {
					String BeforeManagerUserName = ((MyOrder) beforePartNumberChooser.getSelectedItem())
							.getManagerUserName();
					Integer BeforePartNumber = ((MyOrder) beforePartNumberChooser.getSelectedItem()).getPartNumber();
					String AfterManagerUserName = (String) afterManagerUserNameChooser.getSelectedItem();
					Integer AfterPartNumber = (Integer) afterPartNumberChooser.getSelectedItem();
					boolean dontProceed = true;
					for (int i = 0; i < myOrders.size(); i++) {
						String currentOrderManagerUserName = myOrders.get(i).getManagerUserName();
						Integer currentPartNumber = myOrders.get(i).getPartNumber();
						if (AfterManagerUserName.equals(currentOrderManagerUserName)
								&& AfterPartNumber.equals(currentPartNumber)) {
							dontProceed = false;
							break;
						}
					}

					if (BeforeManagerUserName.length() != 0 && AfterManagerUserName.length() != 0
							&& BeforePartNumber != null && AfterPartNumber != null
							&& (!BeforeManagerUserName.equals(AfterManagerUserName)
									&& !BeforePartNumber.equals(AfterPartNumber))
							&& dontProceed) {
						app.updateOrders(BeforeManagerUserName, BeforePartNumber, AfterManagerUserName,
								AfterPartNumber);
					} else {
						JOptionPane.showMessageDialog(null, "The Fields are incorrect");
					}
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Fields are incorrect");
				}
			}
		});

		container.add(beforePartNumberLabel);
		container.add(beforePartNumberChooser);

		container.add(afterManagerUserNameLabel);
		container.add(afterManagerUserNameChooser);

		container.add(afterPartNumberLabel);
		container.add(afterPartNumberChooser);

		container.add(addButton);

		this.setTitle("Update Order");
		this.setVisible(true);
		this.setBounds(10, 10, 370, 700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
	}

	public void deleteOrder() {
		container.removeAll();
		container.add(toolBar);

		ArrayList<MyOrder> myOrders = app.getOrders();
		String[] myManagerUserNames = new String[myOrders.size()];
		Integer[] partNumbers = new Integer[myOrders.size()];
		for (int i = 0; i < myOrders.size(); i++) {
			myManagerUserNames[i] = myOrders.get(i).getManagerUserName();
			partNumbers[i] = myOrders.get(i).getPartNumber();
		}

		// Set up
		JLabel managerUserNameLabel = new JLabel("ManagerUserName");
		JComboBox<String> managerUserNameChooser = new JComboBox<String>(myManagerUserNames);

		JLabel partNumberLabel = new JLabel("PartNumber");
		JComboBox<Integer> partNumberChooser = new JComboBox<Integer>(partNumbers);

		JButton deleteButton = new JButton("DELETE");

		partNumberLabel.setBounds(25, 50, 150, 30);
		managerUserNameChooser.setBounds(100, 50, 150, 30);

		managerUserNameLabel.setBounds(25, 50, 150, 30);
		partNumberChooser.setBounds(100, 50, 150, 30);

		deleteButton.setBounds(100, 350, 150, 30);

		managerUserNameChooser.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub

			}

		});

		partNumberChooser.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub

			}

		});

		deleteButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Integer partNumber = (Integer) partNumberChooser.getSelectedItem();
				String managerUserName = (String) managerUserNameChooser.getSelectedItem();
				if (partNumber != null && managerUserName.length() != 0) {
					app.deleteOrders(managerUserName, partNumber);
				} else {
					JOptionPane.showMessageDialog(null, "Fields are incorrect");
				}

			}

		});
		container.add(partNumberLabel);
		container.add(partNumberChooser);
		container.add(managerUserNameLabel);
		container.add(managerUserNameChooser);
		container.add(deleteButton);

		this.setTitle("Delete Order");
		this.setVisible(true);
		this.setBounds(10, 10, 370, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
	}

	public void readOrders() {
		container.removeAll();
		container.add(toolBar);
		JScrollPane myPane = new JScrollPane();

		ArrayList<MyOrder> myInsurances = app.getOrders();
		JTable myTable = new JTable();
		DefaultTableModel myModel = new DefaultTableModel();
		String[] myColumns = { "ManagerUserName", "PartNumber" };
		myTable.setModel(myModel);
		myModel.setColumnIdentifiers(myColumns);
		myPane.setViewportView(myTable);
		Object[] myRow = new Object[2];
		for (int i = 0; i < myInsurances.size(); i++) {
			myRow[0] = myInsurances.get(i).getManagerUserName();
			myRow[1] = myInsurances.get(i).getPartNumber();
			myModel.addRow(myRow);
		}
		myTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

		for (int i = 0; i < myRow.length; i++) {
			myTable.getColumnModel().getColumn(i).setPreferredWidth(100);
		}
		myPane.setBounds(30, 30, 200, 300);
		container.add(myPane);

		this.setTitle("Read Orders");
		this.setBounds(10, 10, 680, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
	}

	public void updatemanager() {
		container.removeAll();
		container.add(toolBar);

		JLabel currentManagerlabel = new JLabel("Personal ManagerUsername");
		JLabel currentManagerText = new JLabel(this.userName);

		JLabel managerFirstNameLabel = new JLabel("Manager FirstName");
		JTextField managerFirstNameChooser = new JTextField();

		JLabel managerLastNameLabel = new JLabel("Manager LastName");
		JTextField managerLastNameChooser = new JTextField();

		JButton addButton = new JButton("UPDATE");

		currentManagerlabel.setBounds(25, 50, 150, 30);
		currentManagerText.setBounds(100, 50, 150, 30);

		managerFirstNameLabel.setBounds(25, 100, 150, 30);
		managerFirstNameChooser.setBounds(100, 100, 150, 30);

		managerLastNameLabel.setBounds(25, 150, 150, 30);
		managerLastNameChooser.setBounds(100, 150, 150, 60);

		addButton.setBounds(100, 450, 100, 100);

		addButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				try {
					String currentManager = currentManagerText.getText();
					String FirstName = managerFirstNameChooser.getText();
					String LastName = managerLastNameChooser.getText();
					if (currentManager.length() != 0 && FirstName.length() != 0 && LastName.length() != 0) {
						app.updateManager(currentManager, FirstName, LastName);
					} else {
						JOptionPane.showMessageDialog(null, "The Fields are incorrect");
					}
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Fields are incorrect");
				}
			}
		});
		container.add(currentManagerlabel);
		container.add(currentManagerText);

		container.add(managerFirstNameLabel);
		container.add(managerFirstNameChooser);

		container.add(managerLastNameLabel);
		container.add(managerLastNameChooser);

		container.add(addButton);

		this.setTitle("Update Order");
		this.setVisible(true);
		this.setBounds(10, 10, 370, 700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);

	}

	public void readallManagers() {
		container.removeAll();
		container.add(toolBar);
		JScrollPane myPane = new JScrollPane();

		ArrayList<MyManager> myManagers = app.getManagers();
		JTable myTable = new JTable();
		DefaultTableModel myModel = new DefaultTableModel();
		String[] myColumns = { "UserName" };
		myTable.setModel(myModel);
		myModel.setColumnIdentifiers(myColumns);
		myPane.setViewportView(myTable);
		Object[] myRow = new Object[1];
		for (int i = 0; i < myManagers.size(); i++) {
			myRow[0] = myManagers.get(i).getUsername();
			myModel.addRow(myRow);
		}
		myTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

		for (int i = 0; i < myRow.length; i++) {
			myTable.getColumnModel().getColumn(i).setPreferredWidth(100);
		}
		myPane.setBounds(30, 30, 100, 300);
		container.add(myPane);

		this.setTitle("Read Managers");
		this.setBounds(10, 10, 680, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
	}

	public void addFor() {
		container.removeAll();
		container.add(toolBar);

		ArrayList<MyTasks> myTasks = app.getTasks();
		ArrayList<MyParts> myParts = app.getParts();
		Integer[] myTaskID = new Integer[myTasks.size()];
		Integer[] myPartNumber = new Integer[myParts.size()];
		for (int i = 0; i < myTasks.size(); i++) {
			myTaskID[i] = myTasks.get(i).getID();
		}
		for (int i = 0; i < myParts.size(); i++) {
			myPartNumber[i] = myParts.get(i).getPartNumber();
		}

		// Set up
		JLabel partNumberLabel = new JLabel("PartNumber");
		JComboBox<Integer> partNumberChooser = new JComboBox<Integer>(myPartNumber);

		JLabel taskIdLabel = new JLabel("TaskID");
		JComboBox<Integer> taskIdChooser = new JComboBox<Integer>(myTaskID);

		JButton addButton = new JButton("ADD");

		// BOUNDS
		partNumberLabel.setBounds(25, 50, 150, 30);
		partNumberChooser.setBounds(100, 50, 150, 30);

		taskIdLabel.setBounds(25, 100, 150, 30);
		taskIdChooser.setBounds(100, 100, 150, 30);

		addButton.setBounds(100, 400, 100, 100);
		partNumberChooser.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub

			}

		});
		taskIdChooser.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub

			}

		});

		addButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				try {
					Integer TaskID = (Integer) taskIdChooser.getSelectedItem();
					Integer PartNumber = (Integer) partNumberChooser.getSelectedItem();

					// Be careful to not insert soemthing already in the list
					if (TaskID != null && PartNumber != null) {
						app.addFor(PartNumber, TaskID);
					} else {
						JOptionPane.showMessageDialog(null, "The Fields are incorrect");
					}
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Fields are incorrect");
				}
			}
		});
		container.add(taskIdLabel);
		container.add(taskIdChooser);

		container.add(partNumberLabel);
		container.add(partNumberChooser);

		container.add(addButton);

		this.setTitle("Add For");
		this.setVisible(true);
		this.setBounds(10, 10, 370, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
	}

	public void updateFor() {
		container.removeAll();
		container.add(toolBar);

		ArrayList<MyFor> myFor = app.getAllFor();
		ArrayList<MyTasks> myTasks = app.getTasks();
		ArrayList<MyParts> myParts = app.getParts();
		MyFor[] beforeFor = new MyFor[myFor.size()];
		Integer[] afterMyPart = new Integer[myParts.size()];
		Integer[] afterMyTask = new Integer[myTasks.size()];
		for (int i = 0; i < myFor.size(); i++) {
			beforeFor[i] = myFor.get(i);
		}
		for (int i = 0; i < myParts.size(); i++) {
			afterMyPart[i] = myParts.get(i).getPartNumber();
		}
		for (int i = 0; i < myTasks.size(); i++) {
			afterMyTask[i] = myTasks.get(i).getID();
		}

		JLabel beforePartNumberLabel = new JLabel("BeforePartNumber");
		JComboBox<MyFor> beforePartNumberChooser = new JComboBox<MyFor>(beforeFor);

		JLabel afterPartNumberLabel = new JLabel("AfterPartNumber");
		JComboBox<Integer> afterPartNumberChooser = new JComboBox<Integer>(afterMyPart);

		JLabel afterTaskLabel = new JLabel("AfterTaskID");
		JComboBox<Integer> afterTaskChooser = new JComboBox<Integer>(afterMyTask);

		JButton addButton = new JButton("UPDATE");

		beforePartNumberLabel.setBounds(25, 50, 150, 30);
		beforePartNumberChooser.setBounds(100, 50, 150, 30);

		afterPartNumberLabel.setBounds(25, 100, 150, 30);
		afterPartNumberChooser.setBounds(100, 100, 150, 60);

		afterTaskLabel.setBounds(25, 150, 150, 30);
		afterTaskChooser.setBounds(100, 150, 150, 60);

		addButton.setBounds(100, 450, 100, 100);

		beforePartNumberChooser.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});

		afterPartNumberChooser.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});

		afterTaskChooser.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});

		addButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				try {
					Integer BeforePartNumber = ((MyFor) beforePartNumberChooser.getSelectedItem()).getPartNumber();
					Integer BeforeTaskID = ((MyFor) beforePartNumberChooser.getSelectedItem()).getTaskID();
					Integer AfterPartNumber = (Integer) afterPartNumberChooser.getSelectedItem();
					Integer AfterTaskID = (Integer) afterTaskChooser.getSelectedItem();
					if (BeforePartNumber != null && BeforeTaskID != null && AfterPartNumber != null
							&& AfterTaskID != null
							&& (!BeforePartNumber.equals(AfterPartNumber) && !BeforeTaskID.equals(AfterTaskID))) {
						app.UpdateFor(BeforePartNumber, BeforeTaskID, AfterPartNumber, AfterTaskID);
					} else {
						JOptionPane.showMessageDialog(null, "The Fields are incorrect");
					}
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Fields are incorrect");
				}
			}
		});

		container.add(beforePartNumberLabel);
		container.add(beforePartNumberChooser);

		container.add(afterPartNumberLabel);
		container.add(afterPartNumberChooser);

		container.add(afterTaskLabel);
		container.add(afterTaskChooser);

		container.add(addButton);

		this.setTitle("Update For");
		this.setVisible(true);
		this.setBounds(10, 10, 370, 700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
	}

	public void deleteFor() {
		container.removeAll();
		container.add(toolBar);

		ArrayList<MyFor> myFor = app.getAllFor();
		Integer[] partNumbers = new Integer[myFor.size()];
		Integer[] taskNumbers = new Integer[myFor.size()];
		for (int i = 0; i < myFor.size(); i++) {
			taskNumbers[i] = myFor.get(i).getTaskID();
			partNumbers[i] = myFor.get(i).getPartNumber();
		}

		// Set up
		JLabel partNumberLabel = new JLabel("PartNumber");
		JComboBox<Integer> partNumberChooser = new JComboBox<Integer>(partNumbers);

		JLabel taskNumberLabel = new JLabel("TaskNumber");
		JComboBox<Integer> taskNumberChooser = new JComboBox<Integer>(taskNumbers);

		JButton deleteButton = new JButton("DELETE");

		partNumberLabel.setBounds(25, 50, 150, 30);
		partNumberChooser.setBounds(100, 50, 150, 30);

		taskNumberLabel.setBounds(25, 50, 150, 30);
		taskNumberChooser.setBounds(100, 50, 150, 30);

		deleteButton.setBounds(100, 350, 150, 30);

		partNumberChooser.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub

			}

		});

		taskNumberChooser.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub

			}

		});

		deleteButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Integer partNumber = (Integer) partNumberChooser.getSelectedItem();
				Integer taskID = (Integer) taskNumberChooser.getSelectedItem();
				if (partNumber != null && taskID != null) {
					app.deleteFor(partNumber, taskID);
				} else {
					JOptionPane.showMessageDialog(null, "Fields are incorrect");
				}

			}

		});
		container.add(partNumberLabel);
		container.add(partNumberChooser);
		container.add(taskNumberLabel);
		container.add(taskNumberChooser);
		container.add(deleteButton);

		this.setTitle("Delete For");
		this.setVisible(true);
		this.setBounds(10, 10, 370, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
	}

	public void readAllFor() {
		container.removeAll();
		container.add(toolBar);
		JScrollPane myPane = new JScrollPane();

		ArrayList<MyFor> myFors = app.getAllFor();
		JTable myTable = new JTable();
		DefaultTableModel myModel = new DefaultTableModel();
		String[] myColumns = { "PartNumber", "TaskID" };
		myTable.setModel(myModel);
		myModel.setColumnIdentifiers(myColumns);
		myPane.setViewportView(myTable);
		Object[] myRow = new Object[2];
		for (int i = 0; i < myFors.size(); i++) {
			myRow[0] = myFors.get(i).getPartNumber();
			myRow[1] = myFors.get(i).getTaskID();
			myModel.addRow(myRow);
		}
		myTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

		for (int i = 0; i < myRow.length; i++) {
			myTable.getColumnModel().getColumn(i).setPreferredWidth(100);
		}
		myPane.setBounds(30, 30, 200, 300);
		container.add(myPane);

		this.setTitle("Read For");
		this.setBounds(10, 10, 680, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
	}

	public void addHas() {
		container.removeAll();
		container.add(toolBar);

		ArrayList<MyVehicles> myVehicles = app.getAllVehicles();
		ArrayList<MyRepairs> myRepairs = app.getRepairs();
		ArrayList<MyTasks> myTasks = app.getTasks();

		String[] myVins = new String[myVehicles.size()];
		Integer[] repairIds = new Integer[myRepairs.size()];
		Integer[] taskIds = new Integer[myTasks.size()];

		for (int i = 0; i < myVehicles.size(); i++) {
			myVins[i] = myVehicles.get(i).getVin();
		}
		for (int i = 0; i < myRepairs.size(); i++) {
			repairIds[i] = myRepairs.get(i).getID();
		}
		for (int i = 0; i < myTasks.size(); i++) {
			taskIds[i] = myTasks.get(i).getID();
		}

		// Set up
		JLabel vinLabel = new JLabel("VIN");
		JComboBox<String> vinChooser = new JComboBox<String>();

		JLabel repairIdLabel = new JLabel("RepairID");
		JComboBox<Integer> repairIdChooser = new JComboBox<Integer>();

		JLabel taskIdLabel = new JLabel("TaskID");
		JComboBox<Integer> taskIdChooser = new JComboBox<Integer>();

		JButton addButton = new JButton("ADD");

		// BOUNDS
		vinLabel.setBounds(25, 50, 150, 30);
		vinChooser.setBounds(100, 50, 150, 30);

		repairIdLabel.setBounds(25, 100, 150, 30);
		repairIdChooser.setBounds(100, 100, 150, 30);

		taskIdLabel.setBounds(25, 150, 150, 30);
		taskIdChooser.setBounds(100, 150, 150, 30);

		addButton.setBounds(100, 400, 100, 100);

		vinChooser.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub

			}

		});
		repairIdChooser.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub

			}

		});

		taskIdChooser.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub

			}

		});

		addButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				try {
					String VIN = (String) vinChooser.getSelectedItem();
					Integer RepairID = (Integer) repairIdChooser.getSelectedItem();
					Integer TaskID = (Integer) taskIdChooser.getSelectedItem();

					if (VIN.length() != 0 && RepairID != null && TaskID != null) {
						app.addHas(RepairID, VIN, TaskID);
					} else {
						JOptionPane.showMessageDialog(null, "The Fields are incorrect");
					}
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Fields are incorrect");
				}
			}
		});
		container.add(vinLabel);
		container.add(vinChooser);

		container.add(repairIdLabel);
		container.add(repairIdChooser);

		container.add(taskIdLabel);
		container.add(taskIdChooser);

		container.add(addButton);

		this.setTitle("Add Has");
		this.setVisible(true);
		this.setBounds(10, 10, 370, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
	}

	public void updateHas() {
		container.removeAll();
		container.add(toolBar);

		ArrayList<MyHas> myHas = app.getAllHas();
		ArrayList<MyVehicles> myVehicles = app.getAllVehicles();
		ArrayList<MyRepairs> myRepairs = app.getRepairs();
		ArrayList<MyTasks> myTasks = app.getTasks();

		MyHas[] beforeHas = new MyHas[myHas.size()];
		String[] afterVehicle = new String[myVehicles.size()];
		Integer[] afterRepair = new Integer[myRepairs.size()];
		Integer[] afterTask = new Integer[myTasks.size()];

		for (int i = 0; i < myHas.size(); i++) {
			beforeHas[i] = myHas.get(i);
		}
		for (int i = 0; i < myVehicles.size(); i++) {
			afterVehicle[i] = myVehicles.get(i).getVin();
		}
		for (int i = 0; i < myRepairs.size(); i++) {
			afterRepair[i] = myRepairs.get(i).getID();
		}
		for (int i = 0; i < myTasks.size(); i++) {
			afterTask[i] = myTasks.get(i).getID();
		}

		JLabel beforePartNumberLabel = new JLabel("BeforeHas");
		JComboBox<MyHas> beforePartNumberChooser = new JComboBox<MyHas>(beforeHas);

		JLabel afterVehicleVIN = new JLabel("AftterVehicleVIN");
		JComboBox<String> afterVehicleVinchooser = new JComboBox<String>(afterVehicle);

		JLabel afterRepairLabel = new JLabel("AfterRepairID");
		JComboBox<Integer> afterRepairChooser = new JComboBox<Integer>(afterRepair);

		JLabel afterTaskLabel = new JLabel("AfterTaskID");
		JComboBox<Integer> afterTaskChooser = new JComboBox<Integer>(afterTask);

		JButton addButton = new JButton("UPDATE");

		beforePartNumberLabel.setBounds(25, 50, 150, 30);
		beforePartNumberChooser.setBounds(100, 50, 150, 30);

		afterVehicleVIN.setBounds(25, 100, 150, 30);
		afterVehicleVinchooser.setBounds(100, 100, 150, 60);

		afterRepairLabel.setBounds(25, 150, 150, 30);
		afterRepairChooser.setBounds(100, 150, 150, 60);

		afterTaskLabel.setBounds(25, 200, 150, 30);
		afterTaskChooser.setBounds(100, 200, 150, 60);

		addButton.setBounds(100, 450, 100, 100);

		beforePartNumberChooser.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});

		afterVehicleVinchooser.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});

		afterTaskChooser.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});
		afterRepairChooser.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});

		addButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				try {
					String BeforeVehicleVIN = ((MyHas) beforePartNumberChooser.getSelectedItem()).getVehicleVin();
					Integer BeforeRepairID = ((MyHas) beforePartNumberChooser.getSelectedItem()).getRepairID();
					Integer BeforeTaskID = ((MyHas) beforePartNumberChooser.getSelectedItem()).getTaskID();
					String AfterVehicleVIN = (String) afterVehicleVinchooser.getSelectedItem();
					Integer AfterRepairID = (Integer) afterRepairChooser.getSelectedItem();
					Integer AfterTaskID = (Integer) afterTaskChooser.getSelectedItem();
					if (BeforeRepairID != null && BeforeTaskID != null && AfterRepairID != null && AfterTaskID != null
							&& BeforeVehicleVIN.length() != 0 && AfterVehicleVIN.length() != 0) {
						app.updateHas(BeforeRepairID, BeforeVehicleVIN, BeforeTaskID, AfterRepairID, AfterVehicleVIN,
								AfterTaskID);
					} else {
						JOptionPane.showMessageDialog(null, "The Fields are incorrect");
					}
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Fields are incorrect");
				}
			}
		});

		container.add(beforePartNumberLabel);
		container.add(beforePartNumberChooser);

		container.add(afterVehicleVinchooser);
		container.add(afterVehicleVIN);

		container.add(afterRepairChooser);
		container.add(afterRepairLabel);

		container.add(afterTaskLabel);
		container.add(afterTaskChooser);

		container.add(addButton);

		this.setTitle("Update Has");
		this.setVisible(true);
		this.setBounds(10, 10, 370, 700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
	}

	public void deleteHas() {
		container.removeAll();
		container.add(toolBar);

		ArrayList<MyHas> myHas = app.getAllHas();
		MyHas[] myListHas = new MyHas[myHas.size()];
		for (int i = 0; i < myHas.size(); i++) {
			myListHas[i] = myHas.get(i);
		}

		// Set up
		JLabel myHasLabel = new JLabel("Has");
		JComboBox<MyHas> myHasChooser = new JComboBox<MyHas>(myListHas);

		JButton deleteButton = new JButton("DELETE");

		myHasLabel.setBounds(25, 50, 150, 30);
		myHasChooser.setBounds(100, 50, 150, 30);

		deleteButton.setBounds(100, 350, 150, 30);

		myHasChooser.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub

			}

		});

		deleteButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String VIN = ((MyHas) myHasChooser.getSelectedItem()).getVehicleVin();
				Integer RepairID = ((MyHas) myHasChooser.getSelectedItem()).getRepairID();
				Integer TaskID = ((MyHas) myHasChooser.getSelectedItem()).getTaskID();
				if (VIN.length() != 0 && RepairID != null && TaskID != null) {
					app.deleteHas(VIN, RepairID, TaskID);
				} else {
					JOptionPane.showMessageDialog(null, "Fields are incorrect");
				}

			}

		});
		container.add(myHasLabel);
		container.add(myHasChooser);
		container.add(deleteButton);

		this.setTitle("Delete Has");
		this.setVisible(true);
		this.setBounds(10, 10, 370, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
	}

	public void readAllHas() {
		container.removeAll();
		container.add(toolBar);
		JScrollPane myPane = new JScrollPane();

		ArrayList<MyHas> myHas = app.getAllHas();
		JTable myTable = new JTable();
		DefaultTableModel myModel = new DefaultTableModel();
		String[] myColumns = { "VehicleVIN", "RepairID", "TaskID" };
		myTable.setModel(myModel);
		myModel.setColumnIdentifiers(myColumns);
		myPane.setViewportView(myTable);
		Object[] myRow = new Object[3];
		for (int i = 0; i < myHas.size(); i++) {
			myRow[0] = myHas.get(i).getVehicleVin();
			myRow[1] = myHas.get(i).getRepairID();
			myRow[2] = myHas.get(i).getTaskID();
			myModel.addRow(myRow);
		}
		myTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

		for (int i = 0; i < myRow.length; i++) {
			myTable.getColumnModel().getColumn(i).setPreferredWidth(100);
		}
		myPane.setBounds(30, 30, 300, 300);
		container.add(myPane);

		this.setTitle("Read Has");
		this.setBounds(10, 10, 680, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
	}

	public void addPaidBy() {
		container.removeAll();
		container.add(toolBar);

		ArrayList<MyVehicles> myVehicles = app.getAllVehicles();
		ArrayList<MyRepairs> myRepairs = app.getRepairs();
		ArrayList<MyCustomer> myCustomers = app.getCustomers();

		String[] myVins = new String[myVehicles.size()];
		Integer[] repairIds = new Integer[myRepairs.size()];
		String[] customerUsrenames = new String[myCustomers.size()];

		for (int i = 0; i < myVehicles.size(); i++) {
			myVins[i] = myVehicles.get(i).getVin();
		}
		for (int i = 0; i < myRepairs.size(); i++) {
			repairIds[i] = myRepairs.get(i).getID();
		}
		for (int i = 0; i < myCustomers.size(); i++) {
			customerUsrenames[i] = myCustomers.get(i).getusername();
		}

		// Set up
		JLabel vinLabel = new JLabel("VehicleVIN");
		JComboBox<String> vinChooser = new JComboBox<String>(myVins);

		JLabel repairIdLabel = new JLabel("RepairID");
		JComboBox<Integer> repairIdChooser = new JComboBox<Integer>(repairIds);

		JLabel customerLabel = new JLabel("CustomerUsername");
		JComboBox<String> customerChooser = new JComboBox<String>(customerUsrenames);

		JLabel receiptLabel = new JLabel("Receipt");
		JTextField receiptChooser = new JTextField();

		JButton addButton = new JButton("ADD");

		// BOUNDS
		vinLabel.setBounds(25, 50, 150, 30);
		vinChooser.setBounds(100, 50, 150, 30);

		repairIdLabel.setBounds(25, 100, 150, 30);
		repairIdChooser.setBounds(100, 100, 150, 30);

		customerLabel.setBounds(25, 150, 150, 30);
		customerChooser.setBounds(100, 150, 150, 30);

		receiptLabel.setBounds(25, 200, 150, 30);
		receiptChooser.setBounds(100, 200, 150, 30);

		addButton.setBounds(100, 400, 100, 100);

		vinChooser.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub

			}

		});
		repairIdChooser.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub

			}

		});

		customerChooser.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub

			}

		});

		addButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				try {
					String VIN = (String) vinChooser.getSelectedItem();
					Integer RepairID = (Integer) repairIdChooser.getSelectedItem();
					String CustomerUserName = (String) customerChooser.getSelectedItem();
					String Receipt = receiptChooser.getText();

					if (VIN.length() != 0 && RepairID != null && CustomerUserName != null && Receipt.length() != 0) {
						app.addPaidBy(VIN, RepairID, CustomerUserName, Receipt);
					} else {
						JOptionPane.showMessageDialog(null, "The Fields are incorrect");
					}
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Fields are incorrect");
				}
			}
		});
		container.add(vinLabel);
		container.add(vinChooser);

		container.add(repairIdLabel);
		container.add(repairIdChooser);

		container.add(customerLabel);
		container.add(customerChooser);

		container.add(receiptLabel);
		container.add(receiptChooser);

		container.add(addButton);

		this.setTitle("Add PaidBy");
		this.setVisible(true);
		this.setBounds(10, 10, 370, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
	}

	public void updatePaidBy() {
		container.removeAll();
		container.add(toolBar);

		ArrayList<MyPaidBy> myPaidBy = app.getPaidBy();
		ArrayList<MyVehicles> myVehicles = app.getAllVehicles();
		ArrayList<MyRepairs> myRepairs = app.getRepairs();
		ArrayList<MyCustomer> myCustomers = app.getCustomers();

		MyPaidBy[] beforePaidBy = new MyPaidBy[myPaidBy.size()];
		String[] afterVehicle = new String[myVehicles.size()];
		Integer[] afterRepair = new Integer[myRepairs.size()];
		String[] afterCustomerUserName = new String[myCustomers.size()];

		for (int i = 0; i < myPaidBy.size(); i++) {
			beforePaidBy[i] = myPaidBy.get(i);
		}
		for (int i = 0; i < myVehicles.size(); i++) {
			afterVehicle[i] = myVehicles.get(i).getVin();
		}
		for (int i = 0; i < myRepairs.size(); i++) {
			afterRepair[i] = myRepairs.get(i).getID();
		}
		for (int i = 0; i < myCustomers.size(); i++) {
			afterCustomerUserName[i] = myCustomers.get(i).getusername();
		}

		JLabel beforePartNumberLabel = new JLabel("BeforePaidBy");
		JComboBox<MyPaidBy> beforePartNumberChooser = new JComboBox<MyPaidBy>(beforePaidBy);

		JLabel afterVehicleVIN = new JLabel("AftterVehicleVIN");
		JComboBox<String> afterVehicleVinchooser = new JComboBox<String>(afterVehicle);

		JLabel afterRepairLabel = new JLabel("AfterRepairID");
		JComboBox<Integer> afterRepairChooser = new JComboBox<Integer>(afterRepair);

		JLabel afterTaskLabel = new JLabel("AfterCustomerUserName");
		JComboBox<String> afterCustomerChooser = new JComboBox<String>(afterCustomerUserName);

		JLabel afterReceiptLabel = new JLabel("AfterReceipt");
		JTextField afterReceiptChooser = new JTextField();

		JButton addButton = new JButton("UPDATE");

		beforePartNumberLabel.setBounds(25, 50, 150, 30);
		beforePartNumberChooser.setBounds(100, 50, 150, 30);

		afterVehicleVIN.setBounds(25, 100, 150, 30);
		afterVehicleVinchooser.setBounds(100, 100, 150, 60);

		afterRepairLabel.setBounds(25, 150, 150, 30);
		afterRepairChooser.setBounds(100, 150, 150, 60);

		afterTaskLabel.setBounds(25, 200, 150, 30);
		afterCustomerChooser.setBounds(100, 200, 150, 60);

		afterReceiptLabel.setBounds(25, 250, 150, 30);
		afterReceiptChooser.setBounds(100, 250, 150, 60);

		addButton.setBounds(100, 450, 100, 100);

		beforePartNumberChooser.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});

		afterVehicleVinchooser.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});

		afterCustomerChooser.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});
		afterRepairChooser.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});

		addButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				try {
					String BeforeVehicleVIN = ((MyPaidBy) beforePartNumberChooser.getSelectedItem()).getVehicleVIN();
					Integer BeforeRepairID = ((MyPaidBy) beforePartNumberChooser.getSelectedItem()).getRepairID();
					String BeforeCustomer = ((MyPaidBy) beforePartNumberChooser.getSelectedItem()).getCustomerName();
					String BeforeReceipt = ((MyPaidBy) beforePartNumberChooser.getSelectedItem()).getReceipt();
					String AfterVehicleVIN = (String) afterVehicleVinchooser.getSelectedItem();
					Integer AfterRepairID = (Integer) afterRepairChooser.getSelectedItem();
					String AfterCustomer = (String) afterCustomerChooser.getSelectedItem();
					String AfterReceipt = (String) afterReceiptChooser.getText();
					if (BeforeRepairID != null && AfterRepairID != null && BeforeVehicleVIN.length() != 0
							&& BeforeCustomer.length() != 0 && AfterVehicleVIN.length() != 0
							&& AfterCustomer.length() != 0 && AfterReceipt.length() != 0
							&& BeforeVehicleVIN.length() != 0 && AfterVehicleVIN.length() != 0) {
						app.updatePaidBy(BeforeVehicleVIN, BeforeRepairID, BeforeCustomer, BeforeReceipt,
								AfterVehicleVIN, AfterRepairID, AfterCustomer, AfterReceipt);
					} else {
						JOptionPane.showMessageDialog(null, "The Fields are incorrect");
					}
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Fields are incorrect");
				}
			}
		});

		container.add(beforePartNumberLabel);
		container.add(beforePartNumberChooser);

		container.add(afterVehicleVIN);
		container.add(afterVehicleVinchooser);

		container.add(afterRepairChooser);
		container.add(afterRepairLabel);

		container.add(afterTaskLabel);
		container.add(afterCustomerChooser);

		container.add(afterReceiptLabel);
		container.add(afterReceiptChooser);

		container.add(addButton);

		this.setTitle("Update MyPaidBy");
		this.setVisible(true);
		this.setBounds(10, 10, 370, 700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
	}

	public void deletePaidBy() {
		container.removeAll();
		container.add(toolBar);

		ArrayList<MyPaidBy> myPaidBy = app.getPaidBy();
		MyPaidBy[] myListPaidBy = new MyPaidBy[myPaidBy.size()];
		for (int i = 0; i < myPaidBy.size(); i++) {
			myListPaidBy[i] = myPaidBy.get(i);
		}

		// Set up
		JLabel myPaidByLabel = new JLabel("PaidBy");
		JComboBox<MyPaidBy> paidByChooser = new JComboBox<MyPaidBy>(myListPaidBy);

		JButton deleteButton = new JButton("DELETE");

		myPaidByLabel.setBounds(25, 50, 150, 30);
		paidByChooser.setBounds(100, 50, 150, 30);

		deleteButton.setBounds(100, 350, 150, 30);

		paidByChooser.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub

			}

		});

		deleteButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String VIN = ((MyPaidBy) paidByChooser.getSelectedItem()).getVehicleVIN();
				Integer RepairID = ((MyPaidBy) paidByChooser.getSelectedItem()).getRepairID();
				String CustomerUserName = ((MyPaidBy) paidByChooser.getSelectedItem()).getCustomerName();
				String Receipt = ((MyPaidBy) paidByChooser.getSelectedItem()).getReceipt();
				if (VIN.length() != 0 && RepairID != null && CustomerUserName.length() != 0 && Receipt.length() != 0) {
					app.deletePaidBy(VIN, RepairID, CustomerUserName);
				} else {
					JOptionPane.showMessageDialog(null, "Fields are incorrect");
				}

			}

		});
		container.add(myPaidByLabel);
		container.add(paidByChooser);
		container.add(deleteButton);

		this.setTitle("Delete PaidBy");
		this.setVisible(true);
		this.setBounds(10, 10, 370, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
	}

	public void readPaidBy() {
		container.removeAll();
		container.add(toolBar);
		JScrollPane myPane = new JScrollPane();

		ArrayList<MyPaidBy> myPaidBy = app.getPaidBy();
		JTable myTable = new JTable();
		DefaultTableModel myModel = new DefaultTableModel();
		String[] myColumns = { "VehicleVIN", "RepairID", "CustomerUserName", "Receipt" };
		myTable.setModel(myModel);
		myModel.setColumnIdentifiers(myColumns);
		myPane.setViewportView(myTable);
		Object[] myRow = new Object[3];
		for (int i = 0; i < myPaidBy.size(); i++) {
			myRow[0] = myPaidBy.get(i).getVehicleVIN();
			myRow[1] = myPaidBy.get(i).getRepairID();
			myRow[2] = myPaidBy.get(i).getCustomerName();
			myRow[3] = myPaidBy.get(i).getReceipt();
			myModel.addRow(myRow);
		}
		myTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

		for (int i = 0; i < myRow.length; i++) {
			myTable.getColumnModel().getColumn(i).setPreferredWidth(100);
		}
		myPane.setBounds(30, 30, 400, 300);
		container.add(myPane);

		this.setTitle("Read PaidBy");
		this.setBounds(10, 10, 680, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
	}

	public void addPaidFor() {
		container.removeAll();
		container.add(toolBar);

		ArrayList<MyVehicles> myVehicles = app.getAllVehicles();
		ArrayList<MyRepairs> myRepairs = app.getRepairs();
		ArrayList<MyInsurance> myInsurance = app.getInsurance();

		String[] myVins = new String[myVehicles.size()];
		Integer[] repairIds = new Integer[myRepairs.size()];
		String[] claimNumbers = new String[myInsurance.size()];

		for (int i = 0; i < myVehicles.size(); i++) {
			myVins[i] = myVehicles.get(i).getVin();
		}
		for (int i = 0; i < myRepairs.size(); i++) {
			repairIds[i] = myRepairs.get(i).getID();
		}
		for (int i = 0; i < myInsurance.size(); i++) {
			claimNumbers[i] = myInsurance.get(i).getClaimNumber();
		}

		// Set up
		JLabel vinLabel = new JLabel("VehicleVIN");
		JComboBox<String> vinChooser = new JComboBox<String>(myVins);

		JLabel repairIdLabel = new JLabel("RepairID");
		JComboBox<Integer> repairIdChooser = new JComboBox<Integer>(repairIds);

		JLabel customerLabel = new JLabel("InsuranceClaimNumber");
		JComboBox<String> customerChooser = new JComboBox<String>(claimNumbers);

		JLabel receiptLabel = new JLabel("Receipt");
		JTextField receiptChooser = new JTextField();

		JButton addButton = new JButton("ADD");

		// BOUNDS
		vinLabel.setBounds(25, 50, 150, 30);
		vinChooser.setBounds(100, 50, 150, 30);

		repairIdLabel.setBounds(25, 100, 150, 30);
		repairIdChooser.setBounds(100, 100, 150, 30);

		customerLabel.setBounds(25, 150, 150, 30);
		customerChooser.setBounds(100, 150, 150, 30);

		receiptLabel.setBounds(25, 200, 150, 30);
		receiptChooser.setBounds(100, 200, 150, 30);

		addButton.setBounds(100, 400, 100, 100);

		vinChooser.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub

			}

		});
		repairIdChooser.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub

			}

		});

		customerChooser.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub

			}

		});

		addButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				try {
					String VIN = (String) vinChooser.getSelectedItem();
					Integer RepairID = (Integer) repairIdChooser.getSelectedItem();
					String InsuranceClaimNumber = (String) customerChooser.getSelectedItem();
					String Receipt = receiptChooser.getText();

					if (VIN.length() != 0 && RepairID != null && InsuranceClaimNumber != null
							&& Receipt.length() != 0) {
						app.addPaidFor(VIN, RepairID, InsuranceClaimNumber, Receipt);
					} else {
						JOptionPane.showMessageDialog(null, "The Fields are incorrect");
					}
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Fields are incorrect");
				}
			}
		});
		container.add(vinLabel);
		container.add(vinChooser);

		container.add(repairIdLabel);
		container.add(repairIdChooser);

		container.add(customerLabel);
		container.add(customerChooser);

		container.add(receiptLabel);
		container.add(receiptChooser);

		container.add(addButton);

		this.setTitle("Add PaidFor");
		this.setVisible(true);
		this.setBounds(10, 10, 370, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
	}

	public void updatePaidFor() {
		container.removeAll();
		container.add(toolBar);

		ArrayList<MyPaidFor> myPaidBy = app.getPaidFor();
		ArrayList<MyVehicles> myVehicles = app.getAllVehicles();
		ArrayList<MyRepairs> myRepairs = app.getRepairs();
		ArrayList<MyInsurance> myInsurance = app.getInsurance();

		MyPaidFor[] beforePaidBy = new MyPaidFor[myPaidBy.size()];
		String[] afterVehicle = new String[myVehicles.size()];
		Integer[] afterRepair = new Integer[myRepairs.size()];
		String[] afterInsuranceClaimNumber = new String[myInsurance.size()];

		for (int i = 0; i < myPaidBy.size(); i++) {
			beforePaidBy[i] = myPaidBy.get(i);
		}
		for (int i = 0; i < myVehicles.size(); i++) {
			afterVehicle[i] = myVehicles.get(i).getVin();
		}
		for (int i = 0; i < myRepairs.size(); i++) {
			afterRepair[i] = myRepairs.get(i).getID();
		}
		for (int i = 0; i < myInsurance.size(); i++) {
			afterInsuranceClaimNumber[i] = myInsurance.get(i).getClaimNumber();
		}

		JLabel beforePartNumberLabel = new JLabel("BeforePaidFor");
		JComboBox<MyPaidFor> beforePartNumberChooser = new JComboBox<MyPaidFor>(beforePaidBy);

		JLabel afterVehicleVIN = new JLabel("AftterVehicleVIN");
		JComboBox<String> afterVehicleVinchooser = new JComboBox<String>(afterVehicle);

		JLabel afterRepairLabel = new JLabel("AfterRepairID");
		JComboBox<Integer> afterRepairChooser = new JComboBox<Integer>(afterRepair);

		JLabel afterTaskLabel = new JLabel("AfterInsuranceCN");
		JComboBox<String> afterCustomerChooser = new JComboBox<String>(afterInsuranceClaimNumber);

		JLabel afterReceiptLabel = new JLabel("AfterReceipt");
		JTextField afterReceiptChooser = new JTextField();

		JButton addButton = new JButton("UPDATE");

		beforePartNumberLabel.setBounds(25, 50, 150, 30);
		beforePartNumberChooser.setBounds(100, 50, 150, 30);

		afterVehicleVIN.setBounds(25, 100, 150, 30);
		afterVehicleVinchooser.setBounds(100, 100, 150, 60);

		afterRepairLabel.setBounds(25, 150, 150, 30);
		afterRepairChooser.setBounds(100, 150, 150, 60);

		afterTaskLabel.setBounds(25, 200, 150, 30);
		afterCustomerChooser.setBounds(100, 200, 150, 60);

		afterReceiptLabel.setBounds(25, 250, 150, 30);
		afterReceiptChooser.setBounds(100, 250, 150, 60);

		addButton.setBounds(100, 450, 100, 100);

		beforePartNumberChooser.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});

		afterVehicleVinchooser.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});

		afterCustomerChooser.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});
		afterRepairChooser.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});

		addButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				try {
					String BeforeVehicleVIN = ((MyPaidFor) beforePartNumberChooser.getSelectedItem()).getVehicleVIN();
					Integer BeforeRepairID = ((MyPaidFor) beforePartNumberChooser.getSelectedItem()).getRepairID();
					String BeforeInsuranceClaimNumber = ((MyPaidFor) beforePartNumberChooser.getSelectedItem())
							.getInsuranceClaimNumber();
					String BeforeReceipt = ((MyPaidFor) beforePartNumberChooser.getSelectedItem()).getReceipt();
					String AfterVehicleVIN = (String) afterVehicleVinchooser.getSelectedItem();
					Integer AfterRepairID = (Integer) afterRepairChooser.getSelectedItem();
					String AfterInsuranceClaimNumber = (String) afterCustomerChooser.getSelectedItem();
					String AfterReceipt = (String) afterReceiptChooser.getText();
					if (BeforeRepairID != null && AfterRepairID != null && BeforeVehicleVIN.length() != 0
							&& BeforeInsuranceClaimNumber.length() != 0 && AfterVehicleVIN.length() != 0
							&& AfterInsuranceClaimNumber.length() != 0 && AfterReceipt.length() != 0
							&& BeforeVehicleVIN.length() != 0 && AfterVehicleVIN.length() != 0) {
						app.updatePaidFor(BeforeVehicleVIN, BeforeRepairID, BeforeInsuranceClaimNumber, BeforeReceipt,
								AfterVehicleVIN, AfterRepairID, AfterInsuranceClaimNumber, AfterReceipt);
					} else {
						JOptionPane.showMessageDialog(null, "The Fields are incorrect");
					}
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Fields are incorrect");
				}
			}
		});

		container.add(beforePartNumberLabel);
		container.add(beforePartNumberChooser);

		container.add(afterVehicleVIN);
		container.add(afterVehicleVinchooser);

		container.add(afterRepairChooser);
		container.add(afterRepairLabel);

		container.add(afterTaskLabel);
		container.add(afterCustomerChooser);

		container.add(afterReceiptLabel);
		container.add(afterReceiptChooser);

		container.add(addButton);

		this.setTitle("Update MyPaidFor");
		this.setVisible(true);
		this.setBounds(10, 10, 370, 700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
	}

	public void deletePaidFor() {
		container.removeAll();
		container.add(toolBar);

		ArrayList<MyPaidFor> myPaidFor = app.getPaidFor();
		MyPaidFor[] myListPaidFor = new MyPaidFor[myPaidFor.size()];
		for (int i = 0; i < myPaidFor.size(); i++) {
			myListPaidFor[i] = myPaidFor.get(i);
		}
		// Set up
		JLabel myPaidByLabel = new JLabel("PaidFor");
		JComboBox<MyPaidFor> paidByChooser = new JComboBox<MyPaidFor>(myListPaidFor);
		JButton deleteButton = new JButton("DELETE");

		myPaidByLabel.setBounds(25, 50, 150, 30);
		paidByChooser.setBounds(100, 50, 150, 30);

		deleteButton.setBounds(100, 350, 150, 30);

		paidByChooser.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub

			}

		});

		deleteButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String VIN = ((MyPaidFor) paidByChooser.getSelectedItem()).getVehicleVIN();
				Integer RepairID = ((MyPaidFor) paidByChooser.getSelectedItem()).getRepairID();
				String InsuranceClaimNumber = ((MyPaidFor) paidByChooser.getSelectedItem()).getInsuranceClaimNumber();
				String Receipt = ((MyPaidFor) paidByChooser.getSelectedItem()).getReceipt();
				if (VIN.length() != 0 && RepairID != null && InsuranceClaimNumber.length() != 0
						&& Receipt.length() != 0) {
					app.deletePaidFor(VIN, RepairID, InsuranceClaimNumber);
				} else {
					JOptionPane.showMessageDialog(null, "Fields are incorrect");
				}

			}

		});
		container.add(myPaidByLabel);
		container.add(paidByChooser);
		container.add(deleteButton);

		this.setTitle("Delete PaidFor");
		this.setVisible(true);
		this.setBounds(10, 10, 370, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
	}

	public void readPaidFor() {
		container.removeAll();
		container.add(toolBar);
		JScrollPane myPane = new JScrollPane();

		ArrayList<MyPaidFor> myPaidBy = app.getPaidFor();
		JTable myTable = new JTable();
		DefaultTableModel myModel = new DefaultTableModel();
		String[] myColumns = { "VehicleVIN", "RepairID", "InsuranceClaimNumber", "Receipt" };
		myTable.setModel(myModel);
		myModel.setColumnIdentifiers(myColumns);
		myPane.setViewportView(myTable);
		Object[] myRow = new Object[3];
		for (int i = 0; i < myPaidBy.size(); i++) {
			myRow[0] = myPaidBy.get(i).getVehicleVIN();
			myRow[1] = myPaidBy.get(i).getRepairID();
			myRow[2] = myPaidBy.get(i).getInsuranceClaimNumber();
			myRow[3] = myPaidBy.get(i).getReceipt();
			myModel.addRow(myRow);
		}
		myTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

		for (int i = 0; i < myRow.length; i++) {
			myTable.getColumnModel().getColumn(i).setPreferredWidth(100);
		}
		myPane.setBounds(30, 30, 400, 300);
		container.add(myPane);

		this.setTitle("Read PaidFor");
		this.setBounds(10, 10, 680, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
	}

	public static boolean validDate(String date) {
		String[] myDate = date.split("-");
		if (myDate.length != 3) {
			return false;
		}
		try {
			// Test on year
			if (myDate[0].length() != 4 || Integer.parseInt(myDate[0]) >= Calendar.getInstance().get(Calendar.YEAR)) {
				return false;
			}
			// Test on month
			if (Integer.parseInt(myDate[1]) < 1 || Integer.parseInt(myDate[1]) > 12) {
				return false;
			}
			if (Integer.parseInt(myDate[2]) < 1 || Integer.parseInt(myDate[2]) > 31) {
				return false;
			}
		} catch (NumberFormatException e) {
			System.out.println("Invalid Date");
			return false;
		}
		return true;
	}

	public static boolean compareDate(String startdate, String endDate) {

		if (ManagerFrame.validDate(startdate) && ManagerFrame.validDate(endDate)) {
			String[] myStartDate = startdate.split("-");
			String[] myEndDate = endDate.split("-");
			if (Integer.parseInt(myStartDate[0]) < Integer.parseInt(myEndDate[0])) {
				return true;
			} else if (Integer.parseInt(myStartDate[0]) == Integer.parseInt(myEndDate[0])) {
				if (Integer.parseInt(myStartDate[1]) < Integer.parseInt(myEndDate[1])) {
					return true;
				} else if (Integer.parseInt(myStartDate[1]) == Integer.parseInt(myEndDate[1])) {
					if (Integer.parseInt(myStartDate[2]) <= Integer.parseInt(myEndDate[2])) {
						return true;
					} else {
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
