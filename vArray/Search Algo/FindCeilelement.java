public class FindCeilelement {
    static int ceilSearch(int arr[], int start, int end,
            int val) {
        if (val == 0) {
            return -1;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (val == arr[mid]) {
                return mid;
            }
            if (val < arr[mid]) {
                end = mid - 1;
            }

            else {
                start = mid + 1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 8, 10, 10, 12, 19 };
        int n = arr.length;
        int val = 9;
        int index = ceilSearch(arr, 0, n - 1, val);
        System.out.println(arr[index]);
    }
    /*
     * step 1 : { start = 1, 2, 8, 10= mid, 10, 12, 19= end };
     * if( val < mid) yes set end = mid -1;
     * step 2 : { start = 1, 2 = mid, 8 = end , 10, 10, 12, 19};
     * if( val < mid) no set start = mid + 1;
     * step 3 : {1, 2, 8 = end ,start,start, 10, 10, 12, 19};
     * if( val == mid ) yes return mid
     * if(val < mid ) no start = mid + 1
     * step 4 : {1, 2, 8 = end ,mid, 10 = start, 10, 12, 19};
     * check while(start < = end )
     * condition break and return start which will
     * nevalt greater of target
     */

}
