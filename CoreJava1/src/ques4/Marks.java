package ques4;

import java.util.Scanner;

public class Marks {
	 public static void main(String[] args) {
		 int count =0;
		 Scanner scanner = new Scanner(System.in);
		 int[]sub =new int[3];
		 System.out.print("Enter marks out of 100\n ");
		 for (int j=0;j<3;j++)
		 {sub[j]=scanner.nextInt();
		 }
		 for (int i=0;i<sub.length;i++)
		 {
		  if (sub[i]>60)
		  {count=count+1;
		  }
		 }
		 if (count == 3)
		 {
		  System.out.print("PASSED.Well Done!!");
		 }
		 else if (count ==2)
		 {
		  System.out.print("PROMOTED.Good!!");
		 }
		 else
		 {
		  System.out.print("FAIL"
		  		+ "..Work Hard..");
		 }
		 }

}
