/**
 * Song class that holds the title, author, and lyrics of a song in verse-chorus form.
 * @author Teja Akella
 * 
 */
package Unit3.Unit3Lab;
public class Song {
    private static String title;
    private static String author;
    private static String verse1;
    private static String chorus;
    private static String verse2;
  
    /**
     * Set the title of the song.
     * @param songTitle the title of the song
     */
    public static void setTitle(String songTitle) {
      title = songTitle;
    }
  
    /**
     * Set the author of the song.
     * @param songAuthor the author of the song
     */
    public static void setAuthor(String songAuthor) {
      author = songAuthor;
    }
  
    /**
     * Set the first verse of the song.
     * @param firstVerse the first verse of the song
     */
    public static void setVerse1(String firstVerse) {
      verse1 = firstVerse;
    }
  
    /**
     * Set the chorus of the song.
     * @param songChorus the chorus of the song
     */
    public static void setChorus(String songChorus) {
      chorus = songChorus;
    }
  
    /**
     * Set the second verse of the song.
     * @param secondVerse the second verse of the song
     */
    public static void setVerse2(String secondVerse) {
      verse2 = secondVerse;
    }
  
    /**
     * Print the title of the song.
     */
    public static void printTitle() {
      System.out.println("Title: " + title);
    }
  
    /**
     * Print the author of the song.
     */
    public static void printAuthor() {
      System.out.println("Author: " + author);
    }
  
    /**
     * Print the lyrics of the song in verse-chorus form.
     */
    public static void printLyrics() {
      System.out.println("Verse 1: " + verse1);
      System.out.println("Chorus: " + chorus);
      System.out.println("Verse 2: " + verse2);
      System.out.println("Chorus: " + chorus);

      
    }
  }
  