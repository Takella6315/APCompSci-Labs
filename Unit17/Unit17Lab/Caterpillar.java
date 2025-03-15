/**
 * 
 * This Caterpillar class can move up and does not evolve or interact
 * @author Teja Akella
 */
public class Caterpillar extends Animal {
    private int moveCount;

	public Caterpillar(int r, int c) { 
        super(r, c);
        moveCount = 0;
    } 
	public void move() {
		moveCount++;

        if (moveCount % 3 == 1) {
            int newCol = getCol() + 1;
            setRow(getRow());
            setCol(newCol);
        }
    }

	@Override
	public char getSymbol() {
		return '~';
	}
	
	@Override
	public void interactWith(Animal other, World world) {
	
	}
	
	@Override
	public Animal evolve() {
		return this;
    }
}
