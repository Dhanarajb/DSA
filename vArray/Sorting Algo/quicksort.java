public class quicksort {
    public static int partition(int[] arr, int low, int high) {// ({3 5 4 2 7 6 8}, l=0, h=6)({3,5,4,2,7,6},l=0,h=5)
        int pivot = arr[high];// 8,5,2
        int i = low - 1; // -1

        for (int j = low; j < high; j++) {// (0,1,2,3,4,5<6)(0,1,2,3,4<5)
            if (arr[j] < pivot) {// (3,5,4,2,7,6<8)(0,1,2,3<6)
                i++;// (0,1,2,3,4,5)(0,1,2,3) //track the emplty places
                int temp = arr[i];// (temp=3,5,4,2,7,6)(t=3,5,4,2)
                arr[i] = arr[j];// (a[i]=3,5,4,2,7,6)(a[i]=3,5,4,2)
                arr[j] = temp;// (a[j]=3,5,4,2,7,6)(a[j]=3,5,4,2)
            }
        }
        i++;// 6,4,0
        int temp = arr[i];// (8)(7)(3)
        arr[i] = pivot;// (8)(6)(2)
        arr[high] = temp;// (8)(7)(3)
        return i; // pivot index
    }

    public static void quickSort(int[] arr, int low, int high) { // ({3 5 4 2 7 6 8}, l=0, h=6)({3,5,4,2,7,6},l=0,h=5)
        if (low < high) {// 0<6, 7<6, 0<5
            int pidx = partition(arr, low, high);// 6,4
            quickSort(arr, low, pidx - 1);// {3,5,4,2,7,6},l=0,pidx-1=5
            quickSort(arr, pidx + 1, high);// {},pidx+1=7
        }
    }

    public static void main(String[] args) {
        int[] arr = { 3, 5, 4, 2, 7, 6, 8 };
        int n = arr.length;
        quickSort(arr, 0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

// Time complexity
// worst case : O(n^2)
// average case : O(nlogn)