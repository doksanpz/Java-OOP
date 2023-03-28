package products;

public class Chocolate extends Food implements  Product{

    public static final double CALORIES_PER_100_GRAMS = 575.0;

    private double grams;

    public Chocolate(double grams) {
        super(grams);
    }

    public double getCaloriesPer100Grams() {
        return CALORIES_PER_100_GRAMS;
    }
}
