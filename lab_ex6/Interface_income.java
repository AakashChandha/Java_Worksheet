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
public class Interface_income {
   public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the employee name:");
        double salary;
        double tax=0;
        String a=obj.next();
        System.out.print("Enter the employee gender(If female enter F and if male enter M):");
        char b=obj.next().charAt(0);
        System.out.print("Enter the employee salary:");
        salary=obj.nextDouble();
        employee1 e=new employee1();
        e.show(salary,tax,b);
        e.information();
   }
}
interface Customer
{
    void information();
    void show(double income,double Tax,char b);
} 
class employee1 implements Customer
{
    public void show(double income,double Tax,char b)
    {
        System.out.println("\nCalculation of tax:");
        if(income<=190000)
        {
            if(b=='M')
            {
                Tax=income*0.0;
                System.out.println("The tax is 0% from the salary");
                System.out.println("The tax amount of the employee is:"+Tax);
            }
            if(b=='F')
            {
                Tax=income*0.0;
                System.out.println("The tax is 0% from the salary");
                System.out.println("The tax amount of the employee is:"+Tax);
            }
        }
        if(income>190000 && income<=200000)
        {
            if(b=='M')
            {
                Tax=income*0.1;
                System.out.println("The tax is 10% from the salary");
                System.out.println("The tax amount of the employee is:"+Tax);
            }
            else
            {
                Tax=income*0.0;
                System.out.println("The tax is 0% from the salary");
                System.out.println("The tax amount of the employee is:"+Tax);
            }
        }
        if(income>200000 && income<=500000)
        {
            if(b=='M')
            {
                Tax=income*0.2;
                System.out.println("The tax is 20% from the salary");
                System.out.println("The tax amount of the employee is:"+Tax);
            }
            if(b=='F')
            {
                Tax=income*0.1;
                System.out.println("The tax is 10% from the salary");
                System.out.println("The tax amount of the employee is:"+Tax);
            }
        }
        if(income>500000)
        {
            if(b=='M')
            {
                Tax=income*0.25;
                System.out.println("The tax is 25% from the salary");
                System.out.println("The tax amount of the employee is:"+Tax);
            }
            else
            {
                Tax=income*0.2;
                System.out.println("The tax is 20% from the salary");
                System.out.println("The tax amount of the employee is:"+Tax);
            }                    
        }
    }
    public void information() 
    {
        System.out.println("\nThe tax amount differs from gender to gender.");
        System.out.println("The tax amount differs from the salary of the employee also.");
    }
}
