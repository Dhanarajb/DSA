
public class DeleteAnArray {
    public static void main(String[] args) { // 0 1 2 3 4 5
        int[] arr = { 12, 32, 54, 77, 88, 54 }; // 12 32 54 77 88 54
        int Removal = 77;
        for (int i = 0; i < arr.length; i++) { // i=0 //i=1
            if (arr[i] == Removal) { // 12=32 //32==32
                for (int j = i; j < arr.length - 1; j++) { // j=1 1<4 // j=2 2<4 //j=3 3<4 //j=4 4<4
                    arr[j] = arr[j + 1]; // 1=2 2=3 3=4 4=5
                }
                break;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
