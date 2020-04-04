package roman_numeral;

public final class RomanNumeral {

    private final char ONE = 'I';
    private final char FIVE = 'V';
    private final char TEN = 'X';

	public String DecimalToRoman(int i) {
		if (i == 1) {
            return String.valueOf(ONE);
        }
        if (i == 5) {
            return String.valueOf(FIVE);
        }
        return String.valueOf(TEN);
	}

}
