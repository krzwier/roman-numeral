package roman_numeral;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Suite of unit tests for RomanNumeral class.
 */
class RomanNumeralTest {
    
    @Test
    void DecimalToRoman_Input1_ReturnI() {
        RomanNumeral rn = new RomanNumeral();

        String actual = rn.DecimalToRoman(1);
        
        assertEquals("I", actual);
    }
}
