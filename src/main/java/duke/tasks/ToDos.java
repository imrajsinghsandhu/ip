package duke.tasks;

/**
 * Tasks without any date/time attached to it.
 */
public class ToDos extends Task {

    public ToDos(String description) {
        super(description);
        // TODO Auto-generated constructor stub
    }

    /**
     * String version
     */
    public String toString() {
        return "[T]" + "[" + super.getStatusIcon() + "] " + super.getDescription();
    }
}
