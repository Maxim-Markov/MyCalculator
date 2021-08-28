package com.maxmarkovandroiddev.Calculations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArabicOperationTest {


    @Test
    void sum_9_and_5() {
        String expected = "14";
        String actual = new ArabicOperation().sum("9","5");
        assertEquals(expected,actual);
    }

    @Test
    void div_5_and_6_0_expected() {
        String expected = "0";
        String actual = new ArabicOperation().div("5","6");
        assertEquals(expected,actual);
    }

    @Test
    void sub_6_and_7_minus1_expected() {
        String expected = "-1";
        String actual = new ArabicOperation().sub("6","7");
        assertEquals(expected,actual);
    }

    @Test
    void sub_10_and_6() {
        String expected = "4";
        String actual = new ArabicOperation().sub("10","6");
        assertEquals(expected,actual);
    }

    @Test
    void mux_9_and_6() {
        String expected = "54";
        String actual = new ArabicOperation().mux("9","6");
        assertEquals(expected,actual);
    }

    @Test
    void div_10_and_3() {
        String expected = "3";
        String actual = new ArabicOperation().div("10","3");
        assertEquals(expected,actual);
    }
}