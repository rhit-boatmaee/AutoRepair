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
import javax.swing.JTextArea;
import javax.swing.JTextField;

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

	JMenuItem addVehicle = new JMenuItem("Add Vehicle");
	JMenuItem updateVehicle = new JMenuItem("Update Vehicle");
	JMenuItem deleteVehicle = new JMenuItem("Delete Vehicle");

	JMenuItem addTask = new JMenuItem("Add Task");
	JMenuItem updateTask = new JMenuItem("Update Task");
	JMenuItem deleteTask = new JMenuItem("Delete Task");

	JMenuItem addTool = new JMenuItem("Add Tool");
	JMenuItem updateTool = new JMenuItem("Update Tool");
	JMenuItem deleteTool = new JMenuItem("Delete Tool");

	JMenuItem addPart = new JMenuItem("Add Part");
	JMenuItem updatePart = new JMenuItem("Update Part");
	JMenuItem deletePart = new JMenuItem("Delete Part");

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

		tools.add(addTool);
		tools.add(updateTool);
		tools.add(deleteTool);

		tasks.add(addTask);
		tasks.add(updateTask);
		tasks.add(deleteTask);

		repairs.add(addRepair);
		repairs.add(updateRepair);
		repairs.add(deleteRepair);

		parts.add(addPart);
		parts.add(updatePart);
		parts.add(deletePart);

	}

	public void addComponentsToContainer() {

		container.add(toolBar);

	}

	public void addActionEvent() {
		addRepair.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == addRepair) {

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

					app.addRepair(vehicle, startDate, endDate, discount, totalCost, description);

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

		if (e.getSource() == addVehicle) {
			// call stored procedure from database
		}
		if (e.getSource() == updateVehicle) {
			// call stored procedure from database
		}
		if (e.getSource() == deleteVehicle) {
			// call stored procedure from database
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

		if (e.getSource() == addTask) {
			// call stored procedure from database
		}
		if (e.getSource() == updateTask) {
			// call stored procedure from database
		}
		if (e.getSource() == deleteTask) {
			// call stored procedure from database
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
	}
}
