public class FirstAndLastOccurance {
    public static void main(String[] args) {
        int arr[] = { 1, 4, 7, 8, 11, 11, 11, 11, 11, 13 };
        int val = 11;

        int firstOcc = FirstOccurance(arr, val);
        int lastOcc = LastOccurance(arr, val);

        System.out.println(firstOcc);
        System.out.println(lastOcc);
    }

    public static int FirstOccurance(int[] arr, int val) {
        int start = 0;
        int end = arr.length - 1;
        int index = -1;
        while (start <= end) {
            int mid = (start + (end - start) / 2);

            if (val == arr[mid]) {
                index = mid;
                end = mid - 1;
            } else if (arr[mid] > val) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return index;
    }

    public static int LastOccurance(int[] arr, int val) {
        int start = 0;
        int end = arr.length - 1;
        int index = -1;

        while (start <= end) {
            int mid = (start + (end - start) / 2);
            if (arr[mid] == val) {
                index = mid;
                start = mid + 1;
            } else if (arr[mid] > val) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return index;
    }
}
