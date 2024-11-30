package strings;

public class ceasarCipher {

    public static void main(String[] args) {

        String s = "www.abc.xy";
        int k = 87;
        char[] ch = s.toCharArray();
        String result = "";
        k = k % 26;
        for (char c : ch) {
            int num = (int) c;
            if (c >= 'a' && c <= 'z') {
                if (num + k > 122) {
                    num += k - 26;
                } else {
                    num += k;
                }
                char r = (char) (num);
                result += r;
            } else if (c >= 'A' && c <= 'Z') {
                if (num + k > 90) {
                    num += k - 26;
                } else {
                    num += k;
                }
                char r = (char) (num);
                result += r;
            } else {
                result += c;
            }
        }
        System.out.println(result);
    }

}
