public class FindFloorElement {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 8, 9, 10, 11, 12 };
        int k = 5;
        System.out.println(solve(arr, k));
    }

    static int solve(int arr[], int k) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == k) {
                return arr[mid];
            } else if (arr[mid] > k) {
                end = mid - 1;
            } else {
                ans = arr[mid];
                start = mid + 1;
            }
        }
        return ans;
    }
}
