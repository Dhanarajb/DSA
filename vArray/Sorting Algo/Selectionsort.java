public class Selectionsort {
    public static void main(String[] args) {
        int[] arr = { 23, 1, 43, 2, 0 };

        int min, temp = 0; // min = 0
                           // temp=0 |//
        for (int i = 0; i < arr.length; i++) { // |i=0 | i=1 |i=2
            min = i; // |min = 0 | min=1 |min=2
            for (int j = i + 1; j < arr.length; j++) { // |1<4 | 2<4 |3<4
                if (arr[j] < arr[min]) { // |0<23 | 2<43 |23<43
                    min = j; // |23=0 | 43=2 |43=23
                }
            }
            temp = arr[i]; // |0 = 23 |0=43 |0=43
            arr[i] = arr[min]; // |23=1 |43=2 |43=23
            arr[min] = temp; // |1=0 |2=0 |23=0
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
// 0 1 43 2 23 //0 1 2 43 23 //0 1 2 23 43
