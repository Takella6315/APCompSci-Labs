/**
 * Checks password to see if they are weak using a weakPasswordException
 * @author Teja AKella
 * 
 */
package Unit10.Unit10Lab;

public class UserProfile_Part1 {
    private String firstName;
    private String lastName;
    private String password;

    public UserProfile_Part1(String firstName, String lastName, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        try {
            setPassword(password);
        } catch (WeakPasswordException e) {
            System.out.println("Failed to set password: " + e.getMessage());
        }
    }

    public void setPassword(String newPassword) throws WeakPasswordException {
        if (checkPassword(newPassword)) {
            this.password = newPassword;
        } else {
            throw new WeakPasswordException("Password must be at least 8 characters long, not contain first or last name, contain at least one character from the set of !@#$%^&*, and contain at least one digit.");
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
}

class WeakPasswordException extends Exception {
    public WeakPasswordException(String message) {
        super(message);
    }
}

