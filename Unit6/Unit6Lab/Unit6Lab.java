/**
 * Unit6Lab.java
 * This program allows the user to select a shape and then enter the dimensions and features of that shape. Then this shape, with
 * the features the user entered will be printed out and the user can go through this process again
 * @author Teja Akella
 */
package Unit6.Unit6Lab;

import java.util.Scanner;

public class Unit6Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome! This program will draw a geometry figure of your choice.");

        while (true) {
            System.out.println("Make your choice from the following:");
            System.out.println("1 a square");
            System.out.println("2 a rectangle");
            System.out.println("3 a triangle");
            System.out.println("4 a circle");
            System.out.println("-1 to quit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == -1) {
                System.out.println("Thank you and have a great day!");
                break;
            } else if (choice == 1) {
                System.out.println("Please enter the side length of your square:");
                int side = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Do you want the square to be filled? (y/n)");
                boolean filled = scanner.nextLine().equalsIgnoreCase("y");

                System.out.println("What character do you want to use for drawing?");
                char character = scanner.nextLine().charAt(0);

                drawSquare(side, filled, character);
            } else if (choice == 2) {
                System.out.println("Please enter the width of your rectangle:");
                int width = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Please enter the height of your rectangle:");
                int height = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Do you want the rectangle to be filled? (y/n)");
                boolean filled = scanner.nextLine().equalsIgnoreCase("y");

                System.out.println("What character do you want to use for drawing?");
                char character = scanner.nextLine().charAt(0);

                drawRectangle(width, height, filled, character);
            } else if (choice == 3) {
                System.out.println("Please enter the height of your triangle:");
                int height = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Do you want the triangle to point up? (y/n)");
                boolean pointUp = scanner.nextLine().equalsIgnoreCase("y");

                System.out.println("Do you want the triangle to be filled? (y/n)");
                boolean filled = scanner.nextLine().equalsIgnoreCase("y");

                System.out.println("What character do you want to use for drawing?");
                char character = scanner.nextLine().charAt(0);

                drawTriangle(height, pointUp, filled, character);
            } else if (choice == 4) {
                // Optional challenge: draw a circle
                System.out.println("Sorry, drawing a circle is not implemented yet.");
            } else {
                System.out.println("Unrecognized choice. Please try again.");
            }
        }
        scanner.close(); 
    }

    public static void drawSquare(int side, boolean filled, char character) {
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                if (filled || i == 0 || i == side - 1 || j == 0 || j == side - 1) {
                    System.out.print(character);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void drawRectangle(int width, int height, boolean filled, char character) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (filled || i == 0 || i == height - 1 || j == 0 || j == width - 1) {
                    System.out.print(character);
                } else {

                    System.out.print(" ");

                }
            }
            System.out.println();
        }
    }


    public static void drawTriangle(int height, boolean pointUp, boolean filled, char character){
    if (pointUp) {
        // Triangle pointing up
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < height - row - 1; col++) {
                System.out.print(" ");
            }
            for (int col = 0; col < 2 * row + 1; col++) {
                if (filled || col == 0 || col == 2 * row) {
                    System.out.print(character);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    } else {
        // Triangle pointing down
        for (int row = height - 1; row >= 0; row--) {
            for (int col = 0; col < height - row - 1; col++) {
                System.out.print(" ");
            }
            for (int col = 0; col < 2 * row + 1; col++) {
                if (filled || col == 0 || col == 2 * row) {
                    System.out.print(character);
                } else {
                    System.out.print(" ");
                }
            }
        System.out.println();   
        
    }
}
}
}

