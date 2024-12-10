package strings;

public class makingAnagrams {
    public static void main(String[] args) {
        String s1 = "absdjkvuahdakejfnfauhdsaavasdlkj";
        String s2 = "djfladfhiawasdkjvalskufhafablsdkashlahdfa";
        System.out.println(s1.length() + "\t" + s2.length());
        int[] occur1 = new int[26];
        int[] occur2 = new int[26];
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            int n = (int) (s1.charAt(i) - 'a');
            occur1[n]++;
        }
        for (int i = 0; i < s2.length(); i++) {
            int n = (int) (s2.charAt(i) - 'a');
            occur2[n]++;
        }
        for (int i = 0; i < 26; i++) {
            if (occur1[i] != occur2[i]) {
                count += Math.abs(occur1[i] - occur2[i]);
            }
        }
        System.out.println(count);
    }
}
