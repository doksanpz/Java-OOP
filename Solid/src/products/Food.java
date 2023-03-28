package products;

public abstract class Food implements HasWeight {
    double weightGrams;

    protected Food(double weightGrams) {
        this.weightGrams = weightGrams;
    }

    public double getWeightGrams() {
        return weightGrams;
    }
    public double getWeightKilograms() {
        return getWeightGrams() / 1000;
    }
}
