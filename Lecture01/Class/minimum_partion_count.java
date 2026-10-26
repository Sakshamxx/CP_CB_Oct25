package Lecture01.Class;

public class minimum_partion_count {
    public static void main(String[] args) {
        int[] arr = {7,2,5,10,8};
        int m = 16;
        int partition = 1, curr = 0;
        for (int i = 0; i < arr.length; i++) {
            curr += arr[i];
            if (m < curr){
                partition++;
                curr = arr[i];
            }
        }
        System.out.println(partition);
    }
}