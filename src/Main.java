import java.util.HashSet;
import java.util.Set;

public class Main {
    Certainly!Here's a comment with documentation for the provided code:

    /**
     * Checks if a given string is a pangram, i.e., it contains every letter of the alphabet at least once.
     *
     * @param str The input string to be checked for being a pangram
     * @return true if the input string is a pangram, false otherwise
     */
    public static boolean isPangram(String str) {
        // Create a set to store unique lowercase alphabet characters
        Set alphabetSet = new HashSet();

        // Iterate through each character in the input string after converting it to lowercase
        for (char c : str.toLowerCase().toCharArray()) {
            // Check if the character is a letter
            if (Character.isLetter(c)) {
                // Add the letter to the set if it's not already present
                alphabetSet.add(c);
            }
        }

        // Return true if the size of the set is 26 (indicating all letters of the alphabet are present), otherwise return false
        return alphabetSet.size() == 26;
    }

    /**
     * Wrapper function to check if a given sentence is a pangram
     *
     * @param sentence The input sentence to be checked for being a pangram
     * @return true if the input sentence is a pangram, false otherwise
     */
    public static boolean check(String sentence) {
        return isPangram(sentence); // Call the isPangram function to check if the sentence is a pangram
    }

    /**
     * Main method to demonstrate the functionality of isPangram and check functions
     *
     * @param args Command line arguments (not used in this example)
     */
    public static void main(String[] args) {
        // Print a welcome message
        System.out.println("Hello and welcome!");

        // Test the check function with a pangram and print the result
        System.out.println("The quick brown fox jumps over the lazy dog.: " + check("The quick brown fox jumps over the lazy dog"));

        // Test the check function with a non-pangram and print the result
        System.out.println("You shall not pass!: " + check("You shall not pass"));
    }


}