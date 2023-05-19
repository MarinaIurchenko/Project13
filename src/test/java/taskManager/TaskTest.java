package taskManager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskTest {


    @Test
    public void testMeeting() {
        Meeting meeting = new Meeting(555, "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда");

        boolean expected = true;
        boolean actual = meeting.matches("версии");

        Assertions.assertEquals(expected,actual);

    }
    @Test
    public void testMeetingFalse() {
        Meeting meeting = new Meeting(555, "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда");

        boolean expected = false;
        boolean actual = meeting.matches("выкатить");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testEpic() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        boolean expected = true;
        boolean actual = epic.matches("Яйца");

        Assertions.assertEquals(expected,actual);

    }
    @Test
    public void testEpicFalse() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        boolean expected = false;
        boolean actual = epic.matches("выкатить");

        Assertions.assertEquals(expected,actual);

    }
    @Test
    public void testSimpleTask() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        boolean expected = true;
        boolean actual = simpleTask.matches("Позвонить");

        Assertions.assertEquals(expected,actual);

    }
    @Test
    public void testSimpleTaskFalse() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        boolean expected = false;
        boolean actual = simpleTask.matches("позвать");

        Assertions.assertEquals(expected,actual);

    }

}









