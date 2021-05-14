package reversearraylist;
import java.util.*;

public class Reversearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  ArrayList<String> aList = new ArrayList<String>();
	      aList.add("Amanda");
	      aList.add("Peter");
	      aList.add("Julie");
	      aList.add("James");
	      aList.add("Emma");
	      ListIterator<String> li = aList.listIterator(aList.size());
	      System.out.println("The ArrayList elements in the reverse direction are: ");
	      while (li.hasPrevious()) {
	         System.out.println(li.previous());
	      }

	}

}
