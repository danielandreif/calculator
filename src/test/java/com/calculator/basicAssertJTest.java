package com.calculator;

import com.DaySixCourse.basic.Basic;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class basicAssertJTest {
    private Basic calculator;

    @BeforeEach
    public void BeforeEach(){
        calculator = new Basic() {};
    }

    @Test
    public void shouldAddOneNumber(){
        Long result = calculator.add(167L);
        assertThat(result).isBetween(100L,200L)
                .isGreaterThan(150L)
                .isEqualTo(167L)
                .isNotNegative()
                .isNotNull();
    }
}
