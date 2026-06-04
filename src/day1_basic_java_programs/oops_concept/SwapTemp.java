package day1_basic_java_programs.oops_concept;
public class SwapTemp {
    public static void main(String[] args) {
        int a = 10, b = 20, temp;

        temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}