package homework9;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner action = new Scanner(System.in);

        System.out.println("Please enter your action: rock, paper or scissors");

        String myAction = action.nextLine();

        if (!myAction.equals("rock") && !myAction.equals("paper") && !myAction.equals("scissors")) {
            System.out.println("Value is not valid.Please enter valid action: rock, paper or scissors");
        } else {

            int random = (int) (Math.random() * 3);

            String computerAction = "";

            if (random == 0) {
                computerAction = "rock";
            } else if (random == 1) {
                computerAction = "paper";
            } else if (random == 2) {
                computerAction = "scissors";
            } else {
                System.out.println("Sorry something went wrong");
            }

            System.out.println("Computer action is: " + computerAction);

        }


    }
}
