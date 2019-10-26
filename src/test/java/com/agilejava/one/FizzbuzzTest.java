package com.agilejava.one;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FizzbuzzTest {
    @Test
    public void should_say_1_when_valve_is_1() {
        int actualvue = 1;
        String expectedWord = "1";
        assertGameNumber(expectedWord, actualvue);
    }
    //当数字被3整除，显示为fizz
    @Test
    public void should_say_fizz() {
        assertGameNumber("fizz", 3);
    }

    @Test
    public void should_say_buzz() {
        assertGameNumber("buzz", 5);
    }

    @Test
    public void should_say_fizzbuzz() {
        assertGameNumber("fizzbuzz", 15);
    }
    private void assertGameNumber(String expectedWord, int actualvue) {
        GameNamber gameNamber = new GameNamber(actualvue);
        assertThat(gameNamber.say(), is(expectedWord));
    }
}
