/**
 * 
 * This dog class does almost all of the same things as the Rabbit but has a longer life and can can move further
 * @author Teja Akella
 */
public class Dog extends Animal {
	

	public Dog(int r, int c) { 
        super(r, c);
    } 
	public void move() {
		if (getAge() % 2 == 0)
			setRow(getRow() + -1 + (int)(Math.random()*4));
		else
			setCol(getCol() + -1 + (int)(Math.random()*4));
	}

	@Override
	public char getSymbol() {
		return 'D';
	}
	
	@Override
	public void interactWith(Animal other, World world) {
		if (other instanceof Dog) {
			Dog otherDog = (Dog)other;
			if (Math.abs(otherDog.getCol() - this.getCol()) <= 1 &&
				Math.abs(otherDog.getRow() - this.getRow()) <= 1 &&
			    otherDog.getAge() > 2 && 
			    this.getAge() > 2)
				world.addAnimal(new Dog(this.getRow()+1, this.getCol()+1));
		}
	}
	
	@Override
	public Animal evolve() {
		if (getAge() >= 30)
			return null;
        return this; 
    }
}
