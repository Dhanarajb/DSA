package String;

import java.util.LinkedHashSet;
import java.util.Set;

public class FindDuplicateString {

    public static void main(String[] args) {
        String str = "hi enmadla tidi";
        char[] carr = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (carr[i] == carr[j]) {
                    System.out.print(carr[j] + " ");
                    break;
                }
            }
        }
    }
}
