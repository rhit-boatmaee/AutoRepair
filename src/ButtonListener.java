import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

public class ButtonListener implements ActionListener {

	JButton button;
	JLabel label;
	
	public ButtonListener(JButton button, JLabel label) {
		this.button = button;
		this.label = label;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(this.button.getText().equals("Submit")){
			
			label.setText("yee");
		}
		
	}

}
