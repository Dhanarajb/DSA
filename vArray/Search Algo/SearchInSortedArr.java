import java.io.Console;

public class SearchInSortedArr {
    public static void main(String[] args) {
        SearchInSortedArr ob = new SearchInSortedArr();
        int arr[] = { 3, 2, 10, 4, 40 };
        int n = arr.length;
        int val = 10;
        int result = ob.binary(arr, 0, n - 1, val);
        System.out.println(result);
    }

    int binary(int arr[], int start, int end, int val) {
        if (start <= end) {
            int mid = (start + (end - start) / 2);
            if (arr[mid] == val)
                return mid;
            if (mid > start && arr[mid - 1] == val)
                return (mid - 1);
            if (mid < end && arr[mid + 1] == val)
                return (mid + 1);
            if (arr[mid] > val)
                return binary(arr, start, mid - 2, val);
            return binary(arr, mid + 2, end, val);

        }
        return -1;
    }
}
// Construct a recursive function to search for x that takes array arr[], left
// pointer l and right pointer r as input and returns the index of x in array.
// Initialize a variable mid with l+(r-l)/2.
// If arr[mid] is equal to x return mid
// Else if arr[mid-1] is equal to x return mid-1
// Else if arr[mid+1] is equal to x return mid+1
// If arr[mid] > x recur for search space l to mid-2 else recur for search space
// mid+2 to r.