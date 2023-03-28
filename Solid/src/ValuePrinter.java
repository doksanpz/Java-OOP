import products.Product;

import java.util.List;

public class ValuePrinter {
    private static final String SUM_FORMAT = "Sum: %f";
    private static final String AVERAGE_FORMAT = "Average: %f";

    public void printSum(double sum) {
        System.out.printf((SUM_FORMAT) + "%n", sum);
    }

    public void printAverage(double average) {
        System.out.printf((AVERAGE_FORMAT) + "%n", average);
    }
}
