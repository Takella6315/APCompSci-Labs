/**
 * This class has all of the data about the user and then sets and gets them. 
 * There is also a method for checking if the password is long enough and if it has a special character in it
 * 
 * @author Teja Akella
 * 
 */
public class UserProfile {
    private String firstName;
    private String lastName;
    private String email;
    private String street;
    private String city;
    private String state;
    private String zipCode;
    
    public UserProfile(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
    
    public void setStreet(String street) {
        this.street = street;
    }
    
    public String getStreet() {
        return street;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
    
    public String getCity() {
        return city;
    }
    
    public void setState(String state) {
        this.state = state;
    }
    
    public String getState() {
        return state;
    }
    
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
    
    public String getZipCode() {
        return zipCode;
    }
    
    public boolean checkPassword(String password) {
        if (password.length() < 8) {
            return false;
        }
        if (password.toLowerCase().contains(firstName.toLowerCase())) {
            return false;
        }
        if (password.toLowerCase().contains(lastName.toLowerCase())) {
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
