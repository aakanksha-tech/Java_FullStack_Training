package day2_basic_java_programs.oops_concept;
abstract class Employee{abstract double calculateSalary();}
class FullTimeEmployee extends Employee{double calculateSalary(){return 50000;}}
class PartTimeEmployee extends Employee{double calculateSalary(){return 15000;}}
public class EmployeeAbstractDemo{public static void main(String[] a){System.out.println(new FullTimeEmployee().calculateSalary());}}