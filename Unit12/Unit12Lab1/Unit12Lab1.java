/**
 * This class has all the methods that allows the users to reserve, cancel, and view the seating chart. 
 * 
 * @author Teja Akella
 */
package Unit12.Unit12Lab1;

import java.util.Arrays;
import java.util.Scanner;

public class Unit12Lab1 {
    private final int ROWS = 12;
    private final int SEATS_PER_ROW = 25;
    private final double PREMIUM_PRICE = 14.5;
    private final double GENERAL_PRICE = 10.0;
    private final char EMPTY_SEAT_CHAR = '.';
    private final char EMPTY_PREMIUM_SEAT_CHAR = '*';
    private final char RESERVED_SEAT_CHAR = 'R';
    private final char RESERVED_PREMIUM_SEAT_CHAR = 'P';
    
    private double totalCost;

    private char[][] seats;
    private int numGeneralReserved;
    private int numPremiumReserved;

    public Unit12Lab1() {
        seats = new char[ROWS][SEATS_PER_ROW];
        for (int i = 0; i < ROWS; i++) {
            Arrays.fill(seats[i], EMPTY_SEAT_CHAR);
        }
        numGeneralReserved = 0;
        numPremiumReserved = 0;
    }

    public void display() {
        System.out.println("     Seating Chart");
        System.out.println("...........................");
        for (int i = 0; i < ROWS; i++) {
            System.out.print("..");
            for (int j = 0; j < SEATS_PER_ROW; j++) {
                char seatChar = seats[i][j];
                if (seatChar == EMPTY_SEAT_CHAR) {
                    if (i >= 1 && i <= 5 && j >= 2 && j <= 22) {
                        seatChar = EMPTY_PREMIUM_SEAT_CHAR;
                    }
                }
                System.out.print(seatChar);
            }
            System.out.println("..");
        }
        System.out.println("...........................");
        System.out.println("Legend: .=empty seat, *=empty premium seat, R=reserved seat, P=reserved premium seat");
    }

    public boolean reserve(int row, int seat) {
        if (row < 1 || row > ROWS || seat < 1 || seat > SEATS_PER_ROW) {
            System.out.println("Invalid row or seat number.");
        } else if (seats[row - 1][seat - 1] == RESERVED_SEAT_CHAR || seats[row - 1][seat - 1] == RESERVED_PREMIUM_SEAT_CHAR) {
            System.out.println("Seat already reserved.");
        } else {
            char seatChar = seats[row - 1][seat - 1];
            if (row >= 2 && row <= 6 && seat >= 3 && seat <= 23) {
                seats[row - 1][seat - 1] = RESERVED_PREMIUM_SEAT_CHAR;
                numPremiumReserved++;
                System.out.printf("Seat reserved. Price: $%.1f\n", PREMIUM_PRICE);
                totalCost += PREMIUM_PRICE;
            } else {
                seats[row - 1][seat - 1] = RESERVED_SEAT_CHAR;
                numGeneralReserved++;
                System.out.printf("Seat reserved. Price: $%.1f\n", GENERAL_PRICE);
                totalCost += GENERAL_PRICE;
            }
            //double price = (seatChar == EMPTY_SEAT_CHAR) ? GENERAL_PRICE : PREMIUM_PRICE;
            //System.out.printf("Seat reserved. Price: $%.1f\n", price);
        }
        return true;
    }

    public boolean cancel(int row, int seat) {
        if (row < 0 || row >= ROWS || seat < 0 || seat >= SEATS_PER_ROW) {
            
        }
        if (seats[row][seat] == RESERVED_SEAT_CHAR) {
            seats[row][seat] = EMPTY_SEAT_CHAR;
            totalCost -= GENERAL_PRICE;
            
        } else if (seats[row][seat] == RESERVED_PREMIUM_SEAT_CHAR) {
            seats[row][seat] = EMPTY_PREMIUM_SEAT_CHAR;
            totalCost -= PREMIUM_PRICE;
        }
        seats[row-1][seat-1] = EMPTY_SEAT_CHAR & EMPTY_PREMIUM_SEAT_CHAR;
        System.out.printf("Seat [%d,%d] has been canceled.%n", row, seat);

        return true;
        
    }

    public double getGeneralReservedSeats(){

        return numGeneralReserved;

    }

    public double getPremiumReservedSeats(){

        return numPremiumReserved;

    }

    public double calculateCost() {
        
        
        
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < SEATS_PER_ROW; j++) {
                if (seats[i][j] == RESERVED_SEAT_CHAR) {
                    if (seats[i][j] == RESERVED_PREMIUM_SEAT_CHAR) {
                        numPremiumReserved++;
                        totalCost += PREMIUM_PRICE;
                    } else {
                        numGeneralReserved++;
                        totalCost += GENERAL_PRICE;
                    }
                }
            }
        }
        
        System.out.printf("There are %d premium seats reserved\n", numPremiumReserved);
        System.out.printf("There are %d general seats reserved\n", numGeneralReserved);
        System.out.printf("Total cost: $%.2f\n", totalCost);
        
        return totalCost;

    }


    
}