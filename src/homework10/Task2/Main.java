package homework10.Task2;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<Integer> integerList = new ArrayList<>();
        integerList.add(-67);
        integerList.add(43);
        integerList.add(13);
        integerList.add(-99);
        integerList.add(0);
        integerList.add(413);
        integerList.add(144443);
        integerList.add(-99);
        integerList.add(10);

        Collections.sort(integerList);
        System.out.println(integerList);
        System.out.print("Please enter a number: ");

        int x = scan.nextInt();
        List<Integer> integerList2 = new ArrayList<>();

        for (int n: integerList) {
            if (n < x) {
                integerList2.add(n);
            }
        }
        System.out.println("Numbers below " + x + ": " + integerList2);

        List<Integer> integerList3 = new ArrayList<>();

        for (int n: integerList) {
            if (n > x) {
                integerList3.add(n);
            }
        }
        System.out.println("Numbers above " + x + ": " + integerList3);
    }
}

