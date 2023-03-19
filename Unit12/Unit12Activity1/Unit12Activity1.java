package Unit12.Unit12Activity1;

import java.util.Arrays;

public class Unit12Activity1 {

    public static String findLongest(String[][] array) {
        String longest = array[0][0];
        for (String[] row : array) {
            for (String str : row) {
                if (str.length() > longest.length()) {
                    longest = str;
                }
            }
        }
        return longest;
    }
    
    public static String findShortest(String[][] array) {
        String shortest = array[0][0];
        for (String[] row : array) {
            for (String str : row) {
                if (str.length() < shortest.length()) {
                    shortest = str;
                }
            }
        }
        return shortest;
    }
    
    public static String findLongestInAColumn(String[][] array, int column) {
        String longest = array[0][column];
        for (String[] row : array) {
            String str = row[column];
            if (str.length() > longest.length()) {
                longest = str;
            }
        }
        return longest;
    }
    
    public static String findShortestInAColumn(String[][] array, int column) {
        String shortest = array[0][column];
        for (String[] row : array) {
            String str = row[column];
            if (str.length() < shortest.length()) {
                shortest = str;
            }
        }
        return shortest;
    }
    
    public static String findLongestInARow(String[][] array, int row) {
        String longest = array[row][0];
        for (String str : array[row]) {
            if (str.length() > longest.length()) {
                longest = str;
            }
        }
        return longest;
    }
    
    public static String findShortestInARow(String[][] array, int row) {
        String shortest = array[row][0];
        for (String str : array[row]) {
            if (str.length() < shortest.length()) {
                shortest = str;
            }
        }
        return shortest;
    }
    
    public static void main(String[] args) {
        String[][] array = {
            {"abc", "de", "fghi", "j", "kl"},
            {"mnop", "q", "rs", "t", "u"},
            {"v", "xyz", "01", "234567", "789"}
        };
        
        System.out.println("Array:");
        for (String[] row : array) { 
            System.out.println(Arrays.toString(row));
        }
        
        System.out.println("Longest: " + findLongest(array));
        System.out.println("Shortest: " + findShortest(array));
        System.out.println("Longest in column 1: " + findLongestInAColumn(array, 1));
        System.out.println("Shortest in column 1: " + findShortestInAColumn(array, 1));
        System.out.println("Longest in row 0: " + findLongestInARow(array, 0));
        System.out.println("Shortest in row 0: " + findShortestInARow(array, 0));
    }
}

