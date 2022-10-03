import java.util.*; 
class TreeSet1{ 
public static void main(String args[]){ 
 //Creating and adding elements 
 TreeSet<String> al=new TreeSet<String>(); 
 al.add("Rajendra"); 
 al.add("Raja"); 
 al.add("Ravi"); 
 al.add("Technolamror");  
 Iterator<String> itr=al.iterator(); 
 while(itr.hasNext()){ 
 System.out.println(itr.next()); 
 } 
} 
} 