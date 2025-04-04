package mypackage;

public class basiccalc {
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        if (b == 0) {
            System.out.println("Denominator with 0 is not defined or infinite");
            return 0;
        } 
        else {
            return a / b;
        }
    }
}
