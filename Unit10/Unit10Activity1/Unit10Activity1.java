/**
 * Unit10Activity1.java
 * This program uses two methods divide and stringLength. each of them has an exception - arthimetic and null pointer respectively. 
 * @author Teja Akella
 */
package Unit10.Unit10Activity1;

import java.util.Scanner;

public class Unit10Activity1 {
    
    public static int divide(int x, int y) {
        try {
            return x / y;
        } catch (ArithmeticException e) {
            return x > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
    }
    
    public static int stringLength(String s) {
        try {
            return s.length();
        } catch (NullPointerException e) {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        // Testing divide
        System.out.print("Enter dividend: ");
        int dividend = scanner.nextInt();
        System.out.print("Enter divisor: ");
        int divisor = scanner.nextInt();
        int result = divide(dividend, divisor);
        System.out.println("Result of division: " + result);
    
        // Testing stringLength
        System.out.print("Enter a string: ");
        String s = scanner.next();
        int length = stringLength(s);
        System.out.println("Length of string: " + length);
        scanner.close();
    }
    
}
