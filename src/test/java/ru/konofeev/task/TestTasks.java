package ru.konofeev.task;

import java.util.List;
import org.junit.Test;
import ru.konofeev.common.Task;
import ru.konofeev.common.TaskFactory;
import static org.junit.Assert.*;

/**
 * Тестирование задач
 */
public class TestTasks
{
    /**
     * Задача "Hello World"
     * Требуется вывести текст
     */
    @Test
    public void testHelloWorldRun()
    {
        Task task = TaskFactory.getTask("1");
        String result = "Hello World";
        assertEquals(result, task.run());
    }
}
