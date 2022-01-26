package com.DaySixCourse.basic;

public class Basic implements BasicOperations {

    protected int decimals;

    public Basic() {
        decimals = 10;
    }

    public Basic(int decimals) {
        this.decimals = 10;
    }


    @Override
    public double subtract(int... no) {
        int result = no[0];
        for (int i = 1; i < no.length; i++) {
            result -= no[i];
        }
        return formatNumber(result);
    }

    @Override
    public long subtract(long... no) {
        long result = no[0];
        for (int i = 1; i < no.length; i++) {
            result -= no[i];
        }
        return result;
    }

    @Override
    public double subtract(double... no) {
        double result = no[0];
        for (int i = 1; i < no.length; i++) {
            result -= no[i];
        }
        return result;
    }

    @Override
    public double add(int... no) {
        int sum = 0;
        for (int number : no) {
            sum += number;
        }
        return formatNumber(sum);
    }

    @Override
    public long add(long... no) {
        long sum = 0;
        for (long number : no) {
            sum += number;
        }
        return sum;
    }

    @Override
    public double add(double... no) {
        double sum = 0;
        for (double number : no) {
            sum += number;
        }
        return sum;
    }

    @Override
    public long multiply(int... no) {
        long result = no[0];
        for (int i = 1; i < no.length; i++) {
            result *= no[i];
        }
        return result;
    }

    @Override
    public long multiply(long... no) {
        long result = no[0];
        for (int i = 1; i < no.length; i++) {
            result *= no[i];
        }
        return result;
    }

    @Override
    public double multiply(double... no) {
        double result = no[0];
        for (int i = 1; i < no.length; i++) {
            result *= no[i];
        }
        return result;
    }

    @Override
    public double divide(int... no) {
        int result = no[0];
        for (int i = 1; i < no.length; i++) {
            result /= no[i];
        }
        return formatNumber(result);
    }

    @Override
    public long divide(long... no) {
        long result = no[0];
        for (int i = 1; i < no.length; i++) {
            result /= no[i];
        }
        return result;
    }

    @Override
    public double divide(double... no) {
        double result = no[0];
        for (int i = 1; i < no.length; i++) {
            result /= no[i];
        }
        return result;
    }

    protected double formatNumber(double n) {
        String s = String.format("%." + decimals + "f", n);
        return Double.parseDouble(s);
    }
}
