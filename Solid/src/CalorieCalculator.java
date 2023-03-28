
import products.Product;
import java.util.List;

public class CalorieCalculator {
    public CalorieCalculator() {
    }

    public double sum(List<Product> products) {
        double sum = 0;

        for (Product product : products) {
            sum += calculateCalories(product.getWeightGrams(), product.getCaloriesPer100Grams());
        }

        return sum;
    }

    private double calculateCalories(double grams, double caloriesPer100Grams) {
        return (caloriesPer100Grams / 100) * grams;
    }

    public double average(List<Product> products) {
        return sum(products) / products.size();
    }

}
