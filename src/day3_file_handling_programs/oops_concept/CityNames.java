package day3_file_handling_programs.oops_concept;
import java.util.ArrayList;

public class CityNames {
    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<>();

        cities.add("Mumbai");
        cities.add("Pune");
        cities.add("Kolhapur");
        cities.add("Sangli");
        cities.add("Nagpur");

        System.out.println("Cities: " + cities);
        System.out.println("Size of ArrayList: " + cities.size());
    }
}