package day2_basic_java_programs.oops_concept;
interface Issueable{void issueBook();}
abstract class LibraryItem{abstract void showDetails();}
class Book extends LibraryItem implements Issueable{
 private String title="Java";
 public void issueBook(){System.out.println("Issued");}
 void showDetails(){System.out.println(title);}
}
public class LibraryManagementSystem{public static void main(String[] a){Book b=new Book();b.showDetails();b.issueBook();}}