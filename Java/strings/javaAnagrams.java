package strings;

public class javaAnagrams {
    public static void main(String[] args) {
        String a = "anagramm";
        String b = "marganaa";
        int[] occur1 = new int[27];
        int[] occur2 = new int[27];
        int num = 0;
        boolean isAnagram = true;
        for (char c : a.toCharArray()) {
            if (c >= 'a' && c <= 'z')
                num = (int) c - 'a';
            else if (c >= 'A' && c <= 'Z')
                num = (int) c - 'A';
            occur1[num]++;
        }
        for (char c : b.toCharArray()) {
            if (c >= 'a' && c <= 'z')
                num = (int) c - 'a';
            else if (c >= 'A' && c <= 'Z')
                num = (int) c - 'A';
            occur2[num]++;
        }
        for (int i = 0; i < 26; i++) {
            if (occur1[i] != occur2[i]) {
                isAnagram = false;
                break;
            }
        }
        System.out.println(isAnagram);
    }
}
