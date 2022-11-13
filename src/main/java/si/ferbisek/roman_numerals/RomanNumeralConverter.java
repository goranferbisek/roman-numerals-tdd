package si.ferbisek.roman_numerals;

public class RomanNumeralConverter {
    public static String convert(int number) {
        if (number < 4)
            return "I".repeat(Math.max(0, number));
        if (number == 4)
            return "IV";
        if (number == 5)
            return "V";
        if (number < 9)
            return convert(5) + convert(number - 5);
        if (number == 9)
            return "IX";
        return "X";
    }
}
