package com.romanNumerals;

public class Main {
    public static String convert(int n) {
        if (n < 1) throw new InvalidRomanNumberException();

        switch (n){
            case 1: return "I";
            case 2: return "II";
        }
        throw new UnsupportedRomanNumberException();
    }
}
