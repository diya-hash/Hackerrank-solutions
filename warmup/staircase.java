package warmup;

import java.util.ArrayList;
import java.util.Arrays;

public class staircase {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(5, 5, 5, 5, 5));
        long min = -10;
        long max = 1000000001;
        long sum = 0;
        arr.sort(null);
        for (int i = 0; i < arr.size() - 1; i++) {
            sum += arr.get(i);
        }
        min = sum;
        System.out.println(min);
        sum = 0;
        for (int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        if (sum < min)
            min = sum;
        else if (sum == min) {
            min = sum;
            max = sum;
        } else
            max = sum;
        System.out.println("min = " + min + " max = " + max);
    }
}
