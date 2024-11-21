package Level_1_Exercise_1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws EmptySaleExcepcion {
        try {
            Sale sale = new Sale();
            sale.calculateTotal();
        } catch (EmptySaleExcepcion e) {
            System.out.println(e.getMessage());
        }
    }
}