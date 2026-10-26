package Lecture01.Class;

import java.util.Arrays;

public class minimize_dot_product {
    public static void main(String[] args) {
        int[] arr1 = {7,2,8,9,4};
        int[] arr2 = {1,3,2,7,5};
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int sum = 0,curr= 0;
        for (int i = 0; i < arr1.length; i++) {
            curr = arr1[i]*arr2[i];
            sum += curr;
        }
        System.out.println(sum);
    }
}
