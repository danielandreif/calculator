package com.calculator;

import com.DaySixCourse.basic.Basic;
import com.extensions.ExecutionListenerImplement;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class expertMultiplyTest {

    private Basic calculator;
    private ExecutionListenerImplement listener;

    //Instantiate the basic calculator object before each test
    @BeforeEach
    public void BeforeEach(){
        calculator = new Basic() {};
        listener = new ExecutionListenerImplement() {};
        listener.listener();
    }

}
