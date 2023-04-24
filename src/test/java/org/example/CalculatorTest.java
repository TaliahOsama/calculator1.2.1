package org.example;

import io.qase.api.annotation.QaseTitle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

        @Test
        @QaseTitle("testAddition")
        public void testAddition() {
            Calculator calculator = new Calculator();
            Assertions.assertEquals(4, calculator.add(2, 2));
        }

        @Test
        @QaseTitle("testSubtraction")
        public void testSubtraction() {
            Calculator calculator = new Calculator();
            Assertions.assertEquals(2, calculator.subtract(4, 2));
        }

        @Test
        @QaseTitle("testMultiplication")
        public void testMultiplication() {
            Calculator calculator = new Calculator();
            Assertions.assertEquals(6, calculator.multiply(2, 3));
        }

        @Test
        @QaseTitle("testDivision")
        public void testDivision() {
            Calculator calculator = new Calculator();
            Assertions.assertEquals(2, calculator.divide(4, 2));
        }

        @Test
        @QaseTitle("testDivisionByZero")
        public void testDivisionByZero() {
            Calculator calculator = new Calculator();
            Assertions.assertEquals(Double.POSITIVE_INFINITY, calculator.divide(4, 0));
        }
    }




