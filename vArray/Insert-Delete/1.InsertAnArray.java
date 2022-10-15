class Main {
    public static void main(String[] args) { // 0 1 2 3 4 5
        int[] arr = { 12, 23, 34, 45, 56, 67 }; // 12 23 34 45 56 67
        int[] newarr = new int[arr.length + 1];

        int pos = 3;
        int value = 36;
        int i = 0, j = 0, n = arr.length;
        while (i < n) {
            if (i == pos) {
                arr[i] = value;
                i++;
            } else {
                newarr[i] = arr[j];
                j++;
                i++;
            }

        }
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

/*
 * notes
 * 12 23 34 45 56 67
 * -> -> -> -> -> ->
 * 
 * we need to insert postion = 3; and element = 100;
 * for(int i=a.length-1;(start fron end and index number 4)i>pos-1;(we can
 * search the position)i--){
 * a[i]=a[i-1] we can change the postion from 4th position to 5th postion
 * }
 * a[pso-1]=element; insert the element at extact postion
 * 
 * 
 * 
 */

// backlog in the s
