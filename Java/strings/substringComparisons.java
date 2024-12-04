package strings;

public class substringComparisons {
    public static void main(String[] args) {
        String s = "welcometojava";
        int k = 3;
        String smallest = "";
        String largest = "";
        int j = 0;
        smallest = s.substring(s.length() - k, s.length());
        largest = s.substring(s.length() - k, s.length());
        // System.out.println(smallest);
        for (int i = 0; i < s.length() - k; i++) {
            j = i + k;
            String s1 = s.substring(i, j);
            // System.out.println(s1);
            if (s1.compareTo(smallest) <= 0)
                smallest = s1;
            if (s1.compareTo(largest) > 0) {
                largest = s1;
            }
        }
        System.out.println(smallest + "\n" + largest);
        // return smallest + "\n" + largest;
    }
}
