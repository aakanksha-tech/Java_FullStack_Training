package day2_basic_java_programs.oops_concept;
public class EmployeeEncapsulation{
 private int id; private String name; private double salary;
 public int getId(){return id;} public void setId(int id){this.id=id;}
 public String getName(){return name;} public void setName(String n){name=n;}
 public double getSalary(){return salary;} public void setSalary(double s){salary=s;}
 public static void main(String[] a){EmployeeEncapsulation e=new EmployeeEncapsulation();e.setId(101);e.setName("John");e.setSalary(50000);System.out.println(e.getName());}
}