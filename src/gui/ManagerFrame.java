package gui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class ManagerFrame extends JFrame implements ActionListener {

	JMenuBar toolBar = new JMenuBar();

	JMenu repairs = new JMenu("Repairs");
	JMenu vehicles = new JMenu("Vehicles");
	JMenu tasks = new JMenu("Tasks");
	JMenu tools = new JMenu("Tools");
	JMenu parts = new JMenu("Parts");

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

	JMenuItem addTool = new JMenuItem("Add Tool");
	JMenuItem updateTool = new JMenuItem("Update Tool");
	JMenuItem deleteTool = new JMenuItem("Delete Tool");
	JMenuItem readTool = new JMenuItem("Read Tool");


	JMenuItem addPart = new JMenuItem("Add Part");
	JMenuItem updatePart = new JMenuItem("Update Part");
	JMenuItem deletePart = new JMenuItem("Delete Part");
	JMenuItem readPart = new JMenuItem("Read Part");

	Container container = getContentPane();
	AppRunner app;

	public ManagerFrame(AppRunner application) {
		this.app = application;
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

		toolBar.add(repairs);
		toolBar.add(vehicles);
		toolBar.add(tools);
		toolBar.add(tasks);
		toolBar.add(parts);

		vehicles.add(addVehicle);
		vehicles.add(updateVehicle);
		vehicles.add(deleteVehicle);
		vehicles.add(readVehicles);

		tools.add(addTool);
		tools.add(updateTool);
		tools.add(deleteTool);
		tools.add(readTool);

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
		addRepair.addActionListener(this);
		readRepair.addActionListener(this);
		readVehicles.addActionListener(this);
		readTask.addActionListener(this);
		readTool.addActionListener(this);
		readPart.addActionListener(this);
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
		}
		if (e.getSource() == readRepair) {
			container.removeAll();
			container.add(toolBar);
			System.out.println("WENT THROUGH");
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
		}
		if (e.getSource() == updateVehicle) {
			// call stored procedure from database
		}
		if (e.getSource() == deleteVehicle) {
			// call stored procedure from database
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

		if (e.getSource() == addTool) {
			// call stored procedure from database
		}
		if (e.getSource() == updateTool) {
			// call stored procedure from database
		}
		if (e.getSource() == deleteTool) {
			// call stored procedure from database
		}
		if (e.getSource() == readTool) {
			container.removeAll();
			container.add(toolBar);
			JScrollPane myPane = new JScrollPane();
			
			ArrayList<MyTools> myTools = app.getTools();
			JTable myTable = new JTable();
			DefaultTableModel myModel = new DefaultTableModel();
			String[] myColumns = {"Size","Name","Brand"};
			myTable.setModel(myModel);
			myModel.setColumnIdentifiers(myColumns);
			myPane.setViewportView(myTable);
			Object[] myRow = new Object[3];
			for(int i = 0; i<myTools.size();i++) {
				myRow[0] = myTools.get(i).getSize();
				myRow[1] = myTools.get(i).getName();
				myRow[2] = myTools.get(i).getBrand();
				myModel.addRow(myRow);
			}
			myTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
			myTable.getColumnModel().getColumn(2).setPreferredWidth(150);
			myPane.setBounds(30, 30, 300, 300);
			container.add(myPane);
			
			this.setTitle("Read Tools");
			this.setBounds(10, 10, 680, 600);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setResizable(false);
			this.setVisible(true);		
		}

		if (e.getSource() == addTask) {
			// call stored procedure from database
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
			myTable.getColumnModel().getColumn(2).setPreferredWidth(250);
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
		}
		if (e.getSource() == updatePart) {
			// call stored procedure from database
		}
		if (e.getSource() == deletePart) {
			// call stored procedure from database
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
	}
}
