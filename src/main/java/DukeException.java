/**
 * This is a custom Duke Exception class
 *
 *
 * @author  Hsiao Jiet
 * @version 1.0
 * @since   2022-1-15
 */
public class DukeException extends Exception {
    protected String message;

    public DukeException(String msg) {
        message = msg;
    }
}
