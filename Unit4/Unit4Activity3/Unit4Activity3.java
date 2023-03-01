/**
 * Unit4Activity3.java
 * This program rolls two die randomly (1-6) and then prints out the value of the two die three different times
 * @author Teja Akella
 */
package Unit4.Unit4Activity3;

import java.lang.Math;

public class Unit4Activity3 {
    public static class die {

        int totalValue;

        public int roll() {

            int value = (int) ((Math.random() * 6) + 1);
            totalValue = value;
            return value;
        }

        public int getValue() {

            return totalValue;
        }

    }

    public static void main(String args[]) {

       die dice = new die();
       die dice2 = new die();

        // Simulate throwing each die at least three times
        int i = 0;
        for (i = 0; i < 3; i++) {
            System.out.println("Rolling two dice...");
            System.out.println(dice.roll() + ", " + dice2.roll());
        }

    }
}
