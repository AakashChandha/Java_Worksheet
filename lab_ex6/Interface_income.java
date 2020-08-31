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
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the gender of the employee:");
        String gender=obj.next();
        System.out.println("Enter the income of the employee:");
        double income=obj.nextDouble();
        
        employee1 obj1=new employee1();
        obj1.show(gender,income);
        obj1.information(gender,income);
    }
}
interface customer
{
    void information(String gender,double income);
    void show(String gender,double income);
} 
class employee1 implements customer
{
    public void information(String gender,double income)
    {
        if(gender=="Male")
        {
            if(income<=190000)
                System.out.println("Tax% is:NIL");
            else if(income>190000 && income<=200000)
                System.out.println("Tax% is:10%");
            else if(income>200000 && income<=500000)
                System.out.println("Tax% is:20%");
            else //(if income>500000)
                System.out.println("Tax% is:25%");
        }
        else //if(gender=="Female")
        {
            if(income<=190000)
                System.out.println("Tax% is:NIL");
            else if(income>190000 && income<=200000)
                System.out.println("Tax% is:NIL");
            else if(income>200000 && income<=500000)
                System.out.println("Tax% is:10%");
            else //(if income>500000)
                System.out.println("Tax% is:2%");
        }  
    }
    public void show(String gender,double income)
    {
        System.out.println("Gender of the employee is:"+gender);
        System.out.println("\nSalary of the employee is:"+income);
    }
}