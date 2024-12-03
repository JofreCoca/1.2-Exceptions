package Level_1_Exercise_1.Main;

import Level_1_Exercise_1.Modules.EmptySaleExcepcion;
import Level_1_Exercise_1.Modules.Product;
import Level_1_Exercise_1.Modules.Sale;

public class Main {
    public static void main(String[] args) throws EmptySaleExcepcion {
        Sale sale = new Sale();
        try {
            sale = new Sale();
            sale.calculateTotal();

        } catch (EmptySaleExcepcion e) {
            System.out.println("EmptySaleExcepcion: "+e.getMessage());
        }
        sale.addProducts(new Product("Shirt",20));
        sale.addProducts(new Product("Tie",8));
        sale.addProducts(new Product("Suspenders",12));
        sale.calculateTotal();
        System.out.println(sale.getTotalSalePrice());
    }
}