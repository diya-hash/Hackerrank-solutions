package sorting;

import java.util.ArrayList;
import java.util.List;

public class introduction {
    public static void main(String[] args) {
        int V = 3;
        List<Integer> arr = new ArrayList<>();

        int result = 0;
        arr.add(1);
        arr.add(2);
        arr.add(3);

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == V) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}
