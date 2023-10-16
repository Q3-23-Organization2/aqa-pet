package homework8.Task2;

import homework8.Task2.Interfaces.Printable;

public class Magazine implements Printable {

    @Override
    public void print() {
        System.out.println("Method Print from Magazine Class");

    }
    public static void printMagazines(Printable[] printable) {
        for (Printable mag: printable) {
            if (mag instanceof Magazine)
                mag.print();
        }
    }
}
