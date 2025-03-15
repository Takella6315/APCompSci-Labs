/**
 * This is the Square class that implements the drawable interface
 * @author Teja Akella
 */
package Unit17.Unit17Assigment1;

public class Square implements Drawable {

    @Override
    public String getName() {
        return "Square";
    }

    @Override
    public void draw() {
        System.out.println("****\n****\n****\n****");
    }
    
    
}
