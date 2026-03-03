package palindrome;

public class UseCase13PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "Level";

        // Run StackStrategy
        PalindromeStrategy stackStrategy = new StackStrategy();
        long startStack = System.nanoTime();
        boolean stackResult = stackStrategy.check(input);
        long endStack = System.nanoTime();
        long stackDuration = endStack - startStack;

        System.out.println("Using StackStrategy:");
        System.out.println("Is Palindrome? : " + stackResult);
        System.out.println("Execution Time : " + stackDuration + " ns\n");

        // Run DequeStrategy
        PalindromeStrategy dequeStrategy = new DequeStrategy();
        long startDeque = System.nanoTime();
        boolean dequeResult = dequeStrategy.check(input);
        long endDeque = System.nanoTime();
        long dequeDuration = endDeque - startDeque;

        System.out.println("Using DequeStrategy:");
        System.out.println("Is Palindrome? : " + dequeResult);
        System.out.println("Execution Time : " + dequeDuration + " ns");
    }
}
