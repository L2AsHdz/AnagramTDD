package com.ayd2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Anagrama {


    // Funcion que valida si dos palabras con letras minusculas son anagramas
    public static boolean AnagramCheck(String wordOne, String wordTwo){
        if (wordOne.trim().isEmpty() || wordTwo.trim().isEmpty()) return false;
        if (wordOne.length() != wordTwo.length()) return false;
        if (wordOne.equals(wordTwo)) return false;

        String sortedWord1 = Arrays.stream(wordOne.split(""))
                .sorted()
                .reduce("", (a, b) -> a + b);

        String sortedWord2 = Arrays.stream(wordTwo.split(""))
                .sorted()
                .reduce("", (a, b) -> a + b);

        return sortedWord1.equals(sortedWord2);
    }
}
