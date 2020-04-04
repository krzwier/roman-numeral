package roman_numeral;

public final class RomanNumeral {

    private final char ONE = 'I';
    private final char FIVE = 'V';
    private final char TEN = 'X';
    private final char FIFTY = 'L';
    private final char ONE_HUNDRED = 'C';
    private final char FIVE_HUNDRED = 'D';

	public String DecimalToRoman(int i) {
		if (i == 1) {
            return String.valueOf(ONE);
        }
        if (i == 5) {
            return String.valueOf(FIVE);
        }
        if (i == 10) {
            return String.valueOf(TEN);
        }
        if (i == 50) {
            return String.valueOf(FIFTY);
        }
        if (i == 100) {
            return String.valueOf(ONE_HUNDRED);
        }
        return String.valueOf(FIVE_HUNDRED);
	}

}
