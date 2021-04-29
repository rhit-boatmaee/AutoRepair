package gui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


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
	JMenuItem updateVehicle = new JMenuItem("Option 2");
	JMenuItem deleteVehicle = new JMenuItem("Option 2");

	JMenuItem addTask = new JMenuItem("Option 2");
	JMenuItem updateTask = new JMenuItem("Option 2");
	JMenuItem deleteTask = new JMenuItem("Option 2");

	JMenuItem addTool = new JMenuItem("Option 2");
	JMenuItem updateTool = new JMenuItem("Option 2");
	JMenuItem deleteTool = new JMenuItem("Option 2");

	JMenuItem addPart = new JMenuItem("Option 2");
	JMenuItem updatePart = new JMenuItem("Option 2");
	JMenuItem deletePart = new JMenuItem("Option 2");

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

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == addRepair) {
			// call stored procedure from database
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
