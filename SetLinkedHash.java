import java.util.*;

public class SetLinkedHash {
    public static void main(String[] args) {
        Set<Integer> s = new LinkedHashSet<>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        s.add(5);
        s.add(6);
        s.remove(3);
        System.out.println(s);
    }
}
