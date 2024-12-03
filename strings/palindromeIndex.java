package strings;

public class palindromeIndex {
    public static boolean isPalindrome(String s, int removeChar) {
        StringBuilder sb = new StringBuilder();
        String s1 = sb.append(s).deleteCharAt(removeChar).toString();
        String s2 = sb.reverse().toString();
        if (s1.equals(s2)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "ddabcbad";
        int l = 0;
        int r = s.length() - 1;
        int result = -1;

        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                if (isPalindrome(s, l)) {
                    result = l;
                    break;
                } else if (isPalindrome(s, r)) {
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
// "hgygsvlfcwnswtuhmyaljkqlqjjqlqkjlaymhutwsnwcwflvsgygh"