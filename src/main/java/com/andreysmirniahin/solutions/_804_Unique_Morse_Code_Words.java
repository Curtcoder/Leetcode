package com.andreysmirniahin.solutions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class _804_Unique_Morse_Code_Words {

    private static Map<Character, String> englistMorseCode = new HashMap<>();

    private static void fillValue() {
        englistMorseCode.put('a', ".-");
        englistMorseCode.put('b', "-...");
        englistMorseCode.put('c', "-.-.");
        englistMorseCode.put('d', "-..");
        englistMorseCode.put('e', ".");
        englistMorseCode.put('f', "..-.");
        englistMorseCode.put('g', "--.");
        englistMorseCode.put('h', "....");
        englistMorseCode.put('i', "..");
        englistMorseCode.put('j', ".---");
        englistMorseCode.put('k', "-.-");
        englistMorseCode.put('l', ".-..");
        englistMorseCode.put('m', "--");
        englistMorseCode.put('n', "-.");
        englistMorseCode.put('o', "---");
        englistMorseCode.put('p', ".--.");
        englistMorseCode.put('q', "--.-");
        englistMorseCode.put('r', ".-.");
        englistMorseCode.put('s', "...");
        englistMorseCode.put('t', "-");
        englistMorseCode.put('u', "..-");
        englistMorseCode.put('v', "...-");
        englistMorseCode.put('w', ".--");
        englistMorseCode.put('x', "-..-");
        englistMorseCode.put('y', "-.--");
        englistMorseCode.put('z', "--..");
    }

    public static void main(String[] args) {
        String[] input = {"gin", "zen", "gig", "msg"};
        int result = uniqueMorseRepresentations(input);
        System.out.println(result);
    }

    public static int uniqueMorseRepresentations(String[] words) {
        Set<String> morseUniqSet = new HashSet<>();
        for (int i=0; i<words.length; i++) {
            String currentWordToMorse = convertWordToMorse(words[i]);
            morseUniqSet.add(currentWordToMorse);
        }
        return morseUniqSet.size();
    }

    private static String convertWordToMorse(String wordInEnglish) {
        String result = "";
        fillValue();
        for (int i=0; i<wordInEnglish.length(); i++) {
            result += englistMorseCode.get(wordInEnglish.charAt(i));
        }
        return result;
    }

}
