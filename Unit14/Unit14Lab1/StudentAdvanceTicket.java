package Unit14.Unit14Lab1;

public class StudentAdvanceTicket extends AdvanceTicket {
    private static final double STUDENT_DISCOUNT = 0.5;

    public StudentAdvanceTicket(double price, String concertDate, String performerName, String venueName, int numDaysBefore) {
        super((price * STUDENT_DISCOUNT), concertDate, performerName, venueName, numDaysBefore);

        System.out.println("Dec 12, 7:00 PM" + " " + performerName + " " + venueName + " \n(" + numDaysBefore + " days in advance)");

    }
    @Override
    public String toString() {
        return super.toString() + " \"student ID required\"";
    }
}

