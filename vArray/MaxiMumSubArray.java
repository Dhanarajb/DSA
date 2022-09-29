public class MaxiMumSubArray {
    public static void main(String[] args) {
        int[] arr = { -4, 5, 7, -6, 10, -15, 3 };
        System.out.println(SubArray(arr));
    }

    public static int SubArray(int[] arr) {
        int sum = 0;
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

}
