import java.util.LinkedList;

public class UseCase9PalindromeCheckerApp {
    public static void main(String[] args) {
        // Define the input string
        String input = "Level";

        // Create a LinkedList to store characters
        LinkedList<Character> list = new LinkedList<>();

        // Add each character to the LinkedList
        for (char c : input.toCharArray()) {
            list.add(c);
        }

        // Flag to track palindrome state
        boolean isPalindrome = true;

        // Compare until only one or zero elements remain
        while (list.size() > 1) {
            char first = list.removeFirst();
            char last = list.removeLast();

            if (Character.toLowerCase(first) != Character.toLowerCase(last)) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}
