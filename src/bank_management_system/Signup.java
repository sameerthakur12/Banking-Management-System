package bank_management_system;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;

public class Signup extends JFrame implements ActionListener {
    JRadioButton radioMale, radioFemale, radioMarried, radioSingle, radioOther;
    JButton next;
    JTextField textName, fatherName, textEmail, textAddress, textCity, textPin, textState;
    JDateChooser dateChooser;

    Random random = new Random();
    long first4 = (random.nextLong() % 9000L) + 1000L;
    String first = " " + Math.abs(first4);

    private void styleLabel(JLabel label, String text, int x, int y, int width, int height, Color color, String font, int style, int size) {
        label.setText(text);
        label.setForeground(color);
        label.setFont(new Font(font, style, size));
        label.setBounds(x, y, width, height);
        add(label);
    }

    private void styleTextField(JTextField field, int x, int y, int width, int height, String font, int style, int size) {
        field.setBounds(x, y, width, height);
        field.setFont(new Font(font, style, size));
        add(field);
    }

    private void styleRadioButton(JRadioButton radio, String text, int x, int y, int width, int height, String font, int style, int size) {
        radio.setText(text);
        radio.setBounds(x, y, width, height);
        radio.setFont(new Font(font, style, size));
        radio.setBackground(new Color(222, 255, 228));
        add(radio);
    }

    public Signup() {
        super("Application Form");

        setLayout(null);
        setSize(850, 800);
        setLocation(360, 40);
        getContentPane().setBackground(new Color(222, 255, 228));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25, 10, 100, 100);
        add(image);

        JLabel label1 = new JLabel();
        String str = "APPLICATION FORM NO. " + first;
        styleLabel(label1, str, 160, 20, 600, 40, Color.BLACK, "Raleway", Font.BOLD, 38);

        JLabel label2 = new JLabel();
        styleLabel(label2, "Page 1", 330, 70, 600, 30, Color.BLACK, "Raleway", Font.BOLD, 22);

        JLabel label3 = new JLabel();
        styleLabel(label3, "Personal Details", 290, 90, 600, 30, Color.BLACK, "Raleway", Font.BOLD, 22);

        JLabel labelName = new JLabel();
        styleLabel(labelName, "Name : ", 100, 190, 100, 30, Color.BLACK, "Raleway", Font.BOLD, 20);

        textName = new JTextField(15);
        styleTextField(textName, 300, 190, 400, 30, "Raleway", Font.BOLD, 14);

        JLabel fatherLabel = new JLabel();
        styleLabel(fatherLabel, "Father's Name : ", 100, 240, 170, 30, Color.BLACK, "Raleway", Font.BOLD, 20);

        fatherName = new JTextField(15);
        styleTextField(fatherName, 300, 240, 400, 30, "Raleway", Font.BOLD, 14);

        JLabel dob = new JLabel();
        styleLabel(dob, "Date Of Birth : ", 100, 340, 150, 30, Color.BLACK, "Raleway", Font.BOLD, 20);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105, 105, 105));
        dateChooser.setBounds(300, 340, 400, 30);
        add(dateChooser);

        JLabel genderLabel = new JLabel();
        styleLabel(genderLabel, "Gender : ", 100, 290, 100, 30, Color.BLACK, "Raleway", Font.BOLD, 20);

        radioMale = new JRadioButton();
        styleRadioButton(radioMale, "Male", 300, 290, 100, 30, "Raleway", Font.BOLD, 14);

        radioFemale = new JRadioButton();
        styleRadioButton(radioFemale, "Female", 420, 290, 100, 30, "Raleway", Font.BOLD, 14);

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(radioMale);
        genderGroup.add(radioFemale);

        JLabel labelEmail = new JLabel();
        styleLabel(labelEmail, "Email address : ", 100, 390, 200, 30, Color.BLACK, "Raleway", Font.BOLD, 20);

        textEmail = new JTextField(15);
        styleTextField(textEmail, 300, 390, 400, 30, "Raleway", Font.BOLD, 14);

        JLabel marriedStatus = new JLabel();
        styleLabel(marriedStatus, "Married Status : ", 100, 440, 200, 30, Color.BLACK, "Raleway", Font.BOLD, 20);

        radioSingle = new JRadioButton();
        styleRadioButton(radioSingle, "Single", 300, 440, 100, 30, "Raleway", Font.BOLD, 14);

        radioMarried = new JRadioButton();
        styleRadioButton(radioMarried, "Married", 420, 440, 100, 30, "Raleway", Font.BOLD, 14);

        radioOther = new JRadioButton();
        styleRadioButton(radioOther, "Other", 540, 440, 100, 30, "Raleway", Font.BOLD, 14);

        ButtonGroup marriedGrp = new ButtonGroup();
        marriedGrp.add(radioSingle);
        marriedGrp.add(radioMarried);
        marriedGrp.add(radioOther);

        JLabel address = new JLabel();
        styleLabel(address, "Address : ", 100, 490, 200, 30, Color.BLACK, "Raleway", Font.BOLD, 20);

        textAddress = new JTextField(15);
        styleTextField(textAddress, 300, 490, 400, 30, "Raleway", Font.BOLD, 14);

        JLabel city = new JLabel();
        styleLabel(city, "City : ", 100, 540, 200, 30, Color.BLACK, "Raleway", Font.BOLD, 20);

        textCity = new JTextField(15);
        styleTextField(textCity, 300, 540, 400, 30, "Raleway", Font.BOLD, 14);

        JLabel pincode = new JLabel();
        styleLabel(pincode, "Pin Code : ", 100, 590, 200, 30, Color.BLACK, "Raleway", Font.BOLD, 20);

        textPin = new JTextField(15);
        styleTextField(textPin, 300, 590, 400, 30, "Raleway", Font.BOLD, 14);

        JLabel state = new JLabel();
        styleLabel(state, "State : ", 100, 640, 200, 30, Color.BLACK, "Raleway", Font.BOLD, 20);

        textState = new JTextField(15);
        styleTextField(textState, 300, 640, 400, 30, "Raleway", Font.BOLD, 14);

        next = new JButton("Next");
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620, 710, 80, 30);
        next.addActionListener(this);
        add(next);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == next) {
            String name = textName.getText();
            JOptionPane.showMessageDialog(null, "Name entered: " + name);
        }
    }

    public static void main(String[] args) {
        new Signup();
    }
}
