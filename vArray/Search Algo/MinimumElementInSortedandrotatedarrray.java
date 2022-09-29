// Compute mid i.e start+end/2.
// Check if a[mid…end] is sorted
// Minimum lies in left part, so start=mid+1;
// Else
// Minimum lies in right part, so end=mid
public class MinimumElementInSortedandrotatedarrray {
    public static void main(String[] args) {
        int arr[] = { 5, 6, 1, 2, 3, 4 };
        System.out.println(
                "Minimum element in the array : " + findMinimumElementRotatedSortedArray(arr, 0, arr.length - 1));
    }

    public static int findMinimumElementRotatedSortedArray(int[] arr, int start, int end) {

        while (start < end) {
            int mid = start + ((end - start) / 2);

            if (arr[mid] > arr[end]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return arr[start];
    }
}
