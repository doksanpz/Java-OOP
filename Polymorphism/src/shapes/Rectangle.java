package shapes;

public class Rectangle extends Shape {
    private Double width;
    private Double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
        calculateArea();
        calculatePerimeter();
    }

    public Double getWidth() {
        return width;
    }

    public Double getHeight() {
        return height;
    }

    @Override
    protected void calculateArea() {
        setArea(width * height);
    }

    @Override
    protected void calculatePerimeter() {
        setPerimeter(2 * (width + height));
    }
}
