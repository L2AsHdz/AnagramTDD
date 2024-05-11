package com.ayd2;

public class Main {
    public static void main(String[] args) {
        var wordOne = "pesada";
        var wordTwo = "espada";

        var result = Anagrama.AnagramCheck(wordOne, wordTwo);

        System.out.println(result ? "Son anagramas" : "No son anagramas");
    }
}