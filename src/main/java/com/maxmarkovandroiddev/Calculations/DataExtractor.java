package com.maxmarkovandroiddev.Calculations;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataExtractor {
    static private String firstNum = null;
    public static String getFirstNum(){
        return firstNum;
    }
    static private String secondNum = null;
    public static String getSecondNum(){
        return secondNum;
    }

    static private String operator = null;
    public static String getOperator(){
        return operator;
    }

    static private Operation operation = null;
    public static Operation getOperation(){
        return operation;
    }

    public static void extractData() throws Exception {
        Scanner in = new Scanner(System.in);

        String inputLine = in.nextLine().trim();
        if (inputLine.isEmpty())
            throw new Exception("Blank string");
        fillDataExtractorClass(inputLine);
    }

    public static void fillDataExtractorClass(String inputLine) {
        Pattern pattern = Pattern.compile("[+\\-*/]");
        Matcher matcher = pattern.matcher(inputLine);
        String foundOperator = null;
        int counter = 0;
        while (matcher.find()) {
            foundOperator = matcher.group();
            counter++;
        }

        if (counter > 1)
            throw new NumberFormatException("Too many operators");
        else if (counter == 0)
            throw new NumberFormatException("You don't enter any operator");

        String[] inputElements = inputLine.split("[+\\-*/]");
        Boolean isFirstNumArabic = checkOperand(inputElements[0].replaceAll("\\s", ""));
        Boolean isSecondNumArabic = checkOperand(inputElements[1].replaceAll("\\s", ""));


        if (isFirstNumArabic == null || isSecondNumArabic == null)
            throw new IllegalArgumentException("Operands aren't valid");
        else if(isFirstNumArabic != isSecondNumArabic)
            throw new IllegalArgumentException("Operands have different types");
        else{
            operation = (isFirstNumArabic) ? (new ArabicOperation()) : (new RomanOperation());
            firstNum = inputElements[0].replaceAll("\\s", "");
            operator = foundOperator;
            secondNum = inputElements[1].replaceAll("\\s", "");
        }
    }


    private static Boolean checkOperand(String operand)
    {
        String[] romanNums = new String[] { "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X" };
        if (Arrays.asList(romanNums).contains(operand)) return false;
        else try
        {
            int correctRangeOperand = Integer.parseInt(operand);
            return (correctRangeOperand <= 10 && correctRangeOperand >=1) ? true : null;
        }
        catch(NumberFormatException ex)
        {
            return null;
        }
    }

}
