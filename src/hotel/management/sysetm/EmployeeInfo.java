package hotel.management.sysetm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import net.proteanit.sql.*;


public class EmployeeInfo extends JFrame implements ActionListener {
    JTable t1;
    JButton b1,b2;

    EmployeeInfo(){
        t1 = new JTable();
        t1.setFont(new Font("Tahoma",Font.BOLD,14));
        t1.setBounds(0,40,1200,450);
        add(t1);

        JLabel l1 =new JLabel("NAME");
        l1.setForeground(Color.white);
        l1.setBounds(10,10,60,30);
        add(l1);

        JLabel l2 =new JLabel("AGE");
        l2.setForeground(Color.white);
        l2.setBounds(170,10,60,30);
        add(l2);

        JLabel l3 =new JLabel("GENDER");
        l3.setForeground(Color.white);
        l3.setBounds(320,10,60,30);
        add(l3);

        JLabel l4 =new JLabel("DEPARTMENT");
        l4.setForeground(Color.white);
        l4.setBounds(460,10,100,30);
        add(l4);

        JLabel l5 =new JLabel("SALARY");
        l5.setForeground(Color.white);
        l5.setBounds(600,10,60,30);
        add(l5);

        JLabel l6 =new JLabel("MOBILE NO.");
        l6.setForeground(Color.white);
        l6.setBounds(770,10,100,30);
        add(l6);

        JLabel l7 =new JLabel("AADHAR");
        l7.setForeground(Color.white);
        l7.setBounds(910,10,100,30);
        add(l7);

        JLabel l8 =new JLabel("EMAIL");
        l8.setForeground(Color.white);
        l8.setBounds(1070,10,100,30);
        add(l8);

        b1 = new JButton("Load Data");
        b1.setBackground(Color.white);
        b1.setForeground(Color.black);
        b1.setBounds(330,500,120,30);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("Back");
        b1.setBackground(Color.white);
        b1.setForeground(Color.black);
        b2.setBounds(470,500,120,30);
        b2.addActionListener(this);
        add(b2);

        setLayout(null);
        setBounds(100,100,1200,600);
        getContentPane().setBackground(Color.BLACK);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            try{
                conn c = new conn();
                String str = "select * from employee";
                ResultSet rs = c.s.executeQuery(str);

                t1.setModel(DbUtils.resultSetToTableModel(rs));
            }
            catch(Exception e){

            }
        }
        else if(ae.getSource() == b2){
            new Reception().setVisible(true);
            this.setVisible(false);
        }
    }
    public static void main(String[] args){
        new EmployeeInfo().setVisible(true);

    }
}
