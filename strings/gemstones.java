package strings;

import java.util.ArrayList;
import java.util.Arrays;

public class gemstones {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("abcdde", "baccd", "eeabg"));
        int[] occur = new int[27];
        boolean[] isPassed = new boolean[26];
        String s = list.get(0);
        int result = 0;
        for (char c : s.toCharArray()) {
            int num = (int) c - 'a';
            if (occur[num] == 0) {
                occur[num]++;
            }
        }

        for (int i = 1; i < list.size(); i++) {
            s = list.get(i);
            for (char c : s.toCharArray()) {
                int num = (int) c - 'a';
                if (isPassed[num] == false) {
                    occur[num]++;
                    isPassed[num] = true;
                }
            }
            for (int j = 0; j < isPassed.length; j++) {
                if (isPassed[j] == true) {
                    isPassed[j] = false;
                }
            }
        }

        for (int i = 0; i < occur.length; i++) {
            if (occur[i] == list.size())
                result++;
        }
        System.out.println(result);
    }
}
