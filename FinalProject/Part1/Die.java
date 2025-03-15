/* Starter file for JHU CTY AP CS Course Final Project 
 * Initial code for Die with stub implementations
 */

public class Die
{
    int currentRoll;
    /* Roll a die and return its numerical value */
    public int roll() {
    	currentRoll = (int) (Math.random() * 6) + 1;
        return currentRoll;
    }
    
    /* Return numerical value of the die without re-rolling it */
    public int getValue() {
    	return currentRoll;
    }
}