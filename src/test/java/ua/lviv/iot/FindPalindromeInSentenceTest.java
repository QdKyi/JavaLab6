package ua.lviv.iot;

import org.junit.jupiter.api.Test;

import ua.lviv.iot.RegEx.RegEx;

public class FindPalindromeInSentenceTest {
    
    @Test
    public void test() {
        System.out.println(" Enter your Text ");
        String textToCheck = RegEx.scanString();
        RegEx.findPalindromeInSentence(textToCheck);

    }

}
