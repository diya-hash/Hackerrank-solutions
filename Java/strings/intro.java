package strings;

public class intro {
    public static void main(String[] args) {
        String A = "java";
        String B = "hello";
        String lex = "No";

        int add = A.length() + B.length();
        if (A.compareTo(B) > 0) {
            lex = "Yes";
        }
        int num = (int) A.charAt(0) - 'a';
        char c = (char) (num + 65);
        A = A.replace(A.charAt(0), c);

        num = (int) B.charAt(0) - 'a';
        c = (char) (num + 65);
        B = B.replace(B.charAt(0), c);

        System.out.println(add);
        System.out.println(lex);
        System.out.println(A + " " + B);
    }
}
