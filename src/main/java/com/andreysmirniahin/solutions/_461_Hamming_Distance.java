package com.andreysmirniahin.solutions;

import java.util.HashMap;
import java.util.Map;

public class _461_Hamming_Distance {

    public static void main(String[] args) {
        _461_Hamming_Distance hammingDistance = new _461_Hamming_Distance();
        int result = hammingDistance.hammingDistance(1, 4);
        System.out.println(result);
    }

    public int hammingDistance(int x, int y) {
        int result = 0;

        char[] firstNumberSymbolsArray = String.format("%32s", Integer.toBinaryString(x)).replace(' ', '0').toCharArray();
        char[] secondNumberSymbolsArray = String.format("%32s", Integer.toBinaryString(y)).replace(' ', '0').toCharArray();

        Map<Integer, Integer> positionCounter = new HashMap<>();

        for (int i=0; i<firstNumberSymbolsArray.length; i++) {
            int value = Integer.valueOf(String.valueOf(firstNumberSymbolsArray[i]));
            positionCounter.put(i, value);
        }

        for (int j=0; j<secondNumberSymbolsArray.length; j++) {
            if (secondNumberSymbolsArray[j] != firstNumberSymbolsArray[j]) {
                result++;
            }
        }

        return result;
    }

}
