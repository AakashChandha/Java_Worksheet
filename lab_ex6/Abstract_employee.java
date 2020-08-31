/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_ex6;
import java.util.Scanner;
/**
 *
 * @author SONAL L R
 */
public class Abstract_employee {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        employee e=new manager();
        employee e1=new manager();
        employee e2=new clerk();
        System.out.println("Enter Manager 1 details:");
        e.getdetails();
        System.out.println("Enter Manager 2 details:");
        e1.getdetails();
        System.out.println("Enter Clerk details:");
        e2.getdetails();
        System.out.println("Manager 1 details:");
        System.out.println(e);
        System.out.println("Salary is:Rs."+e.CalcSalary());
        System.out.println("Manager 2 details:");
        System.out.println(e1);
        System.out.println("Salary is:Rs."+e1.CalcSalary());
        System.out.println("Clerk details:");
        System.out.println(e2);
        System.out.println("Salary is:Rs."+e2.CalcSalary());
    }
}
abstract class employee
{
    Scanner s=new Scanner(System.in);
    String emp_name;
    int emp_age;
    float hour_rate; 
    void getdetails()
    {
        System.out.println("Enter employee name:");
        emp_name=s.next();
        System.out.println("Enter employee age:");
        emp_age=s.nextInt();
        System.out.println("Enter the no.of hours worked:");
        hour_rate=s.nextFloat();
    }
    abstract double CalcSalary();
    public String toString()
    {
      return "Name:"+emp_name+"\nAge:"+emp_age+"\nHours worked:"+hour_rate;
    }
}
class manager extends employee
{
    float manager_salary;
    double CalcSalary()
    {
        manager_salary=hour_rate*1000;
        return manager_salary;
    }
}
class clerk extends employee
{
    float clerk_salary;
    double CalcSalary()
    {
        clerk_salary=hour_rate*300;
        return clerk_salary;
    }
}