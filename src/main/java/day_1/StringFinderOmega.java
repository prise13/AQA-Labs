package day_1;

import java.util.ArrayList;

public class StringFinderOmega {
    public static void main(String[] args) {
        System.out.println(numberOfWords("Hello My World", " "));
        System.out.println(numberOfChars("Hello worldie"));
        System.out.println(numberOfCharsByIndex("Hello my dear world", 2));
    }

    // Returns the number of words in string with specified separator
    private static int numberOfWords(String input, String sep) {
        return input.split(sep).length;
    }
    // Returns the array with number of chars in each word.
    private static ArrayList<Integer> numberOfChars(String input) {
        ArrayList<Integer> chars = new ArrayList<>();
        for(String word: input.split(" ")) {
            chars.add(word.length());
        }
        return chars;
    }
    // Returns the integer, number of chars in a word with specified index, returns 0 if index is out of range
    private static int numberOfCharsByIndex(String input, int index) {
        String[] textSplitted = input.split(" ");
        if (index > textSplitted.length) {
            return 0;
        }
        for(int i = 0; i < textSplitted.length; i++) {
            if (i == index) {
                return textSplitted[i].length();
            }
        }
        return 0;
    }

}
