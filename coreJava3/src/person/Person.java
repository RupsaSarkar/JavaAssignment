package person;
public class Person implements Comparable<Person> {
	float weight;  
	String name;  
	float height;  
	public Person(String name,float weight,  float height) {  
	    this.weight = weight;  
	    this.name = name;  
	    this.height = height;   
	}  
	public int compareTo(Person b) {  
	    if(weight>b.weight){  
	        return 1;  
	    }else if(weight<b.weight){  
	        return -1;  
	    }else{  
	    	 if(height>b.height){  
	 	        return 1;  
	 	    }else if(height<b.height){  
	 	        return -1;  
	 	    }else{  
	 	    return 0;  
	 	    }  
	    }  
	}

}
