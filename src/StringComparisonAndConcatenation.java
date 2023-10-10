import java.util.Scanner; // Importing the Scanner class to read user input

public class StringComparisonAndConcatenation {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first String
        System.out.print("Enter the first String: ");
        String str1 = scanner.nextLine();

        // Prompt the user to enter the second String
        System.out.print("Enter the second String: ");
        String str2 = scanner.nextLine();

        // Close the Scanner to release resources
        scanner.close();

        // Compare the lengths of the two strings
        int lengthComparison = Integer.compare(str1.length(), str2.length());

        // Compare the strings lexicographically
        int lexicoComparison = str1.compareTo(str2);

        // Display the results based on length and lexicographic order
        if (lengthComparison > 0) {
            System.out.println("String 1 is longer than String 2.");
        } else if (lengthComparison < 0) {
            System.out.println("String 2 is longer than String 1.");
        } else {
            System.out.println("Both strings have the same length.");
        }

        if (lexicoComparison < 0) {
            System.out.println("String 1 appears before String 2 in lexicographic order.");
        } else if (lexicoComparison > 0) {
            System.out.println("String 2 appears before String 1 in lexicographic order.");
        } else {
            System.out.println("Both strings are the same in lexicographic order.");
        }

        // Combine the two strings and display the sentence
        String combinedSentence = str1 + " " + str2;
        System.out.println("Combined Sentence: " + combinedSentence);
    }
}
