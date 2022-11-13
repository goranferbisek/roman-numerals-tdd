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
        if (number < 10)
            return "IX";
        if (number == 10)
            return "X";
        if (number < 40)
            return convert(10) + convert(number - 10);
        if (number == 40)
            return "XL";
        if (number < 50)
            return convert(40) + convert(number - 40);
        return "L";
    }
}
