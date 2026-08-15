package org.example;

public class Main {
    public static void main(String[] args) {
        ArithmeticService arithmeticService = new ArithmeticService();
        double left = 10.0;
        double right = 5.0;

        System.out.printf("%.1f + %.1f = %.1f%n", left, right, arithmeticService.add(left, right));
        System.out.printf("%.1f - %.1f = %.1f%n", left, right, arithmeticService.subtract(left, right));
        System.out.printf("%.1f * %.1f = %.1f%n", left, right, arithmeticService.multiply(left, right));
        System.out.printf("average(%.1f, %.1f) = %.1f%n", left, right, arithmeticService.average(left, right));
        System.out.printf("%.1f / %.1f = %.1f%n", left, right, arithmeticService.divide(left, right));
    }
}
