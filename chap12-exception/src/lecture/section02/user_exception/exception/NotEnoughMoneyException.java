package lecture.section02.user_exception.exception;

public class NotEnoughMoneyException extends NegativeException{

    public NotEnoughMoneyException() {
    }

    public NotEnoughMoneyException(String message) {
        super(message);
    }
}
