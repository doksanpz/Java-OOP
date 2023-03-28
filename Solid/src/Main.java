import products.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        CalorieCalculator calculator = new CalorieCalculator();

        ArrayList<Product> products = new ArrayList<>();
        products.add(new Coke(500));
        products.add(new Lemonade(330));
        products.add(new Chocolate(100));
        products.add(new Chips(100));

        ValuePrinter valuePrinter = new ValuePrinter();

        valuePrinter.printSum(calculator.sum(products));
        valuePrinter.printAverage(calculator.average(products));
    }
}
