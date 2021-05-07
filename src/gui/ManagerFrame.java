package gui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
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

		if (e.getSource() == addRepair) {
			container.removeAll();
			container.add(toolBar);
			ArrayList<String> vehicleList = app.getVehicles();

			String[] vehicles = new String[vehicleList.size() + 1];
			vehicles[0] = "Select A Vehicle";
			for (int i = 0; i < vehicleList.size(); i++) {
				vehicles[i + 1] = vehicleList.get(i);
			}

			JComboBox<String> vehicleBox = new JComboBox<String>(vehicles);
			JLabel vehicleLabel = new JLabel("Vehicle");

			JTextField startDateField = new JTextField();
			JLabel sDLabel = new JLabel("Start Date");

			JTextField endDateField = new JTextField();
			JLabel eDLabel = new JLabel("End Date");

			JTextField discountField = new JTextField();
			JLabel disLabel = new JLabel("Discount");

			JTextField totalCostField = new JTextField();
			JLabel tCLabel = new JLabel("Total Cost");

			JTextArea descTextBox = new JTextArea();
			JLabel descLabel = new JLabel("Description");

			JButton addButton = new JButton("ADD");

			vehicleLabel.setBounds(25, 50, 150, 30);
			vehicleBox.setBounds(100, 50, 150, 30);

			sDLabel.setBounds(25, 100, 150, 30);
			startDateField.setBounds(100, 100, 150, 30);

			eDLabel.setBounds(25, 150, 150, 30);
			endDateField.setBounds(100, 150, 150, 30);

			disLabel.setBounds(25, 200, 150, 30);
			discountField.setBounds(100, 200, 150, 30);

			tCLabel.setBounds(25, 250, 150, 30);
			totalCostField.setBounds(100, 250, 150, 30);

			descLabel.setBounds(25, 300, 100, 100);
			descTextBox.setBounds(100, 300, 100, 100);

			addButton.setBounds(100, 450, 100, 100);

			vehicleBox.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent arg0) {

				}
			});
			addButton.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent arg0) {
					String vehicle = (String) vehicleBox.getSelectedItem();
					String startDate = startDateField.getText();
					String endDate = endDateField.getText();
					String discount = discountField.getText();
					String totalCost = totalCostField.getText();
					String description = descTextBox.getText();
					app.addRepair(vehicle,startDate, endDate, Integer.parseInt(discount), Integer.parseInt(totalCost),description);

				}
			});

			container.add(vehicleBox);
			container.add(vehicleLabel);

			container.add(startDateField);
			container.add(sDLabel);

			container.add(endDateField);
			container.add(eDLabel);

			container.add(discountField);
			container.add(disLabel);

			container.add(totalCostField);
			container.add(tCLabel);

			container.add(descTextBox);
			container.add(descLabel);

			container.add(addButton);

			this.setTitle("Add Repair");
			this.setVisible(true);
			this.setBounds(10, 10, 370, 600);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setResizable(false);

		}
		if (e.getSource() == updateRepair) {
			// call stored procedure from database
		}
		if (e.getSource() == deleteRepair) {
			// call stored procedure from database
			container.removeAll();
			container.add(toolBar);
			ArrayList<MyRepairs> allRepairs = app.getRepairs();
			Integer[] myRepairIDS = new Integer[allRepairs.size()];
			for(int i = 0; i<allRepairs.size();i++) {
				myRepairIDS[i] = allRepairs.get(i).getID();
			}
			JComboBox<Integer> repairIDS = new JComboBox<Integer>(myRepairIDS);
			JLabel repairIDSLabel = new JLabel("RepairID");
			
			JButton deleteButton = new JButton("DELETE");
			
			repairIDSLabel.setBounds(25, 50, 150, 30);
			repairIDS.setBounds(100, 50, 150, 30);
			deleteButton.setBounds(100, 450, 100, 100);
			
			container.add(repairIDSLabel);
			container.add(repairIDS);
			container.add(deleteButton);
			
			repairIDS.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent arg0) {

				}
			});
			
			
			deleteButton.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent arg0) {
					int repairID = (Integer) repairIDS.getSelectedItem();
					
					try {
					app.deleteRepair(repairID);
					} catch (NumberFormatException e) {
						JOptionPane.showMessageDialog(null, "fields can't be left empty");
					}

				}
			});
			this.setTitle("Delete Repair");
			this.setVisible(true);
			this.setBounds(10, 10, 370, 600);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setResizable(false);
			
		}
		if (e.getSource() == readRepair) {
			container.removeAll();
			container.add(toolBar);
	
			JScrollPane myPane = new JScrollPane();
			
			ArrayList<MyRepairs> myRepairs = app.getRepairs();
			JTable myTable = new JTable();
			DefaultTableModel myModel = new DefaultTableModel();
			String[] myColumns = {"ID","StartDate","EndDate","Description","Discount","TotalCost","VIN"};
			myTable.setModel(myModel);
			myModel.setColumnIdentifiers(myColumns);
			myPane.setViewportView(myTable);
			Object[] myRow = new Object[7];
			for(int i = 0; i<myRepairs.size();i++) {
				myRow[0] = myRepairs.get(i).getID();
				myRow[1] = myRepairs.get(i).getstartDate();
				myRow[2] = myRepairs.get(i).getendDate();
				myRow[3] = myRepairs.get(i).getDescription();
				myRow[4] = myRepairs.get(i).getDiscount();
				myRow[5] = myRepairs.get(i).getTotalCost();
				myRow[6] = myRepairs.get(i).getVIN();
				myModel.addRow(myRow);
			}
			myTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
			myTable.getColumnModel().getColumn(1).setPreferredWidth(130);
			myTable.getColumnModel().getColumn(2).setPreferredWidth(130);
			myTable.getColumnModel().getColumn(6).setPreferredWidth(190);
			myPane.setBounds(30, 30, 540, 300);
			container.add(myPane);
			
			this.setTitle("Read Repair");
			this.setBounds(10, 10, 680, 600);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setResizable(false);
			this.setVisible(true);
		}

		if (e.getSource() == addVehicle) {
			// call stored procedure from database
			container.removeAll();
			container.add(toolBar);
			
			String[] myBodyTypes = {"Sedan","Coupe","SportsCar","StationWagon","Hatchback","Convertible","SUV","Minivan","Pickup"};
			
			JTextField VINTextField = new JTextField();
			JLabel VINLabel = new JLabel("VIN#");

			JTextField yearTextField = new JTextField();
			JLabel yearLabel = new JLabel("Year");

			JTextField modelTextField = new JTextField();
			JLabel modelLabel = new JLabel("Model");

			JTextField mileageTextField = new JTextField();
			JLabel mileageLabel = new JLabel("Mileage");

			JComboBox<String> bodyTypes = new JComboBox<String>(myBodyTypes);
			JLabel bodyTypeLabel = new JLabel("BodyType");


			JButton addButton = new JButton("ADD");

			VINLabel.setBounds(25, 50, 150, 30);
			VINTextField.setBounds(100, 50, 150, 30);

			yearLabel.setBounds(25, 100, 150, 30);
			yearTextField.setBounds(100, 100, 150, 30);

			modelLabel.setBounds(25, 150, 150, 30);
			modelTextField.setBounds(100, 150, 150, 30);

			mileageLabel.setBounds(25, 200, 150, 30);
			mileageTextField.setBounds(100, 200, 150, 30);

			bodyTypeLabel.setBounds(25, 250, 150, 30);
			bodyTypes.setBounds(100, 250, 150, 30);

			addButton.setBounds(100, 450, 100, 100);

			bodyTypes.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent arg0) {

				}
			});
			
		
			addButton.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent arg0) {
					String bodyType = (String) bodyTypes.getSelectedItem();
					String VIN = VINTextField.getText();
					System.out.println(VIN);
					String Year = yearTextField.getText();
					String Model = modelTextField.getText();
					String Mileage = mileageTextField.getText();
					
					try {
					app.addVehicle(VIN, Integer.parseInt(Year), Model, Integer.parseInt(Mileage),bodyType);
					} catch (NumberFormatException e) {
						JOptionPane.showMessageDialog(null, "fields can't be left empty");
					}

				}
			});

			container.add(VINLabel);
			container.add(VINTextField);

			container.add(yearLabel);
			container.add(yearTextField);

			container.add(modelLabel);
			container.add(modelTextField);

			container.add(mileageLabel);
			container.add(mileageTextField);

			container.add(bodyTypeLabel);
			container.add(bodyTypes);

			container.add(addButton);

			this.setTitle("Add Vehicle");
			this.setVisible(true);
			this.setBounds(10, 10, 370, 600);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setResizable(false);
		}
		if (e.getSource() == updateVehicle) {
			// call stored procedure from database
		}
		if (e.getSource() == deleteVehicle) {
			// call stored procedure from database
			container.removeAll();
			container.add(toolBar);
			ArrayList<MyVehicles> myVehicles = app.getAllVehicles();
			String[] allVINS = new String[myVehicles.size()];
			for(int i = 0; i<myVehicles.size();i++) {
				allVINS[i] = (myVehicles.get(i).getVin());
			}
			JComboBox<String> VINNumbers = new JComboBox<String>(allVINS);
			JLabel VINLabel = new JLabel("VIN#");

			JButton deleteButton = new JButton("DELETE");
			
			VINLabel.setBounds(25, 50, 150, 30);
			VINNumbers.setBounds(100, 50, 150, 30);
			deleteButton.setBounds(100, 450, 100, 100);
			
			container.add(VINLabel);
			container.add(VINNumbers);
			container.add(deleteButton);
			
			VINNumbers.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent arg0) {

				}
			});
			
			
			deleteButton.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent arg0) {
					String vinNumber = (String) VINNumbers.getSelectedItem();
					
					try {
					app.deleteVehicle(vinNumber);
					} catch (NumberFormatException e) {
						JOptionPane.showMessageDialog(null, "fields can't be left empty");
					}

				}
			});
			this.setTitle("Delete Vehicle");
			this.setVisible(true);
			this.setBounds(10, 10, 370, 600);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setResizable(false);
		}
		if (e.getSource() == readVehicles) {
			container.removeAll();
			container.add(toolBar);
			JScrollPane myPane = new JScrollPane();
			
			ArrayList<MyVehicles> myVehicles = app.getAllVehicles();
			JTable myTable = new JTable();
			DefaultTableModel myModel = new DefaultTableModel();
			String[] myColumns = {"VIN","Year","Model","Mileage","BodyType"};
			myTable.setModel(myModel);
			myModel.setColumnIdentifiers(myColumns);
			myPane.setViewportView(myTable);
			Object[] myRow = new Object[5];
			for(int i = 0; i<myVehicles.size();i++) {
				myRow[0] = myVehicles.get(i).getVin();
				myRow[1] = myVehicles.get(i).getYear();
				myRow[2] = myVehicles.get(i).getModel();
				myRow[3] = myVehicles.get(i).getMileage();
				myRow[4] = myVehicles.get(i).getBodyType();
				myModel.addRow(myRow);
			}
			myTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
			myTable.getColumnModel().getColumn(0).setPreferredWidth(190);
			myPane.setBounds(30, 30, 500, 300);
			container.add(myPane);
			
			this.setTitle("Read Vehicles");
			this.setBounds(10, 10, 680, 600);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setResizable(false);
			this.setVisible(true);
		}

		
		if (e.getSource() == addTask) {
			// call stored procedure from database
			container.removeAll();
			container.add(toolBar);


			JTextField nameTextField = new JTextField();
			JLabel nameLabel = new JLabel("Name");
			
			JTextField descriptionTextField = new JTextField();
			JLabel descriptionLabel = new JLabel("Description");

			JTextField priceTextField = new JTextField();
			JLabel priceLabel = new JLabel("Price");


			JButton addButton = new JButton("ADD");

			nameLabel.setBounds(25, 50, 150, 30);
			nameTextField.setBounds(100, 50, 150, 30);

			descriptionLabel.setBounds(25, 100, 150, 30);
			descriptionTextField.setBounds(100, 100, 150, 30);

			priceLabel.setBounds(25, 150, 150, 30);
			priceTextField.setBounds(100, 150, 150, 30);

			addButton.setBounds(100, 200, 150, 30);

			addButton.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent arg0) {
					String Name = nameTextField.getText();
					String Description = descriptionTextField.getText();
					String Price = priceTextField.getText();
					int id = new Random().nextInt(999999);
					app.addTask(id,Name, Description, Integer.parseInt(Price));

				}
			});

			container.add(nameLabel);
			container.add(nameTextField);

			container.add(descriptionLabel);
			container.add(descriptionTextField);

			container.add(priceLabel);
			container.add(priceTextField);
			
			container.add(addButton);

			this.setTitle("Add Task");
			this.setVisible(true);
			this.setBounds(10, 10, 370, 600);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setResizable(false);
		}
		if (e.getSource() == updateTask) {
			// call stored procedure from database
		}
		if (e.getSource() == deleteTask) {
			// call stored procedure from database
		}
		if (e.getSource() == readTask) {
			container.removeAll();
			container.add(toolBar);
			JScrollPane myPane = new JScrollPane();
			
			ArrayList<MyTasks> myTasks = app.getTasks();
			JTable myTable = new JTable();
			DefaultTableModel myModel = new DefaultTableModel();
			String[] myColumns = {"ID","Name","Description","Price"};
			myTable.setModel(myModel);
			myModel.setColumnIdentifiers(myColumns);
			myPane.setViewportView(myTable);
			Object[] myRow = new Object[4];
			for(int i = 0; i<myTasks.size();i++) {
				myRow[0] = myTasks.get(i).getID();
				myRow[1] = myTasks.get(i).getName();
				myRow[2] = myTasks.get(i).getDescription();
				myRow[3] = myTasks.get(i).getPrice();
				myModel.addRow(myRow);
			}
			myTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
			myTable.getColumnModel().getColumn(0).setPreferredWidth(55);
			myTable.getColumnModel().getColumn(1).setPreferredWidth(125);
			myTable.getColumnModel().getColumn(2).setPreferredWidth(195);
			myTable.getColumnModel().getColumn(3).setPreferredWidth(125);
			myPane.setBounds(30, 30, 500, 300);
			container.add(myPane);
			
			this.setTitle("Read Task");
			this.setBounds(10, 10, 680, 600);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setResizable(false);
			this.setVisible(true);		
		}

		if (e.getSource() == addPart) {
			// call stored procedure from database
			container.removeAll();
			container.add(toolBar);

			
			JTextField partNumberTextField = new JTextField();
			JLabel partNumberLabel = new JLabel("PartNumber");

			JTextField nameTextField = new JTextField();
			JLabel namelabel = new JLabel("Name");

			JTextField priceTextField = new JTextField();
			JLabel priceLabel = new JLabel("Price");


			JButton addButton = new JButton("ADD");

			partNumberLabel.setBounds(25, 50, 150, 30);
			partNumberTextField.setBounds(100, 50, 150, 30);

			namelabel.setBounds(25, 100, 150, 30);
			nameTextField.setBounds(100, 100, 150, 30);

			priceLabel.setBounds(25, 150, 150, 30);
			priceTextField.setBounds(100, 150, 150, 30);

			addButton.setBounds(100, 200, 150, 30);

			addButton.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent arg0) {
					String PartNumber = partNumberTextField.getText();
					String Name = nameTextField.getText();
					String Price = priceTextField.getText();
					
					app.addPart(Integer.parseInt(PartNumber), Name, Integer.parseInt(Price));

				}
			});

			container.add(partNumberTextField);
			container.add(partNumberLabel);

			container.add(nameTextField);
			container.add(namelabel);

			container.add(priceTextField);
			container.add(priceLabel);
			
			container.add(addButton);

			this.setTitle("Add Part");
			this.setVisible(true);
			this.setBounds(10, 10, 370, 600);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setResizable(false);
		}
		if (e.getSource() == updatePart) {
			// call stored procedure from database
		}
		if (e.getSource() == deletePart) {
			// call stored procedure from database
			container.removeAll();
			container.add(toolBar);
			ArrayList<MyParts> myParts = app.getParts();
			Integer[] allPartNumbers = new Integer[myParts.size()];
			for(int i = 0; i<myParts.size();i++) {
				allPartNumbers[i] = (myParts.get(i).getPartNumber());
			}
			JComboBox<Integer> partNumbers = new JComboBox<Integer>(allPartNumbers);
			JLabel partNumberLabel = new JLabel("PartNumber");

			JButton deleteButton = new JButton("DELETE");
			
			partNumberLabel.setBounds(25, 50, 150, 30);
			partNumbers.setBounds(100, 50, 150, 30);
			deleteButton.setBounds(100, 450, 100, 100);
			
			container.add(partNumberLabel);
			container.add(partNumbers);

			container.add(deleteButton);
			partNumbers.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent arg0) {

				}
			});
			
			
			deleteButton.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent arg0) {
					int partNumber = (int) partNumbers.getSelectedItem();
					
					try {
					app.deletePart(partNumber);
					} catch (NumberFormatException e) {
						JOptionPane.showMessageDialog(null, "fields can't be left empty");
					}

				}
			});
			

			this.setTitle("Delete Part");
			this.setVisible(true);
			this.setBounds(10, 10, 370, 600);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setResizable(false);
		}
		if (e.getSource() == readPart) {
			container.removeAll();
			container.add(toolBar);
			JScrollPane myPane = new JScrollPane();
			
			ArrayList<MyParts> myParts = app.getParts();
			JTable myTable = new JTable();
			DefaultTableModel myModel = new DefaultTableModel();
			String[] myColumns = {"PartNumber","Name","Price"};
			myTable.setModel(myModel);
			myModel.setColumnIdentifiers(myColumns);
			myPane.setViewportView(myTable);
			Object[] myRow = new Object[7];
			for(int i = 0; i<myParts.size();i++) {
				myRow[0] = myParts.get(i).getPartNumber();
				myRow[1] = myParts.get(i).getName();
				myRow[2] = myParts.get(i).getPrice();
				myModel.addRow(myRow);
			}
			myTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
			myTable.getColumnModel().getColumn(1).setPreferredWidth(100);
			myTable.getColumnModel().getColumn(2).setPreferredWidth(100);
			myTable.getColumnModel().getColumn(0).setPreferredWidth(100);
			myPane.setBounds(30, 30, 300, 300);
			container.add(myPane);
			
			this.setTitle("Read Repair");
			this.setBounds(10, 10, 680, 600);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setResizable(false);
			this.setVisible(true);
		}
		if(e.getSource() == addEmployee) {
			container.removeAll();
			container.add(toolBar);
			//ManagerName
			//TaskID
			//EmployeeName
			ArrayList<MyEmployee> myEmployees = app.getEmployees();
			String[] employeeUsernames = new String[myEmployees.size()];
			for(int i = 0; i<myEmployees.size();i++) {
				employeeUsernames[i] = (myEmployees.get(i).getUsername());
			}
			
			ArrayList<MyTasks> myTasks = app.getTasks();
			Integer[] myTasksID = new Integer[myTasks.size()];
			for(int i = 0; i<myTasks.size();i++) {
				myTasksID[i] = (myTasks.get(i).getID());
			}
			//PUT IN MANAGER NAME
			JLabel managerLabel = new JLabel("Manager Username");
			JLabel actualManagerLabel = new JLabel(this.userName);
			
			JComboBox<String> allUsernames = new JComboBox<String>(employeeUsernames);
			JLabel usernameLabel = new JLabel("Employee Username");
			
			JComboBox<Integer> allTasks = new JComboBox<Integer>(myTasksID);
			JLabel tasksLabel = new JLabel("TasksID");
			
			JButton deleteButton = new JButton("ASSIGN");
			
			managerLabel.setBounds(25, 50, 150, 30);
			actualManagerLabel.setBounds(150, 50, 150, 30);
			
			usernameLabel.setBounds(25, 100, 150, 30);
			allUsernames.setBounds(150, 100, 150, 30);
			
			tasksLabel.setBounds(25, 150, 150, 30);
			allTasks.setBounds(150, 150, 150, 30);
			
			deleteButton.setBounds(100, 450, 100, 100);
			
			container.add(usernameLabel);
			container.add(allUsernames);
			container.add(managerLabel);
			container.add(actualManagerLabel);
			container.add(usernameLabel);
			container.add(tasksLabel);
			container.add(allTasks);
			container.add(deleteButton);
			
			allUsernames.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent arg0) {

				}
			});
			
			allTasks.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent arg0) {

				}
			});
			
			
			
			
			deleteButton.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent arg0) {
					String employeeUsername = (String) allUsernames.getSelectedItem();
					int theTaskNumber = (int) allTasks.getSelectedItem();
					
					
					try {
					app.assign(actualManagerLabel.getText(),employeeUsername,theTaskNumber);
					} catch (NumberFormatException e) {
						JOptionPane.showMessageDialog(null, "fields can't be left empty");
					}

				}
			});
			this.setTitle("Delete Employees");
			this.setBounds(10, 10, 680, 600);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setResizable(false);
			this.setVisible(true);
			
		}
		
		
		if(e.getSource() == readEmployee) {
			container.removeAll();
			container.add(toolBar);
			JScrollPane myPane = new JScrollPane();
			
			ArrayList<MyEmployee> myEmployees = app.getEmployees();
			JTable myTable = new JTable();
			DefaultTableModel myModel = new DefaultTableModel();
			String[] myColumns = {"Username"};
			myTable.setModel(myModel);
			myModel.setColumnIdentifiers(myColumns);
			myPane.setViewportView(myTable);
			Object[] myRow = new Object[7];
			for(int i = 0; i<myEmployees.size();i++) {
				myRow[0] = myEmployees.get(i).getUsername();
				myModel.addRow(myRow);
			}
			myTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
			myTable.getColumnModel().getColumn(0).setPreferredWidth(100);
			myPane.setBounds(30, 30, 300, 300);
			container.add(myPane);
			
			this.setTitle("Read Employees");
			this.setBounds(10, 10, 680, 600);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setResizable(false);
			this.setVisible(true);
		}
		
		if(e.getSource() == readAssignments) {
			System.out.println("HOLAAAA");
			container.removeAll();
			container.add(toolBar);
			JScrollPane myPane = new JScrollPane();
			
			ArrayList<MyAssignments> myEmployees = app.getAssignments();
			JTable myTable = new JTable();
			DefaultTableModel myModel = new DefaultTableModel();
			String[] myColumns = {"ManagerUserName","EmployeeUserName","TaskID"};
			myTable.setModel(myModel);
			myModel.setColumnIdentifiers(myColumns);
			myPane.setViewportView(myTable);
			Object[] myRow = new Object[7];
			for(int i = 0; i<myEmployees.size();i++) {
				myRow[0] = myEmployees.get(i).ManagerUserName;
				myRow[1] = myEmployees.get(i).EmployeeUsername;
				myRow[2] = myEmployees.get(i).TaskID;
				myModel.addRow(myRow);
			}
			myTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
			myTable.getColumnModel().getColumn(0).setPreferredWidth(100);
			myPane.setBounds(30, 30, 300, 300);
			container.add(myPane);
			
			this.setTitle("Read Employees");
			this.setBounds(10, 10, 680, 600);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setResizable(false);
			this.setVisible(true);
		}
		
		if(e.getSource() == deleteEmployee) {
			container.removeAll();
			container.add(toolBar);
			
			ArrayList<MyEmployee> myEmployees = app.getEmployees();
			String[] employeeUsernames = new String[myEmployees.size()];
			for(int i = 0; i<myEmployees.size();i++) {
				employeeUsernames[i] = (myEmployees.get(i).getUsername());
			}
			JComboBox<String> allUsernames = new JComboBox<String>(employeeUsernames);
			JLabel usernameLabel = new JLabel("Username");

			JButton deleteButton = new JButton("DELETE");
			
			usernameLabel.setBounds(25, 50, 150, 30);
			allUsernames.setBounds(100, 50, 150, 30);
			deleteButton.setBounds(100, 450, 100, 100);
			
			container.add(usernameLabel);
			container.add(allUsernames);
			container.add(deleteButton);
			
			allUsernames.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent arg0) {

				}
			});
			
			
			deleteButton.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent arg0) {
					String employeeUsername = (String) allUsernames.getSelectedItem();
					
					try {
					app.deleteEmployee(employeeUsername);
					} catch (NumberFormatException e) {
						JOptionPane.showMessageDialog(null, "fields can't be left empty");
					}

				}
			});
			this.setTitle("Delete Employees");
			this.setBounds(10, 10, 680, 600);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setResizable(false);
			this.setVisible(true);
			
		}
		
		
	}
	
}
