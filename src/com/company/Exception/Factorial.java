package com.company.Exception;

public class Factorial<T extends Integer> {
    T i;

    private boolean isInteger(T i) {
        if (i instanceof Integer) return true;
        return false;
    }

    public int getFactorial(T i) throws Exception{
        if ((int) i < 1) {
            throw new Exception("The number is less than 1");
        }

        if (!isInteger(i)) throw new Exception("This is not a number");

        int f = 1;

        for (int j = 1; j <= (int) i; j++) {
            f *= j;
        }
        return f;
    }
}
