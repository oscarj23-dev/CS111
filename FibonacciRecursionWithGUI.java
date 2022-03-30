//Oscar Maldonado
//Lab 8
//Tatiana Harrison
//CS111
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class FibonacciRecursionWithGUI extends JFrame {
    private JPanel panel;
    private JButton button;
    private JLabel label1, label2;
    private JTextField textField1, textField2;
    private JTextArea display;
    private int numInvo = 0;
    private final int windowWidth = 350;
    private final int windowHeight = 250;

    // constructor which builds the gui panel
    public FibonacciRecursionWithGUI() {
        buildPanel();
        setSize(windowWidth, windowHeight);
        add(panel);
        setVisible(true);
    }

    // builds panel method assigning values to the buttons and text fields
    //and adds a scroll wheel for navigation and adds components to panel
    private void buildPanel() {
        button = new JButton("Calculate Fibonacci Number."); 
        button.addActionListener(new ButtonListener());
        label1 = new JLabel("Which Fibonacci Number: "); 
        label2 = new JLabel("The Fibonacci Number: ");
        textField1 = new JTextField(5);
        textField2 = new JTextField(5);
        textField2.setEditable(false);
        display = new JTextArea(5, 15);
        display.setEditable(false);
        JScrollPane scroll = new JScrollPane(display);
        scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        panel = new JPanel();
        panel.add(label1);
        panel.add(textField1);
        panel.add(button);
        panel.add(label2);
        panel.add(textField2);
        panel.add(scroll);
    }


    // fibonacci recursive method
    public int fibonacci(int n) {
        numInvo++;
        display.append("invocation " + numInvo + "\n"); 
        if (n == 0) { 
            return 0; 
        } else if (n == 1) { 
            return 1; 
        } else { 
            return fibonacci(n-1) + fibonacci(n-2); 
        } 
    }
    // action listener class which takes input from the user in the form
    // of a button click
    private class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Integer value = Integer.valueOf(textField1.getText());
            int fibNum = fibonacci(value);
            Integer result = Integer.valueOf(fibNum);
            textField2 = new JTextField(Integer.toString(result));
        }
    }

    // the main method
    public static void main(String[] args) {
        FibonacciRecursionWithGUI fib = new FibonacciRecursionWithGUI();
    }
}
