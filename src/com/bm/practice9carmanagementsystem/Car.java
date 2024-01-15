package com.bm.practice9carmanagementsystem;

import java.util.Scanner;

public class Car extends Showroom implements birju{
	
	String car_name;
	
    String car_color;
    
    String car_fuel_type;
    
    int car_price;
    
    String car_type;
    
    String car_transmission;
    
    Scanner sc = new Scanner(System.in);
	
	@Override
	public void setDetails() {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
        System.out.println("======================= *** ENTER CAR DETAILS *** =======================");
        
        System.out.println();
        
        System.out.print("Car Name: ");
        
        car_name = sc.next();
        
        System.out.print(("Car Color: "));
        
        car_color = sc.nextLine();
        
        System.out.print("CAR FUEL TYPE(PETROL/DIESEL): ");
        
        car_fuel_type = sc.nextLine();
        
        System.out.print("Car Price: ");
        
        car_price = sc.nextInt();
//        sc.nextLine();
        System.out.print("CAR TYPE(SEDAN/SUV/HATCHBACK): ");
        
        car_type = sc.nextLine();
        
        System.out.print("TRANSMISSION TYPE(AUTOMATIC/MANUAL): ");
        
        car_transmission = sc.nextLine();
        
		carsinstock++;
		
	}
	
	@Override
	public void getDetails() {
		// TODO Auto-generated method stub
		System.out.println("Name: "+car_name);
		
        System.out.println("Color: "+car_color);
        
        System.out.println("Fuel Type: "+car_fuel_type);
        
        System.out.println("Price: "+car_price);
        
        System.out.println("Car Type: "+car_type);
        
        System.out.println("Transmission: "+car_transmission);
	}

}
