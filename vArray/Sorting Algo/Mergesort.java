public class Mergesort {

    // Represent O(n) si ei
    public static void conquersort(int[] arr, int si, int mid, int ei) { // 5,4,2,6,2
        // create one merged array
        int[] merged = new int[ei - si + 1]; // [ei-si+1] :-> full array size,
        // we can get 2 indexes
        int idx1 = si; // track 1st array //idx1= 5 4 2
        int idx2 = mid + 1; // track 2nd array //idx2= 6 2
        int x = 0; // x is tracking for merged index,
        while (idx1 <= mid && idx2 <= ei) { //
            if (arr[idx1] <= arr[idx2]) {
                merged[x++] = arr[idx1++]; // we can add index1 in merged x
            } else {
                merged[x++] = arr[idx2++];// we can add index2 in merged x
            }
        }
        // suppose one array completed comparison and another array elements not
        // completed
        while (idx1 <= mid) {
            merged[x++] = arr[idx1++];
        }
        while (idx2 <= ei) {
            merged[x++] = arr[idx2++];
        }
        // we can copy the merged elements in original array
        for (int i = 0, j = si; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }

    }

    public static void devide(int[] arr, int si, int ei) {
        // incase starting index is greater than ending index then we have to return
        if (si >= ei) { // if(0 >== n)
            return;
        }
        // Represent O(logn)
        // find the mid
        int mid = si + (ei - si) / 2; // si+ei/2 :-> space complexity issue so we can use si+(ei-si)/2.
        devide(arr, si, mid); // we can take arr and starting index and mid
        devide(arr, mid + 1, ei);
        conquersort(arr, si, mid, ei);

    }

    public static void main(String[] args) {
        int[] arr = { 5, 4, 2, 6, 2, 9, 11 };
        int n = arr.length; // array size

        devide(arr, 0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}