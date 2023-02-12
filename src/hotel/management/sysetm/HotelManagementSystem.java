package hotel.management.sysetm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HotelManagementSystem extends JFrame implements ActionListener {
    HotelManagementSystem(){
        setBounds(100,100,1250,565);
      //  setSize(400,400);

      //  setLocation(300,300);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotel\\management\\sysetm\\icons\\first.jpg"));
        JLabel l1 = new JLabel(i1);
        l1.setBounds(0,0,1250,565);
        add(l1);

        JLabel l2= new JLabel("Hotel Management System");
        l2.setBounds(20,430, 1200,100);
        l2.setForeground(Color.white);
        l2.setFont(new Font("serif", Font.PLAIN,70));
        l1.add(l2);

        JLabel l3 = new JLabel("Click!");
        l3.setBounds(920,460,180,50);
        l3.setForeground(Color.white);
        l3.setFont(new Font("Bold",Font.BOLD,30));
        l1.add(l3);

        JButton b1 = new JButton("Next");
        b1.setBackground(Color.YELLOW);
        b1.setForeground(Color.BLACK);
        b1.setBounds(1020, 470, 150,30);
        b1.addActionListener(this);
        l1.add(b1);


        setLayout(null);
        setVisible(true);
        while(true){
            l2.setVisible(false);
            try{
                Thread.sleep(500);
            }
            catch (Exception e){
            }

            l2.setVisible(true);
            try{
                Thread.sleep(500);
            }
            catch(Exception e){
            }

        }

    }
    public void actionPerformed(ActionEvent ae){
        new login().setVisible(true);
        this.setVisible(false);
    }

    public static void main(String[] args){
        new HotelManagementSystem();


    }
}
