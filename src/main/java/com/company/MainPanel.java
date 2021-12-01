package com.company;

import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.FormLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Locale;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.StyleContext;


public class MainPanel extends JFrame {
    JPanel panel1;
    private JTextField usernameTextField;
    private JButton loginButton;
    private JLabel loginLabel;
    private JLabel registerLabel;
    private JTextField usernameTextField2;
    private JPanel login_panel;
    private JPanel register_panel;
    private JPanel card;
    private JTextField emailTextField;
    private JTextField passwordTextField;
    private JButton register_button;
    private JButton login_button;
    private final CardLayout cl = (CardLayout) card.getLayout();


    public MainPanel() {
        //JFrame
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1000, 600);
        setResizable(false);
        add(panel1);


        loginLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                loginLabel.setForeground(Color.white);
                loginLabel.setBackground(new Color(0x007BFF));

                registerLabel.setForeground(new Color(0x3C3F41));
                registerLabel.setBackground(Color.white);
                cl.first(card);
            }
        });
        registerLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                registerLabel.setForeground(Color.white);
                registerLabel.setBackground(new Color(0x007BFF));

                loginLabel.setForeground(new Color(0x3C3F41));
                loginLabel.setBackground(Color.white);
                cl.last(card);

            }
        });
    }

    public static void main(String[] args) {
        MainPanel mainPage = new MainPanel();

    }


}
