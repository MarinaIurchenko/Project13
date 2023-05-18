package taskManager;

public class Epic extends Task {

    protected String[] subtasks;

    public Epic(int id, String[] subtasks) {
        super(id);
        this.subtasks = subtasks;
    }

    @Override
    public boolean matches(String query) {
        for (String subtasks : subtasks) {
            if (subtasks.contains(query)) ;
            return true;
        }
        return false;
    }

    public String[] getSubtasks() {
        return subtasks;
    }
}


