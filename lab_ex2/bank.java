/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_ex2;
import java.util.Scanner;
/**
 *
 * @author ELCOT
 */
public class bank {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        account a1=new account("19CSE087","Sonal",0);
        account1 a2=new account1("19MSC096","Shibani",15);
        System.out.println("ID is:"+a1.getid());
        System.out.println("Name is:"+a1.getname());
        System.out.println("Balance is:"+a1.getbalance());
        System.out.println("ID is:"+a2.getdata());
        System.out.println("Name is:"+a2.getname());
        System.out.println("Balance is:"+a2.getbalance());
        System.out.println("Enter the amount to be credited:");
        int a2a2=obj.nextInt();
        System.out.println("Balance is:"+a2.credit(a2a2));
        System.out.println("Enter the amount to be debited:");
        int a2a2a2=obj.nextInt();
        System.out.println("Balance is:"+a2.debit(a2a2a2));
        System.out.println("Enter the amount to be transferred:");
        int a2a2a2a2=obj.nextInt();
        System.out.println("Balance is:"+a2.transferto(a1,a2a2a2a2));
        //System.out.println(a2.toString());
    }
}
class account
{
    String id,name;
    int balance;
    account(String i,String n,int b)
    {
        id=i;
        name=n;
        balance=b;
    }
    String getid()
    {
        return id;
    }
    String getname()
    {
        return name;
    }
    int getbalance()
    {
        return balance;
    }
}
class account1
{
    String id,name;
    int balance=0;
    account1(String i,String o,int s)
    {
        id=i;
        name=o;
        balance=s;
    }
    String getdata()
    {
        return id;
    }
    String getname()
    {
        return name;
    }
    int getbalance()
    {
        return balance;
    }
    int credit(int amount)
    {
        balance=balance+amount;
        return balance;
    }
    int debit(int amount)
    {
        if(amount<=balance)
            balance=balance-amount;
        else
            System.out.println("Amount exceeded balance.");
        return balance;  
    }
    int transferto(account another,int amount)
    {
        if(amount<=balance)
        {
            amount=balance-amount;
            another.balance=another.balance+amount;
        }    
        else
            System.out.println("Amount exceeded balance.");
        return balance;
    }
    public String tostring()
    {
        return "ID:"+id+"\nName:"+name+"\nBalance:"+balance;
    }
}