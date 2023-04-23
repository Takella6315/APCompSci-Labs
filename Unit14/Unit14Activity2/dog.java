/**
 * This is the bunny class which inherits the pet class and it has the same characteristics as well as the make sound method
 * @author Teja Akella
 * 
 */
package Unit14.Unit14Activity2;

class dog extends pets {
    public dog(String name, double weight, int age) {
        super(name, weight, age);
    }

    
    public String makeSound() {
        return "bowwow";
    }
}
