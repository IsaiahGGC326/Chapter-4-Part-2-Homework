import java.util.Scanner; // Importing the Scanner class to read user input

public class LastOccurrenceFinder {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a String
        System.out.print("Enter a String: ");
        String inputString = scanner.nextLine();

        // Prompt the user to enter a character
        System.out.print("Enter a character: ");
        char targetChar = scanner.next().charAt(0); // Read the first character of the input

        // Close the Scanner to release resources
        scanner.close();

        // Find the last occurrence of the character in the String
        int lastIndex = inputString.lastIndexOf(targetChar);

        // Display the result
        if (lastIndex != -1) {
            System.out.println("Last occurrence of '" + targetChar + "' is at index: " + lastIndex);
        } else {
            System.out.println("'" + targetChar + "' is not found in the String.");
        }
    }
}
