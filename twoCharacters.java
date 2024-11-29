

import java.util.HashMap;

public class twoCharacters {

    public static void main(String[] args) {
        String s = "asdcbsdcagfsdbgdfanfghbsfdab";
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        Character[] c = { '0' };
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i)) == false) {
                map.put(s.charAt(i), 1);
            } else {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            }

        }
        System.out.println(map);
        int j = 0;
        for (Character i : map.keySet()) {
            if (map.get(i) == 1)
                s = s.replace(String.valueOf(i), "");
            if (map.get(i) > 1) {
                for (int m = 1; m < s.length(); m++) {
                    if (i == s.charAt(m) && s.charAt(m) == s.charAt(m - 1)) {
                        c[j] = s.charAt(m);
                        System.out.println(c[j]);
                        j++;
                    }
                }
            }
        }
        for (int i = 0; i < c.length; i++) {
            s = s.replace(String.valueOf(c[i]), "");
        }
        HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            if (map1.containsKey(s.charAt(i)) == false) {
                map1.put(s.charAt(i), 1);
            } else {
                map1.put(s.charAt(i), map1.get(s.charAt(i)) + 1);
            }

        }
        System.out.println(map1);
        System.out.println("map size: " + map1.size());
        boolean flag = false;
        if (s.length() > 1 && map1.size() == 2) {
            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i) != s.charAt(i - 1)) {
                    flag = true;
                } else {
                    flag = false;
                }
            }
        }
        if (flag == true)
            result = s.length();
        else
            result = 0;
        System.out.println(result);
    }
}
