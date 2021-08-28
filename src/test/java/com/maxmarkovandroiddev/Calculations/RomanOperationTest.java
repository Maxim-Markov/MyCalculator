package com.maxmarkovandroiddev.Calculations;


import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.*;

class RomanOperationTest {


    @Test
    void sum_IX_and_V() {
        String expected = "XIV";
        String actual = new RomanOperation().sum("IX","V");
        assertEquals(expected,actual);
    }

    @Test
    void div_V_and_VI_Exception_expected() {
        Throwable thrown = assertThrows(NumberFormatException.class, () -> new RomanOperation().div("V","VI"));
        assertNotNull(thrown.getMessage());
    }

    @Test
    void sub_VI_and_VII_Exception_expected() {
        Throwable thrown = assertThrows(ArithmeticException.class, () -> new RomanOperation().sub("VI","VII"));
        assertNotNull(thrown.getMessage());
    }

    @Test
    void sub_X_and_VI() {
        String expected = "IV";
        String actual = new RomanOperation().sub("X","VI");
        assertEquals(expected,actual);
    }

    @Test
    void mux_IX_and_VI() {
        String expected = "LIV";
        String actual = new RomanOperation().mux("IX","VI");
        assertEquals(expected,actual);
    }

    @Test
    void div_X_and_III() {
        String expected = "III";
        String actual = new RomanOperation().div("X","III");
        assertEquals(expected,actual);
    }
}