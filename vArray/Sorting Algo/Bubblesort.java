import javax.sound.midi.Soundbank;

public class Bubblesort {
    public static void main(String[] args) {
        int[] arr = { 122, 32, 1, 43, 54, 23, 5, };

        int temp = 0;
        for (int i = 0; i < arr.length; i++) { // array traversal
            for (int j = 0; j < arr.length - 1 - i; j++) { // array comparing //arr.length-1-i->when we sort the
                                                           // thousands of array then we have to use -i
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j]; // arr[j] store in temp value;
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
