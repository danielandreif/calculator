package com.calculator;

import com.DaySixCourse.basic.Basic;
import com.DaySixCourse.expert.Expert;
import com.extensions.TestReporterExtension;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;

@ExtendWith(TestReporterExtension.class)
public class basicTest {

    private Basic calculator;

    @BeforeAll
    public static void beforeAll(){
        System.out.println("Before all");
    }

    @AfterAll
    public static void AfterAll(){
        System.out.println("After all");
    }

    @AfterEach
    public void AfterEach(){
        System.out.println("After each\n");
    }

    @BeforeEach
    public void BeforeEach(){
        calculator = new Basic() {};
        System.out.println("\nBefore each");
    }

    @Tags({@Tag("Smoke"), @Tag("UI")})
    @ParameterizedTest
    @MethodSource("numberProvider")
    public void shouldAddNumbersGivenZero(int a, int b){
        Double result = calculator.add(a,b);
        System.out.println(result);
    }

    public static List<Arguments> numberProvider(){
        List<Arguments> argumentList = new ArrayList<>();
        argumentList.add(Arguments.of(0,2));
        argumentList.add(Arguments.of(2,0));

        return argumentList;
    }

    @ParameterizedTest
    @CsvFileSource(resources = "numberSource.csv")
    public void shouldAddNegativeNumbers(int a, int b, int c){
        Double result = calculator.add(a,b,c);
        System.out.println(result);
    }

    @Tags({@Tag("Smoke"), @Tag("API")})
    @Test
    public void shouldAddBigNumbers(){
        Long result = calculator.add(Integer.MAX_VALUE, 1L);
        System.out.println(result);
    }

    @ParameterizedTest
    @CsvSource({"1,2,3", "2,4,5"})
    public void shouldAddMultipleNumbers(int a, int b, int c){
        Double result = calculator.add(a, b , c);
        System.out.println(result);
    }

    @Test
    public void shouldAddNoNumbers(){
        Double result = calculator.add();
        System.out.println(result);
    }

    @Test
    public void shouldAddOneNumber(){
        Double result = calculator.add(4);
        System.out.println(result);
    }

    //create test cases for 3 other methods
}
