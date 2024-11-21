package Level_1_Exercise_1;

public class EmptySaleExcepcion extends Exception {
    public EmptySaleExcepcion() {
        super("To make a sale you must first add products");
    }
}
