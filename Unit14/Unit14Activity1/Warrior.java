package Unit14.Unit14Activity1;

public class Warrior extends Player {
    private String weapon;
    private int health;
    
    public Warrior(String name, int lives, int score, int credits, String weapon, int health) {
        super(name, lives, score, credits);
        this.weapon = weapon;
        this.health = health;
    }
    
    public void attack() {
        System.out.println("The warrior is attacking with their " + weapon + "!");
    }

    public void newHealth(int health){

        
        System.out.println("The warriors health has decreased by 10");
        

    }
}