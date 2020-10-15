/*
2.Write a java program to search an element from the given type of elements using a generic function.
 */
package lab_ex12;

import java.util.Scanner;

/**
 *
 * @author Sonal L R
 */
public class Generic_function {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        Integer[] numbers={10,21,2,14,29,19}; 
        String[] names={"Rajan","Subalakshmi","Sonal","Himal","Shahasni","Shaksi"};
        Character[] vowels={'a','e','i','o','u'};
        Double[] dnumbers={10.12,217.1976,2.62002,1.40703,29.527,1912.9100};
        Float[] fnumbers={12.3f,23.4f,34.5f,56.7f};
        
        Search s=new Search();
        System.out.println("Available datatypes are: \n{1}Integer \n(2)String \n(3)Character \n(4)Double \n(5)Float");
        System.out.println("Press 1 for Integer, 2 for String, 3 for Charcater, 4 for Double and 5 for Float types:");
        int option=obj.nextInt();
        switch(option)
        {
            case 1:
                System.out.println("Enter the number to be searched:");
                int value1=obj.nextInt();
                s.search(value1,numbers);
                break;
            case 2:
                System.out.println("Enter the name to be searched:");
                String value2=obj.next();
                s.search(value2,names);
                break;
            case 3:
                System.out.println("Enter the vowel to be searched:");
                char value3=obj.next().charAt(0);
                s.search(value3,vowels);
                break;
            case 4:
                System.out.println("Enter the number to be searched:");
                double value4=obj.nextDouble();
                s.search(value4,dnumbers);
                break;
            case 5:
                System.out.println("Enter the number to be searched:");
                float value5=obj.nextFloat();
                s.search(value5,fnumbers);
                break;
        }
    }
}
class Search
{
    boolean flag=false;
    public<A,B> void search(A s,B[] array)
    {
        for(int i=0;i<array.length;i++)
        {
            if(s.equals(array[i])) 
            {
                flag=true;
                break;
            }
        }
        if(flag)
            System.out.println("Searched element '"+s+"' is found in the array.");
        else
            System.out.println("Searched element '"+s+"' is not found in the array.");
    }
}