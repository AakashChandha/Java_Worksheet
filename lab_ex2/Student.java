/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_ex2;
import java.util.Scanner;
/**
 *
 * @author ELCOT
 */
public class Student {
    public static void main(String[] arg){
        Scanner obj=new Scanner(System.in);
        Student in=new Student();
        double a[]=new double[5];
        double b[]=new double[5]; 
        double c[]=new double[5];
        double d[]=new double[5];
        double e[]=new double[5];
        System.out.println("Enter 5 subjects marks of student 1:");
        for(int i=0;i<5;i++)
            a[i]=obj.nextDouble();
        System.out.println("Enter 5 subjects marks of student 2:");
        for(int i=0;i<5;i++)
            b[i]=obj.nextDouble();
        System.out.println("Enter 5 subjects marks of student 3:");
        for(int i=0;i<5;i++)
            c[i]=obj.nextDouble();
        System.out.println("Enter 5 subjects marks of student 4:");
        for(int i=0;i<5;i++)
            d[i]=obj.nextDouble();
        System.out.println("Enter 5 subjects marks of student 5:");
        for(int i=0;i<5;i++)
            e[i]=obj.nextDouble();
        stud s=new stud();
        s.cal(a,1);
        s.cal(b,2);
        s.cal(c,3);
        s.cal(d,4);
        s.cal(e,5);
    }
}
class stud
{
    double tot,avg;
    stud()
    {
        tot=0;
        avg=0;
    }
    void cal(double array[],int stud1)
        {
           for(int i=0;i<5;i++)
               tot=tot+array[i];
           avg=tot/5;
           System.out.println("Student:"+stud1);
           System.out.println("Total is:"+tot);
           System.out.println("Average is:"+avg+"\n");
        }  
}