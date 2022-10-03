import java.util.*;  
public class LinkedList1 {
  public static void main(String[] args) {
   List<String> al = new LinkedList<String>();
    al.add("Rajendra");// Adding object in LinkedList
    al.add("Mahendra");
    al.add("Raja");
    al.add("Technolamror");
    Iterator<String> itr = al.iterator();
    while (itr.hasNext()) {
      System.out.println(itr.next());
    }
  }
}
