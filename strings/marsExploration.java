package string_solutions;

public class marsExploration {
    public static void main(String[] args) {
        String s = "SOSOOSOSOSOSOSSOSOSOSOSOSOS";
        int result = 0;
        int count = 0;
        int i = 0;
        int n = s.length() / 3;

        while (count != n) {
            if (s.charAt(i) != 'S')
                result++;
            i++;
            if (s.charAt(i) != 'O')
                result++;
            i++;
            if (s.charAt(i) != 'S')
                result++;
            i++;
            count++;
        }
        System.out.println(result);
    }
}
