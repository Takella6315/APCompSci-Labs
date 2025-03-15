/**
 * This is the triangle class that implements the drawable interface
 * @author Teja Akella
 */
package Unit17.Unit17Assigment1;

public class Triangle implements Drawable {

    @Override
    public String getName() {
        return "Triangle";
    }

    @Override
    public void draw() {
        System.out.println("*\n**\n***\n****\n*****");
    }
    
    
}
