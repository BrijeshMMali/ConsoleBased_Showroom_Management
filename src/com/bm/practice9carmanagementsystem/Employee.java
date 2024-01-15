package com.bm.practice9carmanagementsystem;

public class Employee extends Showroom implements birju{
	
    String empName;
	
	int empId;
	
	int empagae;
	
	String empDepartment;

	@Override
	public void setDetails() {
		// TODO Auto-generated method stub
		System.out.println("Enter Employee Details");
		
		System.out.println("Enter Employee Name");
		
		empName = sc.next();
		
		System.out.println("Enter Employee ID");
		
		empId = sc.nextInt();
		
		System.out.println("Enter Employee Age");
		
		empagae = sc.nextInt();
		
		System.out.println("Enter Employee Department");
		
		empDepartment = sc.next();
		
	}

	@Override
	public void getDetails() {
		// TODO Auto-generated method stub
		
		System.out.println("Employee Name: "+empName);
		
		System.out.println("Employee ID: "+empId);
		
		System.out.println("Employee Age: "+empagae);
		
		System.out.println("Employee Department: "+empDepartment);
		
	}
	
	

}
