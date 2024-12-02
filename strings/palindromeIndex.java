package strings;

public class palindromeIndex {
    public static void main(String[] args) {
        String s = "hgygsvlfcwnswtuhmyaljkqlqjjqlqkjlaymhutwsnwcwflvsgygh";
        int l = 0;
        int r = s.length() - 1;
        int result = -1;

        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                if (s.charAt(l + 1) == s.charAt(r)) {
                    result = l;
                    break;
                } else if (s.charAt(r - 1) == s.charAt(l)) {
                    result = r;
                    break;
                }
            }
            l++;
            r--;
        }
        System.out.println(result);
    }
}
