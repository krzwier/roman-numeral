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
    private final int[] basic_numerals = {1000, 500, 100, 50, 10, 5, 1};
    private final int[] repeating_numerals = {1000, 100, 10, 1};

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

        int trial_number;
        // check to see if i is a basic numeral minus another basic numeral
        // start by checking the largest basic numeral
        for (int n = 0; n < basic_numerals.length; n++ ){
            trial_number = i + basic_numerals[n];
            if (rn_mappings.containsKey(trial_number)) {
                return String.valueOf(rn_mappings.get(basic_numerals[n])) +
                    String.valueOf(rn_mappings.get(trial_number));
            }
        }

        // check to see if i is a basic numeral plus another basic numeral
        // start by checking the smallest basic numeral
        for (int n = basic_numerals.length - 1; n >= 0; n--) {
            trial_number = i - basic_numerals[n];
            if (rn_mappings.containsKey(trial_number)) {
                return String.valueOf(rn_mappings.get(trial_number)) + 
                    String.valueOf(rn_mappings.get(basic_numerals[n]));
            }
        }

        // check to see if i needs a repeating numeral
        // start by checking the smallest repeating numeral
        for (int n = repeating_numerals.length - 1; n >= 0; n--) {
            // check for repeating numeral times 2
            trial_number = i - (repeating_numerals[n] * 2);
            if (rn_mappings.containsKey(trial_number)) {
                return String.valueOf(rn_mappings.get(trial_number)) + 
                    String.valueOf(rn_mappings.get(repeating_numerals[n])) +
                    String.valueOf(rn_mappings.get(repeating_numerals[n]));
            }

            // check for repeating numeral times 3
            trial_number = i - (repeating_numerals[n] * 3);
            if (rn_mappings.containsKey(trial_number)) {
                return String.valueOf(rn_mappings.get(trial_number)) + 
                    String.valueOf(rn_mappings.get(repeating_numerals[n])) +
                    String.valueOf(rn_mappings.get(repeating_numerals[n])) +
                    String.valueOf(rn_mappings.get(repeating_numerals[n]));
            }
        }

        

        return null;
	}

}
