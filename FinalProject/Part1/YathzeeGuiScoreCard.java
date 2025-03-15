/* Starter file for JHU CTY AP CS Course Final Project 
 * Example code for YathzeeGuiScoreCard
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class YathzeeGuiScoreCard extends JPanel implements YathzeeScoreCard
{
    // Define how big the score card will be
    public static final int xSize = 400;
    public static final int ySize = 700;
    // Define initial position where we will draw the score
    public static final int xPosition = 10;
    public static final int yPosition = 20;
    // Define size of the line drawn as a delimeter
    public static final int horizontalLineLength = (xSize * 4)/5;
    public static final int verticatLineSpacing = 10;
    // Define font used for drawing
    public static final String font = "Arial";
    public static final int fontSize = 16;
   
    public YathzeeGuiScoreCard()
    {
        this.create();
    }
    
    @Override
    public void paintComponent(Graphics g) {
    	// Example code how can we "print" on the scorecard
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, xSize, ySize);
        
        g.setFont(new Font(font, Font.BOLD, fontSize));
        g.setColor(Color.RED);
        g.drawString("Yahtzee!", xPosition, yPosition);
        g.setColor(Color.BLACK);        
        g.drawLine(xPosition, yPosition + verticatLineSpacing, xPosition + horizontalLineLength, yPosition + verticatLineSpacing);
    }

    private void create() {
    	// Example how to create GUI components
        JFrame f = new JFrame("Yahtzee Scorecard");
        f.add(this);
        f.setPreferredSize(new Dimension(xSize,ySize));
        f.pack();
        Dimension screenSize = new Dimension(Toolkit.getDefaultToolkit().getScreenSize());
        f.setLocation(screenSize.width - xSize, screenSize.height/2 - ySize/2);
        f.setVisible(true);

        f.addMouseListener(new MouseListener(){
                @Override
                public void mousePressed(MouseEvent e) {}

                @Override
                public void mouseReleased(MouseEvent e) {}

                @Override
                public void mouseEntered(MouseEvent e) {}

                @Override
                public void mouseExited(MouseEvent e) {}
                
                @Override
                public void mouseClicked(MouseEvent e) {
                }
            });
    }

    public void scoreHand(YahtzeeHand yahtzee, int game) {
        int[] diceValues = yahtzee.getDice(); // Get the dice values from YahtzeeHand
        
        YahtzeeScore yahtzeeScore = new YahtzeeScore(diceValues); // Create an instance of YahtzeeScore
        
        System.out.println("-- Upper Section --");
        System.out.println("               1s ");
        System.out.println("               2s ");
        System.out.println("               3s   " + yahtzeeScore.getUpperScore(3));
        System.out.println("               4s ");
        System.out.println("               5s ");
        System.out.println("               6s ");
        System.out.println("      Upper Total   " + yahtzeeScore.getUpperScore(1) + yahtzeeScore.getUpperScore(2) + yahtzeeScore.getUpperScore(3)
                            + yahtzeeScore.getUpperScore(4) + yahtzeeScore.getUpperScore(5) + yahtzeeScore.getUpperScore(6));
        System.out.println("      Upper Bonus   0");
        System.out.println(" -- Lower Section --");
        System.out.println("  Three of a Kind ");
        System.out.println("   Four of a Kind ");
        System.out.println("       Full House  " + yahtzeeScore.scoreFullHouse());
        System.out.println("   Small Straight ");
        System.out.println("   Large Straight ");
        System.out.println("           Chance " + yahtzeeScore.scoreChance());
    }
    
}
