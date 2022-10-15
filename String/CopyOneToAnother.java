package String;

public class CopyOneToAnother {
    public static void main(String[] args) {
        String x = "Dhanaraj bhaskar"; // create one reference
        char y[] = x.toCharArray(); // exttract that data from string to array
        int size = y.length; // computing size of y
        char a[] = new char[size]; // create a new array
        int i = 0;
        while (i != size) {
            a[i] = y[i];
            i++;
        }
        System.out.println(y);
        System.out.println(a);
    }
}
