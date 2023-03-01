/**
 * Unit5Activity1.java
 * the user can input two numbers and can choose an operation type. Then the computer will compute the answer using an if else statement and a switch
 * @author Teja Akella
 */
package Unit5.Unit5Activity1;

import java.util.Scanner;
public class Unit5Activity1 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the numbers seperated by a space: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        System.out.print("Enter operation type (+, -, *, /, %): ");
        char operator = input.next().charAt(0);

        double resultIf = evaluateWithIf(num1, operator, num2);
        double resultSwitch = evaluateWithSwitch(num1, operator, num2);

        System.out.println("Using if/else: " + resultIf);
        System.out.println("Using switch/case: " + resultSwitch);
    }
    //method to evaulate expression with if else statement
    public static double evaluateWithIf(double num1, char operator, double num2) {
        double result = 0.0;
        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/') {
            result = num1 / num2;
        } else if (operator == '%') {
            result = num1 % num2;
        } else {
            System.out.println("Invalid operator.");
        }
        return result;
    }
    //method to evaulate the expression with a switch
    public static double evaluateWithSwitch(double num1, char operator, double num2) {
        double result = 0.0;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '%':
                result = num1 % num2;
                break;
            default:
                System.out.println("Invalid operator.");
                break;
        }
        return result;
        
    }
    

}
