import java.util.Arrays;

public class Mainpt2 {
    public static void main(String args[]) {
        YahtzeeHand yahtzee = new YahtzeeHand();
        yahtzee.changeHand();
        System.out.println("Final dice: " + Arrays.toString(yahtzee.getDice()));
        YahtzeeScore score = new YahtzeeScore(yahtzee.getDice());
        System.out.println("Score:\n");
        System.out.println("             1s: " + score.getUpperScore(1));
        // 2, 3, 4, 5, 6 omitted for brevity
        System.out.println("Three Of A Kind: " + score.scoreThreeOfAKind());
        // Four Of A Kind, Full House, Straights, Chance omitted
        System.out.println("        Yahtzee: " + score.scoreYahtzee());

        // Create the GUI scorecard
        YathzeeGuiScoreCard guiScoreCard = new YathzeeGuiScoreCard();
        guiScoreCard.scoreHand(yahtzee, 1);
    }
}
