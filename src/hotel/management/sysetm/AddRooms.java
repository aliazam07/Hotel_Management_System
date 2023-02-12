package hotel.management.sysetm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class AddRooms extends JFrame implements ActionListener {
    JTextField t1,t2;
    JComboBox c1,c2,c3;
    JButton b1,b2;
    AddRooms(){
        JLabel l1 =new JLabel("ADD ROOMS");
        l1.setFont(new Font("Tahoma",Font.BOLD,18));
        l1.setBounds(200,20,150,20);
        add(l1);

        JLabel room = new JLabel("Room Number");
        room.setFont(new Font("Tahoma",Font.PLAIN,16));
        room.setBounds(100,80,120,30);
        add(room);

        t1 = new JTextField();
        t1.setBounds(250,80,150,30);
        t1.setFont(new Font("Tahoma",Font.PLAIN,16));
        t1.setBackground(Color.pink);
        add(t1);

        JLabel available = new JLabel("Available");
        available.setFont(new Font("Tahoma",Font.PLAIN,16));
        available.setBounds(100,130,120,30);
        add(available);

        c1 = new JComboBox(new String[] {"Available","Occupied"});
        c1.setFont(new Font("Tahoma",Font.PLAIN,16));
        c1.setBackground(Color.pink);
        c1.setBounds(250,130,150,30);
        add(c1);

        JLabel status = new JLabel("Cleaning Status");
        status.setFont(new Font("Tahoma",Font.PLAIN,16));
        status.setBounds(100,180,120,30);
        add(status);

        c2 = new JComboBox(new String[] {"Cleaned","Not Cleaned"});
        c2.setFont(new Font("Tahoma",Font.PLAIN,16));
        c2.setBackground(Color.pink);
        c2.setBounds(250,180,150,30);
        add(c2);

        JLabel price = new JLabel("Price");
        price.setFont(new Font("Tahoma",Font.PLAIN,16));
        price.setBounds(100,230,120,30);
        add(price);

        t2 = new JTextField();
        t2.setFont(new Font("Tahoma",Font.PLAIN,16));
        t2.setBackground(Color.pink);
        t2.setBounds(250,230,150,30);
        add(t2);

        JLabel type = new JLabel("Bed Type");
        type.setFont(new Font("Tahoma",Font.PLAIN,16));
        type.setBounds(100,280,120,30);
        add(type);

        c3 = new JComboBox(new String[] {"Single Bed","Double Bed"});
        c3.setFont(new Font("Tahoma",Font.PLAIN,16));
        c3.setBackground(Color.pink);
        c3.setBounds(250,280,150,30);
        add(c3);

        b1 = new JButton("ADD ROOM");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        b1.setBounds(120,340,120,30);
        add(b1);

        b2 = new JButton("CANCEL");
        b2.setForeground(Color.white);
        b2.setBackground(Color.BLACK);
        b2.addActionListener(this);
        b2.setBounds(250,340,120,30);
        add(b2);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotel\\management\\sysetm\\icons\\twelve.jpg"));
        JLabel l2 =new JLabel(i1);
        l2.setBounds(420,50,550,350);
        add(l2);


        setBounds(200,150,1000,500);
        getContentPane().setBackground(Color.cyan);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            String room = t1.getText();
            String available = (String) c1.getSelectedItem();
            String status = (String) c2.getSelectedItem();
            String price = t2.getText();
            String type = (String) c3.getSelectedItem();

            conn c = new conn();
                try{
                    String str = "insert into room values('"+room+"','"+available+"','"+status+"','"+price+"','"+type+"')";
                    c.s.executeUpdate(str);

                    JOptionPane.showMessageDialog(null,"New Room Added");
                }
                catch(Exception e){
                    System.out.println(e);
                }
            }

        else if(ae.getSource() == b2){
            this.setVisible(false);
        }
    }
    public static void main(String[] args) {
        new AddRooms().setVisible(true);

    }
}
