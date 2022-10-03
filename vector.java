import java.util.Vector;
class vector{
    public static void main(String [] args)
    {
        Vector<Integer>v=new Vector<Integer>();
        v.add(10);
        v.add(20);
        v.add(39);
        v.remove(v.indexOf(39));
        for(int i:v)
        {
            System.out.println(i);
        }
        System.out.println(v.size());
        System.out.println(v.elementAt(0));
        System.out.println(v.clone());
        System.out.println(v.add(49));
    }
}