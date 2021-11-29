package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.border.Border;





public class MainPanel extends JFrame{
    JPanel panel1;
    private JLabel loginLabel;
    private JLabel registerLabel;
    private JTextField usernameTextField;
    private JTextField passwordTextField;
    private JPanel panel2;
    private JButton button1;
    Border default_border = BorderFactory.createMatteBorder(2,0,0,0,new Color(204,204,204));
    Border red_top_border = BorderFactory.createMatteBorder(2,0,0,0,Color.red);

    public MainPanel() {
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400,500);
        setResizable(false);
        add(panel1);
        loginLabel.addMouseListener(new MouseAdapter()  {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                loginLabel.setBorder(red_top_border);
                loginLabel.setForeground(Color.black);
                loginLabel.setBackground(Color.white);

                registerLabel.setBorder(default_border);
                registerLabel.setBackground(new Color(42,187,155));
                registerLabel.setForeground(Color.white);
            }
        });

        registerLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                registerLabel.setBorder(red_top_border);
                registerLabel.setForeground(Color.black);
                registerLabel.setBackground(Color.white);

                loginLabel.setBorder(default_border);
                loginLabel.setBackground(new Color(42,187,155));
                loginLabel.setForeground(Color.white);
            }
        });


    }

    public static void main(String[] args) {
        MainPanel mainPage = new MainPanel();
    }

}
