public class stringConstruction {
    public static void main(String[] args) {
        String s = "abab";
        int[] occur = new int[26];
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            int n = (int) s.charAt(i) - 'a';
            if (occur[n] == 0) {
                occur[n]++;
                count++;
            }
        }
        System.out.println(count);
    }
}
