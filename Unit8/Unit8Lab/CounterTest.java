/**
 * 
 * This class uses the other two classes to display to menu and count and lets the user increment of decrement the number
 * @author Teja Akella
 */
package Unit8.Unit8Lab;

public class CounterTest {
    public static void main(String[] args) {
        CounterConsoleMenu menu = new CounterConsoleMenu();

        while (true) {
            menu.displayMenu();
            menu.displayCount();
            int input = menu.getInput();
            menu.inputManagement(input);
        }
    }
}

