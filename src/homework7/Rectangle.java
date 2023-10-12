package homework7;

public class Rectangle extends Shape {
    public double rectangleArea;
    public double rectanglePerimeter;
    public double 	rectangleLength;

    public void setRectangleLength(double rectangleLength) {
        this.rectangleLength = rectangleLength;
    }
    public double 	rectangleWidth;

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

}
