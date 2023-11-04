package homework10.Task1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();
        firstApp(integerList);
        print(integerList);
        Set<Integer> uniqValues = secondApp(integerList);
        printSet(uniqValues);
        findDuplicates(integerList);
    }

    public static void firstApp(List<Integer> integerList) {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int randomValue = random.nextInt(40) - 20;
            integerList.add(randomValue);
        }
    }

    public static Set<Integer> secondApp(List<Integer> integerList) {
        Set<Integer> uniqValues = new HashSet(integerList);
        return uniqValues;
    }

  public static void findDuplicates(List<Integer> integerList) {
        if(integerList != null && !integerList.isEmpty()) {
            Set<Integer> uniques = new HashSet<>();
            Set<Integer> duplicates = new HashSet<>();

            for (int i=0; i < integerList.size(); i++) {
                if(!uniques.add(integerList.get(i))) {
                    duplicates.add(integerList.get(i));
                }
            }
            System.out.println("Duplicates elements: " + duplicates);
        }
    }

    public static void print(List<Integer> integerList) {
        System.out.println("Collection with duplicate elements: " + integerList);
    }

    public static void printSet(Set<Integer> integerList) {
        System.out.println("Collection without duplicate elements: " + integerList);
    }
}
