/**
 * ================================================================
 * MAIN CLASS - UseCase12PalindromeCheckerApp
 * ================================================================
 * Use Case 12: Strategy Pattern for Palindrome Algorithms
 *
 * Description:
 * This class demonstrates how different palindrome
 * validation algorithms can be selected dynamically
 * at runtime using the Strategy Design Pattern.
 */

public class UseCase12PalindromeStrategyApp {

    public static void main(String[] args) {

        String input = "level";

        // Create strategy object
        PalindromeStrategy strategy = new StackStrategy();

        boolean result = strategy.check(input);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }
}


/**
 * ================================================================
 * INTERFACE - PalindromeStrategy
 * ================================================================
 * This interface defines a contract for all
 * palindrome checking algorithms.
 */

interface PalindromeStrategy {

    boolean check(String input);
}


/**
 * ================================================================
 * CLASS - StackStrategy
 * ================================================================
 * This class provides a Stack based implementation
 * of the PalindromeStrategy interface.
 */

class StackStrategy implements PalindromeStrategy {

    /**
     * Implements palindrome validation using Stack.
     */
    public boolean check(String input) {

        // Create a stack to store characters
        java.util.Stack<Character> stack = new java.util.Stack<>();

        // Push each character onto the stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Compare characters by popping from stack
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}