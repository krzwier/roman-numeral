package roman_numeral;

import java.util.HashMap;

public final class RomanNumeral {

    private final String ONE = "I";
    private final String FOUR = "IV";
    private final String FIVE = "V";
    private final String NINE = "IX";
    private final String TEN = "X";
    private final String FORTY = "XL";
    private final String FIFTY = "L";
    private final String NINETY = "XC";
    private final String ONE_HUNDRED = "C";
    private final String FOUR_HUNDRED = "CD";
    private final String FIVE_HUNDRED = "D";
    private final String NINE_HUNDRED = "CM";
    private final String ONE_THOUSAND = "M";
    private final int[] basic_numbers = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

    private HashMap<Integer, String> rn_mappings;

    public RomanNumeral() {
        // populate hash table with basic numbers
        rn_mappings = new HashMap<>();
        rn_mappings.put(1,ONE);
        rn_mappings.put(4,FOUR);
        rn_mappings.put(5,FIVE);
        rn_mappings.put(9,NINE);
        rn_mappings.put(10,TEN);
        rn_mappings.put(40,FORTY);
        rn_mappings.put(50,FIFTY);
        rn_mappings.put(90,NINETY);
        rn_mappings.put(100,ONE_HUNDRED);
        rn_mappings.put(400,FOUR_HUNDRED);
        rn_mappings.put(500,FIVE_HUNDRED);
        rn_mappings.put(900,NINE_HUNDRED);
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

        // check to see if i is represented by a basic number
        if (rn_mappings.containsKey(i)) {
            return rn_mappings.get(i);
        }

        // RECURSIVE CASES

        for (int n = 0; n < basic_numbers.length - 2; n++ ) {
            if (i - basic_numbers[n] >= 0) {
                return rn_mappings.get(basic_numbers[n]) + 
                    DecimalToRomanRecursive(i - basic_numbers[n]);
            }
        }

        return "I" + DecimalToRomanRecursive(i - 1);

        
    }

}
