package duke.commands;

import java.util.ArrayList;

import duke.tasks.Task;

public class List extends Commands {

    public List(ArrayList<Task> tasks) {
        super(tasks);
    }

    /**
     * Prints out the list of tasks that have matching keywords from
     * findRelevantTasks.
     * 
     * @param tasks
     */
    public String printResults() {
        String res = "";
        res += super.LINE_BREAK + "\n";
        res += " " + super.FIND_INTRO + "\n";

        int internalCounter = 1;
        // iterate through the list
        for (Task task : super.tasks) {
            if (task != null) {
                res += " " + internalCounter + ". " + task + "\n";
                ++internalCounter;
            } else {
                break;
            }
        }
        res += super.LINE_BREAK;
        return res;
    }
}
