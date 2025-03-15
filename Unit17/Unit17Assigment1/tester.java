/**
 * This is the tester class which utilizes all of the classes to print out their names and draw them
 * @author Teja Akella
 */
package Unit17.Unit17Assigment1;

import java.util.ArrayList;

public class tester {
    public static void main(String[] args) {
		ArrayList<Drawable> list = new ArrayList<Drawable>();
		list.add(new Square());
		list.add(new Triangle());
		list.add(new EmptySquare());
		for (Drawable d : list) {
			System.out.println(d.getName());
			d.draw();
			System.out.println();
		}
	}
}
