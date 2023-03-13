package Unit10.Unit10Lab;

public class UserProfileTest {
    public static void main(String[] args) {
        UserProfile_Part1 user1 = new UserProfile_Part1("John", "Doe", "password");
        UserProfile_Part2 user2 = new UserProfile_Part2("John", "Doe", "password");
        
        // Part 1: Checked exception
        try {
            user1.setPassword("weak");
            System.out.println("New password: " + user1.getPassword());
        } catch (WeakPasswordException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        try {
            user1.setPassword("password1");
            System.out.println("New password: " + user1.getPassword());
        } catch (WeakPasswordException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        // Part 2: Runtime exception
        try {
            user2.setPassword("weak");
            System.out.println("New password: " + user2.getPassword());
        } catch (WeakPasswordRuntimeException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        try {
            user2.setPassword("password1");
            System.out.println("New password: " + user2.getPassword());
        } catch (WeakPasswordRuntimeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

