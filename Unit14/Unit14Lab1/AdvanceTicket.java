package Unit14.Unit14Lab1;

public class AdvanceTicket extends Ticket {
    private static final double DISCOUNT = 0.1;
    private int numDaysBefore;


    public AdvanceTicket(double price, String concertDate, String performerName, String venueName, int numDaysBefore) {
        super(calculatePrice(price, numDaysBefore), concertDate, performerName, venueName);
        //System.out.println("Dec 12, 7:00 PM" + " " + performerName + " " + venueName + " \n(" + numDaysBefore + " days in advance)" + " serial number: ");

    }

    private static double calculatePrice(double price, int daysBefore) {
        if (daysBefore >= 10) {
            return price * (1 - DISCOUNT);
        } else {
            
            return price;
        }
    }

    @Override
    public String toString(){

        return "Dec 12, 7:00 PM" + " " + performerName + " " + venueName + " \n(" + numDaysBefore + " days in advance)" + " serial number: " + serialNumber + " price: " + calculatePrice(price, numDaysBefore);

    }
}

