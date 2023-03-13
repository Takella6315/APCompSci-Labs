/**
 * Uses UserProfile Part1 and Part2 to test the passwords and see if they are strong or weak. 
 * @author Teja AKella
 * 
 */
package Unit10.Unit10Lab;

import Unit10.Unit10Lab.UserProfile_Part2.WeakPasswordRuntimeException;

public class UserProfileTest {
    public static void main(String[] args) {
        UserProfile_Part1 user1 = new UserProfile_Part1("John", "Doe", "password#12873UUU");
        UserProfile_Part2 user2 = new UserProfile_Part2("hi", "hi", "password#1626HH");
        
        // Part 1: Checked exception
        try {
            user1.setPassword("weak");
            System.out.println("New password: " + user1.getPassword());
        } catch (WeakPasswordException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        try {
            user1.setPassword("Password101#");
            System.out.println("New password: " + user2.getPassword());
        } catch (WeakPasswordException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        // Part 2: Runtime exception
        try {
            user2.setPassword("weak");
            System.out.println("New password: " + user1.getPassword());
        } catch (WeakPasswordRuntimeException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        try {
            user2.setPassword("Password101#");
            System.out.println("New password: " + user2.getPassword());
        } catch (WeakPasswordRuntimeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

