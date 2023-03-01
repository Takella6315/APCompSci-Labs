/**
 * This program uses the UserProfile file and asks the user to input their data. 
 * After that they are asked to enter their password until it meets the requirements
 * @author Teja Akella
 */
import java.util.Scanner;

public class UserTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("First Name: ");
        String firstName = scanner.nextLine();
        
        System.out.print("Last Name: ");
        String lastName = scanner.nextLine();
        
        System.out.print("Email: ");
        String email = scanner.nextLine();
        
        UserProfile userProfile = new UserProfile(firstName, lastName, email);
        
        System.out.println("User created!");
        
        while (true) {
            System.out.print("Please enter a new password: ");
            String password = scanner.nextLine();
            
            if (userProfile.checkPassword(password)) {
                System.out.println("Your password has been changed.");
                break;
            } else {
                System.out.println("Your password does not meet security criteria, please try again.");
            }
        }
        
        System.out.println("Thank you!");
        scanner.close();
    }
}

