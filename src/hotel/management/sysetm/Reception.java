package hotel.management.sysetm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Reception extends JFrame implements ActionListener
{

    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;
    Reception(){
        b1 = new JButton("New Customer Form");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.white);
        b1.setBounds(10,30,200,30);
        add(b1);
        b1.addActionListener(this);

        b2 = new JButton("Room");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.white);
        b2.setBounds(10,70,200,30);
        add(b2);
        b2.addActionListener(this);

        b3 = new JButton("Department");
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.white);
        b3.setBounds(10,110,200,30);
        add(b3);
        b3.addActionListener(this);

        b4 = new JButton("All Employee Info");
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.white);
        b4.setBounds(10,150,200,30);
        add(b4);
        b4.addActionListener(this);

        b5 = new JButton("Customer Info");
        b5.setBackground(Color.BLACK);
        b5.setForeground(Color.white);
        b5.setBounds(10,190,200,30);
        add(b5);
        b5.addActionListener(this);

        b6 = new JButton("Manager Info");
        b6.setBackground(Color.BLACK);
        b6.setForeground(Color.white);
        b6.setBounds(10,230,200,30);
        add(b6);
        b6.addActionListener(this);

        b7 = new JButton("Check Out");
        b7.setBackground(Color.BLACK);
        b7.setForeground(Color.white);
        b7.setBounds(10,270,200,30);
        add(b7);
        b7.addActionListener(this);

        b8 = new JButton("Update Check Status");
        b8.setBackground(Color.BLACK);
        b8.setForeground(Color.white);
        b8.setBounds(10,310,200,30);
        add(b8);
        b8.addActionListener(this);

        b9 = new JButton("Update Room Status");
        b9.setBackground(Color.BLACK);
        b9.setForeground(Color.white);
        b9.setBounds(10,350,200,30);
        add(b9);
        b9.addActionListener(this);

        b10 = new JButton("Pick Up Service");
        b10.setBackground(Color.BLACK);
        b10.setForeground(Color.white);
        b10.setBounds(10,390,200,30);
        add(b10);
        b10.addActionListener(this);

        b11 = new JButton("Search Room");
        b11.setBackground(Color.BLACK);
        b11.setForeground(Color.white);
        b11.setBounds(10,430,200,30);
        add(b11);
        b11.addActionListener(this);

        b12 = new JButton("Logout");
        b12.setBackground(Color.BLACK);
        b12.setForeground(Color.white);
        b12.setBounds(10,470,200,30);
        add(b12);
        b12.addActionListener(this);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotel\\management\\sysetm\\icons\\fourth.jpg"));
        JLabel l1 =new JLabel(i1);
        l1.setBounds(230,40,560,450);
        add(l1);

        setLayout(null);
        setBounds(180,150,800,550);
        getContentPane().setBackground(Color.MAGENTA);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() ==b1){
            new AddCustomer().setVisible(true);
            this.setVisible(false);
        }
        else if(ae.getSource() ==b2){
            new Room().setVisible(true);
            this.setVisible(false);

        }
        else if(ae.getSource() ==b3){

        }
        else if(ae.getSource() ==b4){
            new EmployeeInfo().setVisible(true);
            this.setVisible(false);
        }
        else if(ae.getSource() ==b5){

        }
        else if(ae.getSource() ==b6){
            new ManagerInfo().setVisible(true);
            this.setVisible(false);
        }
        else if(ae.getSource() ==b7){

        }
        else if(ae.getSource() ==b8){

        }
        else if(ae.getSource() ==b9){

        }
        else if(ae.getSource() ==b10){

        } else if(ae.getSource() ==b11){

        }
        else if(ae.getSource() ==b12){
            setVisible(false);
        }
    }
    public static void main(String[] args) {
        new Reception().setVisible(true);
    }
}
