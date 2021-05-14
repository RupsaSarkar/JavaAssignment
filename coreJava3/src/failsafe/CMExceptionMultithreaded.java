package failsafe;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CMExceptionMultithreaded {
	private static final List<String> list = new CopyOnWriteArrayList<String>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  list.add("a");
		  list.add("b");
		  list.add("c");
		  list.add("d");
		  Thread t1 = new Thread(new Runnable() { 
		            @Override 
		            public void run() 
		            {
		                Iterator<String> itrList = list.iterator();
		                while(itrList.hasNext()){
		                 String str = itrList.next();
		                 System.out.println("Thread1:"+str);
		                }
		            } 
		        }); 
		        t1.start();
		        //update list in second thread
		        Thread t2 = new Thread(new Runnable() { 
		            @Override 
		            public void run() 
		            { 
		            	list.add("e");
		            	Iterator<String> itrList = list.iterator();
		                while(itrList.hasNext()){
		                 String str = itrList.next();
		             System.out.println("Thread 2" +str);
		                }
		             
		            } 
		        }); 
		        t2.start(); 

	}

}
