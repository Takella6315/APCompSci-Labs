/**
 * 
 * In this game the user will have a certain number of guessses(it is up to the user) to determine what the secret number is. 
 * @author Teja Akella
 */
import java.util.Scanner;

public class Unit6Activity1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int playAgain = 1;
        while (playAgain == 1) {
            System.out.println("Welcome to Guess The Secret Number game.");
            System.out.print("You will be guessing a number between 1 and N. What would you like N to be? ");
            int N = input.nextInt();
            System.out.print("How many guesses would you like to make? ");
            int maxGuesses = input.nextInt();
            int secretNumber = (int) (N * Math.random()) + 1;
            int numGuesses = 0;
            int guess = 0;
            while (numGuesses < maxGuesses && guess != secretNumber) {
                System.out.print("Your guess: ");
                guess = input.nextInt();
                if (guess == secretNumber) {
                    System.out.println("Correct, great job!");
                } else if (guess < secretNumber) {
                    System.out.println("Too low");
                } else {
                    System.out.println("Too high");
                }
                numGuesses++;
            }
            if (numGuesses == maxGuesses && guess != secretNumber) {
                System.out.println("Sorry, you have used up all your guesses. The secret number was " + secretNumber + ".");
            }
            System.out.print("Enter 1 to try again, or 2 to stop playing. ");
            playAgain = input.nextInt();
        }
        System.out.println("Good bye!");
        input.close();
    }
}
