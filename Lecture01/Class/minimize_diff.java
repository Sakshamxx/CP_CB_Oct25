package Lecture01.Class;
import java.util.Arrays;

public class minimize_diff {
    public static void main(String[] args){
        int[] arr = {72,15,1,-13,0};
        Arrays.sort(arr);
        int curr = 0, min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            int j = i+1;
            curr = Math.abs(arr[i] - arr[j]);
            min = Math.min(min, curr);
        }
        System.out.println(min);
    }
}
