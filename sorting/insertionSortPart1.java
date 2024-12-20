package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class insertionSortPart1 {
    public static void main(String[] args) {
        int n = 5;
        List<Integer> arr = new ArrayList<Integer>(Arrays.asList(2, 4, 6, 8, 3));

        for (int i = n - 1; i < arr.size(); i++) {
            int key = arr.get(i);
            int j = i - 1;
            while (j >= 0 && arr.get(j) > key) {
                arr.set(j + 1, arr.get(j));
                j--;
                for (int k = 0; k < arr.size(); k++) {
                    System.out.print(arr.get(k) + " ");
                }
                System.out.println("");
            }
            arr.set(j + 1, key);
            for (int k = 0; k < arr.size(); k++) {
                System.out.print(arr.get(k) + " ");
            }
        }
    }
}
