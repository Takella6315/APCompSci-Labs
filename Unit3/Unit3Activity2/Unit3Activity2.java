/**
 * Unit3Activity2.java
 * Description: User can choose the shape that they want and then can input the different specifications 
 * required to solve for the volume.
 * @author Teja Akella
 */
package Unit3.Unit3Activity2;
import java.lang.Math;
import java.util.Scanner;
public class Unit3Activity2{

    //finds volume of a cube using side length
    public static double cube(double sideLength){

        return Math.pow(sideLength, 3);
        
    }
    //finds volume of a rectangular solid using length, width, and height
    public static double rectangularSolid(double length, double width, double height){

        return length * width * height;

    }
    //finds volume of a spehere using radius
    public static double sphere(double radius) {
        
        return (4.0 / 3) * Math.PI * Math.pow(radius, 2);

    }
    //finds volume of a tetrahedron using side length  
    public static double tetrahedron(double sideLength){

        return (Math.pow(sideLength, 3)) / (6 * Math.sqrt(2));

    }
    //finds volume of a ellipsoid using side length a, b, and c
    public static double ellipsoid(double a, double b, double c){

        return (4.0 / 3) * Math.PI * a * b * c;

    }
    //finds volume of a cylinder using radius and height
    public static double cylinder(double radius, double height){

        return Math.PI * Math.pow(radius, 2) * height;

    }
    public static void main(String args[]){


        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Geometry Helper! \nChoose a figure from the following set: \n1 - Cube \n2 - Rectangular Solid \n3 - Sphere \n4 - Tetrahedron \n5 - Ellipsoid \n6 - Cylinder");
        double figure = input.nextDouble();

        if (figure == 1){

            System.out.print("Enter the side length of the cube:\n");
	        double sideLength= input.nextDouble();
	        System.out.println("Volume of a cube with side length " + sideLength + " equals " + cube(sideLength));

        } else if (figure == 2){

            System.out.print("Enter the length of the rectangular solid:\n");
	        double length= input.nextDouble();

            System.out.print("Enter the width of the rectangular solid:\n");
	        double width= input.nextDouble();

            System.out.print("Enter the height of the rectangular solid:\n");
	        double height= input.nextDouble();
	        System.out.println("Volume of a sphere with length of " + length + ", width of " + width + ", height of " + height + " equals " + rectangularSolid(length, width, height));

        } else if (figure == 3){

            System.out.print("Enter the radius of the sphere: \n");
	        double radius= input.nextDouble();
            System.out.println("Volume of a sphere with radius " + radius + " equals " + sphere(radius));


        } else if (figure == 4){

            System.out.print("Enter the side length of the tetrahedron:\n");
	        double sideLength= input.nextDouble();
	        System.out.println("Volume of a tetrahedron with side length " + sideLength + " equals " + tetrahedron(sideLength));

        } else if (figure == 5){

            System.out.print("Enter the a length of the ellipsoid:\n");
	        double a = input.nextDouble();

            System.out.print("Enter the width of the ellipsoid:\n");
	        double b = input.nextDouble();

            System.out.print("Enter the height of the ellipsoid:\n");
	        double c = input.nextDouble();
	        System.out.println("Volume of an ellipsoid with length a of " + a + ", b of " + b + ", and c of " + c + " equals " + ellipsoid(a, b, c));

        } else if (figure == 6){

            System.out.print("Enter the radius of the cylinder:\n");
	        double radius= input.nextDouble();

            System.out.print("Enter the height of the cylinder:\n");
	        double height= input.nextDouble();

            
	        System.out.println("Volume of a cylinder with radius of " + radius + ", height of " + height + " equals " + cylinder(radius, height));

        } else {

            System.out.println("Please enter a number 1-6");

        }

        input.close();
    }
}
