package ques6;
import java.util.*;

public class CUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String username,password;
		Scanner sc=new Scanner(System.in);
		
	 
		System.out.println("Enter the username");
		username=sc.nextLine();
		System.out.println("Enter the password");
		password=sc.nextLine();
		 if(username.equals("anu")&&(password.equals("bincy"))){
		 System.out.println("welcome");
		 
		 
	 
	 	
	 }else { for(int i=0;i<2;i++) {
		 System.out.println("Login again");
		 System.out.println("Enter the username");
			username=sc.nextLine();
			System.out.println("Enter the password");
			password=sc.nextLine();
		 if(username.equals("anu")&&(password.equals("bincy"))){
			 System.out.println("welcome");
			 break;
		 
	 }
	 }
	}
	}
}




