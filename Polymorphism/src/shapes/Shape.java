package shapes;

import java.net.PortUnreachableException;

public abstract class Shape {
    private Double perimeter;
    private Double area;

    public Double getArea() {
        return area;
    }

    public Double getPerimeter() {
        return perimeter;
    }

    protected void setArea(Double area) {
        this.area = area;
    }

    protected void setPerimeter(Double perimeter) {
        this.perimeter = perimeter;
    }

    abstract void calculateArea();
    abstract void calculatePerimeter();
}
