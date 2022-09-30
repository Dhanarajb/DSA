package String;

public class ReverseUsingStringBuilder {
    public static void main(String[] args) {
        String st = "Dhanaraj";
        StringBuilder sb = new StringBuilder(st);
        StringBuilder rev = sb.reverse();
        System.out.println(rev.toString());
    }

}
