package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class insertionSortPart2 {
    public static void main(String[] args) {
        int n = 7;
        List<Integer> arr = new ArrayList<Integer>(Arrays.asList(3, 4, 7, 5, 6, 2, 1));
        for (int i = 1; i < arr.size(); i++) {
            int key = arr.get(i);
            int j = i - 1;
            while (j >= 0 && arr.get(j) > key) {
                arr.set(j + 1, arr.get(j));
                j--;
            }
            arr.set(j + 1, key);
            for (int k = 0; k < arr.size(); k++) {
                System.out.print(arr.get(k) + " ");
            }
            System.out.println("");
        }
    }
}
