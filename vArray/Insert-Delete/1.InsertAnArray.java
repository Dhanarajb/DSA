class Main {
    public static void main(String[] args) { // 0 1 2 3 4 5
        int[] arr = { 12, 23, 34, 45, 56, 67 }; // 12 23 34 45 56 67

        int position = 3;
        int value = 36;

        for (int i = arr.length - 1; i > position - 1; i--) { // i=5 5>(3-1) //i=4 4>(3-1) //i=3 3>(3-1) //i=2 2>(3-1)
            arr[i] = arr[i - 1]; // 5=4 -> 12 23 34 45 56 //4=3 -> 12 23 34 45 56 //3=2 -> 12 23 34 45 56
            // //a[2]-->36 -> 12 23 36 34 45 56
        }
        arr[position - 1] = value;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}