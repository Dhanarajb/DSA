public class FindDuplicateElementForSorted {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 4, 5, 5 };
        int temp[] = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length - 1; i++) { // i=0 |i=1 |i=2 |i=3 |i=4 |i=5
            if (arr[i] != arr[i + 1]) { // 1 != 2 |2 !=2 |2 !=3 |3 != 4 |4!=5
                temp[j] = arr[i]; // temp =1 temp = 2 temp = 3 |temp = 4
                j++;
            }
            // temp[j] = arr[arr.length - 1];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(temp[i] + " ");
        }
    }

}
