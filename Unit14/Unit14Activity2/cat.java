/**
 * This is the cat class which inherits the pet class and it has the same characteristics as well as the make sound method
 * @author Teja Akella
 * 
 */
package Unit14.Unit14Activity2;

class cat extends pets {
    public cat(String name, double weight, int age) {
        super(name, weight, age);
    }
    
    
    public String makeSound() {
        return "meow";
    }
}
