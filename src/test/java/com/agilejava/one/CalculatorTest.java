package com.agilejava.one;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {
    @Test
    public void should_add_tow_numbers() {
        Calculator calculator = new Calculator();
        int result = calculator.add(1, 2);
        assertThat(result, is(3));
    }
}
