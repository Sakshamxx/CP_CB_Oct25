package Lecture01.Class;
import java.util.Arrays;

public class maximize_triangle_parameter {
    public static void main(String[] args) {
        int[] arr = {7,5,1,-3,10};
        int curr = Integer.MIN_VALUE, max = Integer.MIN_VALUE;
        Arrays.sort(arr);
        for (int i = arr.length - 1; i >= 2; i--) {
            int a = arr[i];
            int b = arr[i-1];
            int c = arr[i-2];
            if ( a+b > c || a+c > b || b+c > a){
                curr = a + b + c;
                max = Math.max(curr, max);
            }
        }
        System.out.println(max);
    }
}