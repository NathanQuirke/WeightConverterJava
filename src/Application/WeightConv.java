import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class WeightConv extends JFrame {

  class Handler implements ActionListener {

    public void actionPerformed(ActionEvent e) {

      String s = a1.getText();
      double d = Integer.parseInt(s);
      if (gram1.isSelected() && gram2.isSelected()) {
        a2.setText(s);
      }
      if (gram1.isSelected() && kg2.isSelected()) {
        double kg = d / 1000;
        a2.setText(Double.toString(kg));
      }
      if (gram1.isSelected() && pound2.isSelected()) {
        double pound = d / 453.6;
        a2.setText(Double.toString(pound));

      }
      if (gram1.isSelected() && ounce2.isSelected()) {
        double ounce = d / 28.35;
        a2.setText(Double.toString(ounce));
      }


      // this is not correct, needs to be pushed back in decimal places, formatted
      if (gram1.isSelected() && stone2.isSelected()) {
        double stone = d / 6350;
        a2.setText(Double.toString(stone));
      }
      // this is not correct, needs to be pushed back in decimal places, formatted


      if (kg1.isSelected() && gram2.isSelected()) {
        double gram = d * 1000;
        a2.setText(Double.toString(gram));
      }
      if (kg1.isSelected() && kg2.isSelected()) {
        a2.setText(s);
      }
      if (kg1.isSelected() && pound2.isSelected()) {
        double pou = d * 2.205;
        a2.setText(Double.toString(pou));
      }
      if (kg1.isSelected() && ounce2.isSelected()) {
        double ounce = d * 35.274;
        a2.setText(Double.toString(ounce));
      }
      if (kg1.isSelected() && stone2.isSelected()) {
        double stone = d / 6.35;
        a2.setText(Double.toString(stone));
      }
      if (pound1.isSelected() && gram2.isSelected()) {
        double gram = d * 453.6;
        a2.setText(Double.toString(gram));
      }
      if (pound1.isSelected() && kg2.isSelected()) {
        double kgs = d / 2.205;
        a2.setText(Double.toString(kgs));
      }
      if (pound1.isSelected() && pound2.isSelected())
        a2.setText(s);

      if (pound1.isSelected() && ounce2.isSelected()) {
        double ounces = d / .0625;
        a2.setText(Double.toString(ounces));
      }
      if (pound1.isSelected() && stone2.isSelected()) {
        double kgs = d / 14;
        a2.setText(Double.toString(kgs));
      }
      if (ounce1.isSelected() && gram2.isSelected()) {
        double gram = d * 28.35;
        a2.setText(Double.toString(gram));
      }
      if (ounce1.isSelected() && kg2.isSelected()) {
        double kgs2 = d / 35.274;
        a2.setText(Double.toString(kgs2));
      }
      if (ounce1.isSelected() && pound2.isSelected()) {
        double pounds2 = d * .0625;
        a2.setText(Double.toString(pounds2));
      }
      if (ounce1.isSelected() && ounce2.isSelected()) {
        a2.setText(s);
      }
      if (ounce1.isSelected() && stone2.isSelected()) {
        double stone = d / 224;
        a2.setText(Double.toString(stone));
      }
      if (stone1.isSelected() && gram2.isSelected()) {
        double pounds2 = d * 6350;
        a2.setText(Double.toString(pounds2));
      }
      if (stone1.isSelected() && kg2.isSelected()) {
        double kg = d * 6.35;
        a2.setText(Double.toString(kg));
      }
      if (stone1.isSelected() && pound2.isSelected()) {
        double pounds = d * 14;
        a2.setText(Double.toString(pounds));
      }
      if (stone1.isSelected() && ounce2.isSelected()) {
        double ounce = d * 224;
        a2.setText(Double.toString(ounce));
      }
      if (stone1.isSelected() && stone2.isSelected()) {
        a2.setText(s);
      }

    }

  }



  
  JButton b;
  JTextArea a2;
  JTextField a1;
  JCheckBox gram1;
  JCheckBox gram2;
  JCheckBox kg1;
  JCheckBox kg2;
  JCheckBox pound1;
  JCheckBox pound2;
  JCheckBox ounce1;
  JCheckBox ounce2;
  JCheckBox stone1;
  JCheckBox stone2;
  JCheckBox tonne1;
  JCheckBox tonne2;

  WeightConv() {
    Handler h = new Handler();

    JLabel l = new JLabel("WEIGHT CONVERTER");
    l.setFont(l.getFont().deriveFont((float) 20.00));
    l.setBounds(180, 10, 250, 20);
    add(l);
    JLabel l2 = new JLabel("INPUT UNIT");
    l2.setFont(l2.getFont().deriveFont((float) 15.00));
    l2.setBounds(56, 85, 140, 20);
    add(l2);
    JLabel l3 = new JLabel("OUTPUT UNIT");
    l3.setFont(l3.getFont().deriveFont((float) 15.00));
    l3.setBounds(430, 85, 140, 20);
    add(l3);
    b = new JButton("Convert");
    b.setFont(b.getFont().deriveFont((float) 15.00));
    b.setBounds(240, 430, 100, 50);
    a1 = new JTextField();
    a1.setBounds(240, 40, 100, 30);
    a2 = new JTextArea();
    a2.setBounds(240, 480, 100, 40);
    a2.setEditable(false);
    gram1 = new JCheckBox("Gram");
    gram1.setBounds(50, 130, 140, 20);
    gram2 = new JCheckBox("Gram");
    gram2.setBounds(430, 130, 140, 20);
    kg1 = new JCheckBox("KG");
    kg1.setBounds(50, 190, 140, 20);
    kg2 = new JCheckBox("KG");
    kg2.setBounds(430, 190, 140, 20);
    pound1 = new JCheckBox("Pounds");
    pound1.setBounds(50, 250, 100, 20);
    pound2 = new JCheckBox("Pounds");
    pound2.setBounds(430, 250, 100, 20);
    ounce1 = new JCheckBox("Ounce");
    ounce1.setBounds(50, 310, 100, 20);
    ounce2 = new JCheckBox("Ounce");
    ounce2.setBounds(430, 310, 100, 20);
    stone1 = new JCheckBox("Stone");
    stone1.setBounds(50, 370, 100, 20);
    stone2 = new JCheckBox("Stone");
    stone2.setBounds(430, 370, 100, 20);

    add(b);
    add(gram1);
    add(gram2);
    add(kg1);
    add(kg2);
    add(a1);
    add(a2);
    add(pound1);
    add(pound2);
    add(ounce1);
    add(ounce2);
    add(stone1);
    add(stone2);
    b.addActionListener(h);

    setSize(600, 600);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(null);
    setVisible(true);
    setLocationRelativeTo(null);

  }

  public static void main(String args[]) {
    WeightConv obj = new WeightConv();
  }

}