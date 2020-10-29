/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_ex13;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Sonal L R
 */
public class Background_color extends JFrame implements ActionListener {
    JButton b1,b2,b3,b4,b5;
    Background_color()
    {
        b1=new JButton("Yellow");
        b1.setBounds(100,100,100,50);
        b2=new JButton("Red");
        b2.setBounds(210,100,100,50);
        b3=new JButton("cyan");
        b3.setBounds(320,100,100,50);
        b4=new JButton("Black");
        b4.setBounds(430,100,100,50);
        b5=new JButton("Green");
        b5.setBounds(540,100,100,50);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        setSize(600,400);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
             getContentPane().setBackground(Color.YELLOW);
        }
        if(ae.getSource()==b2)
        {
            getContentPane().setBackground(Color.RED);
        }
        if(ae.getSource()==b3)
        {
            getContentPane().setBackground(Color.CYAN);
        }
        if(ae.getSource()==b4)
        {
            getContentPane().setBackground(Color.BLACK);
        }
        if(ae.getSource()==b5)
        {
            getContentPane().setBackground(Color.GREEN);
        }
    }
    public static void main(String[] args){
        new Background_color();
    }
}