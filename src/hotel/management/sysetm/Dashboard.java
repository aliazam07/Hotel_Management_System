package hotel.management.sysetm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Dashboard extends JFrame implements ActionListener {
    JMenuBar mb;
    JMenu m1, m2;
    JMenuItem i1,i2,i3,i4;
    Dashboard(){
        mb = new JMenuBar();
        mb.setBackground(Color.BLACK);
        add(mb);

        m1= new JMenu("HOTEL MANGEMENT");
        m1.setForeground(Color.red);
        m1.setBackground(Color.BLACK);
        mb.add(m1);

        m2= new JMenu("ADMIN");
        m2.setBackground(Color.BLACK);
        m2.setForeground(Color.GREEN);
        mb.add(m2);

        i1 = new JMenuItem("RECEPTION");
        i1.addActionListener(this);
        m1.add(i1);

        i2 = new JMenuItem("ADD EMPLOYEE");
        i2.addActionListener(this);
        m2.add(i2);

        i3 = new JMenuItem("ADD ROOMS");
        i3.addActionListener(this);
        m2.add(i3);

        i4 = new JMenuItem("ADD DRIVERS");
        i4.addActionListener(this);
        m2.add(i4);

        mb.setBounds(0,0,1350,30);
        ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("hotel\\management\\sysetm\\icons\\third.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1350,680,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0,0,1350,680);
        add(l1);

        JLabel l2 = new JLabel("THE TAJ RESORT WELCOMES YOU");
        l2.setBounds(350,60,750,60);
        l2.setForeground(Color.white);
        l2.setFont(new Font("Tahma",Font.PLAIN,40));
        l1.add(l2);

        setLayout(null);
        setBounds(0,0,1370,730);
        getContentPane().setBackground(Color.BLACK);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getActionCommand().equals("RECEPTION")){
            new Reception().setVisible(true);

        }
        else if(ae.getActionCommand().equals("ADD EMPLOYEE")){
            new AddEmployee().setVisible(true);
        }
        else if(ae.getActionCommand().equals("ADD ROOMS")){
            new AddRooms().setVisible(true);
        }
        else if(ae.getActionCommand().equals("ADD DRIVERS")){
            new AddDriver().setVisible(true);
        }
    }

    public static void main(String[] args){
        new Dashboard().setVisible(true);
    }
}
