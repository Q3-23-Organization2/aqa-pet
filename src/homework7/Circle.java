package homework7;

public class Circle extends Shape {

    public double radius;
    public double pi = 3.14159;
    public double circleArea;
    public double circlePerimeter;

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
}
