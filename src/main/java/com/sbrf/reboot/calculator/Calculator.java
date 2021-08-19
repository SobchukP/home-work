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
        return numOne/numTwo;
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