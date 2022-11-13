package si.ferbisek.roman_numerals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanNumeralConverterTest {

    @Test
    void given_latin_1_then_roman_I() {
        Assertions.assertEquals(RomanNumeralConverter.convert(1), "I");
    }
}
