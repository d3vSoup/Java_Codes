package Java;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DivisionUI extends JFrame implements ActionListener {

    JTextField t1, t2, t3;
    JButton divide;

    DivisionUI() {
        setTitle("Integer Division");
        setSize(300, 200);
        setLayout(new GridLayout(4, 2));

        add(new JLabel("Num1"));
        t1 = new JTextField();
        add(t1);

        add(new JLabel("Num2"));
        t2 = new JTextField();
        add(t2);

        add(new JLabel("Result"));
        t3 = new JTextField();
        t3.setEditable(false);
        add(t3);

        divide = new JButton("Divide");
        add(divide);

        divide.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int n1 = Integer.parseInt(t1.getText());
            int n2 = Integer.parseInt(t2.getText());

            int result = n1 / n2;
            t3.setText(String.valueOf(result));
        }
        catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this,
                    "Please enter valid integers",
                    "Number Format Exception",
                    JOptionPane.ERROR_MESSAGE);
        }
        catch (ArithmeticException ex) {
            JOptionPane.showMessageDialog(this,
                    "Cannot divide by zero",
                    "Arithmetic Exception",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new DivisionUI();
    }
}

