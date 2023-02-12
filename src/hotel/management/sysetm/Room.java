package hotel.management.sysetm;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Room extends JFrame implements ActionListener {

    JTable t1;
    JButton b1, b2;

    Room(){

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotel\\management\\sysetm\\icons\\eight.jpg"));
        JLabel icon = new JLabel(i1);
        icon.setBounds(570,10,400,500);
        add(icon);

        t1 = new JTable();
        t1.setBounds(0,40,550,450);
        add(t1);

        JLabel l1 =new JLabel("ROOM NO.");
        l1.setForeground(Color.white);
        l1.setBounds(10,10,60,30);
        add(l1);

        JLabel l2 =new JLabel("STATUS");
        l2.setForeground(Color.white);
        l2.setBounds(110,10,60,30);
        add(l2);

        JLabel l5 =new JLabel("CLEANING STATUS");
        l5.setForeground(Color.white);
        l5.setBounds(230,10,80,30);
        add(l5);

        JLabel l3 =new JLabel("PRICE");
        l3.setForeground(Color.white);
        l3.setBounds(350,10,60,30);
        add(l3);

        JLabel l4 =new JLabel("BED TYPE");
        l4.setForeground(Color.white);
        l4.setBounds(460,10,100,30);
        add(l4);

        b1 =new JButton("Load Data");
        b1.setBounds(150,500,120,30);
        b1.addActionListener(this);
        add(b1);

        b2 =new JButton("Back");
        b2.setBounds(290,500,120,30);
        b2.addActionListener(this);
        add(b2);

        setLayout(null);
        setBounds(150,120,1000,600);
        getContentPane().setBackground(Color.BLACK);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            try{
                conn c = new conn();
                String str = "select * from room";

                ResultSet rs = c.s.executeQuery(str);
                t1.setModel(DbUtils.resultSetToTableModel(rs));
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        else if(ae.getSource() == b2){
            new Reception().setVisible(true);
            this.setVisible(false);
        }
    }
    public static void main(String[] args){
        new Room().setVisible(true);
    }
}
