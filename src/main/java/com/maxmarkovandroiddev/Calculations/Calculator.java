package com.maxmarkovandroiddev.Calculations;

public class Calculator
{

    static public void start() {
        String result;
        try {
            DataExtractor.extractData();
           result = getResult(DataExtractor.getFirstNum(),DataExtractor.getOperator(),DataExtractor.getSecondNum(),DataExtractor.getOperation());
        }
        catch (ArithmeticException | IllegalArgumentException | NullPointerException ex){
            System.out.println("throws Exception " + ex.getMessage());
            return;
        } catch (Exception ex){
            System.out.println("throws Exception");
            return;
        }

        System.out.println(result);
    }

    public static String getResult(String firstOperand, String operator, String secondOperand,Operation operation) throws Exception {
        String result = null;
        switch (operator) {
            case "+":
                result = operation.sum(firstOperand, secondOperand);
                break;
            case "-":
                result = operation.sub(firstOperand, secondOperand);
                break;
            case "/":
                result = operation.div(firstOperand, secondOperand);
                break;
            case "*":
                result = operation.mux(firstOperand, secondOperand);
                break;
        }
        return result;
    }
}

