package homework11.Task3;

import java.util.Comparator;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        User user1 = new User("Lionel", "Messi", 32);
        User user2 = new User("Pele", "Pele", 88);
        User user3 = new User("Diego", "Maradona", 64);
        User user4 = new User("Cristiano", "Ronaldo", 33);
        User user5 = new User("Johan", "Cruyff", 57);
        User user6 = new User("Zinedine", "Zidane", 48);
        User user7 = new User("Gerd", "Muller", 62);
        User user8 = new User("Ronaldo", "Nazario", 46);
        User user9 = new User("Alfredo", "Stefano", 50);
        User user10 = new User("Michel", "Platini", 72);


        System.out.println("Sub-point a");
        Stream.of(user1, user2, user3, user4, user5, user6, user7, user8, user9, user10).forEach(System.out::println);

        System.out.println("   ");
        System.out.println("Sub-point b");

        Stream.of(user1, user2, user3, user4, user5, user6, user7, user8, user9, user10).sorted(Comparator.comparingInt(User::getAge)).forEach(System.out::println);

        System.out.println("   ");
        System.out.println("Sub-point c");

        double averageAge = Stream.of(user1, user2, user3, user4, user5, user6, user7, user8, user9, user10).mapToDouble(User::getAge).average().orElse(0.0);
        System.out.println("Average age of users: " + averageAge + " age.");

        System.out.println("   ");
        System.out.println("Sub-point d");

        Stream.of(user1, user2, user3, user4, user5, user6, user7, user8, user9, user10).sorted(Comparator.comparing(User::getFirstName).thenComparing(User::getAge)).forEach(System.out::println);

        System.out.println("   ");
        System.out.println("Sub-point e");

        boolean secondNameCheck = Stream.of(user1, user2, user3, user4, user5, user6, user7, user8, user9, user10).anyMatch(user -> user.getSecondName().startsWith("S") || user.getSecondName().startsWith("A"));

        if (secondNameCheck) {
            System.out.println("Yes, there are users with second names starting with 'S' or 'A.");
        } else {
            System.out.println("No, there are no users with second names starting with 'S' or 'A.");
        }

        System.out.println("   ");
        System.out.println("Sub-point f");

        boolean ageOver18 = Stream.of(user1, user2, user3, user4, user5, user6, user7, user8, user9, user10).allMatch(user -> user.getAge() > 18);

        if (ageOver18) {
            System.out.println("Yes, all users are over 18 years old.");
        } else {
            System.out.println("No, not all users are over 18 years old.");
        }

    }

}
