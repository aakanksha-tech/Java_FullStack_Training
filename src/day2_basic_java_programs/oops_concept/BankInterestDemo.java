package day2_basic_java_programs.oops_concept;
abstract class Bank{abstract double interest();}
class SBI extends Bank{double interest(){return 6.5;}}
class HDFC extends Bank{double interest(){return 7.0;}}
class ICICI extends Bank{double interest(){return 7.5;}}
public class BankInterestDemo{public static void main(String[] a){System.out.println(new SBI().interest());System.out.println(new HDFC().interest());System.out.println(new ICICI().interest());}}