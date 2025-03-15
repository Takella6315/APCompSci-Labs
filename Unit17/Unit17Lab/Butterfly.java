/**
 * 
 * This Butterfly class can move diagonally and does not evolve or interact
 * @author Teja Akella
 */
import java.util.Random;

public class Butterfly extends Animal {
    private final int[][] DIAGONAL_MOVES = {
        {-1, -1}, // Up-left
        {-1, 1},  // Up-right
        {1, -1},  // Down-left
        {1, 1}    // Down-right
    };

    
    private int moveCount;
	public Butterfly(int r, int c) { 
        super(r, c);
        moveCount = 0;
    } 
	public void move() {
        moveCount++;

        Random rand = new Random();
    int[] diagonalMove = DIAGONAL_MOVES[rand.nextInt(DIAGONAL_MOVES.length)];
    int newRow = getRow() + diagonalMove[0];
    int newCol = getCol() + diagonalMove[1];

    setRow(newRow);
    setCol(newCol);
	}

	@Override
	public char getSymbol() {
		return '%';
	}
	
	@Override
    public Animal evolve() {
        return this;
    }

    @Override
    public void interactWith(Animal otherAnimal, World world) {
        // Butterfly does not interact with other animals
    }
}
