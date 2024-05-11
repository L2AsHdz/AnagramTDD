package com.ayd2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramaTest {

    @Test
    public void CheckEmptyWords(){
        var word1 = "";
        var word2 = "";

        assertFalse(Anagrama.AnagramCheck(word1, word2));
    }

    @Test
    public void CheckDifferentLength(){
        var word1 = "wenas";
        var word2 = "loquesea";

        assertFalse(Anagrama.AnagramCheck(word1, word2));
    }

    @Test
    public void CheckMatchingWords(){
        var word1 = "igual";
        var word2 = "igual";

        assertFalse(Anagrama.AnagramCheck(word1, word2));
    }

    @Test
    public void CheckNotAnagram(){
        var word1 = "una";
        var word2 = "dos";

        assertFalse(Anagrama.AnagramCheck(word1, word2));
    }

    @Test
    public void CheckAreAnagram(){
        var word1 = "espada";
        var word2 = "pesada";

        assertTrue(Anagrama.AnagramCheck(word1, word2));
    }

}