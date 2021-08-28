package com.maxmarkovandroiddev.Calculations;

abstract class Operation
{
    abstract String sum(String first, String second);

    abstract String sub(String first, String second) throws Exception;

    abstract String mux(String first, String second);

    abstract String div(String first, String second) throws Exception;
}

