public class MaxiMumSubArray {
    public static void main(String[] args) {
        int[] arr = { -4, 5, 7, -6, 10, -15, 3 };
        System.out.println(SubArray(arr));
    }

    public static int SubArray(int[] arr) {
        int maxsum = Integer.MIN_VALUE; // it will take any value
        int cursum = 0;
        for (int i = 0; i < arr.length; i++) {
            cursum += arr[i];
            if (cursum > maxsum) {
                maxsum = cursum;
            } else {
                cursum = 0;
            }
        }
        return maxsum;
    }

}
