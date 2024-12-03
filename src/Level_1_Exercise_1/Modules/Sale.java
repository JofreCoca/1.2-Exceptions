package Level_1_Exercise_1.Modules;
import java.util.ArrayList;
import java.util.List;

public class Sale{
    private List<Product> products;
    private float totalSalePrice;

    public Sale() {
        this.products = new ArrayList<Product>();
    }

    public float getTotalSalePrice() {
        return totalSalePrice;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void addProducts(Product products) {
        this.products.add(products);
    }

    public void calculateTotal() throws EmptySaleExcepcion{
        float total=0f;
        if(this.products.isEmpty()){
            throw new EmptySaleExcepcion();
        }else{
            for (Product readingArrayProducts : this.products) {
                total+=readingArrayProducts.getPrice();
            }
        }
        this.totalSalePrice=total;
    }
}


