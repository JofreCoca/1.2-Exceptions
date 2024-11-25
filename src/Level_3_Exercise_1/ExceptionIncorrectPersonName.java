package Level_3_Exercise_1;

public class ExceptionIncorrectPersonName extends Throwable {
    public ExceptionIncorrectPersonName() {
        super("Exception: Incorrect PersonName");
    }
}
