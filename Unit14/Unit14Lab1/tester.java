/**
 * This class utilizes all of these classes and prints out all of the required ticket info
 * @author Teja Akella
 * 
 */
package Unit14.Unit14Lab1;

public class tester {
    public static void main(String[] args) {
        //Walkup Ticket
        System.out.println("WalkUp Tickets");
        WalkUpTicket walkUp = new WalkUpTicket(50, "Dec 12, 7:00 PM", "Youth Orchestra: Peter and the Wolf", "concert Hall", 0);
        System.out.println(walkUp);
        System.out.println();

        //Advance Ticket
        System.out.println("Advance Tickets");
        AdvanceTicket advance1 = new AdvanceTicket(50, "Dec 12, 7:00 PM", "Youth Orchestra: Peter and the Wolf", "concert Hall", 12);
        AdvanceTicket advance2 = new AdvanceTicket(50, "Dec 12, 7:00 PM", "Youth Orchestra: Peter and the Wolf", "concert Hall", 13);
        AdvanceTicket advance3 = new AdvanceTicket(50, "Dec 12, 7:00 PM", "Youth Orchestra: Peter and the Wolf", "concert Hall", 14);
        AdvanceTicket advance4 = new AdvanceTicket(50, "Dec 12, 7:00 PM", "Youth Orchestra: Peter and the Wolf", "concert Hall", 15);
        System.out.println(advance1);
        System.out.println(advance2);
        System.out.println(advance3);
        System.out.println(advance4);
        System.out.println();

        //Student Advance tickets
        System.out.println("Student Advance Tickets");
        StudentAdvanceTicket studentAdvance1 = new StudentAdvanceTicket(50, "Dec 12, 7:00 PM", "Youth Orchestra: Peter and the Wolf", "concert Hall", 12);
        StudentAdvanceTicket studentAdvance2 = new StudentAdvanceTicket(50, "Dec 12, 7:00 PM", "Youth Orchestra: Peter and the Wolf", "concert Hall", 13);
        StudentAdvanceTicket studentAdvance3 = new StudentAdvanceTicket(50, "Dec 12, 7:00 PM", "Youth Orchestra: Peter and the Wolf", "concert Hall", 10);
        StudentAdvanceTicket studentAdvance4 = new StudentAdvanceTicket(50, "Dec 12, 7:00 PM", "Youth Orchestra: Peter and the Wolf", "concert Hall", 15);
        System.out.println(studentAdvance1);
        System.out.println(studentAdvance2);
        System.out.println(studentAdvance3);
        System.out.println(studentAdvance4);
        System.out.println();
        
        //Student volunteer tickets
        System.out.println("Student Volunteer Tickets");
        StudentVolunteerTicket studentVolunteer1 = new StudentVolunteerTicket(50, "Dec 12, 7:00 PM", "Youth Orchestra: Peter and the Wolf", "concert Hall", 15, 5);
        StudentVolunteerTicket studentVolunteer2 = new StudentVolunteerTicket(50, "Dec 12, 7:00 PM", "Youth Orchestra: Peter and the Wolf", "concert Hall", 15, 13);
        System.out.println(studentVolunteer1);
        System.out.println(studentVolunteer2);
        System.out.println();
        // Calculate the total price of all tickets
        double totalPrice = walkUp.getPrice() + advance1.getPrice() + advance2.getPrice() + advance3.getPrice() 
                          + advance4.getPrice() + studentAdvance1.getPrice() + studentAdvance2.getPrice() 
                          + studentAdvance3.getPrice() + studentAdvance4.getPrice() + studentVolunteer1.getPrice()
                          + studentVolunteer2.getPrice();
    
        
        
        System.out.println("Total Price: $" + totalPrice);
        
    }
    
}
