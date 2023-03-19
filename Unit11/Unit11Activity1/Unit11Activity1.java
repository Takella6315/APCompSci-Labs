/**
 * This program allows the user to input how many intergers they want to enter and then they can enter those integers, which will be added to an array.
 * Then the numbers will be analyzed and the amount of numbers in it will be printed out.
 * @author Teja Akella
 */
package Unit11.Unit11Activity1;

import java.util.Scanner;

public class Unit11Activity1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of integers to be entered: ");
        int n = input.nextInt();

        int[] count = new int[50];
        System.out.print("Enter " + n + " integers separated by spaces: ");
        for (int i = 0; i < n; i++) {
            int num = input.nextInt();
            if (num >= 1 && num <= 50) {
                count[num - 1]++;
            }
        }

        System.out.println("Number of occurrences for each integer from 1 to 50:");
        for (int i = 0; i < 50; i++) {
            if (count[i] > 0) {
                System.out.println((i + 1) + " occurs " + count[i] + " times");
            }
        }
        input.close();
    }
}
