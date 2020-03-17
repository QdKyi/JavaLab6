package ua.lviv.iot;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

import ua.lviv.iot.RegEx.PalindromeFinder;

public class FindPalindromeInSentenceTest {

    @Test
    public void test() {

        String text = "Nun, dota, kook, kkk, o, play, apple, maran";
        InputStream in = new ByteArrayInputStream(text.getBytes());
        System.setIn(in);

        @SuppressWarnings("resource")
        Scanner myScanner = new Scanner(System.in);
        String textToCheck = myScanner.nextLine();
        System.out.println(textToCheck);
        PalindromeFinder.findPalindromeInSentence(textToCheck);

    }

}
