// Main application class
public class UseCase12PalindromeCheckerApp {
    public static void main(String[] args) {
        PalindromeService service = new PalindromeService();

        String input = "racecar";
        boolean result = service.checkPalindrome(input);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }
}

// Service class encapsulating palindrome logic
class PalindromeService {

    // Method to check if a string is a palindrome
    public boolean checkPalindrome(String input) {
        if (input == null || input.isEmpty()) {
            return false;
        }

        int start = 0;
        int end = input.length() - 1;

        // Compare characters from both ends
        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
