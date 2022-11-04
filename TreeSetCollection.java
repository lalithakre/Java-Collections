import java.util.*;

public class TreeSetCollection {
    public static void main(String[] args) {
        Set<Integer> s = new TreeSet<>();
        s.add(2);
        s.add(0);
        s.add(4);
        s.add(3);
        s.add(6);
        s.add(7);
        for (int i : s) {
            System.out.println(i);
        }
    }
}