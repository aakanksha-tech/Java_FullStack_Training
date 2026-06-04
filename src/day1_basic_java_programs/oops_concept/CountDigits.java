package day1_basic_java_programs.oops_concept;

public class CountDigits {
    public static void main(String[] args) {
        int num = 12345;
        int count = 0;

        while(num > 0) {
            count++;
            num /= 10;
        }

        System.out.println(count);
    }
}