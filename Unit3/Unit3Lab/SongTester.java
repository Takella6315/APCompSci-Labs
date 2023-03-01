
/**
 * SongTester class utilizes the Song class to print the lyrics of a song. The user sets the Title, author, verse, and Chorus
 * @author Teja Akella
 * 
 */
package Unit3.Unit3Lab;

public class SongTester {
  
  

    public static void main(String[] args) {
      // Set the title, author, and lyrics of the song
      Song.setTitle("Roxanne");
      Song.setAuthor("The Police");
      Song.setVerse1("Roxanne, you don't have to put on the red light");
      Song.setChorus("Those days are over, you don't have to sell your body to the night");
      Song.setVerse2("Roxanne, you don't have to wear that dress tonight");
  
      // Print the title and author of the song
      Song.printTitle();
      Song.printAuthor();
      Song.printLyrics();

}
}
