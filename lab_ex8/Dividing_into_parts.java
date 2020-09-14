/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_ex8;
import java.util.Scanner;
/**
 *
 * @author SONAL L R
 */
public class Dividing_into_parts {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the string:");
        String s=obj.next(); //"abcdefghijklmnopqrstuvwxy"
        int len=s.length();  
        int n=5;
        if(len%n!=0)
        {  
            System.out.println("The string cannot be divided into "+n+" equal parts.");
            return;
        }  
        int part=len/n;
        System.out.println("The string is divisible into "+n+" equal parts. They are:");
        for(int i=0;i<len;i++)
        {
            if(i%part==0)
            {
                System.out.print("\n");
            }
            System.out.println(s.charAt(i));
        }  
    }
}