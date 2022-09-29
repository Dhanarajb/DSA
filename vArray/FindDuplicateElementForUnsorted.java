import java.util.*;

public class FindDuplicateElementForUnsorted {
    public static void main(String[] args) {
        int[] arr = { 4, 2, 1, 4, 7, 9, 2, 3, 4, 2, };

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        for (int no : set) {
            System.out.print(no + " ");
        }
    }

}
