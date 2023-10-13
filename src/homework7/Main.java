package homework7;

public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();

        Shape[] shapesArray = {circle, rectangle, triangle};

        for (Shape shapes : shapesArray) {
            shapes.calculateArea();
            shapes.calculatePerimeter();
            shapes.paint();
        }




    }
}
