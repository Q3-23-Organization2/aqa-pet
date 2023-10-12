package homework7;

public class ValidatorShape {

    public static void main(String[] args) {

        Circle circle = new Circle();
        circle.setRadius(3);
        circle.calculateArea();
        circle.calculatePerimeter();
        circle.paint();

        Rectangle rectangle = new Rectangle();
        rectangle.setRectangleLength(7.4);
        rectangle.setRectangleWidth(10.8);
        rectangle.calculateArea();
        rectangle.calculatePerimeter();
        rectangle.paint();

        Triangle triangle = new Triangle();
        triangle.setTriangleFirstSide(7);
        triangle.setTriangleSecondSide(5);
        triangle.setTriangleBase(10);
        triangle.setTriangleHeight(5);
        triangle.calculateArea();
        triangle.calculatePerimeter();
        triangle.paint();

    }
}
