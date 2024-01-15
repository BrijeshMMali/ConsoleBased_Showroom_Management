package com.bm.practice9carmanagementsystem;

import java.util.Scanner;

public class Showroom implements birju {
	
	String showroomname;
	
	String showroomaddress;
	
	int totalemployee;
	
	int carsinstock = 0;
	
	String managername;
	
	Scanner sc = new Scanner(System.in);

	@Override
	public void setDetails() {
		// TODO Auto-generated method stub
		System.out.println("Enter Showroom details");
		
		System.out.println("Enter showroom name");
		
		showroomname = sc.next();
		
		System.out.println("Enter showroom address");
		
		showroomaddress = sc.next();
		
		System.out.println("Enter total number of employee");
		
		totalemployee = sc.nextInt();
		
		System.out.println("Enter cars in stock");
		
		carsinstock = sc.nextInt();
		
		System.out.println("Enter manager name");
		
		managername = sc.next();
		
		
	}

	@Override
	public void getDetails() {
		// TODO Auto-generated method stub
		
		System.out.println("Showroom Name: "+showroomname);
		
		System.out.println("Showroom Address: "+showroomaddress);
		
		System.out.println("Total Number of Employee: "+totalemployee);
		
		System.out.println("Cars in stock: "+carsinstock);
		
		System.out.println("Manager Name: "+managername);
		
	}

}
