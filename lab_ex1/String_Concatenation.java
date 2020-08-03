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
public class String_Concatenation {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=obj.nextInt();
        String str="";
        for(int i=1;i<=num;i++)
        {
            str=str+i;
        }
        System.out.println("Output:"+str);
    }  
}
