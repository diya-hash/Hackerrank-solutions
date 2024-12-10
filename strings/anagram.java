package strings;

public class anagram {
    public static void main(String[] args) {
        String s = "mvdalvkiopaufl";

        if (s.length() % 2 != 0) {
            System.out.println("-1");
        }
        String s1 = s.substring(0, s.length() / 2);
        String s2 = s.substring(s.length() / 2);
        System.out.println(s1 + "\n" + s2);
        int[] occur1 = new int[27];
        int[] occur2 = new int[27];
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < s1.length(); i++) {
            int n = (int) (s1.charAt(i) - 'a');
            int n1 = (int) (s2.charAt(i) - 'a');
            occur1[n]++;
            occur2[n1]++;
        }

        for (int i = 0; i < 26; i++) {
            if (occur2[i] > occur1[i]) {
                count2 += occur2[i] - occur1[i];
            } else if (occur1[i] > occur2[i]) {
                count1 += occur1[i] - occur2[i];
            }
        }
        System.out.println(count1 + "\t" + count2);
        System.out.println(Math.min(count1, count2));
    }
}
