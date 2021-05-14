package person;

import java.util.*;

public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Set<Person> set=new TreeSet<Person>();  
	    //Creating Books  
	    Person b1=new Person("Akash",75f,165.25f);  
	    Person b2=new Person("Ashesh",72f,162.25f);
	    Person b3=new Person("Rajesh",72f,163.25f);
	    Person b4=new Person("Nitesh",78.55f,164.25f);
  
	    //Adding Books to TreeSet  
	    set.add(b1);  
	    set.add(b2);  
	    set.add(b3);
	    set.add(b4);
	    //Traversing TreeSet  
	    for(Person b:set){  
	    System.out.println("name "+b.name+" weight "+b.weight+"height "+b.height);  
	    }  


	}

}
