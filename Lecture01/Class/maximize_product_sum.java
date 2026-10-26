package Lecture01.Class;
import java.util.Arrays;
public class maximize_product_sum{
    public static void main(String[] args) {
        int[] arr = {7,2,5,10,8};
        Arrays.sort(arr);
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += ((i+1)*arr[i]);
        }
        System.out.println(sum);
    }
}