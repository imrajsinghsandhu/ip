package duke.commands;

import java.util.ArrayList;
import duke.tasks.Task;

public class Mark extends Commands {

    public Mark(ArrayList<Task> tasks) {
        super(tasks);
    }

    public String markTask(Task currTask) {

        String res = "";

        boolean currState = currTask.getIsDone();
        currTask.setDone(!currState);

        res += super.LINE_BREAK + "\n";
        res += " " + super.MARK_MESSAGE + "\n";
        res += " [X] " + currTask.getDescription() + "\n";

        return res;
    }
}