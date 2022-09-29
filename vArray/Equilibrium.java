public class Equilibrium {
    public static void main(String[] args) {
        Equilibrium equi = new Equilibrium();
        int arr[] = { -7, 1, 5, 2, -4, 3, 0 };
        System.out.println(equi.equilibriumm(arr, arr.length));
    }

    int equilibriumm(int[] arr, int n) {
        int leftSum, rightSum;
        for (int i = 0; i < n; i++) {
            leftSum = 0;
            for (int j = 0; j < i; j++)
                leftSum += arr[j];

            rightSum = 0;
            for (int j = i + 1; j < n; j++)
                rightSum += arr[j];

            if (leftSum == rightSum)
                return arr[i];

        }
        return -1;

    }

}
