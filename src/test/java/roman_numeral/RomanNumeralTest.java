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
    void DecimalToRoman_Input49_ReturnXLIX() {
        AssertDecimalToRoman("XLIX", 49);
    }

    @Test
    void DecimalToRoman_Input45_ReturnXLV() {
        AssertDecimalToRoman("XLV", 45);
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
    void DecimalToRoman_Input990_ReturnCMXC() {
        AssertDecimalToRoman("CMXC", 990);
    }

    @Test
    void DecimalToRoman_Input950_ReturnCML() {
        AssertDecimalToRoman("CML", 950);
    }

    @Test
    void DecimalToRoman_Input14_ReturnXIV() {
        AssertDecimalToRoman("XIV", 14);
    }

    @Test
    void DecimalToRoman_Input16_ReturnXVI() {
        AssertDecimalToRoman("XVI", 16);
    }

    @Test
    void DecimalToRoman_Input19_ReturnXIX() {
        AssertDecimalToRoman("XIX", 19);
    }

    @Test
    void DecimalToRoman_Input21_ReturnXXI() {
        AssertDecimalToRoman("XXI", 21);
    }

    @Test
    void DecimalToRoman_Input23_ReturnXXIII() {
        AssertDecimalToRoman("XXIII", 23);
    }

    @Test
    void DecimalToRoman_Input24_ReturnXXIV() {
        AssertDecimalToRoman("XXIV", 24);
    }

    @Test
    void DecimalToRoman_Input31_ReturnXXXI() {
        AssertDecimalToRoman("XXXI", 31);
    }
    
    @Test
    void DecimalToRoman_Input28_ReturnXXVIII() {
        AssertDecimalToRoman("XXVIII", 28);
    }

    @Test
    void DecimalToRoman_Input29_ReturnXXIX() {
        AssertDecimalToRoman("XXIX", 29);
    }

    @Test
    void DecimalToRoman_Input39_ReturnXXXIX() {
        AssertDecimalToRoman("XXXIX", 39);
    }

    @Test
    void DecimalToRoman_Input54_ReturnLIV() {
        AssertDecimalToRoman("LIV", 54);
    }

    @Test
    void DecimalToRoman_Input400_ReturnCD() {
        AssertDecimalToRoman("CD", 400);
    }

    @Test
    void DecimalToRoman_Input1459_ReturnMCDLIX() {
        AssertDecimalToRoman("MCDLIX", 1459);
    }

    @Test
    void DecimalToRoman_Input1959_ReturnMCMLIX() {
        AssertDecimalToRoman("MCMLIX", 1959);
    }

    @Test
    void DecimalToRoman_Input99_ReturnXCIX() {
        AssertDecimalToRoman("XCIX", 99);
    }
    

}
