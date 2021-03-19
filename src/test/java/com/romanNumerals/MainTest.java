package com.romanNumerals;

import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

public class MainTest {

    @Test
    public void one() {

        String romanNumeral = Main.convert(1);

        assertThat(romanNumeral).isEqualTo("I");
    }
}
