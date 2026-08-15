package org.example;

public class ArithmeticService {
    public double add(double left, double right) {
        return left + right;
    }

    public double subtract(double left, double right) {
        return left - right;
    }

    public double multiply(double left, double right) {
        return left * right;
    }

    public double divide(double left, double right) {
        if (right == 0.0) {
            throw new IllegalArgumentException("0으로 나눌 수 없습니다.");
        }
        return left / right;
    }
}
