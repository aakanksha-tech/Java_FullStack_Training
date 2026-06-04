package day1_basic_java_programs.oops_concept;
public class SumNatural {
    public static void main(String[] args) {
        int n = 10, sum = 0;

        for(int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("Sum = " + sum);
    }
}