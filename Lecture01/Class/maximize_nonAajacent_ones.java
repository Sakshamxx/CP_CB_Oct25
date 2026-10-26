package Lecture01.Class;

public class maximize_nonAajacent_ones {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1};

        int curr = 0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                curr++;
            } else {
                sum += (curr + 1) / 2;
                curr = 0;
            }
        }
        sum += (curr + 1) / 2;
        System.out.println(sum);
    }
}