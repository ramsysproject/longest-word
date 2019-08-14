package com.emramirez.longestword.logic;

import java.util.Arrays;
import java.util.Comparator;

public class StringAnalyzer {

    private static final String EMPTY_STRING = "";

    public String findLongestWord(String input) {
        if (null == input) {
            return EMPTY_STRING;
        }

        return Arrays.stream(input.split("\\s+"))
                .sorted(Comparator.comparingInt(String::length).reversed())
                .findFirst().orElse(EMPTY_STRING);
    }
}
