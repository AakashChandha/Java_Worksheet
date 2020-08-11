/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_ex3;
import java.util.Scanner;
/**
 *
 * @author ELCOT
 */
public class static_method_reverse {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int s=obj.nextInt();
        int a[]=new int[s];
        System.out.println("Enter the array elements:");
        for(int i=0;i<s;i++)
        {
            a[i]=obj.nextInt();
        }
        reverse.display(a,s);
    }
}
class reverse
{
    static void display(int a[],int s)
    {
        int rever[]=new int[s];
        System.out.println("Reversed array is:");
        for(int i=s-1;i>=0;i--)
        {
            rever[i]=a[i];
            System.out.println(rever[i]);
        }
    }
}
