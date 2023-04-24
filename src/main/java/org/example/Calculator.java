package org.example;

import io.qase.api.annotation.Step;

public class Calculator {
    @Step("Add the given numbers {a} and {b}")
    public int add(int a, int b) {
        return a + b;
    }
    @Step("Subtract the given numbers {a} and {b}")
    public int subtract(int a, int b) {
        return a - b;
    }
    @Step("Multiply the given numbers {a} and {b}")
    public int multiply(int a, int b) {
        return a * b;
    }
    @Step("Divide the given numbers {a} and {b}")
    public double divide(int a, int b) {
        if (b == 0) {
            return Double.POSITIVE_INFINITY;
        }
        return  (double) a / b;
    }
}

