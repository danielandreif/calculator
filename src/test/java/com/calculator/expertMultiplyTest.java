package com.calculator;

import com.DaySixCourse.basic.Basic;
import org.junit.jupiter.api.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class expertMultiplyTest {

    private Basic calculator;

    //Instantiate the basic calculator object before each test
    @BeforeEach
    public void BeforeEach(){
        calculator = new Basic() {};
    }

}
