import java.util.*;
class ArraylistLalit {
    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<String>();// Creating arraylist
        list.add("Lalit");// Adding object in arraylist
        list.add("Thakre");
        list.add("Bhopal");
        list.add("Coder");
        list.remove("Bhopal");
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}