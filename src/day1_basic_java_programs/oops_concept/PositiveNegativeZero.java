package day1_basic_java_programs.oops_concept;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        int num = -5;

        if(num > 0)
            System.out.println("Positive");
        else if(num < 0)
            System.out.println("Negative");
        else
            System.out.println("Zero");
    }
}