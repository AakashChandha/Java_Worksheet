/*
1.Write java programs that include generic method to satisfy the following property.
    a.	To counts the number of odd integers in an integer list
    b.	To exchange the positions of two different elements in an array.
    c.	To find the maximal element in the range [begin, end] of a list.
 */
package lab_ex12;
import java.util.Scanner;

/**
 *
 * @author Sonal L R
 */
public class Generic_method {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        Integer l[]={2,19,21,18,22,10,29,6};
        System.out.println("The list elements are:");
        for(int i=0;i<l.length;i++)
            System.out.println(l[i]+" ");
        Numbers n=new Numbers();
        n.OddNUmbers(l);
        
        //Echanging position between 2 elements
        System.out.println("Enter the 1st element position that has to be exchanged:"); //(1-8)
        int x=obj.nextInt();
        System.out.println("Enter the 2nd element position that has to be exchanged:"); //(1-0)
        int y=obj.nextInt();
        if(x>9||x<0||y>9||y<0)
        {
            System.out.println("Invalid position!");
            return;
        }
        n.ExchangePOs(l,x,y);
        
        //Finding maximal element between the range
        System.out.println("Enter the begin index to find the maximal element in the particular range:"); //(0-7)
        int begin=obj.nextInt();
        System.out.println("Enter the end index to find the maximal element in the particular range:"); //(0-7)
        int end=obj.nextInt();
        if(begin>end)
        {
            System.out.println("Invalid indices!"); //Begin index>end index
            return;
        }
        n.MaxElement(l,begin,end);
    }
}
class Numbers
{
    public<A extends Integer> void OddNUmbers(A[] value)
    {
        int num=0;
        for(int i=0;i<value.length;i++)
        {
            if(value[i]%2!=0)
                num++;
        }
        if(num>0)
            System.out.println("Number of odd integers is:"+num);
        else
            System.out.println("No odd integers!");
    }
    public<A extends Integer> void ExchangePOs(A[] value,int x,int y)
    {
        A a; 
        a=value[x-1];
        value[x-1]=value[y-1];
        value[y-1]=a;
        System.out.println("The list elements after exchanging are:");
        for(int i=0;i<value.length;i++)
            System.out.println(value[i]+" ");
    }
    public<A extends Integer> void MaxElement(A[] value,int begin,int end)
    {
        A max=value[begin];
        for(int i=begin;i<=end;i++)
        {
            if(value[i]>max)
            {
                max=value[i];
            }
        }
        System.out.println("Maximal element is:"+max);
    }
}