/*
1.Write a java program for generating three threads to perform the following operations
    i)	Getting N numbers as input
    ii)	Printing the numbers divisible by five
    iii)Computing the average.
 */
package lab_ex11;
import java.util.Scanner;

/**
 *
 * @author Sonal L R
 */
public class Threads {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        try 
        {
            System.out.println("Enter how many number to calculate: ");
            int n=obj.nextInt(); 
            int a[]=new int[n]; //getting input using array
            System.out.println("Enter the numbers: ");
            for(int i=0;i<n;i++)
                a[i]=obj.nextInt();
            th1 p=new th1(n,a);
            Thread t1=new Thread(p); //calls display method
            th2 q=new th2(n,a);
            Thread t2=new Thread(q);
            th3 r=new th3(n,a);
            Thread t3=new Thread(r);
            t1.start(); //finds run method
            t1.join();  //waits for the thread to die
            t2.start();
            t2.join();
            t3.start();
            t3.join();
        }
        catch(InterruptedException e) 
        {
            System.out.println(e);
        }
    } 
}

class th1 implements Runnable //to combine other class
{
    public int n;
    public int[] a;
    public th1(int n,int[] a) 
    {
        this.n=n;
        this.a=a;
    }
    public void run() 
    {
        System.out.print("Entered numbers are: ");
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
        System.out.println();
    }
}
class th2 extends th1 implements Runnable 
{
    public th2(int n,int[] a) 
    {
        super(n,a);
    }
    public void run() 
    {
        boolean flag=false;
        System.out.print("Number(s) divisible by 5 are: ");
        for(int i=0;i<a.length;i++) 
        {
            if(a[i]%5==0) 
            {
                flag=true; //if true, displays the numbers divisible by 5
                System.out.print(a[i]+"  ");       
            }
        }
        if(flag==false) //else displays "None"
            System.out.print("None");
        System.out.println();
    }
}
class th3 extends th2 implements Runnable 
{
    public th3(int n,int[] a) 
    {
        super(n,a);
    }
    public void run() 
    {
        int sum=0,average=0;
        System.out.print("Average of "+n+" numbers is: ");
        for(int i=0;i<n;i++) 
        {
            sum=sum+a[i];
        }
        average=sum/n;
        System.out.println(average);
    }
}