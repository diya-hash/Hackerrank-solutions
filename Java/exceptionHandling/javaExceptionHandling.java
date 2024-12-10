package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class javaExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int output = 0;
        try {
            int x = sc.nextInt();
            int y = sc.nextInt();
            output = x / y;
            System.out.println(output);
        } catch (ArithmeticException e) {
            System.out.println("java.lang.ArithmeticException: / by zero");
        } catch (InputMismatchException e) {
            System.out.println("java.util.InputMismatchException");
        }

    }
}
