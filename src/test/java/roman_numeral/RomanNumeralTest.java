package roman_numeral;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Suite of unit tests for RomanNumeral class.
 */
class RomanNumeralTest {


    /**
     * Helper method to streamline tests of DecimalToRoman method.
     * Creates instance of RomanNumeral, calls DecimalToRoman on input value,
     * then checks against expected value.
     */
    private void AssertDecimalToRoman(String expected, int input) {
        RomanNumeral rn = new RomanNumeral();

        String actual = rn.DecimalToRoman(input);

        assertEquals(expected, actual);
    }
    
    @Test
    void DecimalToRoman_Input1_ReturnI() {
        AssertDecimalToRoman("I", 1);
    }

    @Test
    void DecimalToRoman_Input5_ReturnV() {
        AssertDecimalToRoman("V", 5);
    }
}
