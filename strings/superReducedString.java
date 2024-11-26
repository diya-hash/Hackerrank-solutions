package strings;

import java.util.Stack;

public class superReducedString {
    public static void main(String[] args) {
        String s = "aaabccddd";
        String result = "";
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (!stack.isEmpty() && stack.peek() == s.charAt(i))
                stack.pop();
            else
                stack.push(s.charAt(i));
        }
        if (stack.isEmpty())
            result = "Empty String";
        else {
            String temp = "";
            while (!stack.isEmpty())
                temp += stack.pop();
            for (int i = temp.length() - 1; i >= 0; i--) {
                result += temp.charAt(i);
            }
        }
        System.out.println(result);
    }

}
