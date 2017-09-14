package ru.konofeev.common;

import ru.konofeev.task.TaskHelloWorld;
import java.util.List;
import java.util.ArrayList;

/**
 * Фабрика задач
 */
public class TaskFactory
{
    /**
     * Создать задачу по наименованию
     *
     * @param nameTask Наименование задачи
     *
     * @return Task Задача
     */
    public static Task getTask(String nameTask)
    {
        return new TaskHelloWorld();
    }
}
