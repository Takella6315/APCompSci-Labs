/**
 * 
 * This program uses the seat class to add the reserved seats to the users shopping cart and calculate the price. 
 * @author Teja Akella
 */
package Unit13.Unit13Lab1;

import java.util.ArrayList;


public class ShoppingCart {
    private static ArrayList<Seat> seats;

    public ShoppingCart() {
        seats = new ArrayList<>();
    }

    public void add(int row, int seat, double price) {
        Seat newSeat = new Seat(row, seat);
        if (seats.contains(newSeat)) {
            System.out.println("This seat is already in your cart.");
        } else {
            seats.add(newSeat);
        }
    }

    public boolean remove(int row, int seat) {
        Seat targetSeat = new Seat(row, seat);
        if (seats.contains(targetSeat)) {
            seats.remove(targetSeat);
            return true;
        } else {
            System.out.println("This seat is not in your cart.");
        }
        return false;
        
    }

    public void clear() {
        seats.clear();
    }

    public void display() {
        double totalPrice = 0;
        for (Seat s : seats) {
            System.out.println("Row " + s.getRow() + " Seat: " + s.getSeat() + " $" + s.getPrice());
            totalPrice += s.getPrice();
        }
        System.out.println("Total: $" + totalPrice);
    }
}
