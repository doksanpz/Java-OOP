package shapes;

public class Circle extends Shape {
    private Double radius;

    public Circle(double radius) {
        this.radius = radius;
        calculateArea();
        calculatePerimeter();
    }

    public final Double getRadius() {
        return radius;
    }

    @Override
    protected void calculateArea() {
        setArea(Math.PI * radius * radius);
    }

    @Override
    protected void calculatePerimeter() {
        setPerimeter(2 * Math.PI * radius);
    }
}
