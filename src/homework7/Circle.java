package homework7;

import java.util.Objects;

public class Circle extends Shape {

    public double pi = 3.14159;
    public double circleArea;
    public double circlePerimeter;
    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }
@Override
    public void calculateArea() {
        circleArea = radius * radius * pi;
        System.out.println("Area of Circle is: " + circleArea);
    }
@Override
    public void calculatePerimeter() {
        circlePerimeter = 2 * pi * radius;
        System.out.println("Perimeter of Circle is: " + circlePerimeter);

    }
    public void paint() {
        System.out.println("Radius of Circle is: " + radius);
        System.out.println("\u03C0 is: " + pi);
        System.out.println("  ");

    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", pi=" + pi +
                ", circleArea=" + circleArea +
                ", circlePerimeter=" + circlePerimeter +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(radius, circle.radius) == 0 && Double.compare(pi, circle.pi) == 0 && Double.compare(circleArea, circle.circleArea) == 0 && Double.compare(circlePerimeter, circle.circlePerimeter) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius, pi, circleArea, circlePerimeter);
    }
}
