/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_ex13;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Sonal L R
 */
public class Registration_form {
    JFrame f;
    JLabel l1,l2,s1,s2; //l-label,p-password,s-sign in
    JTextField t1,t2,t3,p1,p2; 
    JPasswordField pw1,pw2; 
    JCheckBox cb; 
    JButton b; 
    Registration_form()
    {
        f=new JFrame("Registration Form");
        l1=new JLabel("------Register------");
        l1.setBounds(100,10,300,100);
        l1.setFont(new Font("Verdana",Font.PLAIN,30));
        l2=new JLabel("Create your account. It's free and only takes a minute.");
        l2.setBounds(50,50,500,100);
        l2.setFont(new Font("Arial",Font.PLAIN,15));       
        t1=new JTextField("First Name");
        t1.setBounds(50,150,150,30);
        t1.setFont(new Font("Arial",Font.PLAIN,12));
        t2=new JTextField("Last Name");
        t2.setBounds(250,150,150,30);
        t2.setFont(new Font("Arial",Font.PLAIN,12));
        t3=new JTextField("Email");
        t3.setBounds(50,200,350,30);
        t3.setFont(new Font("Arial",Font.PLAIN,12));
        p1=new JTextField("Password");
        p1.setBounds(50,250,350,30);
        p1.setFont(new Font("Arial",Font.PLAIN,12));
        pw1=new JPasswordField();
        pw1.setBounds(200,250,200,30);
        p2=new JTextField("Confirm Password");
        p2.setBounds(50,300,350,30);
        p2.setFont(new Font("Arial",Font.PLAIN,12));
        pw2=new JPasswordField();
        pw2.setBounds(200,200,200,30);
        cb=new JCheckBox("I accept the Terms of Use & Privacy Policy.");
        cb.setBounds(50,350,500,30);
        cb.setFont(new Font("Arial",Font.PLAIN,12));
        b=new JButton("Register Now");
        b.setBounds(50,400,350,30);
        Color c=new Color(0,155,0);
        b.setBackground(c);
        b.setForeground(Color.WHITE);      
        s1=new JLabel("Already have an account?");
        s1.setBounds(140,450,150,30);
        s1.setFont(new Font("Arial",Font.PLAIN,12));
        s2=new JLabel("Sign in");
        s2.setBounds(285,450,100,30);
        s2.setFont(new Font("Arial",Font.ITALIC,12));
        
        f.add(l1);
        f.add(l2);
        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.add(p1);
        f.add(pw1);
        f.add(p2);
        f.add(pw2);
        f.add(cb);
        f.add(b);
        f.add(s1);
        f.add(s2);
        f.setLayout(null);
        f.setSize(500,600);
        f.setVisible(true);      
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        new Registration_form();
    }
}
