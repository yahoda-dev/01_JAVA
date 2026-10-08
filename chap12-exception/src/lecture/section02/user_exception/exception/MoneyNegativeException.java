package lecture.section02.user_exception.exception;

public class MoneyNegativeException extends NegativeException {
    public MoneyNegativeException() {

    }

    public MoneyNegativeException(String message) {
        super(message);
    }
}
