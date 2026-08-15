package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ArithmeticServiceTest {
    private final ArithmeticService service = new ArithmeticService();

    @Test
    void addsTwoNumbers() {
        assertEquals(8.0, service.add(5.0, 3.0));
    }

    @Test
    void subtractsTwoNumbers() {
        assertEquals(2.0, service.subtract(5.0, 3.0));
    }

    @Test
    void multipliesTwoNumbers() {
        assertEquals(15.0, service.multiply(5.0, 3.0));
    }

    @Test
    void averagesTwoNumbers() {
        assertEquals(4.0, service.average(5.0, 3.0));
    }

    @Test
    void returnsTheLargerNumber() {
        assertEquals(5.0, service.maximum(5.0, 3.0));
        assertEquals(7.0, service.maximum(2.0, 7.0));
        assertEquals(-2.0, service.maximum(-5.0, -2.0));
    }

    @Test
    void dividesTwoNumbers() {
        assertEquals(2.5, service.divide(5.0, 2.0));
    }

    @Test
    void rejectsDivisionByZero() {
        assertThrows(IllegalArgumentException.class, () -> service.divide(5.0, 0.0));
    }
}
