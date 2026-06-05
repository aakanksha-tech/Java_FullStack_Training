package day3_file_handling_programs.oops_concept;
import java.util.ArrayList;

public class InsertElements {
    public static void main(String[] args) {

        ArrayList<String> languages = new ArrayList<>();

        languages.add("Java");
        languages.add("C++");
        languages.add("JavaScript");

        languages.add(1, "Python");

        System.out.println("Languages List:");
        System.out.println(languages);
    }
}