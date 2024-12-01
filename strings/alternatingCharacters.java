package strings;

public class alternatingCharacters {
    public static void main(String[] args) {
        String s = "AAABBB";
        int left = 0;
        int right = 1;
        int count = 0;
        while (right < s.length()) {
            if (s.charAt(left) == s.charAt(right)) {
                count++;
                right++;
            } else {
                left = right;
                right++;
            }
        }
        System.out.println(count);
    }
}
