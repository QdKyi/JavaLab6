package ua.lviv.iot.RegEx;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
    
    public static void  findPalindromeInSentence(final String text) {
        
        List<String> foundWords = new LinkedList<>();
        
        String patternForString = "\\b[a-zA-Z]\\w*\\b";
        Pattern pattern = Pattern.compile(patternForString);
        Matcher matcher = pattern.matcher(text);
        
        while (matcher.find()) {
            String stringHolder = matcher.group();
            String reversedString = "";
            
            for(int i = stringHolder.length() - 1; i >= 0; i--) {
                reversedString += stringHolder.charAt(i);
            }
            if(matcher.group().toLowerCase().equals(reversedString.toLowerCase())) {
                foundWords.add(matcher.group());
            }
        }
        
        System.out.println(foundWords);
        
    }
    
    public static String scanString() {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();

}
    
}
