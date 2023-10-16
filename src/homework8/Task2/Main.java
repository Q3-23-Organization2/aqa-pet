package homework8.Task2;

import homework8.Task2.Interfaces.Printable;

public class Main {

    public static void main(String[] args) {

        Book book = new Book();
        Magazine magazine = new Magazine();

        Printable[] printableArray = {book, magazine};

        for (Printable printable : printableArray) {
            printable.print();
        }

        Book.printBooks(printableArray);
        Magazine.printMagazines(printableArray);

    }

}

