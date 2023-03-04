/**
 * This program uses Object oriented programming to get the width and length and then set them both 
 * and print them using a unique character that the user enters.
 * @author Teja Akella
 */
package Unit8.Unit8Activity1;

import java.util.Scanner;

public class Rectangle {
    private int length;
    private int width;

    public Rectangle(int width, int length) {
        setWidth(width);
        setLength(length);
    }
    //sets width of the rectangle
    public void setWidth(int width) {
        if (width >= 1 && width <= 30) {
            this.width = width;
        } else {
            System.out.println("Invalid width value. Width must be between 1 and 30");
        }
    }
    //sets the length of the rectangle
    public void setLength(int length) {
        if (length >= 1 && length <= 30) {
            this.length = length;
        } else {
            System.out.println("Invalid length value. Length must be between 1 and 30");
        }
    }
    //returns width
    public int getWidth() {
        return width;
    }
    //returns length
    public int getLength() {
        return length;
    }
    //This method draws the rectangle using the symbol the users indicate
    public void drawRectangle(char symbol) {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
    //returns area
    public int getArea() {
        return length * width;
    }
    //returns perimeter
    public int getPerimeter() {
        return 2 * (length + width);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int width, length;
        char symbol;
        int choice;

        do {
            System.out.print("Enter rectangle's width and length separated by space: ");
            width = input.nextInt();
            length = input.nextInt();
            System.out.print("Enter character to draw the rectangle: ");
            symbol = input.next().charAt(0);

            Rectangle rectangle = new Rectangle(width, length);
            rectangle.drawRectangle(symbol);

            System.out.println("Rectangle Area = " + rectangle.getArea());
            System.out.println("Rectangle Perimeter = " + rectangle.getPerimeter());

            System.out.print("Would you like to draw another rectangle? (1-yes, 2-no) ");
            choice = input.nextInt();
        } while (choice != 2);

        System.out.println("Thank you!");
        input.close();

    }
}

