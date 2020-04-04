package roman_numeral;

public final class RomanNumeral {

    private final char ONE = 'I';
    private final char FIVE = 'V';
    private final char TEN = 'X';
    private final char FIFTY = 'L';
    private final char ONE_HUNDRED = 'C';
    private final char FIVE_HUNDRED = 'D';
    private final char ONE_THOUSAND = 'M';

	public String DecimalToRoman(int i) {

        switch (i) {
            case 1:
                return String.valueOf(ONE);
            case 5:
                return String.valueOf(FIVE);
            case 10:
                return String.valueOf(TEN);
            case 50: 
                return String.valueOf(FIFTY);
            case 100:
                return String.valueOf(ONE_HUNDRED);
            case 500:
                return String.valueOf(FIVE_HUNDRED);
            case 1000:
                return String.valueOf(ONE_THOUSAND);
        }
        return null;
	}

}
