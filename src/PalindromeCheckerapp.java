import java.util.Scanner;
public class PalindromeCheckerapp {
     static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input text: ");
        String text = sc.nextLine();

        boolean isPalindrome = true;
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        System.out.println("Is it a Palindrome? : " + isPalindrome);
        sc.close();
    }
    }
