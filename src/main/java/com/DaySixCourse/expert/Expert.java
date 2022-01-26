package com.DaySixCourse.expert;

import com.DaySixCourse.basic.Basic;

public class Expert extends Basic implements ExpertOperations {

    private final String[] operators = {"+", "-", "*", "/", "%", "^"};
    private String userInput = null;

    @Override
    public double pow(double base, double exponent) {
        double result = 1;
        for (int i = 1; i <= Math.abs(exponent); i++) {
            result *= base;
        }
        if (exponent >= 0) {
            return result;
        } else {
            return 1 / result;
        }
    }

    @Override
    public double sqrt(int number) {
        return Math.sqrt(number);
    }

    @Override
    public long fact(int number) {
        long result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    @Override
    public long factRec(int number) {
        if (number == 0) {
            return 1;
        } else if (number > 0) {
            return number * factRec(number - 1);
        } else {
            throw new IllegalArgumentException("Can't calculate fact of negative numbers");
        }
    }

    @Override
    public double calculate(String s) {

        try {
            return Double.parseDouble(s);
        } catch (NumberFormatException e) {
            if (s.contains("(")) {
                setInput(s);
                int startIndex = multipleStartingBrackets();
                int endIndex = multipleEndingBrackets();
                String left = s.substring(0, startIndex);
                String right = s.substring(endIndex + 1);
                String center = s.substring((startIndex + 1), endIndex);

                double result = calculate(center);
                return calculate(left + result + right);
            } else {
                for (String o : operators) {
                    int index = s.lastIndexOf(o);

                    if (index == -1) {
                        continue;
                    }

                    String leftSide = s.substring(0, index);
                    if (index != 0 && leftSide.trim().charAt(leftSide.trim().length() - 1) == '+' || leftSide.trim().charAt(leftSide.trim().length() - 1) == '-'
                            || leftSide.trim().charAt(leftSide.trim().length() - 1) == '*' || leftSide.trim().charAt(leftSide.trim().length() - 1) == '/' ||
                            leftSide.trim().charAt(leftSide.trim().length() - 1) == '^') {
                        continue;
                    }
                    double leftOperand = index == 0 ? 0.0 : calculate(leftSide);
                    double rightOperand = calculate(s.substring(index + 1));

                    switch (o) {
                        case "+":
                            return add(leftOperand, rightOperand);
                        case "-":
                            return subtract(leftOperand, rightOperand);
                        case "*":
                            return multiply(leftOperand, rightOperand);
                        case "/":
                            return divide(leftOperand, rightOperand);
                        case "%":
                            return leftOperand % rightOperand;
                        case "^":
                            return pow(leftOperand, rightOperand);
                        default:
                            throw new IllegalArgumentException("Invalid operator" + o);
                    }
                }
            }
            throw new RuntimeException("Operator field needs to have at least one value");
        }
    }

    @Override
    public int multipleStartingBrackets() {
        String userString = getInput();
        return userString.lastIndexOf("(");
    }

    @Override
    public int multipleEndingBrackets() {
        String userString = getInput();
        return userString.indexOf(")", multipleStartingBrackets());
    }

    public String getInput() {
        return userInput;
    }

    public void setInput(String c) {
        this.userInput = c;
    }

}
