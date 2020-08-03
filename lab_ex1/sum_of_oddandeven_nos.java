/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_ex1;
import java.util.Scanner;

/**
 *
 * @author ELCOT
 */
public class sum_of_oddandeven_nos {
     public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int even=0;
        int odd=0;
        System.out.println("Enter the size of array:");
        int num=obj.nextInt();
        System.out.println("Enter the elements");
        int a[]=new int[10];
        for(int i=1;i<=num;i++)
        {
            a[i]=obj.nextInt();
            if(a[i]%2==0)
                even=even+a[i];
            else
                odd=odd+a[i];
        }
        System.out.println("Sum of even numbers is:"+even);
        System.out.println("Sum of odd numbers is:"+odd);
    }
}

