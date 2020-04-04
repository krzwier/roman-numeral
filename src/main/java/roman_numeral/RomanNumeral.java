package roman_numeral;

import java.util.HashMap;

public final class RomanNumeral {

    private final char ONE = 'I';
    private final char FIVE = 'V';
    private final char TEN = 'X';
    private final char FIFTY = 'L';
    private final char ONE_HUNDRED = 'C';
    private final char FIVE_HUNDRED = 'D';
    private final char ONE_THOUSAND = 'M';

    private HashMap<Integer, Character> rn_mappings;

    public RomanNumeral() {
        // populate hash table with basic numerals
        rn_mappings = new HashMap<>();
        rn_mappings.put(1,ONE);
        rn_mappings.put(5,FIVE);
        rn_mappings.put(10,TEN);
        rn_mappings.put(50,FIFTY);
        rn_mappings.put(100,ONE_HUNDRED);
        rn_mappings.put(500,FIVE_HUNDRED);
        rn_mappings.put(1000,ONE_THOUSAND);
    }

	public String DecimalToRoman(final int i) {

        // check to see if i is represented by a basic numeral
        if (rn_mappings.containsKey(i)) {
            return String.valueOf(rn_mappings.get(i));
        }
        
        // check to see if i is 1 greater than a basic numeral
        int trial_number = i - 1;
        if (rn_mappings.containsKey(trial_number)) {
            return String.valueOf(rn_mappings.get(trial_number)) + "I";
        }

        // check to see if i is 2 greater than a basic numeral
        trial_number = i - 2;
        if (rn_mappings.containsKey(trial_number)) {
            return String.valueOf(rn_mappings.get(trial_number)) + "II";
        }

        // check for number 4, which is a special case
        if (i==4) {
            return "IV";
        }

        // check to see if i is 3 greater than a basic numeral
        trial_number = i - 3;
        if (rn_mappings.containsKey(trial_number)) {
            return String.valueOf(rn_mappings.get(trial_number)) + "III";
        }

        

        return null;
	}

}
