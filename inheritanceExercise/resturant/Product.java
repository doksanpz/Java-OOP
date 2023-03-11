package inheritanceExercise.resturant;

import java.math.BigDecimal;

public class Product {
    public String name;
    public BigDecimal price;

    public Product(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
