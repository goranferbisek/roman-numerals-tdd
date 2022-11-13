package si.ferbisek.roman_numerals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanNumeralConverterTest {

    @Test
    void given_latin_1_then_roman_I() {
        Assertions.assertEquals(RomanNumeralConverter.convert(1), "I");
    }

    @Test
    void given_latin_2_then_roman_II() {
        Assertions.assertEquals(RomanNumeralConverter.convert(2), "II");
    }

    @Test
    void given_latin_3_then_roman_III() {
        Assertions.assertEquals(RomanNumeralConverter.convert(3), "III");
    }

    @Test
    void given_latin_4_then_roman_IV() {
        Assertions.assertEquals(RomanNumeralConverter.convert(4), "IV");
    }

    @Test
    void given_latin_5_then_roman_V() {
        Assertions.assertEquals(RomanNumeralConverter.convert(5), "V");
    }

    @Test
    void given_latin_6_then_roman_VI() {
        Assertions.assertEquals(RomanNumeralConverter.convert(6), "VI");
    }

    @Test
    void given_latin_9_then_roman_IX() {
        Assertions.assertEquals(RomanNumeralConverter.convert(9), "IX");
    }

    @Test
    void given_latin_10_then_roman_X() {
        Assertions.assertEquals(RomanNumeralConverter.convert(10), "X");
    }

}
