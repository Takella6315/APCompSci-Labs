/**
 * 
 * This Dragon class does almost all of the same things as the Rabbit but has a longer life and can can move further
 * @author Teja Akella
 */
public class Dragon extends Animal {
	

	public Dragon(int r, int c) { 
        super(r, c);
    } 
	public void move() {
		if (getAge() % 2 == 0)
			setRow(getRow() + -1 + (int)(Math.random()*15));
		else
			setCol(getCol() + -1 + (int)(Math.random()*15));
	}

	@Override
	public char getSymbol() {
		return '+';
	}
	
	@Override
	public void interactWith(Animal other, World world) {
		if (other instanceof Dragon) {
			Dragon otherDrag = (Dragon)other;
			if (Math.abs(otherDrag.getCol() - this.getCol()) <= 1 &&
				Math.abs(otherDrag.getRow() - this.getRow()) <= 1 &&
			    otherDrag.getAge() > 2 && 
			    this.getAge() > 2)
				world.addAnimal(new Dragon(this.getRow()+1, this.getCol()+1));
		}
	}
	
	@Override
	public Animal evolve() {
		if (getAge() >= 10000)
			return null;
        return this; 
    }
}
