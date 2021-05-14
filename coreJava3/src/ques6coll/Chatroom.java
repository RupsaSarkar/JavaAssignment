package ques6coll;

import java.util.ArrayList;
import java.util.Scanner;

public class Chatroom {
	static void userLogin(String name) {
		Scanner sc= new Scanner(System.in);
		if(name.equalsIgnoreCase("Shweta")||name.equalsIgnoreCase("Riya")||name.equalsIgnoreCase("Anu")||name.equalsIgnoreCase("Diksha")) {
			System.out.println(name+ " logged in");	
			System.out.println("Send a message");
			String m= sc.nextLine(); 
				System.out.println("Message by "+name+": "+m);
			}
		}
		static void userLogout(String name1) {
			if(name1.equalsIgnoreCase("Shweta")||name1.equalsIgnoreCase("Riya")||name1.equalsIgnoreCase("Anu")||name1.equalsIgnoreCase("Diksha")) {
				System.out.println(name1+ " logged out");	
			}
		
}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> user= new ArrayList<String>();
		
		user.add("Shweta");
		user.add("Riya");
		user.add("Anu");
		user.add("Diksha");
		Scanner s= new Scanner(System.in);
		System.out.println("Enter username to login");
		String n= s.nextLine();
		userLogin(n);
		System.out.println("Users in Chatroom:");
		for (String str : user)
            System.out.print(str + " ");
		System.out.println("\nEnter username to logout");
		String n1= s.nextLine();
		userLogout(n1);
		user.remove(n1);
		System.out.println("Users in Chatroom:");
		for (String str1 : user)
            System.out.print(str1 + " ");
		
		

	}
	
	
	
	

}

