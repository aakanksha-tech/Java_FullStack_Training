package day1_basic_java_programs.oops_concept;

public class Power {
    public static void main(String[] args) {
        int base = 2, power = 3;
        int result = 1;

        for(int i = 1; i <= power; i++) {
            result *= base;
        }

        System.out.println(result);
    }
}