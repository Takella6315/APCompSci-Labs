/**
 * This game lets the user type in words, which are scored randomy, and the user has to make it to the target.
 * @author Teja Akella
 * 
 */
import java.util.Scanner;

public class WordGolf {
    public static void main(String[] args) {
        // Set up the scanner to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Set up the variables for the game
        int hole1Target = (int) (Math.random() * 51) + 50; // Random number between 50 and 100
        int hole2Target = (int) (Math.random() * 51) + 50; // Random number between 50 and 100
        int hole1Distance = 0;
        int hole2Distance = 0;
        int hole1Strokes = 0;
        int hole2Strokes = 0;
        
        // Print the welcome message and the hole targets
        System.out.println("Welcome to WordGolf! Your course has 2 holes.");
        System.out.println("Hole #1 requires " + hole1Target + " yards to make the hole");
        System.out.println("Hole #2 requires " + hole2Target + " yards to make the hole\n");
        
        // Play hole #1
        System.out.println("Welcome to hole #1. Your target is " + hole1Target + " yards away.\n");
        while (hole1Distance != hole1Target) {
            // Read in the user's input
            System.out.print("Enter your sentence (stroke #" + (hole1Strokes + 1) + "): ");
            String sentence = scanner.nextLine();
            
            // Check if the user wants to quit
            if (sentence.equals("quit")) {
                System.out.println("You earned a 100 stroke penalty for quitting.");
                hole1Strokes += 100;
                continue;
            }
            
            // Validate the sentence
            String[] words = sentence.split(" ");
            if (words.length > 4) {
                System.out.println("Invalid sentence - too many words! Must be 4 words or less!");
                hole1Strokes++;
                continue;
            }
            
            // Calculate the distance for this stroke
            int distance = 0;
            for (String word : words) {
                boolean vowelFound = false;
                for (int i = 0; i < word.length(); i++) {
                    char c = word.charAt(i);
                    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                        vowelFound = true;
                        distance += 2 * (i + 1);
                    } else {
                        distance += i + 1;
                    }
                }
                if (!vowelFound) {
                    distance++;
                }
            }
            
            // Add the distance to the total for this hole
            if (hole1Distance + distance > hole1Target) {
                distance = -(hole1Distance + distance - hole1Target);
            }
            hole1Distance += distance;
            hole1Strokes++;
            
            // Print out the result of this stroke
            System.out.println("Stroke #" + hole1Strokes + ": \"" + sentence + "\" is worth " + distance + " yards.");
            System.out.println("Total distance so far: " + hole1Distance + ". You are " + (hole1Target - hole1Distance) + " yards from the target.\n");
        }
        System.out.println("Congrats, you reached hole #1 in " + hole1Strokes + " strokes.\n");
        
        // Play hole #2
        System.out.println("Welcome to hole #2. Your target is " + hole2Target + " yards away.\n");
        while (hole2Distance != hole2Target) {
            // Read in the user's input
            System.out.print("Enter your sentence (stroke #" + (hole2Strokes + 1) + "): ");
            String sentence = scanner.nextLine();
            
            if (sentence.equals("quit")) {
                System.out.println("You earned a 100 stroke penalty for quitting.");
                hole2Strokes += 100;
                continue;
            }
            
            // Validate the sentence
            String[] words = sentence.split(" ");
            if (words.length > 4) {
                System.out.println("Invalid sentence - too many words! Must be 4 words or less!");
                hole2Strokes++;
                continue;
            }
            
            // Calculate the distance for this stroke
            int distance = 0;
            for (String word : words) {
                boolean vowelFound = false;
                for (int i = 0; i < word.length(); i++) {
                    char c = word.charAt(i);
                    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                        vowelFound = true;
                        distance += 2 * (i + 1);
                    } else {
                        distance += i + 1;
                    }
                }
                if (!vowelFound) {
                    distance++;
                }
            }
            
            // Add the distance to the total for this hole
            if (hole2Distance + distance > hole2Target) {
                distance = -(hole2Distance + distance - hole2Target);
            }
            hole2Distance += distance;
            hole2Strokes++;
            
            // Print out the result of this stroke
            System.out.println("Stroke #" + hole2Strokes + ": \"" + sentence + "\" is worth " + distance + " yards.");
            System.out.println("Total distance so far: " + hole2Distance + ". You are " + (hole2Target - hole2Distance) + " yards from the target.\n");
        }
        System.out.println("Congrats, you reached hole #1 in " + hole2Strokes + " strokes.\n");
        System.out.println("Total number of strokes :" + (hole1Strokes + hole2Strokes));
        
    }
}