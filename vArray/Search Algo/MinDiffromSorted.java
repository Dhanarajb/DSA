public class MinDiffromSorted {
    private static int findElement(int[] arr, int key, boolean test) {

        int start = 0;
        int end = arr.length - 1;
        int result = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == key) {
                return arr[mid];
            } else if (arr[mid] > key) {
                if (test) {
                    result = arr[mid];
                    end = mid - 1;
                    test = false;
                } else {
                    end = mid - 1;
                    test = true;
                }
            } else {
                if (test) {
                    result = arr[mid];
                    start = mid + 1;
                } else {
                    start = mid + 1;
                }
            }

        }
        return result;

    }

    public static void main(String[] args) {

        int[] arr = { 2, 4, 6, 7, 8, 9, 12, 13, 14 };
        int key = 9;

        int floor = findElement(arr, key, false);
        int ceil = findElement(arr, key, true);

        System.out.println("floor of key " + key + " is " + floor);
        System.out.println("ceil of key " + key + " is " + ceil);

        if (Math.abs(key - floor) > Math.abs(key - ceil)) {
            System.out.println("minimum difference of element " + key + " is " + Math.abs(key - ceil));
        } else {
            System.out.println("minimum difference of element " + key + " is " + Math.abs(key - floor));
        }

    }

}
