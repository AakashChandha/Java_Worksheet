/*
Create a employee class with name, salary as attributes. 
Store 20 employees information in arraylist. 
Use Comparator interface to sort the names in descending order.
 */
package lab_ex7;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/**
 *
 * @author SONAL L R
 */
public class Employee_al {
    public static void main(String[] args){
        Employee e=new Employee("Rajan",300000);
        ArrayList<Employee> list=new ArrayList<>();
        list.add(e);
        list.add(new Employee("Sonal",250000));
        list.add(new Employee("Himal",350000));
        list.add(new Employee("Suba",400000));
        list.add(new Employee("Shaksi",150000));
        list.add(new Employee("Shahasni",230000));
        list.add(new Employee("Shyam",560000));
        list.add(new Employee("Susee",260000));
        list.add(new Employee("Nivashi",350000));
        list.add(new Employee("Manisha",600000));
        list.add(new Employee("Shibani",280000));
        list.add(new Employee("Aakash",520000));
        list.add(new Employee("Baruni",470000));
        list.add(new Employee("Vasanth",480000));
        list.add(new Employee("Isha",160000));
        list.add(new Employee("Abinaya",200000));
        list.add(new Employee("Rupshya",190000));
        list.add(new Employee("Sindhuja",210000));
        list.add(new Employee("Dharshan",270000));
        list.add(new Employee("Varshan",280000));
        
        System.out.println("Original list is:"+list);
        Comparator c=Collections.reverseOrder();
        Collections.sort(list,new namesort());
        System.out.println("\nSorted list using Comparator is:"+list);
    }
}
class Employee
{
    String name;
    double salary;
    Employee(String n,double s)
    {
        name=n;
        salary=s;
    }
    public String toString()
    {
        return "\nEmployee name: "+name+"\tSalary: "+salary;
    }
}
class namesort implements Comparator<Employee>
{
    @Override
    public int compare(Employee e,Employee e1)
    {
        return e1.name.compareTo(e.name);  
    }
}
class salarysort implements Comparator<Employee>
{
    @Override
    public int compare(Employee e,Employee e1)
    {
        return (int)(e.salary-e1.salary);  
    }
}