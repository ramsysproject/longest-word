package com.emramirez.longestword.logic;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.isEmptyString;

@RunWith(MockitoJUnitRunner.class)
public class StringAnalyzerTest {

    private StringAnalyzer stringAnalyzer = new StringAnalyzer();

    @Test
    public void findLongestWord_notEmptyTextGiven_longestWordExpected() {
        // arrange
        String longestWord = "determine";
        String text = "Some text is here to determine which is the longest word";

        // act
        String result = stringAnalyzer.findLongestWord(text);

        // assert
        assertThat("Incorrect longest word", result, equalTo(longestWord));
    }

    @Test
    public void findLongestWord_singleWordGiven_sameWordExpected() {
        // arrange
        String text = "lonelyword";

        // act
        String result = stringAnalyzer.findLongestWord(text);

        // assert
        assertThat("Incorrect longest word", result, equalTo(text));
    }

    @Test
    public void findLongestWord_emptyStringGiven_emptyStringExpected() {
        // arrange
        String text = "";

        // act
        String result = stringAnalyzer.findLongestWord(text);

        // assert
        assertThat("Incorrect longest word", result, isEmptyString());
    }

    @Test
    public void findLongestWord_spacesStringGiven_emptyStringExpected() {
        // arrange
        String text = "    ";

        // act
        String result = stringAnalyzer.findLongestWord(text);

        // assert
        assertThat("Incorrect longest word", result, isEmptyString());
    }

    @Test
    public void findLongestWord_nullParameterGiven_emptyStringExpected() {
        // arrange
        String text = null;

        // act
        String result = stringAnalyzer.findLongestWord(text);

        // assert
        assertThat("Incorrect longest word", result, isEmptyString());
    }
}
