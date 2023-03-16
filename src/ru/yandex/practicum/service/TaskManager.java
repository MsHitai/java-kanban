package ru.yandex.practicum.service;

import ru.yandex.practicum.models.Epic;
import ru.yandex.practicum.models.SubTask;
import ru.yandex.practicum.models.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public interface TaskManager {

    void createTask (Task task);

    void createSubTask(SubTask subTask);

    void createEpic(Epic epic);

    Task getTask(int id);

    SubTask getSubtask(int id);

    Epic getEpic(int id);

    List<Task> getTasks();

    List<SubTask> getSubtasks();

    List<Epic> getEpics();

    void updateTask(Task task);

    void updateSubTask(SubTask subTask);

    void updateEpic(Epic epic);

    ArrayList<SubTask> getSubTasksByEpics(Epic epic);

    void deleteTask(int id);

    void deleteSubTask(int id);

    void deleteEpic(int id);

    void deleteAllTasks();

    void deleteAllSubTasks();

    void deleteAllEpics();

    void getHistory();

    Set<Task> getPrioritizedTasks();
}
