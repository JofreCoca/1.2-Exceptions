package Level_3_Exercise_1.Exceptions;

public class InvalidSeatException extends Throwable {
    public InvalidSeatException() {
        super("Exception: Incorrect Seat");
    }
}
