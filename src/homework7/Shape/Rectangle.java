package homework7.Shape;

import java.util.Objects;

public class Rectangle extends Shape {
    public double rectangleArea;
    public double rectanglePerimeter;
    private double 	rectangleLength;

    public void setRectangleLength(double rectangleLength) {
        this.rectangleLength = rectangleLength;
    }
    private double 	rectangleWidth;

    public void setRectangleWidth(double rectangleWidth) {
        this.rectangleWidth = rectangleWidth;
    }
    @Override
    public void calculateArea() {
        rectangleArea = rectangleLength * rectangleWidth;
        System.out.println("Area of Rectangle is: " + rectangleArea);
    }
    @Override
    public void calculatePerimeter() {
        rectanglePerimeter = 2 * (rectangleLength + rectangleWidth);
        System.out.println("Perimeter of Rectangele is: " + rectanglePerimeter);

    }
    public void paint() {
        System.out.println("Length of Rectangle is: " + rectangleLength);
        System.out.println("Width of Rectangle is: " + rectangleWidth);
        System.out.println("  ");

    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "rectangleArea=" + rectangleArea +
                ", rectanglePerimeter=" + rectanglePerimeter +
                ", rectangleLength=" + rectangleLength +
                ", rectangleWidth=" + rectangleWidth +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangleArea, rectangle.rectangleArea) == 0 && Double.compare(rectanglePerimeter, rectangle.rectanglePerimeter) == 0 && Double.compare(rectangleLength, rectangle.rectangleLength) == 0 && Double.compare(rectangleWidth, rectangle.rectangleWidth) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rectangleArea, rectanglePerimeter, rectangleLength, rectangleWidth);
    }
}
