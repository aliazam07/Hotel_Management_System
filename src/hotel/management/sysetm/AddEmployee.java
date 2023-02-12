package hotel.management.sysetm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class AddEmployee extends JFrame implements ActionListener {
    JTextField t1,t2,t3,t4,t5,t6;
    JRadioButton r1,r2;
    JComboBox c1;
    JButton b1;

    AddEmployee(){
        JLabel name = new JLabel("NAME");
        name.setBounds(60,30,120,30);
        name.setFont(new Font("Talima",Font.PLAIN,17));
        add(name);

        t1 = new JTextField();
        t1.setBackground(Color.CYAN);
        t1.setBounds(200,30,150,30);
        add(t1);

        JLabel age = new JLabel("AGE");
        age.setBounds(60,80,120,30);
        age.setFont(new Font("Talima",Font.PLAIN,17));
        add(age);

        t2 = new JTextField();
        t2.setBackground(Color.CYAN);
        t2.setBounds(200,80,150,30);
        add(t2);

        JLabel gender = new JLabel("GENDER ");
        gender.setBounds(60,130,120,30);
        gender.setFont(new Font("Talima",Font.PLAIN,17));
        add(gender );

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Talima",Font.PLAIN,14));
        r1.setBounds(200,130,55,30);
        r1.setBackground(Color.CYAN);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Talima",Font.PLAIN,14));
        r2.setBounds(260,130,90,30);
        r2.setBackground(Color.CYAN);
        add(r2);

        JLabel job = new JLabel("JOB ");
        job.setBounds(60,180,120,30);
        job.setFont(new Font("Talima",Font.PLAIN,17));
        add(job);

        String str[] = {"Front Desks Clerks","Porters","Housekeeping","Kitchen Staff","Room Services","Waiter/Waitress","Manager","Accountant"};
        c1= new JComboBox(str);
        c1.setBackground(Color.CYAN);
        c1.setBounds(200,180,150,30);
        add(c1);

        JLabel salary = new JLabel("SALARY ");
        salary.setBounds(60,230,120,30);
        salary.setFont(new Font("Talima",Font.PLAIN,17));
        add(salary);

        t3 = new JTextField();
        t3.setBackground(Color.CYAN);
        t3.setBounds(200,230,150,30);
        add(t3);

        JLabel phone = new JLabel("PHONE");
        phone.setBounds(60,280,120,30);
        phone.setFont(new Font("Talima",Font.PLAIN,17));
        add(phone);

        t4 = new JTextField();
        t4.setBackground(Color.CYAN);
        t4.setBounds(200,280,150,30);
        add(t4);

        JLabel aadhar = new JLabel("AADHAR");
        aadhar.setBounds(60,330,120,30);
        aadhar.setFont(new Font("Talima",Font.PLAIN,17));
        add(aadhar);

        t5 = new JTextField();
        t5.setBackground(Color.CYAN);
        t5.setBounds(200,330,150,30);
        add(t5);

        JLabel email = new JLabel("EMAIL");
        email.setBounds(60,380,120,30);
        email.setFont(new Font("Talima",Font.PLAIN,17));
        add(email);

        t6 = new JTextField();
        t6.setBackground(Color.CYAN);
        t6.setBounds(200,380,150,30);
        add(t6);

        b1 = new JButton("SUBMIT");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(120,420,120,30);
        b1.addActionListener(this);
        add(b1);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotel\\management\\sysetm\\icons\\tenth.jpg"));
        Image i2 = i1.getImage().getScaledInstance(500,500,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 =new JLabel(i3);
        l1.setBounds(450,50,400,400);
        add(l1);

        JLabel l2 = new JLabel("ADD EMPLOYEE DETAILS");
        l2.setBackground(Color.BLUE);
        l2.setBounds(450,15,350,30);
        l2.setFont(new Font("Tahoma",Font.PLAIN,30));
        add(l2);

        setLayout(null);
        setBounds(250,160,920,500);
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        String name =t1.getText();
        String  age=t2.getText();
        String salary =t3.getText();
        String phone =t4.getText();
        String aadhar =t5.getText();
        String email =t6.getText();

        String gender= null;
        if(r1.isSelected()){
            gender="Male";
        }
        else if(r2.isSelected()){
            gender="Female";
        }

        String job =(String) c1.getSelectedItem();

        conn c = new conn();

        String str = "insert into employee values('"+name+"','"+age+"','"+gender+"','"+job+"','"+salary+"','"+phone+"','"+aadhar+"','"+email+"')";
    try{
        c.s.executeUpdate(str);
        JOptionPane.showMessageDialog(null,"NEW EMPLOYEE ADDED");
        this.setVisible(false);

    }
    catch(Exception e){
        System.out.println(e);
    }
    }
    public static void main(String[] args){
        new AddEmployee().setVisible(true);

    }
}
