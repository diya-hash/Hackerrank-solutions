package strings;

public class loveLetterMystery {
    public static void main(String[] args) {
        String s = "a";
        int l = 0;
        int r = s.length() - 1;
        int count = 0;

        while (l < r) {
            int n1 = (int) s.charAt(l);
            int n2 = (int) s.charAt(r);

            if (n1 < n2) {
                while (n1 < n2) {
                    n2--;
                    count++;
                }
                char c = (char) n2;
                System.out.println(c);
            } else if (n2 < n1) {
                while (n2 < n1) {
                    n1--;
                    count++;
                }
                char c = (char) n1;
                System.out.println(c);
            }
            l++;
            r--;
        }
        System.out.println(count);
    }
}
