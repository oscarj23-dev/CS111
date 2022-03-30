//Oscar Maldonado
//Tatiana Harrison
//Homework 4
//CS111
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class ConvertTemp extends JFrame {
    //components for panel
    private JTextField temp, type;
    private JPanel panel;
    private JLabel label1, label2;
    private JButton button;
    private JTextArea display;
    private final int windowWidth = 350;
    private final int windowHeight = 250;

// constructor which builds the gui panel
    public ConvertTemp() {
        buildPanel();
        setSize(windowWidth, windowHeight);
        add(panel);
        setVisible(true);
    }

// builds panel method assigning values to the buttons and text fields
//and adds a scroll wheel for navigation and adds components to panel
    private void buildPanel() {
        button = new JButton("Convert Temperature"); 
        button.addActionListener(new ButtonListener());
        label1 = new JLabel("Temperature: "); 
        label2 = new JLabel("Temperature Scale: ");

        temp = new JTextField(10);
        type = new JTextField(10);
        display = new JTextArea(5, 10);
        display.setEditable(false);
        panel = new JPanel();       
        panel.add(label1);
        panel.add(temp); 
        panel.add(label2);
        panel.add(type);
        panel.add(button);
    }

    //formula to convert farenheit to celsius
    public double farenToCels(double x) {
        return (( 5 *(x - 32.0)) / 9.0);
    }
    //formula to convert cesius to farenheit
    public double celsToFaren(double x) {        
        return (x * 1.8) + 32;
    }

// action listener class which takes input from the user in the form
// of a button click
private class ButtonListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        String tempType = type.getText();
        //taking the first char and checking if it starts with c || C, if it does it executes the celsius method.
        if(tempType.charAt(0) == 'c' || tempType.charAt(0) == 'C') {
            Double value = Double.valueOf(temp.getText());
            double faren = celsToFaren(value);
            JOptionPane.showMessageDialog(panel, value + " degrees in celsius to farenheit is: " + Math.round(faren));
        //taking the first char and checking if it starts with f || F, if it does it executes the farenheit method.
        } else if(tempType.charAt(0) == 'f' || tempType.charAt(0) == 'F') {
            Double value = Double.valueOf(temp.getText());
            double cels = farenToCels(value);
            JOptionPane.showMessageDialog(panel, value + " degrees in farenheit to celsius is: " + Math.round(cels));
        } else {
            //displays when a string that doesn't start with c || C or f || F is entered.
            JOptionPane.showMessageDialog(panel, "incorrect value.");
        }
    }
}

// the main method
public static void main(String[] args) {
    ConvertTemp temp = new ConvertTemp();
    } 
}