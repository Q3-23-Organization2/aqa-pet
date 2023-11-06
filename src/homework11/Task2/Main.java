package homework11.Task2;

import java.util.function.Consumer;

public class Main {
        public static void main(String[] args) {
            Consumer<String> printer = System.out::println;
            printer.accept("Text from method reference. Thank You.");
        }
}
