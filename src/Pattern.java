/**
 * class: Pattern
 * @author: Isaiah Jimenez
 * @version: 1.0
 * @written on: October 20, 2023
 * @Course: ITEC 2140 Fall 2023
 * description: This is a program written in Java
 */
public class Pattern {
    public static void main(String[] args) {
        // Define the number of rows in the pattern
        int numRows = 6;

        // Loop through each row
        for (int i = 0; i < numRows; i++) {
            // Loop to print the asterisks for each row
            for (int j = numRows; j > i; j--) {
                System.out.print("*");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
