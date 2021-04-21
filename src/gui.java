
import javax.swing.*;
import java.awt.*;
class gui {
    public static void main(String args[]) {

        JFrame frame = new JFrame("Auto Repair");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);

        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("Item 1");
        JMenu m2 = new JMenu("Item 2");
        mb.add(m1);
        mb.add(m2);
        JMenuItem m11 = new JMenuItem("Option 1");
        JMenuItem m22 = new JMenuItem("Option 2");
        m1.add(m11);
        m1.add(m22);

        //Creating the panel at bottom and adding components
        JPanel panel = new JPanel(); // the panel is not visible in output
        JLabel label = new JLabel("Enter Text");
        JTextField tf = new JTextField(10); // accepts upto 10 characters
        JButton send = new JButton("Send");
        JButton reset = new JButton("Reset");
        panel.add(label); // Components Added using Flow Layout
        panel.add(tf);
        panel.add(send);
        panel.add(reset);

        // Text Area at the Center
        JTextArea ta = new JTextArea();

        //Adding Components to the frame.
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.getContentPane().add(BorderLayout.NORTH, mb);
        frame.getContentPane().add(BorderLayout.CENTER, ta);
        frame.setVisible(true);
    }
}
