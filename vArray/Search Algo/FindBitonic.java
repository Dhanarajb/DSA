public class FindBitonic {
    private static int findMaxElement(int[] a) {
        int n = a.length;
        int start = 0;
        int end = n - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if ((mid == 0 || a[mid] > a[mid - 1]) && (mid == n - 1 || a[mid] > a[mid + 1])) {
                return a[mid]; // a[mid] is greater than both its neighbours
            } else if (a[mid] < a[mid - 1]) {
                end = mid - 1; // a[mid] is smaller than its previous element, maximum lies in left half
            } else {
                start = mid + 1; // maximum lies in the right half
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int a[] = { 1, 3, 20, 4, 1, 0 };
        System.out.println(findMaxElement(a));
    }
}
