/**
 * This is the interface for Playable which outlines these certain methods 
 * @author Teja Akella
 * 
 */
package Unit17.Unit17Assignment2;

/**
 * Interface Playable: represents an object that can be played, such as a music player or a TV remote.
 */
public interface Playable {
    /**
     * Changes the current playlist to the specified one.
     * @param playlistName the name of the playlist to change to.
     */
    void changePlaylist(String playlistName);

    /**
     * Starts playing the current playlist.
     */
    void play();

    /**
     * Stops playing the current playlist.
     */
    void stop();

    /**
     * Increases the volume.
     */
    void increaseVolume();

    /**
     * Decreases the volume.
     */
    void decreaseVolume();
}

