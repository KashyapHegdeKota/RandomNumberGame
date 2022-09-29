import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to Random Number Guessing Game");

        try (// Initializing the career
                Scanner scnr = new Scanner(System.in)) {
            // Initializing variables
            int random_number;
            int guess_number;
            int max_attempts = 3;

            // Using Math.random() to get a random number in the range of 1-10
            random_number = (int) (Math.random() * 10) + 1;

            // Using while loop to iterate through and setting max attempts to 3.
            while (max_attempts > 0) {
                System.out.println("Guess the number!");
                // When no attempts have been made
                if (max_attempts == 3) {
                    System.out.println("You have 3 attempts left!");
                    System.out.println("Guess the number: ");
                    guess_number = scnr.nextInt();
                    max_attempts = 2;
                    // If guess is correct
                    if (guess_number == random_number) {
                        System.out.println("Correct!");
                        break;
                    // If guess is wrong
                    } else {
                        System.out.println("Incorrect! Try again!");
                    }
                }
                // When first attempt is made
                if (max_attempts == 2) {
                    System.out.println("You have 2 attempts left!");
                    System.out.println("Guess the number: ");
                    guess_number = scnr.nextInt();
                    max_attempts = 1;
                    // If guess is correct
                    if (guess_number == random_number) {
                        System.out.println("Correct!");
                        break;
                    // If guess is wrong
                    } else {
                        System.out.println("Incorrect! Try again!");
                    }
                }
                // When second attempt has been made
                if (max_attempts == 1) {
                    System.out.println("You have 1 attempt left!");
                    System.out.println("Guess the number: ");
                    guess_number = scnr.nextInt();
                    max_attempts = 0;
                    // If correct guess has been made
                    if (guess_number == random_number) {
                        System.out.println("Correct!");
                        break;
                    // If wrong guess has been made
                    } else {
                        System.out.println("Incorrect! Try again!");
                    }
                // Attempts have run out.
                } else {
                    System.out.println("Sorry, you did not guess the number!");
                    break;
                }
            }
        }

    }
}
