package string_solutions;

public class pangram {
    public static void main(String[] args) {
        String s = "We promptly judged antique ivory buckles for the prize";

        s = s.toLowerCase();
        int[] occur = new int[30];
        boolean pangram = true;
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                continue;
            }
            int num = (int) c - 97;
            occur[num]++;
        }
        for (int i = 0; i < 26; i++) {
            if (occur[i] == 0) {
                pangram = false;
                break;
            }
        }
        if (pangram == true) {
            System.out.println("pangram");
        } else {
            System.out.println("not pangram");
        }
    }
}
