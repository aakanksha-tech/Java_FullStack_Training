package day2_basic_java_programs.oops_concept;
interface Payment{void makePayment();}
class CreditCardPayment implements Payment{public void makePayment(){System.out.println("Card Payment");}}
class UPIPayment implements Payment{public void makePayment(){System.out.println("UPI Payment");}}
public class PaymentDemo{public static void main(String[] a){new CreditCardPayment().makePayment();new UPIPayment().makePayment();}}