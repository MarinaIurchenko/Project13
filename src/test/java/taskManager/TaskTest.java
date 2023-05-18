package taskManager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskTest {


    @Test
    public void testMeeting() {
        Meeting meeting = new Meeting(555, "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда");

        Assertions.assertTrue(meeting.matches("версии"));
        Assertions.assertTrue(meeting.matches("Приложение"));
        Assertions.assertTrue(meeting.matches("вторник"));
        Assertions.assertFalse(meeting.matches("Банка"));
    }

    @Test
    public void testEpic() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        Assertions.assertTrue(epic.matches("Молоко"));
        Assertions.assertTrue(epic.matches("Яйца"));
        Assertions.assertTrue(epic.matches("Хлеб"));
        Assertions.assertFalse(epic.matches("Кефир"));
    }

    @Test
    public void testSimpleTask() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        Assertions.assertTrue(simpleTask.matches("Позвонить"));
        Assertions.assertFalse(simpleTask.matches("Звонить"));

    }

}









