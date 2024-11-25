package warmup;

import java.util.ArrayList;
import java.util.Arrays;

public class birthdayCakeCandles {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(4, 4, 1, 3));
        int n = arr.size();
        int count = 1;
        arr.sort(null);
        long max = arr.get(n - 1);
        for (int i = n - 2; i >= 0; i--) {
            // System.out.println(arr.get(i) + " count " + count + " max = " + max);
            if (arr.get(i) < max) {
                break;
            }
            count++;
        }
        System.out.println(count);
    }
}
