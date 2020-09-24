package ru.konofeev.example.list;

import com.google.common.collect.ImmutableList;
import java.util.List;
import lombok.experimental.UtilityClass;

/**
 * Примеры кода по коллекциям
 */
@UtilityClass
public class ImmutableCollections {
    /**
     * Получить неизменный список
     */
    public List<String> getImmutableList() {
        return ImmutableList.<String>builder().add("первый элемент", "второй элемент").build();
    }
} 
