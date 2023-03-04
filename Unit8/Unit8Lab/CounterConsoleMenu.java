/**
 * This class prints out the menu so that the user can interact with it. It also manages user input
 * @author Teja Akella
 * 
 */
package Unit8.Unit8Lab;

import java.util.Scanner;

public class CounterConsoleMenu {
    private Counter counter;
    private Scanner scanner;

    public CounterConsoleMenu() {
        counter = new Counter();
        scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        System.out.println("Available options: Increment - 0, Decrement - 1, Reset - 2, Quit - 3");
    }

    public void displayCount() {
        System.out.println("Counter value: " + counter.getCount());
    }

    public void inputManagement(int input) {
        switch (input) {
            case 0:
                counter.increment();
                break;
            case 1:
                counter.decrement();
                break;
            case 2:
                counter.reset();
                break;
            case 3:
                System.out.println("Thank you!");
                System.exit(0);
            default:
                System.out.println("Invalid input. Please try again.");
        }
    }

    public int getInput() {
        System.out.print("Enter your choice: ");
        return scanner.nextInt();
    }
}

