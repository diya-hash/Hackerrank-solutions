package warmup;

public class timeConversion {
    public static void main(String[] args) {
        String s = "12:05:45PM";
        String result = "";
        if (s.charAt(8) == 'A') {
            if (s.charAt(0) == '1' && s.charAt(1) == '2') {
                result = "00" + s.substring(2, 8);
            } else {
                result = s.substring(0, 8);
            }
        } else if (s.charAt(8) == 'P') {
            if (s.charAt(0) == '1' && s.charAt(1) == '2') {
                result = s.substring(0, 8);
            } else {
                String sub = s.substring(0, 2);
                int num = Integer.parseInt(sub) + 12;
                sub = String.valueOf(num);
                result = sub + s.substring(2, 8);
            }
        }
        System.out.println(result);
    }
}
