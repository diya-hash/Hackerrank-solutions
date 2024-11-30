package strings;

public class funnyString {
    public static void main(String[] args) {
        String s = "ponml";
        int j = 0;
        boolean isFunny = true;
        int[] arr = new int[s.length() - 1];
        for (int i = 0; i < s.length() - 1; i++) {
            int n1 = (int) s.charAt(i);
            int n2 = (int) s.charAt(i + 1);
            int diff = Math.abs(n1 - n2);

            arr[j] = diff;
            // System.out.println(arr[j]);
            j++;
        }
        int i = 0;
        j--;
        while (i <= j) {
            if (arr[i] != arr[j]) {
                isFunny = false;
                break;
            }
            i++;
            j--;
        }
        if (isFunny == true) {
            System.out.println("Funny");
        } else {
            System.out.println("Not funny");
        }
    }
}