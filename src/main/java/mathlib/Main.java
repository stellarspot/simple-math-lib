package mathlib;

import mathlib.function.Functions;

public class Main {
    public static void main(String[] args) {
        double x = 2;
        System.out.printf("sqr(%.2f)=%.2f%n", x, Functions.SQR.calculate(x));
    }
}
