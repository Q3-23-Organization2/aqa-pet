package homework11.Task1;
@FunctionalInterface
interface Printable {
    void print(String text);
}

public class Main {
    public static void main(String[] args) {
        Printable printer = text -> System.out.println(text);
        printer.print("Hello it's text from Lambda Expression.");
    }
}


