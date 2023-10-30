package homework10.Task2;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] num = {764, -17, 78, 43, 90, -894, 0, -44, 1111, 13, 154, 139};

        for (int i = 0; i < num.length; i++) {

            System.out.println(num[i]);
        }

        System.out.print("Please type a number: ");

        int x = scan.nextInt();

        System.out.println("Numbers below X: ");

        for (int i = 0; i < num.length; i++) {
            if (num[i] < x) {
                System.out.println(num[i]);
            }

        }

        System.out.println("Numbers above X: ");

        for (int i = 0; i < num.length; i++) {
            if (num[i] > x) {
                System.out.println(num[i]);
            }
        }
    }
}

