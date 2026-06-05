package day3_file_handling_programs.oops_concept;

import java.util.ArrayList;

public class ArrayNameDisplay {

    public static void main(String args[]) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Shyam");
        names.add("Seeta");
        names.add("Geeta");
        names.add("Ram");
        names.add("Smith");
        names.add("Bob");
        names.add("John");
        names.add("Sam");
        names.add("Doe");

        System.out.println("Student Names:");

        for (String nam : names) {
            System.out.println(nam);
        }
    }
}