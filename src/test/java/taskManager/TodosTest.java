package taskManager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TodosTest {
    SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

    String[] subtasks = {"Молоко", "Яйца", "Хлеб", "НетоБанка"};
    Epic epic = new Epic(55, subtasks);

    Meeting meeting = new Meeting(
            555, "Выкатка 3й версии приложения",
            "Приложение НетоБанка",
            "Во вторник после обеда"
    );

    Todos todos = new Todos();

    @BeforeEach
    public void setup() {
        todos.add(simpleTask);
        todos.add(epic);
        todos.add(meeting);
    }

    @Test
    public void shouldSearchEpic() {

        Task[] expected = {epic};
        Task[] actual = todos.search("Яйца");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchMeeting() {

        Task[] expected = {meeting};
        Task[] actual = todos.search("Выкатка");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchSimpleTask() {
        Task[] expected = {simpleTask};
        Task[] actual = todos.search("Позвонить");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void shouldSearchTaskOne() {
        Task[] expected = {};
        Task[] actual = todos.search("после");
    }

    @Test
    public void shouldSearchTaskTwo() {
        Task[] expected = {epic, meeting};
        Task[] actual = todos.search("НетоБанка");
    }

    @Test
    public void shouldSearchTaskNot() {
        Task[] expected = {};
        Task[] actual = todos.search("мать");
    }

}

