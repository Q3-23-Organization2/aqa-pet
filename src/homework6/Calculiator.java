package homework6;

import java.util.Scanner;

public class Calculiator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your first number: ");
        double value1 = scan.nextDouble();

        Scanner scan2 = new Scanner(System.in);
        System.out.println("Please enter operation(+,-,/,*): ");
        String operation = scan2.next();

        System.out.println("Please enter your second number: ");
        double value2 = scan.nextDouble();

        if (operation.equals("+"))
        {
            System.out.println("Your answer is: "+(value1 + value2));
        }
        else if (operation.equals("-"))
        {
            System.out.println("Your answer is: "+(value1 - value2));
        }
        else if (operation.equals("*"))
        {
            System.out.println("Your answer is: "+(value1 * value2));
        }
        else if (operation.equals("/"))
        {
            System.out.println("Your answer is: "+(value1 / value2));
        }
        else
        {
            System.out.println("Sorry, your operation is incorrect. \nPlease try again.");
        }
    }

}
