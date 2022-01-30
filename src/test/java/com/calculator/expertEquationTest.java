package com.calculator;

import com.DaySixCourse.basic.Basic;
import com.DaySixCourse.expert.Expert;
import org.junit.jupiter.api.*;

import static org.assertj.core.api.Assertions.assertThat;

public class expertEquationTest {

    private Expert calculator;

    @BeforeEach
    public void BeforeEach(){
        calculator = new Expert() {};
    }

    @DisplayName("Bracket opening at start")
    @Tags({@Tag("Expert"), @Tag("Equation")})
    @Test
    public void shouldHandleOpeningBrackets() {
        double result = calculator.calculate("(( 2 ^ 2) * 3) + 2");
        assertThat(result).isNotNull()
                .isEqualTo(14);
    }


    @DisplayName("Bracket opening at end")
    @Tags({@Tag("Expert"), @Tag("Equation")})
    @Test
    public void shouldHandleOpeningBracketsAtEnd() {
        double result = calculator.calculate("(2 + 2 * (3 + 2))");
        assertThat(result).isNotNull()
                .isEqualTo(12);
    }

    @DisplayName("Multiple opening/closing brackets")
    @Tags({@Tag("Expert"), @Tag("Equation")})
    @Test
    public void shouldHandleMultipleBrackets() {
        double result = calculator.calculate("((2+2)*3) + ((2 - 1) + 4 * (2+2))");
        assertThat(result).isNotNull()
                .isEqualTo(29);
    }

    @DisplayName("Enclosing bracket")
    @Tags({@Tag("Expert"), @Tag("Equation")})
    @Test
    public void shouldHandlEnclosingBrackets() {
        double result = calculator.calculate("(((2+2)*3) + ((2 - 1) + 4 * (2+2)))");
        assertThat(result).isNotNull()
                .isEqualTo(29);
    }
}


