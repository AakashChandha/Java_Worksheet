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
public class count_nums {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the limit:");
        int limit=obj.nextInt();
        System.out.println("Count of numbers having 5 as a digit are:");
        count s=new count();
        System.out.println(s.first(limit));
    }
}
class count
{
    int lim;
    public int first(int limit)
    {
        int count=0;
        for(int i=1;i<=limit;i++)
        {
            count+=second(i);
        }
        return count;
    }
    public int second(int i)
    {
        int count=0;
        while(i>0)
        {
            if(i%10==5)
                count++;
            i=i/10;
        }
        return count;
    }
}
