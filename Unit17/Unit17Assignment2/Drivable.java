/**
 * This is the interface for Drivable which outlines these certain methods 
 * @author Teja Akella
 * 
 */
package Unit17.Unit17Assignment2;

/**
 * Interface Drivable: represents an object that can be driven, such as a vehicle or a robot.
 */
public interface Drivable {
    /**
     * Starts the engine.
     */
    void startEngine();

    /**
     * Stops the engine.
     */
    void stopEngine();

    /**
     * Accelerates.
     */
    void accelerate();

    /**
     * Decelerates.
     */
    void decelerate();

    /**
     * Changes the direction.
     * @param direction the new direction to go towards.
     */
    void changeDirection(String direction);
}

