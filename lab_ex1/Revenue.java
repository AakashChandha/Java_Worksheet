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
public class Revenue {
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        double discount;
        System.out.println("Enter the unit price:");
        double unitprice=a.nextDouble();
        System.out.println("Enter the quantity:");
        double quantity=a.nextDouble();
        double revenue=quantity*unitprice;
        System.out.println("Revenue from sale:"+revenue);
        if(quantity>=100 && quantity<=120)
            discount=(revenue*10)/100;
        else if(quantity>120)
            discount=(revenue*15)/100;
        else
            discount=revenue;
        System.out.println("After discount:"+discount);
    }
}
