/**
 * 
 * This tester class uses the seat, shopping cart, and concert hall classes to allow the user to book tickets and purchase them. 
 * @author Teja Akella
 */
package Unit13.Unit13Lab1;
import java.util.Scanner;

import Unit12.Unit12Lab1.Unit12Lab1;

public class ShopTester {
    private static double price;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Unit12Lab1 concertHall = new Unit12Lab1();
        ShoppingCart shoppingCart = new ShoppingCart();
        
        System.out.println("Welcome to the concert hall ticketing system");
        System.out.println("Here is the map of the venue:");
        concertHall.display();
        
        String action;
        do{
            
            System.out.print("Enter Shopping Cart operation (reserve, cancel, clear, total, display, purchase, quit): ");
            action = input.nextLine().toLowerCase();
            
            switch (action) {
                case "reserve":
                    System.out.print("Enter row and seat number separated by space: ");
                    int row = input.nextInt();
                    int seat = input.nextInt();
                    input.nextLine(); // consume newline character
                    
                    if (concertHall.reserve(row, seat)) {
                        if(row >= 2 && row <= 6 && seat >= 3 && seat <= 23){
                            price += 14.50;
                            

                        } else {

                            price += 10.0;

                        }
                        
                        shoppingCart.add(row, seat, price);
                        System.out.println("Seat reserved.");
                    } else {
                        System.out.println("Seat is not available for reservation.");
                    }
                    break;
                    
                case "cancel":
                    System.out.print("Enter row and seat number separated by space: ");
                    row = input.nextInt();
                    seat = input.nextInt();
                    input.nextLine(); // consume newline character
                    
                    if (shoppingCart.remove(row, seat)) {
                        concertHall.cancel(row, seat);
                        System.out.println("Seat reservation canceled.");
                    } else {
                        System.out.println("Seat is not in your cart.");
                    }
                    break;
                    
                case "clear":
                    shoppingCart.clear();
                    System.out.println("Shopping cart cleared.");
                    break;
                    
                case "total":
                    shoppingCart.display();
                    break;

                case "display":
                    concertHall.display();
                    
                case "purchase":
                    System.out.println("Congratulations, you are buying the following tickets: ");
                    shoppingCart.display();
                    shoppingCart.clear();
                    break;
                    
                case "quit":
                    System.out.println("Goodbye!");
                    break;
                    
                default:
                    System.out.println("Invalid action. Try again.");
            }
        } while (!action.equals("purchase") || !action.equals("quit")); 
            input.close();
    }
}
    


        
    
        

