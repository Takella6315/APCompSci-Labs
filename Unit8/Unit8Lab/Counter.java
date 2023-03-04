/**
 * This class actually hold the count in a loop and updates it when the user increments or decrements it
 * @author Teja Akella
 */
package Unit8.Unit8Lab;

public class Counter {
    private int count;

    public Counter() {
        count = 0;
    }

    public int getCount() {
        return count;
    }

    public void increment() {
        count++;
    }

    public void decrement() {
        count--;
    }

    public void reset() {
        count = 0;
    }
}

