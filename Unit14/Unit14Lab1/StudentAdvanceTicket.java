/**
 * This class inherits the ticket class and has a discount for students that buy in advance
 * @author Teja Akella
 * 
 */
package Unit14.Unit14Lab1;

public class StudentAdvanceTicket extends AdvanceTicket {
    private static final double STUDENT_DISCOUNT = 0.5;
    private static double newPrice;


    public StudentAdvanceTicket(double price, String concertDate, String performerName, String venueName, int numDaysBefore) {
        super((price * STUDENT_DISCOUNT), concertDate, performerName, venueName, numDaysBefore);
        newPrice = price *  STUDENT_DISCOUNT;


    }
    @Override
    public String toString() {
        return concertDate + " " + performerName + " " + venueName + " \n(" + numDaysBefore + " days in advance)" + " serial number: " + serialNumber + " price: " + (newPrice) + " \"student ID required\"";
    }
}

