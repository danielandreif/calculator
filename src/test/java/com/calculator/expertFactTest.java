package com.calculator;

import com.DaySixCourse.expert.Expert;
import org.junit.jupiter.api.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

public class expertFactTest {

    private Expert calculator;

    @BeforeEach
    public void BeforeEach(){
        calculator = new Expert() {};
    }

    @DisplayName("Factorial of zero")
    @Tags({@Tag("Expert"), @Tag("Fact")})
    @Test
    public void shouldFactWithZero(){
        long result =  calculator.factRec(0);
        assertThat(result).isNotNull()
                .isEqualTo(1);
    }

    @DisplayName("Fact negative numbers")
    @Tags({@Tag("Expert"), @Tag("Multiply")})
    @Test
    public void shouldNotHandleNegative(){
        assertThatIllegalArgumentException().isThrownBy(() -> calculator.factRec(-33))
                                            .withMessage("Can't calculate fact of negative numbers");
    }

    @DisplayName("Fact long numbers")
    @Tags({@Tag("Expert"), @Tag("Multiply")})
    @Test
    public void shouldMultiplyLongNumbers(){
        long result =  calculator.factRec(33);
        assertThat(result).isNotNull()
                .isEqualTo(3400198294675128320L);
    }

    @DisplayName("Fact handles plus")
    @Tags({@Tag("Expert"), @Tag("Multiply")})
    @Test
    public void shouldHandlePlusSign(){
        long result =  calculator.factRec(+5);
        assertThat(result).isNotNull()
                .isEqualTo(120);
    }
}

