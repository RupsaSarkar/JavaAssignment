package ques3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    // create an object of Scanner class
	    Scanner input = new Scanner(System.in);

	    // take input from users
	    System.out.print("Enter the principal: ");
	    double principal = input.nextDouble();

	    System.out.print("Enter the rate: ");
	    double rate = input.nextDouble();

	    System.out.print("Enter the time: ");
	    double time = input.nextDouble();

	    System.out.print("Enter number of times interest is compounded: ");
	    int number = input.nextInt();

	    double cinterest = principal * (Math.pow((1 + rate/100), (time * number))) - principal;
	    double sinterest = (principal * time * rate) / 100;

	    System.out.println("Principal: " + principal);
	    System.out.println("Interest Rate: " + rate);
	    System.out.println("Time Duration: " + time);
	    System.out.println("Number of Time interest Compounded: " + number);
	    System.out.println("Simple Interest: " + sinterest);
	    System.out.println("Compound Interest: " + cinterest);

	}

}
