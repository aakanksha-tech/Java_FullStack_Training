package day3_file_handling_programs.oops_concept;

import java.util.ArrayList;

public class RetrieveElements {
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");

        String fruit = fruits.get(2);

        System.out.println("Element at index 2: " + fruit);
    }
}
