package ru.konofeev.task.bracket;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.ParameterizedTest;

import static org.junit.jupiter.api.Assertions.*;

public class ParseBracketTest {
    @Test
    void empty() {
        assertFalse(ParseBracket.parse(""), "Неправильная обработка пустой строки");
    }

    @ParameterizedTest
    @ValueSource(strings = {"()", "[]", "{}"})
    void simpleCorrect(String candidate) {
        assertTrue(ParseBracket.parse(candidate));
    }

    @ParameterizedTest
    @ValueSource(strings = {")", "]", "}", "(", "[", "{"})
    void simpleIncorrect(String candidate) {
        assertFalse(ParseBracket.parse(candidate));
    }

    @ParameterizedTest
    @ValueSource(strings = {"())", "[]]", "{}}", ")()", "[[]", "}{}"})
    void simpleIncorrectOdd(String candidate) {
        assertFalse(ParseBracket.parse(candidate));
    }

    @ParameterizedTest
    @ValueSource(strings = {"())(", "[[][", "}}{{", ")()(", "][[]", "}{}}"})
    void incorrectOneType(String candidate) {
        assertFalse(ParseBracket.parse(candidate));
    }

    @ParameterizedTest
    @ValueSource(strings = {"([)]", "({)}", "[{]}", "({[)}]"})
    void incorrectDifferentType(String candidate) {
        assertFalse(ParseBracket.parse(candidate));
    }

    @ParameterizedTest
    @ValueSource(strings = {"(())", "[[]]", "{{}}", "(()())", "{{}{}}", "[[][]]"})
    void correct(String candidate) {
        assertTrue(ParseBracket.parse(candidate));
    }
}
