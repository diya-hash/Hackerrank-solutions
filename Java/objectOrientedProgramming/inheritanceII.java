package objectOrientedProgramming;

public class inheritanceII {
    public static void main(String[] args) {
        Adder a = new Adder();
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());
        int output = a.add(3, 5);
        System.out.println(output);
    }
}

class Arithmetic {

    public int add(int a, int b) {
        int sum = a + b;
        return sum;
    }
}

class Adder extends Arithmetic {
    Adder() {
        super();
    }
}