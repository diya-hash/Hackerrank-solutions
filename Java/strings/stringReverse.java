package strings;

public class stringReverse {
    public static void main(String[] args) {
        String s = "madam";
        String result = "No";
        StringBuilder sb = new StringBuilder();
        String r = sb.append(s).reverse().toString();

        if (r.equals(s)) {
            result = "Yes";
        }
        System.out.println(result);
    }
}
