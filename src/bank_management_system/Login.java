package bank_management_system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.*;

public class Login extends JFrame {

    JLabel label1, label2, label3;

    private ImageIcon loadIcon(String path, int width, int height) {
        ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource(path));
        Image img = icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(img);
    }

    public Login() {
        super("Bank Management System");

        setLayout(null);
        setSize(850, 480);
        setLocation(450, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel bankImage = new JLabel(loadIcon("icons/bank.png", 100, 100));
        bankImage.setBounds(350, 10, 100, 100);
        add(bankImage);

        JLabel cardImage = new JLabel(loadIcon("icons/card.png", 100, 100));
        cardImage.setBounds(650, 350, 100, 100);
        add(cardImage);

        label1 = new JLabel("Welcome to ATM");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("AvantGrade", Font.BOLD, 38));
        label1.setBounds(250, 125, 450, 40);
        add(label1);

        JLabel backgroundImage = new JLabel(loadIcon("icons/backbg.png", 850, 480));
        backgroundImage.setBounds(0, 0, 850, 480);
        add(backgroundImage);

        setVisible(true);
    }
    public static void main(String[] args) {
        // new Login();
        SwingUtilities.invokeLater(Login::new);
    }
}
