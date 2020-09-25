package ru.konofeev.task.bracket;

import lombok.experimental.UtilityClass;

@UtilityClass
public class ParseBracket {
    /**
     * Проверка выражения на корректность скобок
     */
    boolean parse(String source) {

        if (source == null || source.isEmpty() || source.length() % 2 == 1) {
            return false;
        }

        if (source.equals("()") || source.equals("{}") || source.equals("[]")) {
            return true;
        }

        
        return true;
    }
}
