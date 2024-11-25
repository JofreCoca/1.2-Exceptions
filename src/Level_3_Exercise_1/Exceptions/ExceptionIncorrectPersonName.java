package Level_3_Exercise_1.Exceptions;

public class ExceptionIncorrectPersonName extends Throwable {
    public ExceptionIncorrectPersonName() {
        super("Exception: Incorrect PersonName");
    }
}
