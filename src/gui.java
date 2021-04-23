
import javax.swing.*;
import java.awt.*;
class gui {
    public static void main(String args[]) {

        JFrame frame = new JFrame("Auto Repair");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 800);

        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("Item 1");
        JMenu m2 = new JMenu("Item 2");
        mb.add(m1);
        mb.add(m2);
        
        JMenuItem m11 = new JMenuItem("Option 1");
        JMenuItem m12 = new JMenuItem("Option 2");
        m1.add(m11);
        m1.add(m12);

        //Creating the panel at bottom and adding components
        JPanel panel = new JPanel(); // the panel is not visible in output
        JLabel label = new JLabel("Enter your name");
        
      
        panel.add(label); // Components Added using Flow Layout
    

        //Adding Components to the frame.
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.getContentPane().add(BorderLayout.NORTH, mb);
       
        frame.setVisible(true);
    }
}
