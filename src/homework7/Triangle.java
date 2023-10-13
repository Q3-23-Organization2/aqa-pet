package homework7;

import java.util.Objects;

public class Triangle extends Shape {

    public double triangleArea;
    public double trianglePerimeter;
    private double triangleFirstSide;

    public void setTriangleFirstSide(double triangleFirstSide) {
        this.triangleFirstSide = triangleFirstSide;
    }
    private double triangleSecondSide;

    public void setTriangleSecondSide(double triangleSecondSide) {
        this.triangleSecondSide = triangleSecondSide;
    }
    private double triangleBase;
    public void setTriangleBase(double triangleBase) {
        this.triangleBase = triangleBase;
    }
    private double triangleHeight;

    public void setTriangleHeight(double triangleHeight) {
        this.triangleHeight = triangleHeight;
    }
    @Override
    public void calculateArea() {
        triangleArea = (triangleBase * triangleHeight) / 2;
        System.out.println("Area of Triangle is: " + triangleArea);
    }
    @Override
    public void calculatePerimeter() {
        trianglePerimeter = triangleFirstSide + triangleSecondSide + triangleBase;
        System.out.println("Perimeter of Triangle is: " + trianglePerimeter);

    }
    public void paint() {
        System.out.println("First Side of Triangle is: " + triangleFirstSide);
        System.out.println("Second Side of Triangle is: " + triangleSecondSide);
        System.out.println("Base of Triangle is: " + triangleBase);
        System.out.println("Height of Triangle is: " + triangleHeight);
        System.out.println("  ");

    }

    @Override
    public String toString() {
        return "Triangle{" +
                "triangleArea=" + triangleArea +
                ", trianglePerimeter=" + trianglePerimeter +
                ", triangleFirstSide=" + triangleFirstSide +
                ", triangleSecondSide=" + triangleSecondSide +
                ", triangleBase=" + triangleBase +
                ", triangleHeight=" + triangleHeight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangleArea, triangle.triangleArea) == 0 && Double.compare(trianglePerimeter, triangle.trianglePerimeter) == 0 && Double.compare(triangleFirstSide, triangle.triangleFirstSide) == 0 && Double.compare(triangleSecondSide, triangle.triangleSecondSide) == 0 && Double.compare(triangleBase, triangle.triangleBase) == 0 && Double.compare(triangleHeight, triangle.triangleHeight) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(triangleArea, trianglePerimeter, triangleFirstSide, triangleSecondSide, triangleBase, triangleHeight);
    }
}
