package com.company.gui;

import javax.swing.*;

public class RunFromBiodata {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("From Biodata");
        jFrame.setContentPane(new FromBiodata().getRootPanel());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.setSize( 500,400);
        jFrame.setVisible(true);

    }

}
