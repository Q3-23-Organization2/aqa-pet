package homework8.Task3;

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

        Circle circleWithToString = new Circle();
        Circle circleWithToString2 = new Circle();
        circleWithToString.setRadius(12);
        System.out.println(circleWithToString.toString());
        System.out.println(circleWithToString.equals(circleWithToString2));

        Triangle triangleWithToString = new Triangle();
        Triangle triangleWithToString2 = new Triangle();
        triangleWithToString.setTriangleFirstSide(3);
        System.out.println(triangleWithToString.toString());
        System.out.println(triangleWithToString.equals(triangleWithToString2));

        Rectangle rectangleWithToString = new Rectangle();
        Rectangle rectangleWithToString2 = new Rectangle();
        rectangleWithToString.setRectangleLength(9);
        System.out.println(rectangleWithToString.toString());
        System.out.println(rectangleWithToString.equals(rectangleWithToString2));

    }
}
