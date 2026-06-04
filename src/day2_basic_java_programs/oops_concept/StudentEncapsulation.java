package day2_basic_java_programs.oops_concept;
public class StudentEncapsulation{
 private int rollNo; private String name;
 public int getRollNo(){return rollNo;}
 public void setRollNo(int r){rollNo=r;}
 public String getName(){return name;}
 public void setName(String n){name=n;}
 public static void main(String[] args){
  StudentEncapsulation s=new StudentEncapsulation();
  s.setRollNo(1); s.setName("Aakanksha");
  System.out.println(s.getRollNo()+" "+s.getName());
 }
}