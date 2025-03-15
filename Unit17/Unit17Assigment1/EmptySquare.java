/**
 * This is the Empty Square class that implements the drawable interface
 * @author Teja Akella
 */
package Unit17.Unit17Assigment1;

public class EmptySquare implements Drawable {

    @Override
    public String getName() {
        return "Empty square";
    }

    @Override
    public void draw() {
        System.out.println("*****\n*   *\n*   *\n*   *\n*****");
    }
    
    
}
