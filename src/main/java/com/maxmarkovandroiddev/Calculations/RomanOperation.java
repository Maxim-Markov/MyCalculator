package com.maxmarkovandroiddev.Calculations;
import static com.maxmarkovandroiddev.Utils.TranslationUtils.toRoman;
import static com.maxmarkovandroiddev.Utils.TranslationUtils.toArabic;

public class RomanOperation extends Operation {
    @Override
    String sum(String first, String second) {
        return toRoman(toArabic(first) + toArabic(second));
    }

    @Override
    String sub(String first, String second) {
        int res = toArabic(first) - toArabic(second);

        if(res >= 1)
            return toRoman(res);
        else
            throw new ArithmeticException("Roman numbers always positive");
    }

    @Override
    String mux(String first, String second) {

        return toRoman(toArabic(first) * toArabic(second));
    }

    @Override
    String div(String first, String second) {
        int res = toArabic(first) / toArabic(second);


        if(res >= 1)
            return toRoman(res);
        else
            throw new NumberFormatException("Roman numbers must be much than I");
    }
}
