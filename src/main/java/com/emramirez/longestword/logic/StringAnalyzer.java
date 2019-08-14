package com.emramirez.longestword.logic;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Challenge
 * Have the function LongestWord(sen) take the sen parameter being passed and return the largest word in the string. If there are two or more words that are the same length, return the first word from the string with that length. Ignore punctuation and assume sen will not be empty.
 * Sample Test Cases
 * Input:"fun&!! time"
 *
 * Output:time
 *
 *
 * Input:"I love dogs"
 *
 * Output:love
 */
public class StringAnalyzer {

    private static final String EMPTY_STRING = "";

    public String findLongestWord(String input) {
        if (null == input) {
            return EMPTY_STRING;
        }

        input = input.replaceAll("\\p{Punct}", "");
        return Arrays.stream(input.split("\\s+"))
                .sorted(Comparator.comparingInt(String::length).reversed())
                .findFirst().orElse(EMPTY_STRING);
    }
}
