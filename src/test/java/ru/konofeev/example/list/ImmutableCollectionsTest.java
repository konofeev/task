package ru.konofeev.example.list;

import org.junit.jupiter.api.*;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Примеры кода по коллекциям
 */
public class ImmutableCollectionsTest {
    @Test
    public void testHelloWorldRun() {
        List<String> lists = ImmutableCollections.getImmutableList();
        assertTrue(lists.size() == 2, "Количество элементов не корректное");
        assertEquals("первый элемент", lists.get(0), "Первый элемент не корректный");
        assertEquals("второй элемент", lists.get(1), "Второй элемент не корректный");
    }
} 
