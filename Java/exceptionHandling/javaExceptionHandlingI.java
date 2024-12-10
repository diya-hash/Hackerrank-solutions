package exceptionHandling;

import javax.management.InvalidAttributeValueException;

public class javaExceptionHandlingI {
    public static void main(String[] args) throws Exception {
        int n = 9;
        int p = 0;

        if (n < 0 || p < 0) {
            System.out.println("java.lang.Exception: n and p should not be zero.");
        } else if (n == 0 || p == 0) {
            System.out.println("java.lang.Exception: n or p should not be negative.");
        } else
            System.out.println((long) Math.pow(n, p));

    }
}
