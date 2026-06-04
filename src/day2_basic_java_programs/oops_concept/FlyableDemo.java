package day2_basic_java_programs.oops_concept;
interface Flyable{void fly();}
class Bird implements Flyable{public void fly(){System.out.println("Bird Flying");}}
class Airplane implements Flyable{public void fly(){System.out.println("Airplane Flying");}}
public class FlyableDemo{public static void main(String[] a){new Bird().fly();new Airplane().fly();}}