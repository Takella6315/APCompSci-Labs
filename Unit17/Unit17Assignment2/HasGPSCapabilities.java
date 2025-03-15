/**
 * This is the interface for HasGPACapabilities which outlines these certain methods 
 * @author Teja Akella
 * 
 */
package Unit17.Unit17Assignment2;

/**
 * Interface HasGPSCapabilities: represents an object that has GPS capabilities, such as a vehicle or a smartphone.
 */
public interface HasGPSCapabilities {
    /**
     * Retrieves the current location.
     * @return the current location as a string.
     */
    String getLocation();

    /**
     * Calculates the distance between two locations.
     * @param locationA the first location.
     * @param locationB the second location.
     * @return the distance between the two locations in kilometers.
     */
    double calculateDistance(String locationA, String locationB);
}

