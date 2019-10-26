package com.agilejava.one;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FizzbuzzTest {
    @Test
    public void should_say_1_when_valve_is_1() {
        assertGameNumber(1, "1");
    }

    //当数字被3整除，显示为fizz
    @Test
    public void should_say_fizz() {
        assertGameNumber(3, "fizz");
    }

    @Test
    public void should_say_buzz() {
        assertGameNumber(5, "buzz");
    }

    @Test
    public void should_say_fizzbuzz() {
        assertGameNumber(15, "fizzbuzz");
    }

    private void assertGameNumber(int actualvue, String expectedWord) {
        GameNamber gameNamber = new GameNamber(actualvue);
        assertThat(gameNamber.say(), is(expectedWord));
    }
}
