package ques9;

import java.util.Scanner;

public class TotalAverage {
	public static void main(String[] args) {
		int a,b,c,d,e,f,g,h,i,x1,y1,x2,y2,x3,y3,z1,z2,z3,t1,t2,t3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Student1 Subject1 marks: ");
		a = sc.nextInt();
		System.out.println("Enter the Student1 Subject2 marks: ");
		b = sc.nextInt();
		System.out.println("Enter the Student1 Subject3 marks: ");
		c = sc.nextInt();
		System.out.println("Enter the Student2 Subject1 marks: ");
		d = sc.nextInt();
		System.out.println("Enter the Student2 Subject2 marks: ");
		e = sc.nextInt();
		System.out.println("Enter the Student2 Subject3 marks: ");
		f = sc.nextInt();
		System.out.println("Enter the Student3 Subject1 marks: ");
		g = sc.nextInt();
		System.out.println("Enter the Student3 Subject2 marks: ");
		h = sc.nextInt();
		System.out.println("Enter the Student3 Subject3 marks: ");
		i = sc.nextInt();
		x1= a+b+c;
		y1= x1/3;
		x2 = d+e+f;
		y2 = x2/3;
		x3 = g+h+i;
		y3 = x3/3;
		t1 = a+d+g;
		t2 = b+e+h;
		t3 = c+f+i;
		z1 = t1/3;
		z2 =t2/3;
		z3= t3/3;
		System.out.println("Student1: Total Marks ="+x1+ "and Average Marks ="+y1);
		System.out.println("Student2: Total Marks ="+x2+ "and Average Marks ="+y2);
		System.out.println("Student3: Total Marks ="+x3+ "and Average Marks ="+y3);
		System.out.println("Total Marks in Subject1 = " +t1+ " Subject2 = "+t2+"Subject3 = "+t3);
		System.out.println("Average Marks in Subject1 = " +z1+ " Subject2 = "+z2+"Subject3 = "+z3);
		
		
		
				
		}

}
