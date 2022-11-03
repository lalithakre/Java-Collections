import java.util.*;

public class StackCollection {
    public static void main(String[] args) {
        Stack<Integer> l = new Stack<>();
        l.size();
        l.push(3);
        l.push(2);
        for (int i : l) {
            System.out.println(i);
        }
    }
}
