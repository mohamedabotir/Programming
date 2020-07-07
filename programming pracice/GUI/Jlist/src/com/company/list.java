package com.company;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.color.*;

public class list extends JFrame  {
    private JList colorlist;
    private static final String[] colorNames = { "Black", "Blue", "Cyan",
            "Dark Gray", "Gray", "Green", "Light Gray", "Magenta",
             "Orange", "Pink", "Red", "White", "Yellow" };
 private static final Color[] colors = { Color.BLACK, Color.BLUE,
             Color.CYAN, Color.DARK_GRAY, Color.GRAY, Color.GREEN,
             Color.LIGHT_GRAY, Color.MAGENTA, Color.ORANGE, Color.PINK,
             Color.RED, Color.WHITE, Color.YELLOW };
 list()
 {super("List");
 setSize(500,300);
     setVisible(true);

setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setLayout(new FlowLayout());
     colorlist=new JList(colorNames);
     colorlist.setVisibleRowCount(5);
     colorlist.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
     add(new JScrollPane(colorlist));
     colorlist.addListSelectionListener(new ListSelectionListener() {
         @Override
         public void valueChanged(ListSelectionEvent e) {
             getContentPane().setBackground(colors[colorlist.getSelectedIndex()]);
         }
     });
 }

}
