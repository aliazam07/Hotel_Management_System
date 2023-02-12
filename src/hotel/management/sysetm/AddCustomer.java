package hotel.management.sysetm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class AddCustomer extends JFrame implements ActionListener {
    JTextField t1,t2,t3,t4;
    JComboBox c1,c2;
    Choice ch1;
    JButton b1,b2;
    JRadioButton r1,r2;
    AddCustomer(){
        JLabel l1 =new JLabel("NEW CUSTOMER FORM");
        l1.setFont(new Font("Tahoma", Font.BOLD,18));
        l1.setBounds(50,20,220,30);
        add(l1);

        JLabel l2 =new JLabel("ID");
        l2.setFont(new Font("Tahoma", Font.BOLD,14));
        l2.setBounds(30,70,120,30);
        add(l2);

        c1 = new JComboBox(new String[]{"Passport","Aadhar","Voter-ID","Driving License"});
        c1.setBackground(Color.CYAN);
        c1.setFont(new Font("Tahoma", Font.PLAIN,14));
        c1.setBounds(230,70,160,30);
        add(c1);


        JLabel l3 =new JLabel("ID NUMBER");
        l3.setFont(new Font("Tahoma", Font.BOLD,14));
        l3.setBounds(30,120,120,30);
        add(l3);

        t1 = new JTextField();
        t1.setBackground(Color.CYAN);
        t1.setFont(new Font("Tahoma", Font.PLAIN,14));
        t1.setBounds(230,120,160,30);
        add(t1);


        JLabel l4 =new JLabel("NAME");
        l4.setFont(new Font("Tahoma", Font.BOLD,14));
        l4.setBounds(30,170,120,30);
        add(l4);

        t2 = new JTextField();
        t2.setBackground(Color.CYAN);
        t2.setFont(new Font("Tahoma", Font.PLAIN,14));
        t2.setBounds(230,170,160,30);
        add(t2);

        JLabel l5 =new JLabel("GENDER");
        l5.setFont(new Font("Tahoma", Font.BOLD,14));
        l5.setBounds(30,220,120,30);
        add(l5);

        r1 = new JRadioButton("Male");
        r1.setBackground(Color.CYAN);
        r1.setFont(new Font("Tahoma", Font.BOLD,14));
        r1.setBounds(230,220,70,30);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setBackground(Color.CYAN);
        r2.setFont(new Font("Tahoma", Font.BOLD,14));
        r2.setBounds(310,220,80,30);
        add(r2);

        JLabel l6 =new JLabel("COUNTRY");
        l6.setFont(new Font("Tahoma", Font.BOLD,14));
        l6.setBounds(30,270,120,30);
        add(l6);

        t3 = new JTextField();
        t3.setBackground(Color.CYAN);
        t3.setFont(new Font("Tahoma", Font.PLAIN,14));
        t3.setBounds(230,270,160,30);
        add(t3);

        JLabel l7 =new JLabel("ALLOCATED ROOM NO.");
        l7.setFont(new Font("Tahoma", Font.BOLD,14));
        l7.setBounds(30,320,180,30);
        add(l7);

        ch1 = new Choice();
        try{
            conn c = new conn();
            String str = "select* from room";
            ResultSet rs = c.s.executeQuery(str);
            while (rs.next()){
                ch1.add(rs.getString("room_number"));
            }
        }
        catch(Exception e){

        }
        ch1.setBounds(230,320,160,30);
        ch1.setFont(new Font("Tahoma", Font.PLAIN,14));
        ch1.setBackground(Color.CYAN);
        add(ch1);

        JLabel l8 =new JLabel("CHECKED IN");
        l8.setFont(new Font("Tahoma", Font.BOLD,14));
        l8.setBounds(30,370,120,30);
        add(l8);

        c2 = new JComboBox(new String[]{"Yes","No"});
        c2.setBackground(Color.CYAN);
        c2.setFont(new Font("Tahoma", Font.BOLD,14));
        c2.setBounds(230,370,160,30);
        add(c2);



        JLabel l9 =new JLabel("DEPOSIT");
        l9.setFont(new Font("Tahoma", Font.BOLD,14));
        l9.setBounds(30,420,120,30);
        add(l9);

        t4 = new JTextField();
        t4.setBackground(Color.CYAN);
        t4.setFont(new Font("Tahoma", Font.PLAIN,14));
        t4.setBounds(230,420,160,30);
        add(t4);

        b1 =new JButton("ADD CUSTOMER");
        b1.setBounds(50,480,160,30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.white);
        b1.setFont(new Font("Tahoma", Font.PLAIN,16));
        b1.addActionListener(this);
        add(b1);

        b2 =new JButton("BACK");
        b2.setBounds(230,480,120,30);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.white);
        b2.setFont(new Font("Tahoma", Font.PLAIN,16));
        b2.addActionListener(this);
        add(b2);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotel\\management\\sysetm\\icons\\fifth.png"));
        Image i2 = i1.getImage().getScaledInstance(400,500,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l10 = new JLabel(i3);
        l10.setBounds(480,40,400,500);
        add(l10);


        setLayout(null);
        getContentPane().setBackground(Color.magenta);
        setBounds(150,100,1000,600);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() ==b1) {
            String id = (String) c1.getSelectedItem();
            String id_number = t1.getText();
            String name = t2.getText();
            String gender = null;
            if (r1.isSelected()) {
                gender = "Male";
            } else if (r2.isSelected()) {
                gender = "Female";
            }
            String country = t3.getText();
            String room = (String) ch1.getSelectedItem();
            String checked_in = (String) c2.getSelectedItem();
            String deposit = t4.getText();

            String str = "insert into customer values('" + id + "','" + id_number + "','" + name + "','" + gender + "','" + country + "','" + room + "','" + checked_in + "','" + deposit + "')";
            String str2 = "update room set available = 'occupied' where room ='"+room+"'";
            try {
                conn c = new conn();
                c.s.executeUpdate(str);
                c.s.executeUpdate(str2);
                JOptionPane.showMessageDialog(null, "New Customer Added");
                new Reception().setVisible(true);
                this.setVisible(false);
            } catch (Exception e) {
                System.out.println(e);
            }
        }else if(ae.getSource() ==b2){
            new Reception().setVisible(true);
            this.setVisible(false);
        }
    }
    public static void main(String[] args) {
       new AddCustomer().setVisible(true);

    }
}
