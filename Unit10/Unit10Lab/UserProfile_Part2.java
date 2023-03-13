package Unit10.Unit10Lab;

public class UserProfile_Part2 {
    private String firstName;
    private String lastName;
    private String password;

    public UserProfile_Part2(String firstName, String lastName, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        setPassword(password);
    }

    public void setPassword(String newPassword) {
        if (checkPassword(newPassword)) {
            this.password = newPassword;
        } else {
            throw new WeakPasswordRuntimeException("Password must be at least 8 characters long, not contain first or last name, contain at least one character from the set of !@#$%^&*, and contain at least one digit.");
        }
    }

    public String getPassword() {
        return this.password;
    }

    public boolean checkPassword(String password) {
        // check password against security criteria
        if (password.length() < 8) {
            return false;
        }
        if (password.contains(firstName) || password.contains(lastName)) {
            return false;
        }
        if (!password.matches(".*[!@#$%^&*].*")) {
            return false;
        }
        if (!password.matches(".*\\d.*")) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        UserProfile_Part2 user1 = new UserProfile_Part2("John", "Doe", "password123!");
        System.out.println(user1.getPassword());

        try {
            UserProfile_Part2 user2 = new UserProfile_Part2("Jane", "Doe", "weak");
        } catch (WeakPasswordRuntimeException e) {
            System.out.println("Failed to create user: " + e.getMessage());
        }
    }
}

class WeakPasswordRuntimeException extends RuntimeException {
    public WeakPasswordRuntimeException(String message) {
        super(message);
    }
}
