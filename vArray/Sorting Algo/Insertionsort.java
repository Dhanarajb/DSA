public class Insertionsort {
    public static void main(String[] args) {
        int[] arr = { 5, 1, 6, 2, 0 };
        int temp, j; // temp=1
        for (int i = 1; i < arr.length; i++) { // i=1 |i=2 |i=3 |i=4
            temp = arr[i]; // temp=1 |temp=6 |temp=2 |temp = 0
            j = i; // j=1 |j=2 |j=3 |j=4
            while (j > 0 && arr[j - 1] > temp) { // 1>0 && 5>1 |2>0 && 5>6 |3>0 && 6>2 |4>0 && 2>0
                arr[j] = arr[j - 1]; // 1=5 |2=6 |0 = 6
                j = j - 1; // j=0 |j=2 2>0 && 5>2 |j=3 3>0 && 6>0
            } // | j=1 | 3=5 2>0 && 5>0
            arr[j] = temp; // 5=1 | 1=2 | 5=2 1>0 && 2>0
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
// 1 5 6 2 0 //1 5 6 2 0 //1 2 5 6 0