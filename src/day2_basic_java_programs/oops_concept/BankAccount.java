package day2_basic_java_programs.oops_concept;
public class BankAccount{
 private double balance;
 public void deposit(double a){balance+=a;}
 public void withdraw(double a){balance-=a;}
 public static void main(String[] args){BankAccount b=new BankAccount();b.deposit(1000);b.withdraw(200);System.out.println(b.balance);}
}