/**
 * UserProfile.java
 * This program declares the variables and sets them based on what the user inputs. It uses constructors, getters, setters, and methods to accomplish this.
 * @author Teja Akella
 */
package Unit4.Unit4Lab;

import java.util.Random;
public class UserProfile {
    
    private String firstName;
    private String lastName;
    private String email;
    private int yearOfBirth;
    private String password;
    private String phoneNumber;


    
    public UserProfile(String _firstName, String _lastName, String _email, int _yearOfBirth, String _phoneNumber) {
        firstName = _firstName;
        lastName = _lastName;
        email = _email;
        yearOfBirth = _yearOfBirth;
        phoneNumber = _phoneNumber;
        generatePassword();
    }

    public UserProfile(String firstName, String lastName, String email) {
        this(firstName, lastName, email, 0, "");
    }

    // Getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Function to generate password
    private void generatePassword() {
        Random random = new Random();
        int randomNumber = random.nextInt(9999 - 1000 + 1) + 1000;
        password = "!" + firstName + randomNumber + lastName + random.nextInt(99999 - 10000 + 1);
    }

    // Function to regenerate password with prefix and suffix
    public void regeneratePassword(String prefix, String suffix) {
        Random random = new Random();
        int randomNumber = random.nextInt(9999 - 1000 + 1) + 1000;
        password = "!" + prefix + randomNumber + suffix + random.nextInt(99999 - 10000 + 1);
    }

    // Function to get all user attributes
    public String getAttributes() {
        return "First Name: " + firstName + "\nLast Name: " + lastName + "\nEmail: " + email + "\nYear of Birth: " + yearOfBirth + "\nPhone Number: " + phoneNumber + "\nPassword: " + password;
    }
}



