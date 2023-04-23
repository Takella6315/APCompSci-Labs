/**
 * This program prints the list and then finds the number of B's 1's and 1.5's respectively. 
 * It then also prints the values that don't match B, 1, and 1.5
 * @author
 */
package Unit13.Unit13Activity2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Unit13Activity2 {
    //This method counts the number of times a certain item appears in the list
    public static <T> int count(List<T> list, Object thing) {
        int count = 0;
        for (T item : list) {
            if (item.equals(thing)) {
                count++;
            }
        }
        return count;
    }
    //this list prints whatever is not matching to the items in the list
    public static <T> void printNotMatching(List<T> list, Object thing) {
        for (T item : list) {
            if (!item.equals(thing)) {
                System.out.print("\"" + item + "\", ");
            }
        }
        System.out.println();
    }
    //main function
    public static void main(String[] args) {
        
        //array list for Strings
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("AA");
        strings.add("B");
        strings.add("C");
        System.out.println("ArrayList of String: " + strings);
        System.out.println("count of B:");
        System.out.println(count(strings, "B"));
        System.out.println("not matching B:");
        printNotMatching(strings, "B");
        
        //linked list for integers
        LinkedList<Integer> integers = new LinkedList<Integer>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        System.out.println("LinkedList of Integer: " + integers);
        System.out.println("count of 1:");
        System.out.println(count(integers, 1));
        System.out.println("not matching 1:");
        printNotMatching(integers, 1);
        
        //array list for doubles
        ArrayList<Double> doubles = new ArrayList<Double>();
        doubles.add(1.5);
        doubles.add(1.0);
        doubles.add(1.5);
        System.out.println("ArrayList of Double: " + doubles);
        System.out.println("count of 1.5:");
        System.out.println(count(doubles, 1.5));
        System.out.println("not matching 1.5:");
        printNotMatching(doubles, 1.5);
    }
}
