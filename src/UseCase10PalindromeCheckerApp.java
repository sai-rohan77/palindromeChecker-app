public class UseCase10PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "A man a plan a canal Panama";

        // Remove spaces and convert to lowercase
        String processed = input.replaceAll(" ", "").toLowerCase();

        // Check palindrome
        String reversed = new StringBuilder(processed).reverse().toString();

        boolean isPalindrome = processed.equals(reversed);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}