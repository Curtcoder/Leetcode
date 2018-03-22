package com.andreysmirniahin.solutions;

import java.util.HashMap;
import java.util.Map;

public class _771_Jevels_And_Stones {

    public static void main(String[] args) {
        _771_Jevels_And_Stones jevelsAndStones = new _771_Jevels_And_Stones();
        String J = "z";
        String S = "ZZ";
        int result = jevelsAndStones.numJewelsInStones(J, S);
        System.out.println(result);
    }

    public int numJewelsInStones(String J, String S) {
        int result = 0;

        Map<Character, Integer> charactersCounter = new HashMap<Character, Integer>();
        char[] charArrayForJ = J.toCharArray();
        char[] charArrayForS = S.toCharArray();

        for (char c : charArrayForJ) {
            if (!charactersCounter.containsKey(c)) {
                charactersCounter.put(c, 0);
            }
        }
        for (char ch : charArrayForS) {
            if (charactersCounter.containsKey(ch)) {
                int oldValue = charactersCounter.get(ch);
                charactersCounter.put(ch, oldValue + 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : charactersCounter.entrySet()) {
            result += entry.getValue();
        }

        System.out.println(charactersCounter);

        return result;
    }

}
