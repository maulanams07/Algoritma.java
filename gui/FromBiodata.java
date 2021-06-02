package com.company.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class FromBiodata {
    private JTextField textNama;
    private JTextField textnim;
    private JButton buttonSave;
    private JPanel rootPanel;
    private JLabel lebelHasil;

    public FromBiodata() {
        buttonSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //mengambil data dari textnama
                String nama = textNama.getText();
                //mengambil data dari textnim
                String nim = textnim.getText();
                //diproses
                Mahasiswa mhs = new Mahasiswa();
                mhs.setNama(nama);
                mhs.setNim(nim);

                //Tampilkan output ke FROM
                lebelHasil.setText(mhs.toString());
            }
        });
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }

}

