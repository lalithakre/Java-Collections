import java.util.*;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<Integer>();
        l.add(10);
        l.add(20);
        l.add(20);
        l.remove(l.indexOf(10));
        for (int i : l) {
            System.out.println(i);
        }
    }

}
