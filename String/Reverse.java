package String;

public class Reverse {
    public static void main(String[] args) {
        String name = "DHANARAJ";
        char[] names = name.toCharArray();
        for (int i = names.length - 1; i >= 0; i--) {
            System.out.print(names[i] + " ");
        }
    }
}
