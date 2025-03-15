/**
 * 
 * This Chyrsalis class can't move and does not evolve or interact
 * @author Teja Akella
 */
public class Chrysalis extends Animal {
    private int moveCount;

	public Chrysalis(int r, int c) { 
        super(r, c);
        moveCount = 0;
    } 
	public void move() {
        moveCount++;
        if (moveCount >= 3) {
            setRow(getRow());
            setCol(getCol());
        }
	}

	@Override
	public char getSymbol() {
		return 'O';
	}
	
	@Override
	public Animal evolve() {
        return this;
    }

    @Override
    public void interactWith(Animal otherAnimal, World world) {
        // Chrysalis does not interact with other animals
    }
}
