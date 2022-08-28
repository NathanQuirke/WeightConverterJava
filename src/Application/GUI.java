import javax.swing.*;
import java.awt.*;

public class GUI {

    public static void main(String args[]){

         //Creating the Frame, setting window size and centering when opened
        JFrame frame = new JFrame("Weight Converter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 700);
        frame.setLocationRelativeTo(null);

        //Creating the MenuBar and adding components
        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("From");
        JMenu m2 = new JMenu("To");
        mb.add(m1);
        mb.add(m2);
        JMenuItem m11 = new JMenuItem("Tonne");
        JMenuItem m22 = new JMenuItem("Kilogram");
        JMenuItem m33 = new JMenuItem("Gram");
        JMenuItem m44 = new JMenuItem("Stone");
        JMenuItem m55 = new JMenuItem("Pound");
        JMenuItem m66 = new JMenuItem("Ounce");
        m1.add(m11);
        m1.add(m22);
        m1.add(m33);
        m1.add(m44);
        m1.add(m55);
        m1.add(m66);

        /*m2.add(m11);
        m2.add(m22);
        m2.add(m33);
        m2.add(m44);
        m2.add(m55);
        m2.add(m66);
        */

        //Creating the panel at bottom and adding components
        JPanel panel = new JPanel(); // the panel is not visible in output
        JLabel label = new JLabel("Enter value");
        JTextField tf = new JTextField(10); // accepts upto 10 characters
        JButton send = new JButton("CONVERT");
        JButton reset = new JButton("CLEAR");
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
