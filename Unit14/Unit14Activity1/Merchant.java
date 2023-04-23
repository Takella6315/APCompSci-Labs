/**
 * This is the Merchant class which has all of the traits as the player class but also has a money and goods trait
 * @author Teja Akella
 * 
 */
package Unit14.Unit14Activity1;

import java.util.ArrayList;

public class Merchant extends Player {
    private int money;
    private ArrayList<String> goods;
    
    public Merchant(String name, int lives, int score, int credits, int money, ArrayList<String> goods) {
        super(name, lives, score, credits);
        this.money = money;
        this.goods = goods;
    }
    
    public void sell(String item) {
        if (goods.contains(item)) {
            goods.remove(item);
            money += 5; 
            System.out.println("Sold " + item + " for 5 credits!");
            
        } else {
            System.out.println("Sorry, we're out of stock.");
        }
    }
    
    public void buy(String item) {
        goods.add(item);
        money -= 5; 
        System.out.println("Bought " + item + " for 10 credits!");
        System.out.println("You now have this much money: " + money);
    }
}
