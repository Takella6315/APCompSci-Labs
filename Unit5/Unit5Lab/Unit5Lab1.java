/**
 * 
 * Unit5Lab1.java
 * User can choose 2d or 3d shapes and then can choose whether they want the area, 
 * perimeter, volume, or both, and then they can choose the shape they want to use.
 * Then they will prompted to enter the required information to solve for that shape.
 * @author Teja akella
 * 
 */
package Unit5.Unit5Lab;
import java.util.Scanner;

public class Unit5Lab1 {

    public static double circleP(double radius){

        return 2 * Math.PI * radius;
        
    }

    public static double circleA(double radius){

        return Math.PI * radius * radius;
        
    }

    public static double squareP(double side){

        return 4 * side;
        
    }
    public static double squareA(double side){

        return side * side;
        
    }
    public static double parallelogramP(double side1, double side2){

        return 2 * (side1 + side2);
        
    }

    public static double parallelogramA(double base, double height){

        return base * height;
        
    }
    public static double sphereA(double radius){

        return 4 * Math.PI * radius * radius;
        
    }
    public static double sphereV(double radius){

        return (4.0/3.0) * Math.PI * radius * radius * radius;
        
    }
    public static double rectangularSolidA(double length, double width, double height){

        return 2 * (width * length + height * length + height * width);
        
    }
    public static double rectangularSolidV(double length, double width, double height){

        return length * width * height;
        
    }
    public static double cylinderA(double radius, double height){

        return 2 * Math.PI * (radius + height);
        
    }
    public static double cylinderV(double radius, double height){

        return Math.PI * (radius * radius) * height;
        
    }    
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    // Prompt the user for the type of figure (2D or 3D)
    System.out.println("Welcome to the Geometry Calculator!");
    System.out.print("Enter 2 for 2D figures and 3 for 3D: ");
    int figureType = scanner.nextInt();

