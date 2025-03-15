/**
 * 
 * This Rabiit class can move up and dies at age 12. It can interact and reproduce. 
 * @author Teja Akella
 */
public class Rabbit extends Animal {

	public Rabbit(int r, int c) { 
        super(r, c);
    } 
	public void move() {
		if (getAge() % 2 == 0)
			setRow(getRow() + -1 + (int)(Math.random()*3));
		else
			setCol(getCol() + -1 + (int)(Math.random()*3));
	}

	@Override
	public char getSymbol() {
		return 'R';
	}
	
	@Override
	public void interactWith(Animal other, World world) {
		if (other instanceof Rabbit) {
			Rabbit otherRabbit = (Rabbit)other;
			if (Math.abs(otherRabbit.getCol() - this.getCol()) <= 1 &&
				Math.abs(otherRabbit.getRow() - this.getRow()) <= 1 &&
			    otherRabbit.getAge() > 2 && 
			    this.getAge() > 2)
				world.addAnimal(new Rabbit(this.getRow()+1, this.getCol()+1));
		}
	}
	
	@Override
	public Animal evolve() {
		if (getAge() >= 12)
			return null;
        return this; 
    }
}
