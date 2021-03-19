package com.romanNumerals;

import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

public class MainTest {

    @Test
    public void one() {
        String romanNumeral = Main.convert(1);

        assertThat(romanNumeral).isEqualTo("I");
    }

    @Test
    public void two() {
        String romanNumeral = Main.convert(2);

        assertThat(romanNumeral).isEqualTo("II");
    }

    @Test(expected = UnsupportedRomanNumberException.class)
    public void unsupported_too_big() {
        Main.convert(4000);
    }

    @Test(expected = InvalidRomanNumberException.class)
    public void unsupported_zero() {
        Main.convert(0);
    }

    @Test(expected = InvalidRomanNumberException.class)
    public void unsupported_negative() {
        Main.convert(-1);
    }
}
//1,2,3,4,5,6,7,8,9
//1,5,10,50,100,500,1000