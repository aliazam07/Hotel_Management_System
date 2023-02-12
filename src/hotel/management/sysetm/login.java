package hotel.management.sysetm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.sql.ResultSet;

public class login extends JFrame implements ActionListener {
    JLabel l1,l2;
    JTextField t1,t2;
    JButton b1,b2;
    login(){
        l1 = new JLabel("Username");
        l1.setBounds(50,40,100,30);
        add(l1);

        l2 = new JLabel("Password");
        l2.setBounds(50,80,100,30);
        add(l2);

        t1 = new JTextField();
        t1.setBounds(120,40,150,30);
        add(t1);

        t2 = new JPasswordField();
        t2.setBounds(120,80,150,30);
        add(t2);

        b1 = new JButton("Login");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(50,150,120,30);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("Cancel");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(160,150,120,30);
        b2.addActionListener(this);
        add(b2);

        ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("hotel\\management\\sysetm\\icons\\second.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(350,10,200,170);
        add(l3);

        setBounds(500,300,600,300);
        getContentPane().setBackground(Color.PINK);
        setLayout(null);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== b1){
            String username = t1.getText();
            String password = t2.getText();
            conn c = new conn();
            String str = "select * from login where username = '"+username+"' and password= '"+password+"'";
            try{
               ResultSet rs=  c.s.executeQuery(str);
               if(rs.next()){
                   new Dashboard().setVisible(true);
                   this.setVisible(false);
               }
               else{
                   JOptionPane.showMessageDialog(null,"Invalid username and password");
                   this.setVisible(false);
               }
            }
            catch(Exception e){

            }

        }
        else if(ae.getSource()== b2){
            System.exit(0);
        }

    }
    public static void main(String[] args){
        new login();


    }
}
