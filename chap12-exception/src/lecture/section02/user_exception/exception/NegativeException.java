package lecture.section02.user_exception.exception;

public class NegativeException extends Exception{
    public NegativeException() {
    }

    public NegativeException(String message) {
        super(message);
    }
}
