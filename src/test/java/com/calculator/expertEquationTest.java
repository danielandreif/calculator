package com.calculator;

import com.DaySixCourse.expert.Expert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class expertEquationTest {

    Expert calculator = new Expert() {};

    @Test
    public void doubleParanthesesPowerOf() {
        double result = calculator.calculate("(( 2 ^ 2) * 3) + 2");
        //Asserts
        assertEquals(14, result);
    }

    @Test
    public void doubleParanthesesPlus() {
        double result = calculator.calculate("((2 + 2) * 3) + 2");
        //Asserts
        assertEquals(14, result);
    }

    @Test
    public void doubleParanthesesMinus() {
        double result = calculator.calculate("((10 - 4) - 3) - 2");
        //Asserts
        assertEquals(1, result);
    }

    @Test
    public void doubleParanthesesWithaTwist() {
        double result = calculator.calculate("(2 + 2 * (3 + 2))");
        //Asserts
        assertEquals(12, result);
    }

    @Test
    public void doubleParanthesesMoreOperations() {
        double result = calculator.calculate("((2+2)*3) + ((2 - 1) + 4 * (2+2))");
        //Asserts
        assertEquals(29, result);
    }
}


