package com.company.tabel;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExamTabel1 {
    private JPanel rootPanel;
    private JTextField textNama;
    private JTextField textEmail;
    private JTextField textTb;
    private JButton buttonSave;
    private JTable tableBiodata;
    private DefaultTableModel tableModel;


    public JPanel getRootPanel() {
        return rootPanel;
    }

    public ExamTabel1() {
        this.initComponents();
        buttonSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String Nama = textNama.getText();
                String email = textEmail.getText();
                String Tb = textTb.getText();
                tableModel.addRow(new Object[]{Nama, email, Tb });
                //Tb = (Tinggi  Badan)

                textNama.setText("");
                textEmail.setText("");
                textTb.setText("");
            }
        });
    }

    private void initComponents(){
        Object[] tableColom = {
                "Nama",
                "Email",
                "Tb",
        };
        Object[][] initData = {
                {"Ardi", "ardi@email.com","178 cm"},
                {"beri", "ari@email.com","179 cm"},
                {"cira", "ara@email.com","169 cm"},
                {"lana", "lana@email.com","180 cm"},
                {"kari", "aki@email.com","190 cm"},


        };
        tableModel = new DefaultTableModel(initData, tableColom);
        //set table model
        tableBiodata.setModel(tableModel);
        tableBiodata.setAutoCreateRowSorter(true);
        tableBiodata.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
}
