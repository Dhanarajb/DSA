public class CountOfAnElement {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 5, 5, 6, 6, 8, 9, 9, 9 };
        int val = 5;
        int first = CountBinary(arr, val, true);
        int last = CountBinary(arr, val, false);
        int count = last - first + 1;
        if (first != -1) {
            System.out.println(count);
        } else {
            System.out.println("Element not Found");
        }
    }

    public static int CountBinary(int[] arr, int val, boolean searchFirst) {
        int start = 0;
        int end = arr.length - 1;
        int res = -1;

        while (start <= end) {
            int mid = (start + (end - start) / 2);
            if (val == arr[mid]) {
                res = mid;

                if (searchFirst) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if (val < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return res;
    }

    // public static void main(String[] args) {
    // int[] arr = { 1, 2, 2, 2, 3, 4, 6, 7, 7, };
    // int val = 2;

    // int sum = 0;
    // for (int i = 0; i < arr.length; i++)
    // if (val == arr[i])
    // sum++;
    // System.out.println(sum);

    // }

}
