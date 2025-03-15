/**
 * 
 * This Hawk class can move vertically up to 5 away and dies at age 50. It can interact with other hawks
 * @author Teja Akella
 */
import java.util.Random;

public class Hawk extends Animal {
    private final int MIN_VERTICAL_MOVE = 1;
    private final int MAX_VERTICAL_MOVE = 5;

	public Hawk(int r, int c) { 
        super(r, c);
    } 
	public void move() {
		Random rand = new Random();
        int verticalMove = rand.nextInt(MAX_VERTICAL_MOVE - MIN_VERTICAL_MOVE + 1) + MIN_VERTICAL_MOVE;
        int newRow = getRow() - verticalMove;
        setCol(verticalMove);
        setRow(newRow);
	}

	@Override
	public char getSymbol() {
		return '^';
	}
	
	@Override
	public void interactWith(Animal other, World world) {
		if (other instanceof Hawk) {
			Hawk otherHawk = (Hawk)other;
			if (Math.abs(otherHawk.getCol() - this.getCol()) <= 1 &&
				Math.abs(otherHawk.getRow() - this.getRow()) <= 1 &&
			    otherHawk.getAge() > 2 && 
			    this.getAge() > 2)
				world.addAnimal(new Hawk(this.getRow()+1, this.getCol()+1));
		}
	}
	
	@Override
	public Animal evolve() {
		if (getAge() >= 50)
			return null;
        return this; 
    }
}
