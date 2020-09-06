/*
Write a program that reads numbers and displays all the numbers as a list, then: 
    Prints the average of the numbers. 
    Prints the highest and lowest number. 
    Filters out all of the even numbers (ones divisible by 2).

 */
package lab_ex7;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author SONAL L R
 */
public class Numbers_al {
    Scanner obj=new Scanner(System.in);  //getting input from the user
        int num; 
        System.out.print("Enter 8 integers:");
        ArrayList<Integer> list=new ArrayList<Integer>();
        for (int i=0;i<8;i++)
        {
            num=obj.nextInt(); 
            list.add(num); 
        }
        /*ArrayList<Integer> list=new ArrayList<Integer>();//creation of arraylist
        list.add(87);
        list.add(19);
        list.add(96);
        list.add(2);
        list.add(66);
        list.add(18);
        list.add(128);
        list.add(22);*/
        System.out.println("The Arraylist values are:"+list);
        double total=0;
        double avg;
        for(int i=0;i<list.size();i++)
        {
            total=total+list.get(i);//calculating total value
        }
        avg=total/8;//calculatinging average value
        System.out.println("\nThe Average is:"+avg);//printing average value
        System.out.println("Highest value is:"+Collections.max(list));//max method of Collections class
        System.out.println("Lowest value is:"+Collections.min(list));//min method of Collections class
        System.out.println("\nUnsorted List is:"+list);
        list.removeIf((Integer s)->s%2==0);//removes the even numbers from the list
        System.out.println("Updated list is:"+list);//printing the updated list without even numbers
    }
}
