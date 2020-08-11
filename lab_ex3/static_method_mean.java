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
public class static_method_mean {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int s=obj.nextInt();
        double a[]=new double[s];
        System.out.println("Enter the array eleemnts:");
        for(int i=0;i<s;i++)
        {
            a[i]=obj.nextDouble();
        }
        average.display(a,s);
    }
}
class average
{
    static void display(double a[],int n)
    {
        double avg=0;
        double mean;
        for(int i=0;i<n;i++)
        {
            avg=avg+a[i];
        }
        mean=avg/n;
        System.out.println("Average is:"+mean);
    }
}
