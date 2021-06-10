package com.company.tabel;

import javax.swing.*;

public class RunExamTabel1 {
    public static void main(String[] args) {





        ImageIcon imageIcon = new ImageIcon("res/cost.png");
        JFrame jFrame = new JFrame("data sorting tinggi badan ");
        jFrame.setContentPane(new ExamTabel1().getRootPanel());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.setSize( 500,400);
        jFrame.setVisible(true);
    }
}
