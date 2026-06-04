package day1_basic_java_programs.oops_concept;

public class Armstrong {
    public static void main(String[] args) {
        int num = 153;
        int temp = num, sum = 0;

        while(num > 0) {
            int digit = num % 10;
            sum += digit * digit * digit;
            num /= 10;
        }

        if(temp == sum)
            System.out.println("Armstrong");
        else
            System.out.println("Not Armstrong");
    }
}