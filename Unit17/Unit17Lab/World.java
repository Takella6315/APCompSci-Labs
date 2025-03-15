/**
 * 
 * This World class creates the world and adds the animals to it. 
 * @author Teja Akella
 */
import java.util.*;

public class World { 
    private ArrayList<Animal> animals; 
    private ArrayList<Animal>[][] grid; 

    /* Constructor creating the world of a given dimensions */
    @SuppressWarnings("unchecked")
	public World(int r, int c) { 
        animals = new ArrayList<Animal>(); 
        grid = new ArrayList[r][c];  // causes unchecked warning 
        for (int i = 0; i < r; i++) { 
            for (int j = 0; j < c; j++) { 
                grid[i][j] = new ArrayList<Animal>();
            } 
        } 
    } 

    /* 
     * Adds an animal to the grid placing it
     * at the correct position in the grid
     */
    public void addAnimal(Animal a) { 
        normalizeAnimalCoordinates(a); 
        animals.add(a); 
        grid[a.getRow()][a.getCol()].add(a); 
    }
    
    /*
     * Remove an animal from the grid
     */
    public void removeAnimal(Animal a) { 
        animals.remove(a); 
        grid[a.getRow()][a.getCol()].remove(a); 
    }
    
    /*
     * The "brains" of the program that will allow animals 
     * in the world perform all life functions: move, evolve, interactWith 
     */
    public void tick() { 
        // run through each pair of animals and call interactWith 
        ArrayList<Animal> copy = new ArrayList<Animal>(animals);
        for (int i = 0; i < copy.size(); i++) { 
            for (int j = 0; j < copy.size(); j++) { 
                if (i != j) { 
	                Animal first = copy.get(i); 
	                Animal second = copy.get(j); 
	                first.interactWith(second, this); 
                }
            } 
        } 
        // allow each animal to move and evolve
        for (int i = animals.size() - 1; i >= 0; i--) { 
            Animal a = animals.get(i); 
            // remove the animal from its old place 
            removeAnimal(a); 
            // update the animal's position 
            a.move(); 
            normalizeAnimalCoordinates(a); 
            // get the evolved form of the Animal 
            Animal ea = a.evolve(); 
            // add the animal to its new place 
            if (ea != null)
            	addAnimal(ea); 
        } 
        // age all animals
        for (int i = animals.size() - 1; i >= 0; i--) 
            animals.get(i).age(); 
    } 

    /*
     * Create a grid with all animals
     */
    public String toString() { 
        String gridStr = "Total animals: " + animals.size() + "\n"; 
        String header = "o"; 

        for (int j = 0; j < getNumberOfCols(); j++) { 
            header += "-"; 
        } 
        header += "o\n"; 
        gridStr += header; 
        for (int i = 0; i < getNumberOfRows(); i++) { 
            // start of row 
            gridStr += "|"; 
            for (int j = 0; j < getNumberOfCols(); j++) { 
                if (grid[i][j].size() == 0) { 
                    // no animals at this position 
                    gridStr += ' '; 
                } else if (grid[i][j].size() == 1) { 
                    // exactly one animal at this position 
                    // print its representative character 
                    gridStr += grid[i][j].get(0).getSymbol(); 
                } else { 
                    // multiple animals occupying one space 
                    // print * to indicate multiple 
                    gridStr += '*'; 
                } 
            } 
            // add new line for end of row 
            gridStr += "|\n"; 
        } 
        gridStr += header; 
        return gridStr; 
    } 
    /* 
     * Wrap the Animal's position so it's always in the grid
     */
    private void normalizeAnimalCoordinates(Animal a) { 
        a.setRow(Math.floorMod(a.getRow(), getNumberOfRows())); 
        a.setCol(Math.floorMod(a.getCol(), getNumberOfCols())); 
    }
    /* 
     * Return number of rows in the word
     */
    private int getNumberOfRows() { 
        return grid.length; 
    } 
    /* 
     * Return number of columns in the word
     */
    private int getNumberOfCols() { 
        if (grid.length == 0) { 
            return 0; 
        } 
        return grid[0].length; 
    }
    /*
     * Check if total number of animals is greater than half of
     * the spaces available in the world
     */
    public boolean isOverpopulated() {
    	return getNumberOfRows() * getNumberOfCols() < 2 * animals.size();
    }
    
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    String action = "";
		World w = new World(10, 30);
		w.addAnimal(new Rabbit(6, 6));
		w.addAnimal(new Rabbit(8, 8));
        w.addAnimal(new Hawk(10, 10));
        w.addAnimal(new Hawk(12, 12));
        w.addAnimal(new Chrysalis(1, 1));
        w.addAnimal(new Caterpillar(20, 20));
        w.addAnimal(new Butterfly(15, 15));
        w.addAnimal(new Butterfly(17, 17));
		while (!action.equals("quit") && !w.isOverpopulated()) {
			System.out.print(w);
			w.tick();
			action = input.nextLine();
		}
		if ( w.isOverpopulated() )
			System.out.println("Ecosystem is overpopulated!");
		System.out.println(w);
	}
}
