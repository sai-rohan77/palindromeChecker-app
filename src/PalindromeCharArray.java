import java.util.Scanner;
public class PalindromeCharArray {

    // Method to check palindrome using char array and two-pointer technique
    public static boolean isPalindrome(String input) {

        // Convert string to character array
        char[] characters = input.toCharArray();

        // Initialize two pointers
        int start = 0;
        int end = characters.length - 1;

        // Compare characters from both ends
        while (start < end) {

            if (characters[start] != characters[end]) {
                return false; // Not a palindrome
            }

            start++;
            end--;
        }

        return true; // It is a palindrome
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== UC4: Character Array Based Palindrome Check ===");
        System.out.print("Enter a string: ");

        String input = scanner.nextLine();

        boolean result = isPalindrome(input);

        if (result) {
            System.out.println("Result: The given string is a Palindrome.");
        } else {
            System.out.println("Result: The given string is NOT a Palindrome.");
        }

        scanner.close();
    }
}