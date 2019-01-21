package org.kartashov.part15_regex_and_compression.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example1 {

    public static void main(String[] args) {
        // String to be scanned to find the pattern.
        String line = "DIAGNOSTIC IMPRESSION\n" +
                "\n" +
                "RegExr was created by gskinner.com, and is proudly hosted by Media Temple.";
        String pattern =
                "^([\\s ]*Impression[\\t ]*(?::[\\s ]*|\\r*\\n)|[\\s ]*Impressions[\\t ]*(?::[\\s ]*|\\r*\\n)|[\\s ]*DIAGNOSTIC IMPRESSION[\\t ]*(?::[\\s ]*|.[\\s ]*|\\r*\\n))";

        Pattern r = Pattern.compile(pattern);

        // Now create matcher object.
        Matcher m = r.matcher(line);
        if (m.find()) {
            System.out.println(m.group());
        }else {
            System.out.println("NO MATCH");
        }
    }
}
