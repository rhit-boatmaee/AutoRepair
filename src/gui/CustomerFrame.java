package gui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CustomerFrame extends JFrame implements ActionListener{

	JMenuBar toolBar = new JMenuBar();
	Container container = getContentPane();
	AppRunner app;

	JMenu repairs = new JMenu("Repairs");
	JMenuItem viewRepairs = new JMenuItem("View Repairs");
	JMenu vehicles = new JMenu("Vehicles");
	private String username;
	
	
	public CustomerFrame(AppRunner application, String username) {
		this.username = username;
		this.app = application;
		setLayoutManager();
		setLocationAndSize();
		addActionEvent();
	}

	public void addMenuItemsToToolBar() {

		toolBar.add(repairs);
		toolBar.add(vehicles);
		
	}
	private void addActionEvent() {
	
		
	}

	public void setLayoutManager() {
		container.setLayout(null);
	}

	public void setLocationAndSize() {
		this.setJMenuBar(toolBar);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == viewRepairs) {
			
			container.removeAll();
			container.add(toolBar);
	
			JScrollPane myPane = new JScrollPane();
			
			ArrayList<MyRepairs> myRepairs = app.customerViewRepairs(username);
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
		
	}

}
