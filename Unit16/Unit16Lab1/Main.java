/**
 * This program physically allows the user to input whatever they want and then the map gets filled in. 
 * 
 * @author Teja Akella
 */
package Unit16.Unit16Lab1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        AsciiMap map = new AsciiMap();
        
        // Print the original map
        System.out.println(map.toString());
        
        // Ask the user for the coordinates to flood fill and the character to use
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the row to flood fill: ");
        int row = scanner.nextInt();
        System.out.print("Enter the column to flood fill: ");
        int column = scanner.nextInt();
        scanner.nextLine(); // consume the newline character
        System.out.print("Enter the character to use for the flood fill: ");
        char ch = scanner.nextLine().charAt(0);
        
        // Call the flood fill method
        map.floodFill(row, column, ch);
        
        // Print the updated map
        System.out.println(map.toString());
        
        scanner.close();
    }

}