    if (figureType == 2) {
        // 2D figure
        System.out.print("Enter P if you are looking to compute the perimeter, A for area, or B for both: ");
        String calculationType = scanner.next();

        if (calculationType.equalsIgnoreCase("P")) {
            // Calculate perimeter
            System.out.print("Enter C for Circle, S for Square, and P for Parallelogram: ");
            String shape = scanner.next();

            if (shape.equalsIgnoreCase("C")) {
                // Calculate perimeter of a circle
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                double perimeter = circleP(radius);
                System.out.printf("Perimeter: %.2f (Computed using the equation: Perimeter = 2 * π * r)\n", perimeter);
            } else if (shape.equalsIgnoreCase("S")) {
                // Calculate perimeter of a square
                System.out.print("Enter the length of side: ");
                double side = scanner.nextDouble();
                double perimeter = squareP(side);
                System.out.printf("Perimeter: %.2f (Computed using the equation: Perimeter = 4 * side)\n", perimeter);
            } else if (shape.equalsIgnoreCase("P")) {
                // Calculate perimeter of a parallelogram
                System.out.print("Enter the length of the first side: ");
                double side1 = scanner.nextDouble();
                System.out.print("Enter the length of the second side: ");
                double side2 = scanner.nextDouble();
                double perimeter = parallelogramP(side1, side2);
                System.out.printf("Perimeter: %.2f (Computed using the equation: Perimeter = 2(a + b))\n", perimeter);
            } else {
                System.out.println("Invalid shape entered!");
            }

        } else if (calculationType.equalsIgnoreCase("A")) {
            // Calculate area
            System.out.print("Enter C for Circle, S for Square, and P for Parallelogram: ");
            String shape = scanner.next();

            if (shape.equalsIgnoreCase("C")) {
                // Calculate area of a circle
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                double area = circleA(radius);
                System.out.printf("Area: %.2f (Computed using the equation: Area = π * r^2)\n", area);
            } else if (shape.equalsIgnoreCase("S")) {
                // Calculate area of a square
                System.out.print("Enter the length of side: ");
                double side = scanner.nextDouble();
                double area = squareA(side);
                System.out.printf("Area: %.2f (Computed using the equation: Area = side * side)\n", area);
            } else if (shape.equalsIgnoreCase("P")) {
                // Calculate area of a parallelogram
                System.out.print("Enter the base of the parallelogram: ");
                double base = scanner.nextDouble();
                System.out.print("Enter the vertical height of the parallelogram: ");
                double height = scanner.nextDouble();
                double area = parallelogramA(base, height);
                System.out.printf("Area: %.2f (Computed using the eguation: Area = base * height)\n", area);
            }
        } else if (calculationType.equalsIgnoreCase("B")){

            System.out.print("Enter C for Circle, S for Square, and P for Parallelogram: ");
            String shape = scanner.next();
            if (shape.equalsIgnoreCase("C")) {
                // Calculate area and perimeter of a circle
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                double area = circleA(radius);
                double perimeter = circleP(radius);
                System.out.printf("Area: %.2f (Computed using the equation: Area = π * r^2)\n", area);
                System.out.printf("Perimeter: %.2f (Computed using the equation: Perimeter = 2 * π * r)\n", perimeter);
            } else if (shape.equalsIgnoreCase("S")) {
                // Calculate area and perimeter of a square
                System.out.print("Enter the length of side: ");
                double side = scanner.nextDouble();
                double area = squareA(side);
                double perimeter = squareP(side);
                System.out.printf("Area: %.2f (Computed using the equation: Area = side * side)\n", area);
                System.out.printf("Perimeter: %.2f (Computed using the equation: Perimeter = 4 * side)\n", perimeter);
            } else if (shape.equalsIgnoreCase("P")) {
                // Calculate area and perimeter of a parallelogram
                System.out.print("Enter the base of the parallelogram: ");
                double base = scanner.nextDouble();
                System.out.print("Enter the vertical height of the parallelogram: ");
                double height = scanner.nextDouble();
                double area = parallelogramA(base, height);
                System.out.print("Enter the length of the first side: ");
                double side1 = scanner.nextDouble();
                System.out.print("Enter the length of the second side: ");
                double side2 = scanner.nextDouble();
                double perimeter = parallelogramP(side1, side2);
                System.out.printf("Area: %.2f (Computed using the eguation: Area = base * height)\n", area);
                System.out.printf("Perimeter: %.2f (Computed using the equation: Perimeter = 2(a + b))\n", perimeter);
            } else {
                System.out.println("Invalid shape entered!");
            }
        }

    } else if (figureType == 3){
        System.out.print("Enter A if you are looking to compute the area, V for volume, or B for both: ");
        String calculationType = scanner.next();

        if (calculationType.equalsIgnoreCase("A")){

            System.out.print("Enter SP for sphere, RS for rectangular solid, and CY for cylinder: ");
            String shape = scanner.next();

            if (shape.equalsIgnoreCase("SP")){

                System.out.print("Enter the radius of the sphere: ");
                double radius = scanner.nextDouble();
                double area = sphereA(radius);
                System.out.printf("Area: %.2f (Computed using the eguation: Area = 4 * π * radius * radius)\n", area);

            } else if (shape.equalsIgnoreCase("RS")){

                System.out.print("Enter the length of the rectagular solid: ");
                double length = scanner.nextDouble();

                System.out.print("Enter the width of the rectagular solid: ");
                double width = scanner.nextDouble();

                System.out.print("Enter the height of the rectagular solid: ");
                double height = scanner.nextDouble();

                double area = rectangularSolidA(length, width, height);
                System.out.printf("Area: %.2f (Computed using the eguation: Area = length * width * height)\n", area);

            } else if (shape.equalsIgnoreCase("CY")){

                System.out.print("Enter the radius of the cylinder: ");
                double radius = scanner.nextDouble();

                System.out.print("Enter the height of the cylinder: ");
                double height = scanner.nextDouble();

                double area = cylinderA(radius, height);
                System.out.printf("Area: %.2f (Computed using the eguation: Area = 2 * π * radius * (radius + height))\n", area);

            } else {
                System.out.println("Invalid shape entered!");
            }

        } else if (calculationType.equalsIgnoreCase("V")){

            System.out.print("Enter SP for sphere, RS for rectangular solid, and CY for cylinder: ");
            String shape = scanner.next();

            if (shape.equalsIgnoreCase("SP")){

                System.out.print("Enter the radius of the sphere: ");
                double radius = scanner.nextDouble();
                double volume = sphereV(radius);
                System.out.printf("Volume: %.2f (Computed using the eguation: Area = 4/3 * π * radius * radius * radius)\n", volume);

            } else if (shape.equalsIgnoreCase("RS")){

                System.out.print("Enter the length of the rectagular solid: ");
                double length = scanner.nextDouble();

                System.out.print("Enter the width of the rectagular solid: ");
                double width = scanner.nextDouble();

                System.out.print("Enter the height of the rectagular solid: ");
                double height = scanner.nextDouble();

                double volume = rectangularSolidV(length, width, height);
                System.out.printf("Volume: %.2f (Computed using the eguation: Area = length * width * height)\n", volume);

            } else if (shape.equalsIgnoreCase("CY")){

                System.out.print("Enter the radius of the cylinder: ");
                double radius = scanner.nextDouble();

                System.out.print("Enter the height of the cylinder: ");
                double height = scanner.nextDouble();

                double volume = cylinderV(radius, height);
                System.out.printf("Volume: %.2f (Computed using the eguation: Area = 2 * π * radius * (radius + height))\n", volume);

            } else {
                System.out.println("Invalid shape entered!");
            }

        } else if (calculationType.equalsIgnoreCase("B")){

            System.out.print("Enter SP for sphere, RS for rectangular solid, and CY for cylinder: ");
            String shape = scanner.next();

            if (shape.equalsIgnoreCase("SP")){

                System.out.print("Enter the radius of the sphere: ");
                double radius = scanner.nextDouble();
                double area = sphereA(radius);
                double volume = sphereV(radius);
                System.out.printf("Area: %.2f (Computed using the eguation: Area = 4 * π * radius * radius)\n", area);
                System.out.printf("Volume: %.2f (Computed using the eguation: Area = 4/3 * π * radius * radius * radius)\n", volume);


            } else if (shape.equalsIgnoreCase("RS")){

                System.out.print("Enter the length of the rectagular solid: ");
                double length = scanner.nextDouble();

                System.out.print("Enter the width of the rectagular solid: ");
                double width = scanner.nextDouble();

                System.out.print("Enter the height of the rectagular solid: ");
                double height = scanner.nextDouble();

                double area = rectangularSolidA(length, width, height);
                System.out.printf("Area: %.2f (Computed using the eguation: Area = length * width * height)\n", area);
                double volume = rectangularSolidV(length, width, height);
                System.out.printf("Volume: %.2f (Computed using the eguation: Area = length * width * height)\n", volume);

            } else if (shape.equalsIgnoreCase("CY")){

                System.out.print("Enter the radius of the cylinder: ");
                double radius = scanner.nextDouble();

                System.out.print("Enter the height of the cylinder: ");
                double height = scanner.nextDouble();

                double area = cylinderA(radius, height);
                System.out.printf("Area: %.2f (Computed using the eguation: Area = 2 * π * radius * (radius + height))\n", area);
                double volume = cylinderV(radius, height);
                System.out.printf("Volume: %.2f (Computed using the eguation: Area = 2 * π * radius * (radius + height))\n", volume);
                
            } else {
                System.out.println("Invalid shape entered!");
            }

        }

    } 
    scanner.close();
    } 
}

