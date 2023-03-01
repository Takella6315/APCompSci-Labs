/**
 * Unit2Activity2_takel1s.java
 * The function of this program is print out the makeup of a certain amount of money. 
 * This means that if 15.98 is entered, the following with be returned:
 *      15 dollars
 *      3 quarters
 *      2 dimes
 *      0 nickels
 *      3 pennies
 * @author Teja Akella
 */
import java.util.Scanner;

public class Unit2Activity2_takel1s {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount of money you have (For example 15.98): ");
        double amount = input.nextDouble();

        int remainingAmount = (int) (amount * 100);
        int numberOfOneDollars = remainingAmount / 100;

        remainingAmount = remainingAmount % 100;
        int numberOfQuarters = remainingAmount / 25;

        remainingAmount = remainingAmount % 25;
        int numberOfDimes = remainingAmount / 10;

        remainingAmount = remainingAmount % 10;
        int numberOfNickels = remainingAmount / 5;

        remainingAmount = remainingAmount % 5;
        int numberOfPennies = remainingAmount;

        System.out.println("Your amount $" + amount + " consists of \n" + "\t" + numberOfOneDollars + " dollars\n" + "\t" + 
        numberOfQuarters + " quarters\n" + "\t" + numberOfDimes + " dimes\n" + "\t" + numberOfNickels + " nickels\n" + "\t"
        + numberOfPennies + " pennies");




        System.out.print(210 % 105);

    }
}
