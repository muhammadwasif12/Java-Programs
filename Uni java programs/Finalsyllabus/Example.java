import javax.swing.*; // Import necessary Swing components
import java.awt.*;    // Import AWT for layout management

public class Example {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame jf = new JFrame("Login");
        jf.setSize(400, 400); // Set the width and height of the frame
        jf.setLayout(null);   // Use no layout manager
        jf.setVisible(true);  // Make the frame visible
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit on close

        // Add a label
        JLabel label = new JLabel("Enter Your User ID");
        label.setBounds(50, 50, 150, 20); // Set position and size of the label
        jf.add(label);                   // Add the label to the frame

        // Add a text field
        JTextField tf = new JTextField();
        tf.setBounds(50, 80, 150, 20);  // Set position and size of the text field
        jf.add(tf);                     // Add the text field to the frame

        // Add a combo box
        String[] course = {"SE", "BBA", "CS"};
        JComboBox<String> cb = new JComboBox<>(course);
        cb.setBounds(50, 110, 150, 20); // Set position and size of the combo box
        jf.add(cb);                     // Add the combo box to the frame

        // Add a scroll bar
        JScrollBar sb = new JScrollBar(JScrollBar.VERTICAL);
        sb.setBounds(350, 50, 20, 100); // Set position and size of the scroll bar
        jf.add(sb);                     // Add the scroll bar to the frame

        // Add radio buttons
        JRadioButton rbMale = new JRadioButton("Male");
        rbMale.setBounds(50, 150, 100, 20); // Set position and size of the radio button
        jf.add(rbMale);                     // Add the male radio button to the frame

        JRadioButton rbFemale = new JRadioButton("Female");
        rbFemale.setBounds(50, 180, 100, 20); // Set position and size of the radio button
        jf.add(rbFemale);                     // Add the female radio button to the frame

        // Group radio buttons
        ButtonGroup bg = new ButtonGroup();
        bg.add(rbMale);
        bg.add(rbFemale);
    }
}
