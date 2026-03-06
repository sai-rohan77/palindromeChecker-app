// Service class to check palindrome
class PalindromeService {

    public boolean isPalindrome(String input) {

        String processed = input.replaceAll(" ", "").toLowerCase();
        String reversed = new StringBuilder(processed).reverse().toString();

        return processed.equals(reversed);
    }
}

// Main class
public class UseCase11PalindromeServiceApp {

    public static void main(String[] args) {

        String input = "Madam";

        PalindromeService service = new PalindromeService();

        boolean result = service.isPalindrome(input);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }
}