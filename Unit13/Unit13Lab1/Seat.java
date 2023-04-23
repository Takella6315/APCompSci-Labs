/**
 * 
 * This class, seat, has all of the seats characteristics and returns the row, seat, and price.
 * @author Teja Akella
 */
package Unit13.Unit13Lab1;

public class Seat {
    private int row;
    private int seat;
    private double price;

    public Seat(int row, int seat) {
        this.row = row;
        this.seat = seat;
        if (row >= 2 && row <= 6 && seat >= 3 && seat <= 23) {
            price = 14.5;
        } else {
            price = 10.0;
        }
    }

    public int getRow() {
        return row;
    }

    public int getSeat() {
        return seat;
    }

    public double getPrice() {
        return price;
    }
}
