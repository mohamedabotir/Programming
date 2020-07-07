package com.company;

import javax.swing.*;

public class gui extends JFrame {
    Icon bug=new ImageIcon(getClass().getResource("r.png"));
    JLabel label1=new JLabel("test1");
    JLabel label2=new JLabel("test2");
    JLabel label3=new JLabel("test3");
    gui()
    {
        super("Test");

 label3.setIcon(bug);
 label3.setHorizontalTextPosition(SwingConstants.CENTER);
 label3.setVerticalTextPosition(SwingConstants.BOTTOM);
 add(label3);
 setVisible(true);
setSize(200,300);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
