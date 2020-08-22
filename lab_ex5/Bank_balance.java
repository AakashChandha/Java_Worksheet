/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_ex5;

/**
 *
 * @author SONAL L R
 */
public class Bank_balance {
    public static void main(String[] args){
        bankA b1=new bankA();
        System.out.println("Amount deposited in Bank A is:$"+b1.getbalance());
        bankB b2=new bankB();
        System.out.println("Amount deposited in Bank B is:$"+b2.getbalance());
        bankC b3=new bankC();
        System.out.println("Amount deposited in Bank C is:$"+b3.getbalance());
    }
}
class bank
{
    int getbalance()
    {
        return 0;
    }
}
class bankA extends bank
{
    int getbalance()
    {
        return 1000;
    }
}
class bankB extends bank
{
    int getbalance()
    {
        return 1500;
    }
}
class bankC extends bank
{
    int getbalance()
    {
        return 2000;
    }
}