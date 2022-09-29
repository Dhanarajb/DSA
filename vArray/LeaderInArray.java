public class LeaderInArray {
    // public static void main(String[] args) {
    // int arr[] = { 2, 5, 7, 9, 4, 3, 1 };
    // for (int i = 0; i < arr.length; i++) {
    // boolean flag = false;
    // for (int j = i + 1; j < arr.length; j++) {
    // if (arr[i] <= arr[j]) {
    // flag = true;
    // break;
    // }
    // }
    // if (flag == false) {
    // System.out.print(arr[i] + " ");
    // }
    // }

    // }
    void printLeaders(int arr[], int size) {
        int max_from_right = arr[size - 1];

        /* Rightmost element is always leader */
        System.out.print(max_from_right + " ");

        for (int i = size - 2; i >= 0; i--) {
            if (max_from_right < arr[i]) {
                max_from_right = arr[i];
                System.out.print(max_from_right + " ");
            }
        }
    }

    /* Driver program to test above functions */
    public static void main(String[] args) {
        LeaderInArray lead = new LeaderInArray();
        int arr[] = new int[] { 16, 17, 4, 3, 5, 2 };
        int n = arr.length;
        lead.printLeaders(arr, n);
    }

}
