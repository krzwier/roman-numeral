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

        return DecimalToRomanRecursive(i);
        
    }

    /**
     * This method recurses until roman numeral is found
     * 
     * @param i
     * @return roman numeral
     */
    private String DecimalToRomanRecursive(int i) {

        // BASE CASES

        // check if i is 0
        if (i == 0) {
            return "";
        }

        // check to see if i is represented by a basic numeral
        if (rn_mappings.containsKey(i)) {
            return String.valueOf(rn_mappings.get(i));
        }

        // RECURSIVE CASES

        if (i - 1000 >= 0) {
            return "M" + DecimalToRomanRecursive(i - 1000);
        }

        if (i - 900 >= 0) {
            return "CM" + DecimalToRomanRecursive(i - 900);
        }

        if (i - 500 >= 0) {
            return "D" + DecimalToRomanRecursive(i - 500);
        }

        if (i - 400 >= 0) {
            return "CD" + DecimalToRomanRecursive(i - 400);
        }

        if (i - 100 >= 0) {
            return "C" + DecimalToRomanRecursive(i - 100);
        }

        if (i - 90 >= 0) {
            return "XC" + DecimalToRomanRecursive(i - 90);
        }
        
        if (i - 50 >= 0) {
            return "L" + DecimalToRomanRecursive(i - 50);
        }

        if (i - 40 >= 0) {
            return "XL" + DecimalToRomanRecursive(i - 40);
        }

        if (i - 10 >= 0) {
            return "X" + DecimalToRomanRecursive(i - 10);
        }

        if (i - 9 >= 0) {
            return "IX" + DecimalToRomanRecursive(i - 9);
        }

        if (i - 5 >= 0) {
            return "V" + DecimalToRomanRecursive(i - 5);
        }

        if (i - 4 >= 0) {
            return "IV" + DecimalToRomanRecursive(i - 4);
        }

        return "I" + DecimalToRomanRecursive(i - 1);
    }

    
    /**
     * This method checks if i is a basic numeral minus another basic numeral
     * 
     * @param i
     * @return roman numeral if there's a match, "NONE" if not
     */
    private String BasicMinusBasic(int i) {
        int trial_number;
        
        for (int n = basic_numerals.length - 1; n >= 0; n--) {
            trial_number = basic_numerals[n] - i;
            if (rn_mappings.containsKey(trial_number)) {
                return String.valueOf(rn_mappings.get(trial_number)) + 
                    String.valueOf(rn_mappings.get(basic_numerals[n]));
            }
        }

        return "NONE";
    }

    /**
     * This method checks if i is a basic numeral plus another basic numeral
     * 
     * @param i
     * @return roman numeral if there's a match, "NONE" if not
     */
    private String BasicPlusBasic(int i) {
        int trial_number;
        
        for (int n = 0; n < basic_numerals.length; n++ ){
            trial_number = i + basic_numerals[n];
            if (rn_mappings.containsKey(trial_number)) {
                return String.valueOf(rn_mappings.get(basic_numerals[n])) +
                    String.valueOf(rn_mappings.get(trial_number));
            }
        }

        return "NONE";
    }

    /**
     * This method checks if i needs a repeating numeral
     * 
     * @param i
     * @return roman numeral if there's a match, "NONE" if not
     */
    private String RepeatingNumeral(int i) {
        int trial_number;
        
        for (int n = repeating_numerals.length - 1; n >= 0; n--) {
            // check for repeating numeral times 2
            trial_number = i - (repeating_numerals[n] * 2);
            if (rn_mappings.containsKey(trial_number) && 
                    (repeating_numerals[n] <= trial_number)) {
                return  String.valueOf(rn_mappings.get(trial_number)) +
                    String.valueOf(rn_mappings.get(repeating_numerals[n])) +
                    String.valueOf(rn_mappings.get(repeating_numerals[n]));
            }

            // check for repeating numeral times 3
            trial_number = i - (repeating_numerals[n] * 3);
            if (rn_mappings.containsKey(trial_number) &&
                    (repeating_numerals[n] <= trial_number)) {
                return String.valueOf(rn_mappings.get(trial_number)) +
                    String.valueOf(rn_mappings.get(repeating_numerals[n])) +
                    String.valueOf(rn_mappings.get(repeating_numerals[n])) +
                    String.valueOf(rn_mappings.get(repeating_numerals[n]));
                    
            }
        }

        return "NONE";
    }

}
