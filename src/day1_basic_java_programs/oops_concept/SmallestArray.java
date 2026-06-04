package day1_basic_java_programs.oops_concept;
public class SmallestArray {
    public static void main(String[] args) {
        int arr[] = {10, 40, 20, 5};

        int min = arr[0];

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < min)
                min = arr[i];
        }

        System.out.println(min);
    }
}