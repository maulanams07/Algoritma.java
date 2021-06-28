package com;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class perhitungGui {
    private JPanel PerhitunganPanel;
    private JTextField txJariJari;
    private JTextField txLuas;
    private JButton hitungButton;
    private JButton batalButton;
    private JButton keluarButton;

    public perhitungGui() {
        hitungButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                // buat variabel
                double jariJari, luas;
                double pi = 3.14;

               //ambil imputan dari text field
                jariJari = Double.parseDouble(txJariJari.getText());

                //hitung luas
                luas = pi * (jariJari * jariJari);

                //letakan hasil
                txLuas.setText(String.valueOf(luas));
                }
            });
        batalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                txJariJari.setText("");
                txLuas.setText("");
                txJariJari.requestFocus();
            }
        });
        keluarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("perhitungGui");
        frame.setContentPane(new perhitungGui().PerhitunganPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
