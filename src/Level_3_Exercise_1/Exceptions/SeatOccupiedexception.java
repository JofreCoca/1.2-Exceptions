package Level_3_Exercise_1.Exceptions;

public class SeatOccupiedexception extends Throwable {
    public SeatOccupiedexception() {
        super("Exception: seat occupied");
    }
}
