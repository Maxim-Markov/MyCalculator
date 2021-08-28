package com.maxmarkovandroiddev.Utils;

import java.util.Map;
import java.util.TreeMap;

public class TranslationUtils {
    private final static TreeMap<Integer, String> map = new TreeMap<>();

    static {
        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");
    }

    public static String toRoman(int arabic) {
        int l = map.floorKey(arabic);
        if (arabic == l) {
            return map.get(arabic);
        }
        return map.get(l) + toRoman(arabic - l);
    }

    /*public static Integer toArabic(String roman) {
        int result = 0;
        for (Map.Entry<Integer, String> item : map.entrySet()) {
            result += countOccurrences(roman, item.getValue()) * item.getKey();
            roman = roman.replaceAll(item.getValue(), "");
        }
        return result == 0 ? null : result;
    }*/

    public static int toArabic(String roman) {
        int result = 0;
        for (Map.Entry<Integer, String> item : map.descendingMap().entrySet()) {
            while (roman.indexOf(item.getValue()) == 0 && item.getValue().length() > 0) {
                result += item.getKey();
                roman = roman.substring(item.getValue().length());
            }
        }

        return result;
    }


}