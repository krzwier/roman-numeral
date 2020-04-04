package roman_numeral;

public final class RomanNumeral {

    private final char ONE = 'I';
    private final char FIVE = 'V';
    private final char TEN = 'X';
    private final char FIFTY = 'L';
    private final char ONE_HUNDRED = 'C';

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
        return String.valueOf(ONE_HUNDRED);
	}

}
