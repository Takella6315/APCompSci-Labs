/**
 * This is the animal class which implements the IAnimal Class
 * 
 */
public abstract class Animal implements IAnimal { 
    private int row; 
    private int col; 
    private int age;
    
    public Animal() { 
        this(0, 0);
        age = 1;
    } 

    public Animal(int r, int c) { 
        setRow(r); 
        setCol(c); 
        age = 1;
    } 

    public int getRow() { return row; } 
    public int getCol() { return col; } 
    public void setRow(int r) { row = r; } 
    public void setCol(int c) { col = c; } 

    public int getAge() { return age; } 
    public void age() { age++; }
    
    public Animal evolve() {
        return this; 
    }
} 