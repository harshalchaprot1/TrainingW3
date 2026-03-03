package palindrome;

// DequeStrategy.java
import java.util.Deque;
import java.util.LinkedList;

public class DequeStrategy implements PalindromeStrategy {
    @Override
    public boolean check(String input) {
        Deque<Character> deque = new LinkedList<>();
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }
}
