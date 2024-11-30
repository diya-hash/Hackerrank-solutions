
import java.util.Scanner;

public class hackerrankString {
    public static void main(String[] args) {
        int q = 10;
        for (int input = 0; input < q; input++) {
            // Scanner scan = new Scanner(System.in);
            // String s = scan.nextLine();
            String s = "hackerworld";

            String h = "hackerrank";
            String result = "";
            int curr = 0;
            for (char c : s.toCharArray()) {
                if (c == h.charAt(curr)) {
                    curr++;
                    if (curr == h.length())
                        break;
                }
            }
            if (curr == h.length()) {
                result = "YES";
            } else {
                result = "NO";
            }
            System.out.println(result);

        }

    }
}
