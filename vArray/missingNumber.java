public class missingNumber {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 6 };

        int totalLength = arr.length + 1;
        int max = totalLength * (totalLength + 1) / 2;

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.print(max - sum);
    }

}
