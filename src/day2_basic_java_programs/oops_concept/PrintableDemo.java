package day2_basic_java_programs.oops_concept;
interface Printable{void print();}
public class PrintableDemo implements Printable{
 public void print(){System.out.println("Printing...");}
 public static void main(String[] a){new PrintableDemo().print();}
}