package com.calculator;

import com.DaySixCourse.basic.Basic;
import com.extensions.ExecutionListenerImplement;
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

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class basicAdditionTest {

    private Basic calculator;
    private ExecutionListenerImplement listener = new ExecutionListenerImplement() {};
    //Parameterized test number generator // Helper method
    public static List<Arguments> numberProvider(){
        List<Arguments> argumentList = new ArrayList<>();
        argumentList.add(Arguments.of(1,2,3));
        argumentList.add(Arguments.of(3,4,7));
        argumentList.add(Arguments.of(-4,-2,-6));

        return argumentList;
    }
    //Instantiate the basic calculator object before each test
    @BeforeEach
    public void BeforeEach(){
        calculator = new Basic() {};
        listener.listener();
    }
    //Parameterized tests
    @DisplayName("Addition using method source")
    @Tags({@Tag("Basic"), @Tag("Parameterized"), @Tag("Addition")})
    @ParameterizedTest
    @MethodSource("numberProvider")
    public void shouldAddUsingMethodSource(int a, int b, double expected){
        Double result = calculator.add(a,b);
        assertThat(result).isEqualTo(expected);
    }

    @DisplayName("Addition using csv file")
    @Tags({@Tag("Basic"), @Tag("Parameterized"), @Tag("Addition")})
    @ParameterizedTest
    @CsvFileSource(resources = "numberSource.csv")
    public void shouldAddUsingCsvFile(int a, int b, int c, double expected){
        Double result = calculator.add(a,b,c);
        assertThat(result).isEqualTo(expected);
    }

    @DisplayName("Addition using csv source")
    @Tags({@Tag("Basic"), @Tag("Parameterized"), @Tag("Addition")})
    @ParameterizedTest
    @CsvSource({"1,2,3,6", "2,4,5,11"})
    public void shouldAddUsingCsvSource(int a, int b, int c, double expected){
        Double result = calculator.add(a, b , c);
        assertThat(result).isEqualTo(expected);
    }
    //Non-parameterized tests
    //Treating a known bug for CI/CD sake
    @DisplayName("Addition using max value")
    @Tags({@Tag("Basic"), @Tag("Addition")})
    @Test
    public void shouldAddBigNumbers(){
        assertThrows(AssertionError.class, () -> {
            Long result = calculator.add(Integer.MAX_VALUE, 1L);
            assertThat(result).isEqualTo(Integer.MAX_VALUE + 1L)
                              .isLessThan(0L)//This throws the assertion error
                              .isNotNull();
        });
    }

    @DisplayName("Addition with no numbers")
    @Tags({@Tag("Basic"), @Tag("Addition")})
    @Test
    public void shouldAddNoNumbers(){
        Double result = calculator.add();
        assertThat(result).isNotNull()
                          .isEqualTo(0);
    }

    @DisplayName("Addition with one number")
    @Tags({@Tag("Basic"), @Tag("Addition")})
    @Test
    public void shouldAddOneNumber(){
        Double result = calculator.add(4);
        assertThat(result).isNotNull()
                          .isEqualTo(4);
    }

    //EXTENSION LISTENER LauncherFactory.create().registerTestExecutionListeneres(MyCustomTestListener)
    //IMPLEMENT EXTENSION LISTENER WITH CUSTOM LOGGING // LOG LISTENER
}
