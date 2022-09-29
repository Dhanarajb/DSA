import java.lang.reflect.Array;
import java.util.Arrays;

public class SearchAnValue {
    public static void main(String[] args) {
        int[] arr = { 12, 43, 56, 5, 7, 3, 5, 9 };
        System.out.println(Search(arr, 0));
    }

    public static int Search(int[] arr, int val) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) {
                System.out.println("Searched Value :- " + i);
                return i;
            }
        }
        System.out.println("Sorry! This value is not there: " + -1);
        return -1;

    }

}
