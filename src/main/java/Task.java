/**
 * This is an abstract Task class that creates task instances with a title,
 * whether task is completed and the type of task.
 *
 *
 * @author  Hsiao Jiet
 * @version 1.0
 * @since   2022-1-15
 */

public abstract class Task {
    protected String name;
    protected boolean done;
    protected Character type;

    public Task(String n, boolean d) {
        name = n;
        done = d;
    }

    public String getName() {
        return name;
    }

    public boolean getDone() {
        return done;
    }

    public Character getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public void setType(Character type) {
        this.type = type;
    }

    /**
     * Sets the Task to be done
     */
    public String getDoneIcon() {
        return getDone()
                ? "[X]"
                : "[ ]";
    }

    /**
     * Sets the Task's type of: Todo, Deadline, Event
     */
    public String getTaskIcon() {
        return String.format("[%c]", type);
    }
}
