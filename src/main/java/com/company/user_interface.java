package com.company;


import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.FormLayout;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.StyleContext;
import java.awt.*;
import java.util.Locale;

public class user_interface {
    private JPanel panel1;
    private JButton editProfileButton;
    private JButton addComplaintButton;
    private JButton viewComplaintButton;
    private JButton logOutButton;
    private JLabel editTitle;
    private JPanel editProfile;
    private JPanel addComplaint;
    private JLabel addTitle;

    public static void main(String[] args) {
        JFrame frame = new JFrame("user_interface");
        frame.setContentPane(new user_interface().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}

