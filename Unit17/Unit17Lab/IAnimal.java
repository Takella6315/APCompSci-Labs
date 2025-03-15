/**
 * 
 * This IAnimal class is the interface that all of the other animals implements
 * @author Teja Akella
 */
abstract interface IAnimal { 
    public int getAge();
    public char getSymbol();

    public int getRow(); 
    public int getCol(); 

    public void setRow(int r); 
    public void setCol(int c); 

    public void move(); 
    
    public Animal evolve(); 
    
    public void interactWith(Animal other, World world);
} 