package homework9;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner action = new Scanner(System.in);

        int wins = 0;
        int losses = 0;
        int draws = 0;

        while (true){
            System.out.println("Please enter your action : rock, paper or scissors. If you want to end game please enter 'stop' ");

            String myAction = action.nextLine();

            if (myAction.equals("stop")) {
                break;
            }

            if (!myAction.equals("rock") && !myAction.equals("paper") && !myAction.equals("scissors")) {
                System.out.println("Action is not valid. Please enter valid action: rock, paper or scissors");
                System.out.println("    ");
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

                if (myAction.equals(computerAction)) {
                    System.out.println("You have draw");
                    draws++;
                } else if ((myAction.equals("rock") && computerAction.equals("scissors")) || (myAction.equals("scissors") && computerAction.equals("paper")) || (myAction.equals("paper") && computerAction.equals("rock"))) {
                    System.out.println("Congratulations, You Won.");
                    wins++;
                } else {
                    System.out.println("Sorry, You Lost.");
                    losses++;
                }
                System.out.println("    ");

            }

            System.out.println("You have won " + wins + " games");
            System.out.println("You have lost " + losses + " games");
            System.out.println("You have draw " + draws + " games");
            System.out.println("    ");

        }

        if (wins > losses) {
            System.out.println("You are lucky, you won more games than you lost.");
        } else if (wins < losses) {
            System.out.println("Don't give up, you lost more games than you won.");
        } else {
            System.out.println("You have same numbers of lost and won games.");
        }
        System.out.println("    ");
        System.out.println("Thank You for the game. You are the best!");

    }
}
