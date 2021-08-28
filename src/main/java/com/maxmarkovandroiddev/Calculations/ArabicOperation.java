package com.maxmarkovandroiddev.Calculations;

public class ArabicOperation extends Operation{
    @Override
    String sum(String first, String second) {
        return  Integer.toString(Integer.parseInt(first) + Integer.parseInt(second));
    }

    @Override
    String sub(String first, String second) {
        return Integer.toString(Integer.parseInt(first) - Integer.parseInt(second));
    }

    @Override
    String mux(String first, String second) {

        return Integer.toString(Integer.parseInt(first) * Integer.parseInt(second));
    }

    @Override
    String div(String first, String second) {// ArithmeticException re-throws on the upper layer of hierarchy
        return  Integer.toString(Integer.parseInt(first) / Integer.parseInt(second));
    }
}
