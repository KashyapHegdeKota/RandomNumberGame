import java.util.Scanner;

public class App {
    public static void main(String[] args)  {
        System.out.println("Welcome to Random Number Guessing Game");
        
        try (//Initializing the career
        Scanner scnr = new Scanner(System.in)) {
            // Initializing variables
            int random_number;
            int guess_number;
            int max_attempts = 3;

            //Using Math.random() to get a random number in the range of 1-10
            random_number = (int)(Math.random()*10) + 1;
            
            while(max_attempts>0){
                System.out.println("Guess the number!");
                if(max_attempts==3){
                    System.out.println("You have 3 attempts left!");
                    System.out.println("Guess the number: ");
                    guess_number = scnr.nextInt();
                    max_attempts=2;
                    if(guess_number==random_number){
                        System.out.println("Correct!");
                        break;
                    }
                    else{
                        System.out.println("Incorrect! Try again!");
                    }
                }
                if(max_attempts ==2){
                    System.out.println("You have 2 attempts left!");
                    System.out.println("Guess the number: ");
                    guess_number = scnr.nextInt();
                    max_attempts=1;
                    if(guess_number==random_number){
                        System.out.println("Correct!");
                        break;
                    }
                    else{
                        System.out.println("Incorrect! Try again!");
                    }
                }
                if(max_attempts==1){
                    System.out.println("You have 1 attempt left!");
                    System.out.println("Guess the number: ");
                    guess_number = scnr.nextInt();
                    max_attempts=0;
                    if(guess_number==random_number){
                        System.out.println("Correct!");
                        break;
                    }
                    else{
                        System.out.println("Incorrect! Try again!");
                    }
                }
                else{
                    System.out.println("Sorry, you did not guess the number!");
                    break;
                }
            }
        }
        
    }
}
