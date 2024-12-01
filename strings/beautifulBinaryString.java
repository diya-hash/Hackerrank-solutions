package strings;

public class beautifulBinaryString {
    public static void main(String[] args) {
        String b = "0100101010";
        int left = 0;
        int right = 1;
        boolean isThere = false;
        int count = 0;
        while (right < b.length()) {
            if (left != right && b.charAt(left) == '0' && b.charAt(right) == '1') {
                isThere = true;
                right++;
            } else if (isThere == true && b.charAt(right) == '0') {
                left = right;
                isThere = false;
                right++;
                count++;
            } else if ((left == right && isThere == false) || (left != right && isThere == false)) {
                left = right;
                right++;
            }
        }
        System.out.println(count);
    }
}
