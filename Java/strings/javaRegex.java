package strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class javaRegex {
    public static void main(String[] args) {
        String actualString = "I.Am.not.an.ip";
        String zeroTo255 = "(\\d{1,2}|(0|1)\\"
                + "d{2}|2[0-4]\\d|25[0-5])";

        String regex = zeroTo255 + "\\."
                + zeroTo255 + "\\."
                + zeroTo255 + "\\."
                + zeroTo255;
        Pattern p = Pattern.compile(regex);
        Matcher matcher = p.matcher(actualString);
        boolean m = matcher.matches();
        System.out.println(m);
    }
}
