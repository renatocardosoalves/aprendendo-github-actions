package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testSum() {
        var calculator = new Calculator();
        var result = calculator.sum(5.0, 2.0);
        Assertions.assertEquals(10.0, result);
    }

}