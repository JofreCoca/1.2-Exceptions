package Level_1_Exercise_1.Main;

import Level_1_Exercise_1.Modules.EmptySaleExcepcion;
import Level_1_Exercise_1.Modules.Sale;

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