/**
 * This program uses the concertHall object and its methods and it allows the user to reserve seats at a concert, display the seating chart and more.
 * 
 * 
 * @author Teja Akella
 */
package Unit12.Unit12Lab1;

import java.util.Scanner;

public class TesterProgram {

    public static void main(String[] args) {
        Unit12Lab1 concertHall = new Unit12Lab1();
        Scanner input = new Scanner(System.in);
        String command = "";
        System.out.println("Welcome to the concert concertHall reservation system");
        concertHall.display();
        while (!command.equals("quit")) {
            System.out.println("Enter command (reserve, cancel, display, total, quit):");
            command = input.nextLine();
            String[] tokens = command.split(" ");
            if (tokens[0].equals("reserve")) {
                int row = Integer.parseInt(tokens[1]);
                int seat = Integer.parseInt(tokens[2]);
                if (concertHall.reserve(row, seat)) {
                    System.out.println("Seat reserved successfully!");
                } else {
                    System.out.println("Failed to reserve seat. Please try again.");
                }
            } else if (tokens[0].equals("cancel")) {
                int row = Integer.parseInt(tokens[1]);
                int seat = Integer.parseInt(tokens[2]);
                if (concertHall.cancel(row, seat)) {
                    System.out.println("Seat canceled successfully!");
                } else {
                    System.out.println("Failed to cancel seat. Please try again.");
                }
            } else if (tokens[0].equals("display")) {
                concertHall.display();
            } else if (tokens[0].equals("total")) {
                double revenue = concertHall.calculateCost();
                System.out.println("There are " + concertHall.getPremiumReservedSeats() + " premium seats reserved");
                System.out.println("There are " + concertHall.getGeneralReservedSeats() + " general seats reserved");
                System.out.println("Total revenue: $" + revenue);
            }
        }
        input.close();
    }
}
