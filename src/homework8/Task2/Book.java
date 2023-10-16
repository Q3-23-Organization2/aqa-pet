package homework8.Task2;

import homework8.Task2.Interfaces.Printable;

public class Book implements Printable {

    @Override
    public void print() {
        System.out.println("Method Print from Book Class");

    }

    public static void printBooks(Printable[] printable) {
        for (Printable boo: printable) {
            if (boo instanceof Book)
                boo.print();
        }
    }

}
