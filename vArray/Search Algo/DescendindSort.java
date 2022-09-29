public class DescendindSort {
    public static void main(String[] args) {
        int[] arr = { 20, 17, 15, 14, 13, 12, 8, 4, 2 };
        int val = 15;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + (end - start) / 2);
            if (arr[mid] == val) {
                System.out.println(mid);
                break;
            } else if (arr[mid] > val) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
    }
}
