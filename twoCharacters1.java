
import java.util.HashMap;

public class twoCharacters1 {
    public static void main(String[] args) {
        String s = "asdcbsdcagfsdbgdfanfghbsfdab";
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        Character[] c = { '0' };
        Character[] ch = { '0' };
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i)) == false) {
                map.put(s.charAt(i), 1);
            } else {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            }

        }
        // System.out.println(map);
        // removing unique chars and storing concurrent chars in a char array
        for (Character i : map.keySet()) {
            if (map.get(i) == 1) {
                s = s.replace(String.valueOf(i), "");
                map.remove(i);
            } else if (map.get(i) > 1) {
                for (int m = 1; m < s.length(); m++) {
                    if (i == s.charAt(m) && s.charAt(m) == s.charAt(m - 1)) {
                        c[j] = s.charAt(m);

                        // System.out.println(c[j]);
                        j++;
                    }
                }
            }
        }
        // removing concurrent chars
        for (int i = 0; i < c.length; i++) {
            s = s.replace(String.valueOf(c[i]), "");
            map.remove(c[i]);
        }
        j = 0;
        // finding the combinations with two chars
        for (Character i : map.keySet()) {
            ch[j] = i;
            j++;
        }
        for (int i = 0; i < c.length; i++) {
            for (int m = 1; m < c.length; m++) {

            }
        }

        System.out.println(map);
        System.out.println(s);

    }
}
