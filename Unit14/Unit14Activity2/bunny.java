/**
 * This is the bunny class which inherits the pet class and it has the same characteristics as well as the make sound method
 * @author Teja Akella
 * 
 */
package Unit14.Unit14Activity2;

class bunny extends pets {
    public bunny(String name, double weight, int age) {
        super(name, weight, age);
    }
    
    @Override
    public String makeSound() {
        return "squeak";
    }
}