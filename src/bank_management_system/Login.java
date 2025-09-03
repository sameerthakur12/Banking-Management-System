package bank_management_system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class Login extends JFrame implements ActionListener{

    JLabel label1, label2, label3;
    
    JTextField textField2;
    
    JPasswordField passwordField3;

    JButton loginButton, signupButton, clearButton;

    private ImageIcon loadIcon(String path, int width, int height) {
        ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource(path));
        Image img = icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(img);
    }


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
        field.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) { checkFields(); }
            @Override
            public void removeUpdate(DocumentEvent e) { checkFields(); }
            @Override
            public void changedUpdate(DocumentEvent e) { checkFields(); }
        });
        add(field);
    }

    private void stylePasswordField(JPasswordField field, int x, int y, int width, int height, String font, int style, int size) {
        field.setBounds(x, y, width, height);
        field.setFont(new Font(font, style, size));
        field.setEnabled(false);
        field.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) { checkFields(); }
            @Override
            public void removeUpdate(DocumentEvent e) { checkFields(); }
            @Override
            public void changedUpdate(DocumentEvent e) { checkFields(); }
        });
        add(field);
    }

    private void styleButton(JButton button, String text, int x, int y, int width, int height, String font, int style, int size, Color fg, Color bg) {
        button.setText(text);
        button.setFont(new Font(font, style, size));
        button.setForeground(fg);
        button.setBackground(bg);
        button.setBounds(x, y, width, height);
        button.addActionListener(this);
        button.setEnabled(true);
        add(button);
    }

    private void styleImageLabel(JLabel label, String path, int x, int y, int width, int height) {
        label.setIcon(loadIcon(path, width, height));
        label.setBounds(x, y, width, height);
        add(label);
    }

    private void checkFields() {
        if (textField2.getText().trim().isEmpty()) {
            passwordField3.setEnabled(false); 
            signupButton.setEnabled(true);
            clearButton.setEnabled(false);
        } else {
            passwordField3.setEnabled(true);
            clearButton.setEnabled(true);
        }

        if (!textField2.getText().trim().isEmpty() && passwordField3.getPassword().length > 0) {
            signupButton.setEnabled(true);    
        } else {
            signupButton.setEnabled(false);
        }
    }

    public Login() {
        super("Bank Management System");

        setLayout(null);
        setSize(850, 480);
        setLocation(450, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        styleImageLabel(new JLabel(), "icons/bank.png", 350, 10, 100, 100);

        styleImageLabel(new JLabel(), "icons/card.png", 650, 350, 100, 100);

        label1 = new JLabel();
        styleLabel(label1, "Welcome to ATM", 250, 125, 450, 40, Color.WHITE, "AvantGrade", Font.BOLD, 38);

        label2 = new JLabel();
        styleLabel(label2, "Card No.", 150, 195, 375, 30, Color.WHITE, "Ralway", Font.BOLD, 28);

        label3 = new JLabel();
        styleLabel(label3, "PIN No.", 150, 250, 375, 30, Color.WHITE, "Ralway", Font.BOLD, 28);

        textField2 = new JTextField(15);
        styleTextField(textField2, 325, 190, 230, 30, "Arial", Font.BOLD, 14);

        passwordField3 = new JPasswordField(15);
        stylePasswordField(passwordField3, 325, 250, 230, 30, "Arial", Font.BOLD, 14);

        signupButton = new JButton();
        styleButton(signupButton, "SIGN IN", 325, 300, 105, 30, "Arial", Font.BOLD, 14, Color.WHITE, Color.BLACK);
        signupButton.setEnabled(false);

        loginButton = new JButton();
        styleButton(loginButton, "SIGN UP", 450, 300, 105, 30, "Arial", Font.BOLD, 14, Color.WHITE, Color.BLACK);

        clearButton = new JButton();
        styleButton(clearButton, "CLEAR", 325, 350, 230, 30, "Arial", Font.BOLD, 14, Color.WHITE, Color.BLACK);

        JLabel backgroundImage = new JLabel(loadIcon("icons/backbg.png", 850, 480));
        backgroundImage.setBounds(0, 0, 850, 480);
        add(backgroundImage);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if(e.getSource() == signupButton) {

            } else if (e.getSource() == loginButton) {

            } else if (e.getSource() == clearButton) {
                textField2.setText("");
                passwordField3.setText("");
            }

        } catch (Exception E) {
            E.printStackTrace();
        }
    }
    public static void main(String[] args) {
        // new Login();
        SwingUtilities.invokeLater(Login::new);
        // Signup signup = new Signup();
    }
}
