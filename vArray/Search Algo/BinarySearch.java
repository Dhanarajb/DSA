public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5, 12, 32, 65, 87, 99 };
        int value = 5;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + (end - start) / 2);
            if (arr[mid] == value) {
                System.out.println(mid);
                break;
            } else if (arr[mid] < value) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        if (start > end) {
            System.out.println("Sorry!...Enter exact search value!!");
        }

    }
}
