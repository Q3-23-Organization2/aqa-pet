package homework7;

public class Triangle extends Shape {

    public double triangleArea;
    public double trianglePerimeter;
    public double triangleFirstSide;

    public void setTriangleFirstSide(double triangleFirstSide) {
        this.triangleFirstSide = triangleFirstSide;
    }
    public double triangleSecondSide;

    public void setTriangleSecondSide(double triangleSecondSide) {
        this.triangleSecondSide = triangleSecondSide;
    }
    public double triangleBase;
    public void setTriangleBase(double triangleBase) {
        this.triangleBase = triangleBase;
    }
    public double triangleHeight;

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



}
