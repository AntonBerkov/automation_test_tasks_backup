package errorsAndExceptions.exceptions;

public class WrongMarkException extends Exception {
    public WrongMarkException() {
    }

    public WrongMarkException(String message) {
        super(message);
    }

    public WrongMarkException(String message, Throwable cause) {
        super(message, cause);
    }

    public WrongMarkException(Throwable cause) {
        super(cause);
    }
}
