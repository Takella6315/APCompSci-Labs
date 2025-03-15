/**
 * 
 * This is a recreation of the game wordle where the user guesses a word and the computer lets the user 
 * know what letters are in the correct spot and what letters are in the word. + means correct spot 
 * ^ means in the word but different spot and - means not in the word. 
 * @author Teja Akella
 */
import java.util.*;

public class WordGame {
    private static final String[] wordList = {"SPACE", "PLANET", "ROCKET", "ASTRO", "ALIEN"};
    
    private static String chooseWord() {
        Random random = new Random();
        int index = random.nextInt(wordList.length);
        return wordList[index];
    }
    
    private static String checkWord(String word, String guess) {
        StringBuilder feedback = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            if (guess.charAt(i) == word.charAt(i)) {
                feedback.append("+");
            } else if (word.indexOf(guess.charAt(i)) != -1) {
                feedback.append("^");
            } else {
                feedback.append("-");
            }
        }
        return feedback.toString();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Spacle - the outer space based word game!");
        System.out.println("Enter a 5-letter word to guess what today's word is.");
        System.out.println("Let's play!");
        
        boolean playAgain = true;
        while (playAgain) {
            String word = chooseWord();
            int guesses = 6;
            boolean won = false;
            
            while (guesses > 0) {
                System.out.println("Remaining guesses: " + guesses);
                
                System.out.print("Enter your guess: ");
                String guess = scanner.next().toUpperCase();
                
                String feedback = checkWord(word, guess);
                System.out.println(feedback);
                
                if (feedback.equals("+++++")) {
                    won = true;
                    break;
                }
                
                guesses--;
            }
            
            if (won) {
                System.out.println("You won!");
            } else {
                System.out.println("You lost! The word was: " + word);
            }
            
            System.out.print("Would you like to play again? Enter true for yes, false for no: ");
            playAgain = scanner.nextBoolean();
            System.out.println();
        }
        
        System.out.println("Thank you for playing Spacle! Goodbye!");
        scanner.close();
    }
}
