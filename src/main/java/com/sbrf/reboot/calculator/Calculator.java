package com.sbrf.reboot.calculator;

import static java.lang.Double.MAX_VALUE;

public class Calculator {
    public static int getAddition(int numOne, int numTwo) {
        return numOne + numTwo;
    }

    public static int getSubtraction(int numOne, int numTwo) {
        return numOne - numTwo;
    }

    public static int getMultiplication(int numOne, int numTwo) {
        return numOne * numTwo;
    }

    public static double getDivision(int numOne, int numTwo) {
        double result = MAX_VALUE;
        try {
            result = numOne / numTwo;
        }catch (ArithmeticException err){
            System.out.println("Error: " + err.getMessage() + ", return max value of double");
        }
        return result;
    }

    public static double getPower(int numOne, int numTwo) {
        return Math.pow(numOne, numTwo);
    }

    public static boolean getEquals(int numOne, int numTwo) {
        return numOne == numTwo;
    }

    public static int getMax(int numOne, int numTwo) {
        return numOne >= numTwo ? numOne : numTwo;
    }
}
