package warmup;

import java.util.ArrayList;
import java.util.Arrays;

public class plusMinus {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 1, 0, -1, -1));
        float pos = 0;
        float zero = 0;
        float neg = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0)
                pos++;
            else if (arr.get(i) == 0)
                zero++;
            else
                neg++;
        }
        float p = pos / arr.size();
        float z = zero / arr.size();
        float n = neg / arr.size();
        String res1 = String.format("%.6f", p);
        String res2 = String.format("%.6f", n);
        String res3 = String.format("%.6f", z);
        System.out.println(res1 + "\n" + res2 + "\n" + res3);
    }

}
