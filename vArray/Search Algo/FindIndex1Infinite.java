public class FindIndex1Infinite {
    public static int indexOfFirstOne(int arr[], int start, int end) {
        int mid = 0;
        while (start <= end) {
            mid = (start + end) / 2;
            if (arr[mid] == 1)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return mid;
    }

    public static int posOfFirstOne(int arr[]) {
        int start = 0, end = 1;

        while (arr[end] == 0) {
            start = end;
            end = 2 * end;
        }

        return indexOfFirstOne(arr, start, end);
    }

    /* Driver program to test above function */
    public static void main(String[] args) {

        int arr[] = { 0, 0, 1, 1, 1, 1 };
        System.out.println(posOfFirstOne(arr));

    }
}
