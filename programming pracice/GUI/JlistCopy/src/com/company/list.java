package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("deprecation")
public class list extends JFrame {
    JList listname;
    JList copy;
    JButton copyB=new JButton("Copy>>>");
    public static String colorName[]={"Black", "Blue", "Cyan","Dark Gray", "Gray",
                                      "Green", "Light Gray", "Magenta",
                                       "Orange","Pink", "Red", "White", "Yellow"};
    list()
    {
        super("list");
        setLayout(new FlowLayout());
        listname=new JList(colorName);
        listname.setVisibleRowCount(5);
        listname.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        add(new JScrollPane(listname));
        copyB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                copy.setListData(listname.getSelectedValues());
            }
        });
        add(copyB);
        copy=new JList();
        copy.setVisibleRowCount(5);
        copy.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        add(new JScrollPane(copy));
        copy.setFixedCellHeight(20);
        copy.setFixedCellWidth(100);
        setSize(500,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
