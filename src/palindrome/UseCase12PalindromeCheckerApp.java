package palindrome;

// UseCase12PalindromeCheckerApp.java
public class UseCase12PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "Level";

        // Inject StackStrategy
        PalindromeStrategy stackStrategy = new StackStrategy();
        System.out.println("Using StackStrategy: " + stackStrategy.check(input));

        // Inject DequeStrategy
        PalindromeStrategy dequeStrategy = new DequeStrategy();
        System.out.println("Using DequeStrategy: " + dequeStrategy.check(input));
    }
}
