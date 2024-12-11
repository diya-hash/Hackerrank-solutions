package medium;

public class sherlockAndValidString {
    public static void main(String[] args) {
        String s = "abc";
        int[] occur = new int[26];

        for (int i = 0; i < s.length(); i++) {
            int n = (int) s.charAt(i) - 'a';
            occur[n]++;
        }

    }
}
