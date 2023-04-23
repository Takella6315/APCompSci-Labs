/**
 * This is the base ticket class which has all of the main attributes of a ticket - Serial number, price, preformerName, venueName, and data
 * @author Teja Akella
 * 
 */
package Unit14.Unit14Lab1;

public class Ticket {
    private static int nextSerialNumber = 0;
    protected int serialNumber;
    protected double price;
    protected String performerName;
    protected String venueName;
    protected String concertDate;

    public Ticket(double price, String concertDate, String performerName, String venueName) {
        this.serialNumber = nextSerialNumber;
        nextSerialNumber++;
        this.price = 50;
        this.concertDate = concertDate;
        this.performerName = performerName;
        this.venueName = venueName;
    }

    public double getPrice() {
        return price;
    }
    
    public String getConcertDate() {
        return concertDate;
    }      

    public String getPerformerName() {
        return performerName;
    }

    public String getVenueName() {
        return venueName;
    }

    public String toString() {
        return serialNumber + ", Price: " + getPrice();
    }
}

