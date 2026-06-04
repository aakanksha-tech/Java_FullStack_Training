package day2_basic_java_programs.oops_concept;
public class StudentManagementSystem{
 private int id; private String name;
 public void setId(int id){this.id=id;} public int getId(){return id;}
 public void setName(String n){name=n;} public String getName(){return name;}
 public static void main(String[] a){StudentManagementSystem s=new StudentManagementSystem();s.setId(1);s.setName("Aakanksha");System.out.println(s.getName());}
}