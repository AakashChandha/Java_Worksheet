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
public class Palindrome {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String a,b="";
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the string to be checked:");
        a=obj.next(); //getting string input in a
        int n=a.length(); // storing length of string in n
        for(int i=n-1;i>=0;i--)
        {
            b=b+a.charAt(i);
        }
        if(a.equalsIgnoreCase(b)) //comparing both strings
        {
            System.out.println("The string is palindrome.");
        }
        else
        {
            System.out.println("The string is not palindrome.");
        }
    }
}