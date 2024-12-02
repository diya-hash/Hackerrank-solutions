package strings;

public class beautifulBinaryString {
    public static void main(String[] args) {
        String b = "01100";
        int left = 0;
        int right = 1;
        boolean isThere = false;
        int count = 0;
        while (right < b.length()) {
            if (b.charAt(left) != b.charAt(right) && b.charAt(left) == '0' && b.charAt(right) == '1'
                    && isThere == false) {
                isThere = true;
                right++;
            } else if (b.charAt(left) != b.charAt(right) && (b.charAt(right) == '1' && isThere == true)) {
                left = right + 1;
                right += 2;
                isThere = false;
            } else if (isThere == true && b.charAt(right) == '0') {
                left = right + 1;
                right += 2;
                isThere = false;
                count++;
            } else if ((left == right && isThere == false) || (left != right && isThere == false)) {
                left = right;
                right++;
            }
            System.out.println("left: " + left + " right " + right + " isthere: " + isThere + " count " + count);
        }
        System.out.println(count);
    }
}
