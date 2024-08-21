package com.howtoprogram;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;



public class CalculatorTest {
    
    private final Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(5, calculator.add(2, 3), "2 + 3 should equal 5");
        assertEquals(0, calculator.add(-1, 1), "-1 + 1 should equal 0");
        assertEquals(-2, calculator.add(-1, -1), "-1 + -1 should equal -2");
    }

    @Test
    public void testSubtract() {
        assertEquals(1, calculator.subtract(3, 2), "3 - 2 should equal 1");
        assertEquals(-2, calculator.subtract(-1, 1), "-1 - 1 should equal -2");
        assertEquals(0, calculator.subtract(-1, -1), "-1 - -1 should equal 0");
    }

    @Test
    public void testMultiply() {
        assertEquals(6, calculator.multiply(2, 3), "2 * 3 should equal 6");
        assertEquals(-1, calculator.multiply(-1, 1), "-1 * 1 should equal -1");
        assertEquals(1, calculator.multiply(-1, -1), "-1 * -1 should equal 1");
    }

    @Test
    public void testDivide() {
        assertEquals(2, calculator.divide(4, 2), "4 / 2 should equal 2");
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(1, 0), "Division by zero should throw IllegalArgumentException");
    }
}