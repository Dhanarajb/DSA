import java.util.Arrays;

public class DeleteAnArray {
    public static void main(String[] args) { // 0 1 2 3 4 5
        int[] arr = new int[] { 1, 2, 3, 4, 5 };
        int[] newarr = new int[arr.length - 1];
        int val = 3;
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != val - 1) {
                newarr[j] = arr[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(newarr));

    }

}

/*
 * Notes
 * 12, 32, 54, 77, 88, 54
 * <- <- <- <- <- <-
 * delete = 77
 * 
 * for(int i= 0; i<a.length; i++){ traverse the array from 1 --n
 * if(delete == a[i]){
 * for(int j=i; j<a.length;j++){
 * a[j]=a[j+1]; we can shift the element backside
 * }
 * break; when we found our deleted element then we have to break it
 * }
 * 
 * }
 */