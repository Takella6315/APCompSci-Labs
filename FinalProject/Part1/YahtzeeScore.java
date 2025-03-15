/* Starter file for JHU CTY AP CS Course Final Project 
 * Initial code for YahtzeeScore with stub implementations
 */

public class YahtzeeScore
{
    private int[] dice;

	/* Constructor, parameter dice contains values of dice to be scored 
	 * */
	public YahtzeeScore(int[] dice) {
        this.dice = dice;
	}
	
	/* For a given hand calculate the lower score; if value is 1 score ones, etc. */
    public int getUpperScore(int value) {
        int score = 0;
        for (int d : dice) {
            if (d == value) {
                score += value;
            }
        }
        return score;
    }

    public int scoreThreeOfAKind() {
    	int score = 0;
        for (int i = 1; i <= 6; i++) {
            int sum = 0;
            for (int d : dice) {
                if (d == i) {
                    sum += d;
                }
            }
            if (sum >= 3*i) {
                score = sum;
                break;
            }
        }
        return score;
    }

    public int scoreFourOfAKind(){
    	int score = 0;
        for (int i = 1; i <= 6; i++) {
            int sum = 0;
            for (int d : dice) {
                if (d == i) {
                    sum += d;
                }
            }
            if (sum >= 4*i) {
                score = sum;
                break;
            }
        }
        return score;
    }

    public int scoreFullHouse() {
    	int score = 0;
        boolean hasThreeOfAKind = false;
        boolean hasPair = false;
        for (int i = 1; i <= 6; i++) {
            int count = 0;
            for (int d : dice) {
                if (d == i) {
                    count++;
                }
            }
            if (count == 3) {
                hasThreeOfAKind = true;
            } else if (count == 2) {
                hasPair = true;
            }
        }
        if (hasThreeOfAKind && hasPair) {
            score = 25;
        }
        return score;
    }

    public int scoreSmallStraight() {
    	int[] counts = new int[7];
        for (int d : dice) {
            counts[d]++;
        }
        for (int i = 1; i <= 3; i++) {
            if (counts[i] > 0 && counts[i+1] > 0 && counts[i+2] > 0 && counts[i+3] > 0) {
                return 30;
            }
        }
        return 0;
    }

    public int scoreLargeStraight() {
    	int[] counts = new int[7];
        for (int d : dice) {
            counts[d]++;
        }
        for (int i = 1; i <= 2; i++) {
            if (counts[i] > 0 && counts[i+1] > 0 && counts[i+2] > 0 && counts[i+3] > 0 && counts[i+4] > 0) {
                return 40;
            }
        }
        return 0;
    }


    public int scoreChance() {
    	int score = 0;
        for (int d : dice) {
            score += d;
        }
        return score;
    }


    public int scoreYahtzee() {
    	int score = 0;
    int[] counts = new int[7];
    for (int d : dice) {
        counts[d]++;
    }
    for (int i = 1; i <= 6; i++) {
        if (counts[i] == 5) {
            score = 50;
            break;
        }
    }
    return score;
    }

    public int scoreBonusYahtzee() {
    	int score = 0;
    int[] counts = new int[7];
    for (int d : dice) {
        counts[d]++;
    }
    for (int i = 1; i <= 6; i++) {
        if (counts[i] == 5) {
            score = 50;
            break;
        }
    }
    return score;
    }

    

}
