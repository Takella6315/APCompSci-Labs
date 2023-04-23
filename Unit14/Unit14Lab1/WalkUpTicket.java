package Unit14.Unit14Lab1;

public class WalkUpTicket extends Ticket {
    private static final double premium = 10.0;
    private int numDaysBefore;

    public WalkUpTicket(double price, String concertDate, String performerName, String venueName, int _numDaysBefore) {
        super((price + premium), performerName, venueName, venueName);
        this.numDaysBefore = _numDaysBefore;
    }
    @Override
    public String toString(){

        return "Dec 12, 7:00 PM" + " " + performerName + " " + venueName + " \n(" + numDaysBefore + " days in advance)" + " serial number: " + serialNumber + " price: " + price;

    }
}

