public class SearchElementInfinite {
    static int binarySearch(int arr[], int start, int end, int x) {
        if (end >= start) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] > x)
                return binarySearch(arr, start, mid - 1, x);
            return binarySearch(arr, mid + 1, end, x);
        }
        return -1;
    }

    static int findPos(int arr[], int key) {
        int start = 0, end = 1;
        int val = arr[0];

        while (val < key) {
            start = end; // store previous high
            // check that 2*h doesn't exceeds array
            // length to prevent ArrayOutOfBoundException
            if (2 * end < arr.length - 1)
                end = 2 * end;
            else
                end = arr.length - 1;
            val = arr[end]; // update new val
        }

        // at this point we have updated low
        // and high indices, thus use binary
        // search between them
        return binarySearch(arr, start, end, key);
    }

    public static void main(String[] args) {
        int arr[] = new int[] { 3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170 };
        int ans = findPos(arr, 10);
        System.out.println(ans);
    }
}
