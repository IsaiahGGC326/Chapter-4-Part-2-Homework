import java.util.Scanner; // Importing the Scanner class to read user input

public class ReverseString {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a String
        System.out.print("Enter a String: ");
        String input = scanner.nextLine();

        // Close the Scanner to release resources
        scanner.close();

        // Create a StringBuilder object to store the reversed String
        StringBuilder reversed = new StringBuilder(input);

        // Use the reverse method of StringBuilder to reverse the String
        reversed.reverse();

        // Display the reversed String
        System.out.println("Reversed String: " + reversed.toString());
    }
}
