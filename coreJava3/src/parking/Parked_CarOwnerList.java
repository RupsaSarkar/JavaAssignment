package parking;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Parked_CarOwnerList {
	static Set<Parked_Carowner_Details> car=new TreeSet<Parked_Carowner_Details>(new ParkOrder());
	static Parked_Carowner_Details p1 = new Parked_Carowner_Details("Rajesh","Mercedes",1456,9807685432l,"New Delhi");
	static Parked_Carowner_Details p2 = new Parked_Carowner_Details("Rohan","BMW",1498,9807685432l,"Chennai");
	static Parked_Carowner_Details p3 = new Parked_Carowner_Details("Tina","Lamborghini",1506,9966685432l,"Mumbai");
	static int add_new_car(Parked_Carowner_Details obj) {
		car.add(obj);
		//car.add(p2);
		//car.add(p3);
		 
		if(obj.ownerName.equalsIgnoreCase("Rajesh")) {
			System.out.println("Token no for Rajesh: 1");
		}
		if(obj.ownerName.equalsIgnoreCase("Rohan")) {
			System.out.println("Token no for Rohan: 2");
		}
		if(obj.ownerName.equalsIgnoreCase("Tina")) {
			System.out.println("Token no Tina: 3");
		
		}
		return 0;
		
	}
	static void remove_car(String name) {
		for(Parked_Carowner_Details p:car) {
		if(name.equalsIgnoreCase(p.ownerName))
		car.remove(p);
		}
		for(Parked_Carowner_Details p:car) {
		System.out.println("Owner names of cars parked:"+ p.ownerName);}
	}
	static void get_parked_car_location(int token) {
		if(token==1) {
			System.out.println("Car Location : Floor 1, Section 2, Slot 12");
		}
		if(token==2) {
			System.out.println("Car Location : Floor 2, Section 3, Slot 14");
		}
		if(token==3) {
			System.out.println("Car Location : Floor 3, Section 1, Slot 20");
		}
		
	}
	public  static void main(String[] args) {
		add_new_car(p1);
		add_new_car(p2);
		add_new_car(p3);
		Scanner s= new Scanner(System.in);
		System.out.println("Enter your name");
		String n=s.nextLine();
		remove_car(n);
		System.out.println("Enter your token no.");
		int t=s.nextInt();
		get_parked_car_location(t);
		
		
		
		
	}
	
}
