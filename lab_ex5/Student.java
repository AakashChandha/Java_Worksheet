/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_ex5;
import java.util.Scanner;
/**
 *
 * @author SONAL L R
 */
public class Student {
    public static void main(String[] args){
        //department obj=new department();
        //student1 obj1=new student1();
        //obj.getdpetdetails();
        //obj1.getstudentdetails();
        //obj.display();
        //obj1.display();
        department[] d=new department[5];   //array
        student1[] s=new student1[5];
        for(int i=0;i<5;i++)
        {
            d[i]=new department();
            d[i].getdeptdetails();
            s[i]=new student1();
            s[i].getstudentdetails();
            d[i].display();
            s[i].display();
        }
    }
}
class college
{
    String clgname;
    int clgcode;
    Scanner obj=new Scanner(System.in);
    public void getclgdetails()
    {
        System.out.println("Enter the College Name:");
        clgname=obj.next();
        System.out.println("Enter the College Code:");
        clgcode=obj.nextInt();
    }
    public void display()
    {
        System.out.println("College details:");
        System.out.println("College Name:"+clgname+"\nCollege Code:"+clgcode);
    }
}
class department extends college
{
    String deptname;
    public void getdeptdetails()
    {
        super.getclgdetails();
        System.out.println("Enter the Department:");
        deptname=obj.next();
    }
    public void display()
    {
        super.display();
        System.out.println("Department details:");
        System.out.println("Department:"+deptname);
    }
}
class student1 extends department
{
    String studname;
    String studrollno;
    double m1,m2,m3,m4,m5;
    double total,average;
    public void getstudentdetails()
    {
        System.out.println("Enter Student name:");
        studname=obj.next();
        System.out.println("Enter Student roll.no:");
        studrollno=obj.next();
        System.out.println("Enter OOPS mark:");
        m1=obj.nextDouble();
        System.out.println("Enter DM mark:");
        m2=obj.nextDouble();
        System.out.println("Enter DS mark:");
        m3=obj.nextDouble();
        System.out.println("Enter DPSD mark:");
        m4=obj.nextDouble();
        System.out.println("Enter CE mark:");
        m5=obj.nextDouble();    
        total=m1+m2+m3+m4+m5;
        average=total/5;
    }
    public void display()
    {
        System.out.println("Student details:");
        System.out.println("Student name:"+studname+"\nStudent Roll.no:"+studrollno);
        System.out.println("Marks:"+"\nOOPS mark:"+m1+"\nDM mark:"+m2+"\nDS mark:"+m3+"\nDPSD mark:"+m4+"\nCE mark:"+m5);
        System.out.println("Total:"+total+"\nAverage:"+average);
    }   
}