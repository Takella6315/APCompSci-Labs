/**
 * This is the base pet class which has the main characteristics - name, weight, and age.
 * @author Teja Akella
 */
package Unit14.Unit14Activity2;

public class pets {
    private String name;
    private double weight;
    private int age;
    
    public pets(String name, double weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    
    public double getWeight() {
        return weight;
    }
    
    public int getAge() {
        return age;
    }
    
    public String makeSound() {
        return "generic pet sound";
    }
    
    
    public String toString() {
        return getName() + " " + getAge() + " years old " + getWeight() + " lbs";
    }
}
