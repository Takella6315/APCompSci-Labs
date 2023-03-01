/**
 * UserProfileTester.java
 * This file allows the user to input all the required information about the user profiles. 
 * @author Teja Akella
 * 
 */
package Unit4.Unit4Lab;

public class UserProfileTester {
    public static void main(String[] args) {
        UserProfile user1 = new UserProfile("John", "Doe", "johndoe@gmail.com", 1990, "1234567890");
        System.out.println(user1.getAttributes());

        UserProfile user2 = new UserProfile("Jane", "Doe", "janedoe@gmail.com");
        user2.setYearOfBirth(1995);
        user2.setPhoneNumber("0987654321");
        System.out.println(user2.getAttributes());

       
        System.out.println(user1.getAttributes());

        
    }
}
