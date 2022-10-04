public class DupicateFind {
    public static void main(String[] args) {
        int[] arr = { 2, 13, 1, 5, 7, 2, 1 };
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                if ((arr[i] == arr[j]) && (i != j)) {
                    System.out.println(arr[j]);
                }
            }
        }
    }
}
