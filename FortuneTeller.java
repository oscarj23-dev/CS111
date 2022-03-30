
import java.awt.*;   // the "basic" awt functionality
import javax.swing.*;   // java's awesome swing functionality

import java.awt.event.*;   // necessary for event listeners

// A FortuneTeller class that extends the JFrame class
public class FortuneTeller extends JFrame {
    private JPanel panel;
    private JTextField questionText;
    private JButton answer;
    private JOptionPane tellerAnswer;

    private final int windowWidth = 360;
    private final int windowHeight = 130;

    // This class's default, no-argument constructor
    public FortuneTeller() {
        setTitle("The crystal ball says... ");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buildPanel();
        add(panel);
        setSize(windowWidth, windowHeight);
        setVisible(true);
    }

    // panel is created with the necessary components
    private void buildPanel() {
        JLabel question = new JLabel("Ask me a question");
        questionText = new JTextField(10);
        tellerAnswer = new JOptionPane("I may not know the answer");
        answer = new JButton("Tell me now");
        answer.addActionListener(new CalcButtonListener());
        panel = new JPanel();
        panel.add(question);
        panel.add(questionText);
        panel.add(tellerAnswer);
        panel.add(answer);
    }


    // A private INNER class that implements an event listener.
    // Recall that the actionPerformed method below
    // is invoked when the calcButton in the GUI is clicked.
    private class CalcButtonListener implements ActionListener {

        // The required method, which ActionListner requires
        public void actionPerformed(ActionEvent e) {
            String textBox = questionText.getText();
            String[] token = textBox.split(" ");
            if(token[0].equalsIgnoreCase("who")) {
                tellerAnswer = new JOptionPane("Who asked");
            } else if(token[0].equalsIgnoreCase("what")) {
                tellerAnswer = new JOptionPane("What a question I dont Know the answer to.");
            }
        }
    }

    // The "main" routine, where it all begins
    public static void main(String[] args) {
        FortuneTeller f = new FortuneTeller();
    }
}
