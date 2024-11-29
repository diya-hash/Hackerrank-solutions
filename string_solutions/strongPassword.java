package string_solutions;

public class strongPassword {
    public static void main(String[] args) {
        String s = "E!%Z@";
        int n = 5;
        boolean special = false;
        boolean up = false;
        boolean low = false;
        boolean digit = false;
        int count = 4;

        for (int i = 0; i < n; i++) {
            if (up == false && s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                up = true;
                count--;
            }

            if (low == false && s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                low = true;
                count--;
            }

            if (digit == false && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                digit = true;
                count--;
            }
            if (special == false && s.charAt(i) >= '!' && s.charAt(i) <= '-'
                    || s.charAt(i) == '@' && special == false) {
                special = true;
                count--;
            }
        }
        if (count + n <= 6) {
            count = count + (6 - (n + count));
        }
        System.out.println(count);
    }
}
