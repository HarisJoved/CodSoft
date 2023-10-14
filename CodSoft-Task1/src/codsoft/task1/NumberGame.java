package codsoft.task1;

import java.util.*;

public class NumberGame {

    public static void main(String[] args) {
        int round = 0, correct = 0, guess;
        String ans;
        boolean play = true;
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        System.out.println("***** WELCOME TO NUMBER GAME *****");
        System.out.println("");
        System.out.println("GUESS THE NUMBER BETWEEN 1 to 100");

        while (play) {
            System.out.println("Would you like to play number guessing game? yes or no?");
            ans = sc.nextLine();
            if ("yes".equalsIgnoreCase(ans)) { 
                round++;
                int error = 0;
                int num = ran.nextInt(100) + 1; 
                while (error != 5) {
                    System.out.println("Enter your guess: ");
                    guess = sc.nextInt();
                    sc.nextLine();

                    if (guess == num) {
                        System.out.println("***YOU WON***");
                        correct++;
                        break;
                    } else if (num > guess) {
                        System.out.println("***Wrong***");
                        System.out.println("Number is higher");
                        error++;
                    } else if (num < guess) {
                        System.out.println("***Wrong***");
                        System.out.println("Number is lower");
                        error++;
                    }
                }
            } else if ("no".equalsIgnoreCase(ans)) { 
                System.out.print("Your score was: ");
                System.out.print(correct);
                System.out.print(" out of ");
                System.out.print(round);
                System.out.println("rounds correct!");
                play = false;
            } else {
                System.out.println("Invalid input. Please enter 'yes' or 'no'.");
            }
        }
    }
}
