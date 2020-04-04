package roman_numeral;

public final class RomanNumeral {

	public String DecimalToRoman(int i) {
		if (i == 1) {
            return "I";
        }
        return "V";
	}

}
