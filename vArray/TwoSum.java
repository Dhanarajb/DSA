import java.util.*;

public class TwoSum {
    // public static void main(String[] args) {
    // int[] arr = { 1, 2, 3, 21, 3, 4, 5 };
    // int val = 26;
    // for (int i = 0; i < arr.length; i++) {
    // for (int j = i + 1; j < arr.length; j++) {
    // if (arr[i] + arr[j] == val) {
    // System.out.println("Yes");
    // }
    // }
    // }
    // }
    public static void main(String[] args) {
        TwoSum hi = new TwoSum();
        int[] arr = { 1, 2, 3, 21, 3, 4, 5 };
        final int sum = 26;
        System.out.println(hi.pair(arr, sum));
    }

    public boolean pair(int[] arr, int sum) {
        if (arr.length == 0) {
            return false;
        }
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int summ = arr[start] + arr[end];

            if (summ == sum) {
                return true;
            } else if (summ > sum) {
                end--;
            } else {
                start++;
            }
        }
        return false;
    }

}
