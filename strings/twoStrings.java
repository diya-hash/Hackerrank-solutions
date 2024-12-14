package strings;

public class twoStrings {
    public static void main(String[] args) {
        String s1 = "hi";
        String s2 = "world";

        boolean isPresent = false;
        int[] occur1 = new int[26];
        int[] occur2 = new int[26];

        for (char c : s1.toCharArray()) {
            int num = (int) c - 'a';
            occur1[num]++;
        }

        for (char c : s2.toCharArray()) {
            int num = (int) c - 'a';
            occur2[num]++;
        }
        for (int i = 0; i < 26; i++) {
            if (occur1[i] > 0 && occur2[i] > 0) {
                isPresent = true;
                break;
            }
        }
        if (isPresent == true) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
