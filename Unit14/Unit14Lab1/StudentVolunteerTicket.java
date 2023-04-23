/**
 * This class inherits the ticket class and has a discount for student volunteers
 * @author Teja Akella
 * 
 */
package Unit14.Unit14Lab1;

public class StudentVolunteerTicket extends StudentAdvanceTicket {
    private int volunteerHours;

    public StudentVolunteerTicket(double price, String concertDate, String performerName, String venueName, int numDaysBefore, int hoursVolunteered) {
        super(price, concertDate, performerName, venueName, numDaysBefore);
        volunteerHours = hoursVolunteered;

    }

    
    public double getPrice() {
        double basePrice = super.getPrice();
        double studentPrice = basePrice / 2.0;

        if (volunteerHours >= 10) {
            return studentPrice / 2.0;
        } else {
            return studentPrice;
        }
    }



    
    public String toString() {
        
        return concertDate + " " + performerName + " " + venueName + " \n(" + numDaysBefore + " days in advance)" + " serial number: " + serialNumber + " price: " + getPrice() + " \"student ID required\"" + " volunteered " + volunteerHours + " hours";
    }

    
}

