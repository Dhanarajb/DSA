public class NextAlphabet {
    static char nextGreatestAlphabet(char letters[], char K) {
        int start = 0, end = letters.length - 1;

        int ans = -1;
        while (start <= end) {
            int mid = (start + (end - start) / 2);
            if (letters[mid] > K) {
                end = mid - 1;
                ans = mid;
            } else
                start = mid + 1;
        }
        return letters[ans];
    }

    public static void main(String[] args) {
        char letters[] = { 'a', 'c', 'f', 'h' };
        char K = 'b';
        char result = nextGreatestAlphabet(letters, K);
        System.out.println(result);
    }
}
