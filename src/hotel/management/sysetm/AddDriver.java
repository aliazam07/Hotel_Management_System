package hotel.management.sysetm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

public class AddDriver extends JFrame implements ActionListener {
    JTextField t1,t2,t3,t4,t5;
    JComboBox c1,c2;
    JButton b1,b2;
    AddDriver(){
        JLabel title = new JLabel("ADD DRIVER");
        title.setFont(new Font("Tahoma",Font.BOLD,22));
        title.setBounds(300,20,200,30);
        add(title);

        JLabel name= new JLabel("Name");
        name.setFont(new Font("Tahoma",Font.BOLD,18));
        name.setBounds(120,70,120,30);
        add(name);

        t1 =new JTextField();
        t1.setFont(new Font("Tahoma",Font.BOLD,18));
        t1.setBounds(280,70,160,30);
        t1.setBackground(Color.CYAN);
        add(t1);

        JLabel age= new JLabel("Age");
        age.setFont(new Font("Tahoma",Font.BOLD,18));
        age.setBounds(120,120,120,30);
        add(age);

        t2 =new JTextField();
        t2.setFont(new Font("Tahoma",Font.BOLD,18));
        t2.setBounds(280,120,160,30);
        t2.setBackground(Color.CYAN);
        add(t2);

        JLabel gender = new JLabel("Gender");
        gender.setFont(new Font("Tahoma",Font.BOLD,18));
        gender.setBounds(120,170,120,30);
        add( gender);

        String[] str = {"Male","Female"};
        c1= new JComboBox(str);
        c1.setFont(new Font("Tahoma",Font.BOLD,18));
        c1.setBounds(280,170,160,30);
        c1.setBackground(Color.CYAN);
        add(c1);


        JLabel carCompany= new JLabel("Car Company");
        carCompany.setFont(new Font("Tahoma",Font.BOLD,18));
        carCompany.setBounds(120,220,120,30);
        add(carCompany);

        t3 =new JTextField();
        t3.setFont(new Font("Tahoma",Font.BOLD,18));
        t3.setBounds(280,220,160,30);
        t3.setBackground(Color.CYAN);
        add(t3);

        JLabel model= new JLabel("Model");
        model.setFont(new Font("Tahoma",Font.BOLD,18));
        model.setBounds(120,270,120,30);
        add(model);

        t4 =new JTextField();
        t4.setFont(new Font("Tahoma",Font.BOLD,18));
        t4.setBounds(280,270,160,30);
        t4.setBackground(Color.CYAN);
        add(t4);

        JLabel available= new JLabel("Available");
        available.setFont(new Font("Tahoma",Font.BOLD,18));
        available.setBounds(120,320,120,30);
        add(available);

        String[] str1 = {"Available","Busy"};
        c2= new JComboBox(str1);
        c2.setFont(new Font("Tahoma",Font.BOLD,18));
        c2.setBounds(280,320,160,30);
        c2.setBackground(Color.CYAN);
        add(c2);

        JLabel location= new JLabel("Location");
        location.setFont(new Font("Tahoma",Font.BOLD,18));
        location.setBounds(120,370,120,30);
        add(location);

        t5 =new JTextField();
        t5.setFont(new Font("Tahoma",Font.BOLD,18));
        t5.setBounds(280,370,160,30);
        t5.setBackground(Color.CYAN);
        add(t5);

        b1 = new JButton("ADD DRIVER");
        b1.setFont(new Font("Tahoma",Font.BOLD,16));
        b1.setBounds(130,410,150,30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("CANCEL");
        b2.setFont(new Font("Tahoma",Font.BOLD,16));
        b2.setBounds(290,410,150,30);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.white);
        add(b2);

        ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("hotel\\management\\sysetm\\icons\\eleven.jpg"));
        Image i2 = i1.getImage().getScaledInstance(450,350,Image.SCALE_DEFAULT);
        ImageIcon i3 =new ImageIcon(i2);
        JLabel l2 = new JLabel(i3);
        l2.setBounds(450,60,450,350);
        add(l2);

        setLayout(null);
        getContentPane().setBackground(Color.PINK);
        setBounds(250,160,920,500);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() ==b1) {
            String name =t1.getText();
            String age =t2.getText();
            String gender =(String)c1.getSelectedItem();
            String company = t3.getText();
            String model = t4.getText();
            String available = (String)c2.getSelectedItem();
            String location = t5.getText();

            conn c =new conn();

            String str = "insert into driver values('"+name+"','"+age+"','"+gender+"','"+company+"','"+model+"','"+available+"','"+location+"')";


            try {
                c.s.executeUpdate(str);
                JOptionPane.showMessageDialog(null,"Driver is successfully added");
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        else if(ae.getSource()==b2)
            this.setVisible(false);
    }
    public static void main(String[] args) {
        AddDriver ad =new AddDriver();

    }
}
