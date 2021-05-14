package hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Demo {
	public static void main(String args[]){    
        LinkedHashSet<String> lh=new LinkedHashSet(); // Implementing HashSet     
               lh.add("A");    // Adding elements  
               lh.add("B");      
               lh.add("C");     
               lh.add("D");    
               lh.add("E");    
               Iterator<String> i=lh.iterator(); // Traversing objects    
               while(i.hasNext()) // Return true if the Scanner has another token input    
               {    
               System.out.println(i.next());// printing elements     
               }    
               HashSet<String> h=new HashSet();  // Implementing HashSet  
               h.add("Apple");    //Adding elements  
               h.add("Banana");      
               h.add("Cat");     
               h.add("Dog");    
               h.add("Elephant");  
               Iterator<String> i1=h.iterator();  // Traversing objects  
               while(i1.hasNext())  // Return true if the Scanner has another token input  
               {    
               System.out.println(i1.next()); // printing elements   
               }    
 }    

}
