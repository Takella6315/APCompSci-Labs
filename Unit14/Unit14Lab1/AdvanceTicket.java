/**
 * This class inherits the ticket class and has a discount if the ticket it bought a certain numbers of days before the concert.
 * @author Teja Akella
 * 
 */
package Unit14.Unit14Lab1;

public class AdvanceTicket extends Ticket {
    private static final double DISCOUNT = 0.1;
    protected static int numDaysBefore;
    private static double newPrice;


    public AdvanceTicket(double price, String concertDate, String performerName, String venueName, int _numDaysBefore) {
        super(calculatePrice(price), concertDate, performerName, venueName);
        numDaysBefore = _numDaysBefore;
        


    }

    private static double calculatePrice(double price) {
        if (numDaysBefore >= 10) {
            newPrice = price * (1 - DISCOUNT);
            return price * (1 - DISCOUNT);
        } else {
            newPrice = price;
            return price;
        }
    }

    @Override
    public String toString(){

        return concertDate + " " + performerName + " " + venueName + " \n(" + numDaysBefore + " days in advance)" + " serial number: " + serialNumber + " price: " + newPrice;

    }
}

