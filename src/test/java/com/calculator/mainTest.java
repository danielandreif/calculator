package com.calculator;

import com.DaySixCourse.basic.Basic;
import com.DaySixCourse.basic.BasicOperations;
import com.DaySixCourse.expert.Expert;
import com.DaySixCourse.expert.ExpertOperations;

public class mainTest {

    public static void main(String[] args) {
        BasicOperations basicOp = new Basic(6);
        ExpertOperations expOp = new Expert();

//        System.out.print("SUBTRACT INTEGER = ");
//        System.out.println(basicOp.subtract(1,2,3));
//        System.out.print("SUBTRACT DOUBLE = ");
//        System.out.println(basicOp.subtract(1.5,2.5,3.5));
//        System.out.print("ADD INTEGER = ");
//        System.out.println(basicOp.add(1,2,3));
//        System.out.print("ADD DOUBLE = ");
//        System.out.println(basicOp.add(1.5,2.5,3.5));
//        System.out.print("MULTIPLY INTEGER = ");
//        System.out.println(basicOp.multiply(1,2,3));
//        System.out.print("MULTIPLY DOUBLE = ");
//        System.out.println(basicOp.multiply(1.5,2.5,3.5));
//        System.out.print("DIVIDE INTEGER = ");
//        System.out.println(basicOp.divide(4,2,2));
//        System.out.print("DIVIDE DOUBLE = ");
//        System.out.println(basicOp.divide(4.5,2.5));
//        System.out.println("------------------------------------");

        //homework below. also please see attached unit tests.
        System.out.println(expOp.calculate("((2+2)*3) + (((2 - 1) + 4) * (2+2))"));
    }
}
