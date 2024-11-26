package strings;

import java.util.Stack;

public class stackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        for (int j = 10; j >= 1; j--) {
            stack.push(j);
        }
        for (int j = 1; j <= 10; j++) {
            if (j == stack.peek()) {
                System.out.println(stack.pop() + " repeats");
            }

        }

    }
}
