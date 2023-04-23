/**
 * This is the Tester class which utilizes all of the animal classes to print out their name, weight, age, and the sound that they make
 * @author Teja Akella
 * 
 */
package Unit14.Unit14Activity2;

import java.util.ArrayList;

public class tester {
    public static void main(String[] args) {
        ArrayList<pets> pets = new ArrayList<>();
        pets.add(new cat("Jerry", 3.5, 2));
        pets.add(new bunny("Buster", 8.0, 5));
        pets.add(new dog("Rex", 10.5, 6));
        pets.add(new dog("Prince", 22, 3));
        
        double totalWeight = 0;
        double totalAge = 0;
        
        for (pets pet : pets) {
            System.out.println(pet);
            System.out.println(pet.makeSound());
            totalWeight += pet.getWeight();
            totalAge += pet.getAge();
        }
        
        System.out.println("Average pet age: " + totalAge / pets.size() + " years");
        System.out.println("Average pet weight: " + totalWeight / pets.size() + " lbs");
    }
}
