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

    @Test
    void DecimalToRoman_Input10_ReturnX() {
        AssertDecimalToRoman("X", 10);
    }

    @Test
    void DecimalToRoman_Input50_ReturnL() {
        AssertDecimalToRoman("L", 50);
    }

    @Test
    void DecimalToRoman_Input100_ReturnC() {
        AssertDecimalToRoman("C", 100);
    }

    @Test
    void DecimalToRoman_Input500_ReturnD() {
        AssertDecimalToRoman("D", 500);
    }

    @Test
    void DecimalToRoman_Input1000_ReturnM() {
        AssertDecimalToRoman("M", 1000);
    }

    @Test
    void DecimalToRoman_Input2_ReturnII() {
        AssertDecimalToRoman("II", 2);
    }

    @Test
    void DecimalToRoman_Input6_ReturnVI() {
        AssertDecimalToRoman("VI", 6);
    }

    @Test
    void DecimalToRoman_Input11_ReturnXI() {
        AssertDecimalToRoman("XI", 11);
    }

    @Test
    void DecimalToRoman_Input3_ReturnIII() {
        AssertDecimalToRoman("III", 3);
    }

    @Test
    void DecimalToRoman_Input7_ReturnVII() {
        AssertDecimalToRoman("VII", 7);
    }

    @Test
    void DecimalToRoman_Input8_ReturnVIII() {
        AssertDecimalToRoman("VIII", 8);
    }

    @Test
    void DecimalToRoman_Input13_ReturnXIII() {
        AssertDecimalToRoman("XIII", 13);
    }

    @Test
    void DecimalToRoman_Input4_ReturnIV() {
        AssertDecimalToRoman("IV", 4);
    }

    @Test
    void DecimalToRoman_Input9_ReturnIX() {
        AssertDecimalToRoman("IX", 9);
    }

    @Test
    void DecimalToRoman_Input49_ReturnIL() {
        AssertDecimalToRoman("IL", 49);
    }

    @Test
    void DecimalToRoman_Input45_ReturnVL() {
        AssertDecimalToRoman("VL", 45);
    }

    @Test
    void DecimalToRoman_Input15_ReturnXV() {
        AssertDecimalToRoman("XV", 15);
    }

    @Test
    void DecimalToRoman_Input55_ReturnLV() {
        AssertDecimalToRoman("LV", 55);
    }

    @Test
    void DecimalToRoman_Input40_ReturnXL() {
        AssertDecimalToRoman("XL", 40);
    }

    @Test
    void DecimalToRoman_Input60_ReturnLX() {
        AssertDecimalToRoman("LX", 60);
    }

    @Test
    void DecimalToRoman_Input20_ReturnXX() {
        AssertDecimalToRoman("XX", 20);
    }

    @Test
    void DecimalToRoman_Input70_ReturnLXX() {
        AssertDecimalToRoman("LXX", 70);
    }

    @Test
    void DecimalToRoman_Input80_ReturnLXXX() {
        AssertDecimalToRoman("LXXX", 80);
    }

    @Test
    void DecimalToRoman_Input900_ReturnCM() {
        AssertDecimalToRoman("CM", 900);
    }

    @Test
    void DecimalToRoman_Input990_ReturnXM() {
        AssertDecimalToRoman("XM", 990);
    }

    @Test
    void DecimalToRoman_Input950_ReturnLM() {
        AssertDecimalToRoman("LM", 950);
    }

    @Test
    void DecimalToRoman_Input14_ReturnXIV() {
        AssertDecimalToRoman("XIV", 14);
    }
}
