package bites.examples;

import java.util.HashMap;

public class ScrabbleScore {
    static HashMap<Character, Integer> letterValues = new HashMap<>();

    public static void main(String[] args) {

        letterValues.put('A', 1);
        letterValues.put('E', 1);
        letterValues.put('I', 1);
        letterValues.put('O', 1);
        letterValues.put('U', 1);
        letterValues.put('L', 1);
        letterValues.put('N', 1);
        letterValues.put('S', 1);
        letterValues.put('T', 1);
        letterValues.put('R', 1);
        letterValues.put('D', 2);
        letterValues.put('G', 2);
        letterValues.put('B', 3);
        letterValues.put('C', 3);
        letterValues.put('M', 3);
        letterValues.put('P', 3);
        letterValues.put('F', 4);
        letterValues.put('H', 4);
        letterValues.put('V', 4);
        letterValues.put('W', 4);
        letterValues.put('Y', 4);
        letterValues.put('K', 5);
        letterValues.put('J', 8);
        letterValues.put('X', 8);
        letterValues.put('Q', 10);
        letterValues.put('Z', 10);

        System.out.println("The Scrabble score for 'key' is:  " + calculate("key"));
        System.out.println("The Scrabble score for 'builders' is: " + calculate("builders"));
        System.out.println("The Scrabble score for 'day' is: " + calculate("day"));
        System.out.println("The Scrabble score for 'quay' is: " + calculate("quay"));
        System.out.println("The Scrabble score for 'amazing' is: " + calculate("amazing"));

    }
    String word;

    ScrabbleScore(String word) {
        this.word = word.toUpperCase();
    }
    static int calculate(String word) {
        int i = 0;
        for (char c : word.toUpperCase().toCharArray()){i+=letterValues.get(c);}
        return i;

    }
}