/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_ex3;

/**
 *
 * @author ELCOT
 */
public class static_nonstatic {
    public static void main(String[] args) {
        System.out.println("Counter function using non-static:");
        counter a=new counter();
        counter a1=new counter();
        counter a2=new counter();
        System.out.println("Counter function using static:");
        counter1 a3=new counter1();
        counter1 a4=new counter1();
        counter1 a5=new counter1();
    }
}
class counter
{
    int count=0;
    counter()
    {
        count=count+10;
        System.out.println(count);
    }
}
class counter1
{
    static int count=0;
    counter1()
    {
        count=count+10;
        System.out.println(count);
    }
    
}

