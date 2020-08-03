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
public class minimum_of_2 {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the first value:");
        int first=obj.nextInt();
        System.out.println("Enter the second value:");
        int second=obj.nextInt();
        int result=(first<second)?first:second;
        System.out.println(result+" is the minimum value.");
    }
}

