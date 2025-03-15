/**
 * This program allows the user to input row and column and then the map gets filled in
 * 
 * @author Teja Akella
 */
package Unit16.Unit16Lab1;
/* JHU CTY AP CS A: Starter class for Unit 16 flood fill problem */
public class AsciiMap
{
    /**
     * ASCII drawing of the map of US with state boundaries
     */
    private static String[] asciiMap = {
        "   ",
        "   ",
        "         ,__                                                  _,   ",
        "      \\~\\|  ~~---___              ,                          | \\   ",
        "       |      / |   ~~~~~~~|~~~~~| ~~---,                  _/,  >   ",
        "      /~-_--__| |          |     \\     / ~\\~~/          /~| ||,'   ",
        "      |       /  \\         |------|   {    / /~)     __-  ',|_\\,   ",
        "     /       |    |~~~~~~~~|      \\    \\   | | '~\\  |_____,|~,-'   ",
        "     |~~--__ |    |        |____  |~~~~~|--| |__ /_-'     {,~   ",
        "     |   |  ~~~|~~|        |    ~~\\     /  `-' |`~ |~_____{/   ",
        "     |   |     |  '---------,      \\----|   |  |  ,' ~/~\\,|`   ",
        "     ',  \\     |    |       |~~~~~~~|    \\  | ,'~~\\  /    |   ",
        "      |   \\    |    |       |       |     \\_-~    /`~___--\\   ",
        "      ',   \\  ,-----|-------+-------'_____/__----~~/      /   ",
        "       '_   '\\|     |      |~~~|     |    |      _/-,~~-,/   ",
        "         \\    |     |      |   |_    |    /~~|~~\\    \\,/   ",
        "          ~~~-'     |      |     `~~~\\___|   |   |    /   ",
        "              '-,_  | _____|          |  /   | ,-'---~\\   ",
        "                  `~'~  \\             |  `--,~~~~-~~,  \\   ",
        "                         \\/~\\      /~~~`---`         |  \\   ",
        "                             \\    /                   \\  |   ",
        "                              \\  |                     '\\'   ",
        "                               `~'   ",
        "   ",
        "   ",};
    /**
     * character array representing the map
     */
    private char[][] map;
    
    /**
     * AsciiMap constructor. Creates map array of characters representing image being drawn
     * using static asciiMap.
     */
    public AsciiMap()
    {
        map = new char[asciiMap.length][80];
        for (int r = 0; r < map.length; r++) {
            for (int c = 0; c < map[r].length; c++) {
                if (c < asciiMap[r].length())
                    map[r][c] = asciiMap[r].charAt(c);
                else
                    map[r][c] = ' ';
            }
            
        }
    }
            
    
    /**
     * Returns the width of the image. 
     */
    public int getWidth() {
        return map[0].length;
    }
    
    /**
     * Returns the height of the image. 
     */
    public int getHeight() {
        return map.length;
    }
    
    /**
     * Returns the character at the given coordinate. 
     * 
     * @param row  row coordinate of the cell  
     * @param column  column coordinate of the cell
     */    
    public char charAt(int row, int column) {
        return map[row][column];
    }

    /**
     * Implements the flood fill algorithm.
     * 
     * @param row  row coordinate of the starting cell  
     * @param column  column coordinate of the starting cell
     * @param ch  character to be used when flooding the array  
     */
    public void floodFill(int row, int column, char ch) {
        if (row < 0 || row >= getHeight() || column < 0 || column >= getWidth()) {
            // Base case: the current cell is out of bounds
            return;
        }
        
        if (map[row][column] != ' ') {
            // Base case: the current cell is already filled
            return;
        }
        
        // Replace the character at the current cell with the new character
        map[row][column] = ch;
        
        // Recursively fill the neighboring cells
        floodFill(row - 1, column, ch);
        floodFill(row + 1, column, ch);
        floodFill(row, column - 1, ch);
        floodFill(row, column + 1, ch);
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (int r = 0; r < map.length; r++) {
            for (int c = 0; c < map[r].length; c++) {
                sb.append(map[r][c]);
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
