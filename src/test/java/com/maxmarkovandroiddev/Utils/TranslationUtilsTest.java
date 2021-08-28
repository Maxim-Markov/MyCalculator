package com.maxmarkovandroiddev.Utils;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TranslationUtilsTest {
    String[] romanNumbers;

    @BeforeEach
    void setUp() {
         romanNumbers = new String[]{
                 "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X",
                 "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                 "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX",
                 "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                 "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L",
                 "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                 "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                 "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                 "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                 "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"
         };
    }

    @Test
    void toRoman() {
        List<String> expected = new ArrayList<>();
        for (int x = 1; x <= 100; x++){
            expected.add(TranslationUtils.toRoman(x));
        }
        assertArrayEquals(expected.toArray(),romanNumbers);
    }

    @Test
    void toArabic() {
        List<String> expected = new ArrayList<>();
        int counter = 1;
        for (String num : romanNumbers){
            int actual = TranslationUtils.toArabic(num);
            assertEquals(counter,actual);
            counter++;
        }
    }
}