/**
 * Unit2Lab.java
 * @author : Teja Akella
 * Program implementing Mad Libs® for a letter to someone.
 * a fill in the blank letter
 * 
 */
package Unit2Lab1;
import java.util.Scanner;
public class Unit2Lab{

    public static void main(String args[]){

        System.out.println("The program will prompt for a few words to enter. After all words are entered the program will print a story. Thank you for playing.");

        Scanner firstNoun = new Scanner(System.in);
        System.out.print("Enter a first name: ");
        String firstNounInput = firstNoun.nextLine();

        Scanner firstAdjective = new Scanner(System.in);
        System.out.print("Enter an adjective: ");
        String firstAdjectiveInput = firstAdjective.nextLine();
        
        Scanner firstInteger = new Scanner(System.in);
        System.out.print("Enter a small integer: ");
        String firstIntegerInput = firstInteger.nextLine();

        Scanner firstVerb = new Scanner(System.in);
        System.out.print("Enter a verb: ");
        String firstVerbInput = firstVerb.nextLine();

        Scanner secondVerb = new Scanner(System.in);
        System.out.print("Enter another verb: ");
        String secondVerbInput = secondVerb.nextLine();

        Scanner secondNoun = new Scanner(System.in);
        System.out.print("Enter another first name: ");
        String secondNounInput = secondNoun.nextLine();

        System.out.println("Dear " + firstNounInput);
        System.out.println("\nYou are so " + firstAdjectiveInput + " and I want to " + firstVerbInput + " with you " + firstIntegerInput + " times. After that I would like to " + secondVerbInput + " you away." );
        System.out.println("\nBest, " + secondNounInput);

        firstNoun.close();
        firstAdjective.close();
        firstInteger.close();
        firstVerb.close();
        secondVerb.close();
        secondNoun.close();


    }

}
