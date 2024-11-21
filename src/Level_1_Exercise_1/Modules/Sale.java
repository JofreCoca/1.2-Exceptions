package Level_1_Exercise_1;
import java.util.ArrayList;

public class Sale{
    private ArrayList<Product> products;
    private float totalSalePrice;

    public Sale() {
        this.products = new ArrayList<Product>();
    }

    public float getTotalSalePrice() {
        return totalSalePrice;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void calculateTotal() throws EmptySaleExcepcion{
        float total=0f;

        if(products.isEmpty()){
            throw new EmptySaleExcepcion();
        }else{
            for (Product readingArrayProducts : products) {
                total+=readingArrayProducts.getPrice();
            }
        }
        this.totalSalePrice=total;
    }
}


