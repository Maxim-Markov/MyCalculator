package com.maxmarkovandroiddev.Calculations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void getResult() throws Exception {
        String expected = "I";
        String expected2 = "-8";
        String actual = Calculator.getResult("X","-","IX",new RomanOperation());
        String actual2 = Calculator.getResult("1","-","9",new ArabicOperation());
        assertEquals(expected,actual);
        assertEquals(expected2,actual2);
    }
}