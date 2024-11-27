package strings;

public class camelCase {
    public static void main(String[] args) {
        String s = "saveChangesInTheEditor";
        int count = 1;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                count++;
            }
        }
        System.out.println(count);
    }

}
