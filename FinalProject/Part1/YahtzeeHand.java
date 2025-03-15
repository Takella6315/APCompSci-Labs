/* Starter file for JHU CTY AP CS Course Final Project 
 * Initial code for YahtzeeHand with stub implementations
 */

import java.util.Random;
import java.util.Scanner;

public class YahtzeeHand
{

    int [] diceValues = new int[5];
    /*
     * Returns array of integers with current values of the dice
     */
    public int[] getDice() {
        return diceValues;
    }
    
    /* Roll all dice */
    public void rollAll() {
        for (int i = 0; i < diceValues.length; i++) {
            diceValues[i] = (int)(Math.random() * 6) + 1;
        }
    }

    /* Rolls specific dice */
    public void roll(int number) {
        if (number < 1 || number > 5) {
            throw new IllegalArgumentException("Die number should be between 1 and 5 (inclusive)");
        }
        diceValues[number - 1] = (int) (Math.random() * 6) + 1;

    }
    
    /* Allow user to change dice by rolling two
     * more times, user can choose which dice to keep
     */
    public void changeHand() {
        Scanner scanner = new Scanner(System.in);
    int[] diceToRoll = new int[5];
    for (int i = 0; i < diceToRoll.length; i++) {
        diceToRoll[i] = 1;
    }
    System.out.println("Current dice: " + showDice());
    for (int i = 1; i <= 2; i++) {
        System.out.println("Rolling round " + i);
        System.out.print("Which dice do you want to keep (separated by commas)? ");
        String input = scanner.nextLine();
        String[] diceNumbers = input.split(",");
        for (String dieNumber : diceNumbers) {
            int index = Integer.parseInt(dieNumber.trim()) - 1;
            diceToRoll[index] = 0;
        }
        for (int j = 0; j < diceToRoll.length; j++) {
            if (diceToRoll[j] == 1) {
                roll(j + 1);
            }
        }
        System.out.println("Current dice: " + showDice());
    }
    }
    
    /* Returns value of specified dice */
    public int get(int number) {
        if (number < 1 || number > 5) {
            throw new IllegalArgumentException("Die number should be between 1 and 5 (inclusive)");
        }
        return diceValues[number - 1];
    }

    /* Return string representing current state of the dice in 
     * the following format (or similar):
     * +------+---+---+---+---+---+
     * | Dice | 1 | 2 | 3 | 4 | 5 |
     * +------+---+---+---+---+---+
     * | Face | 4 | 2 | 4 | 6 | 1 |
     * +------+---+---+---+---+---+
     * 
     */
    public String showDice() {
    	StringBuilder sb = new StringBuilder();
        for (int value : diceValues) {
            sb.append(value);
            sb.append(" ");
    }
        return sb.toString();
    }
}
