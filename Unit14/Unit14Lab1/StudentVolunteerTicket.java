package Unit14.Unit14Lab1;

public class StudentVolunteerTicket extends StudentAdvanceTicket {
    private int volunteerHours;

    public StudentVolunteerTicket(double price, String concertDate, String performerName, String venueName, int numDaysBefore, int hoursVolunteered) {
        super(price, concertDate, performerName, venueName, numDaysBefore);
        volunteerHours = hoursVolunteered;
        System.out.println("Dec 12, 7:00 PM" + " " + performerName + " " + venueName + " \n(" + numDaysBefore + " days in advance)");

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
        String str = super.toString();
        return str + " volunteered " + volunteerHours + " hours";
    }

    
}

