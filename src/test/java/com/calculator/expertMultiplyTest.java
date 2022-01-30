package com.calculator;

import com.DaySixCourse.basic.Basic;
import org.junit.jupiter.api.*;

import static org.assertj.core.api.Assertions.assertThat;

public class expertMultiplyTest {

    private Basic calculator;

    @BeforeEach
    public void BeforeEach(){
        calculator = new Basic() {};
    }

    @DisplayName("Multiplication with just zero")
    @Tags({@Tag("Expert"), @Tag("Multiply")})
    @Test
    public void shouldMultiplyJustZero(){
        long result =  calculator.multiply(0);
        assertThat(result).isNotNull()
                .isEqualTo(0);
    }

    @DisplayName("Multiplication long numbers")
    @Tags({@Tag("Expert"), @Tag("Multiply")})
    @Test
    public void shouldMultiplyLongNumbers(){
        long result =  calculator.multiply(546545L,348273L);
        assertThat(result).isNotNull()
                .isEqualTo(190346866785L);
    }

    @DisplayName("Multiplication with doubles and ints")
    @Tags({@Tag("Expert"), @Tag("Multiply")})
    @Test
    public void shouldMultiplyDoublesAndInts(){
        double result =  calculator.multiply(-5.5D,100,-40D);
        assertThat(result).isNotNull()
                .isEqualTo(22000.0);
    }

    @DisplayName("Multiplication with doubles")
    @Tags({@Tag("Expert"), @Tag("Multiply")})
    @Test
    public void shouldMultiplyDoubles(){
        double result =  calculator.multiply(-5.5D,-2.5D,-5.5D);
        assertThat(result).isNotNull()
                .isEqualTo(-75.625);
    }

    @DisplayName("Multiplication with negative")
    @Tags({@Tag("Expert"), @Tag("Multiply")})
    @Test
    public void shouldMultiplyByNegative(){
        long result = calculator.multiply(-5,-2,-5);
        assertThat(result).isNotNull()
                .isEqualTo(-50);
    }

    @DisplayName("Multiplication with zero")
    @Tags({@Tag("Expert"), @Tag("Multiply")})
    @Test
    public void shouldMultiplyByZero(){
        long result = calculator.multiply(8,0,1,3);
        assertThat(result).isNotNull()
                .isEqualTo(0);
    }

    //Bug was here // Had to add extra "if"
    @DisplayName("Multiplication with no numbers")
    @Tags({@Tag("Expert"), @Tag("Multiply")})
    @Test
    public void shouldMultiplyNoNumbers(){
        long result = calculator.multiply();
        assertThat(result).isNotNull()
                .isEqualTo(0);
    }

    @DisplayName("Multiplication with one number")
    @Tags({@Tag("Expert"), @Tag("Multiply")})
    @Test
    public void shouldMultiplyOneNumber(){
        long result = calculator.multiply(4);
        assertThat(result).isNotNull()
                .isEqualTo(4);
    }
}
