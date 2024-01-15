package com.bm.practice9carmanagementsystem;

import java.util.Scanner;

interface birju
{
	public void setDetails();
	
	public void getDetails();
}

public class Main {
	
	static void mainmenu() 
	{
		System.out.println("WELCOME TO CAR MANAGEMENT SYSTEM");
		
		System.out.println();
		
		System.out.println("ENTER YOUR CHOICE");
		
		System.out.println();
		
		System.out.println("1.Add Showroom\t\t\t 2.Add Employee\t\t\t 3.Add Car");
		
		System.out.println("4.Get Showroom\t\t\t 5.Get Employee\t\t\t 6.Get Car");
		
        System.out.println();
		
		System.out.println("Enter 0 to Exit");
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Showroom showroom[] = new Showroom[50];
		
		Employee employee[] = new Employee[50];
		
		Car car[] = new Car[50];
		
		int showroomcounter = 0;
		
		int employeecounter = 0;
		
		int carcounter = 0;
		
		int ch = 1000;
		
		while(ch!=0)
		{
			mainmenu();
			
			ch = sc.nextInt();
			
			while(ch!=0 && ch!=7)
			{
				switch(ch)
				{
				case 1:
					showroom[showroomcounter] = new Showroom();
					
					showroom[showroomcounter].setDetails();
					
                    System.out.println();
					
					System.out.println("1.Add Showroom");
					
					System.out.println("7.Go Back To MainMenu");
					
					ch = sc.nextInt();
					
					break;
					
				case 2:
					employee[employeecounter] = new Employee();
					
					employee[employeecounter].setDetails();
					
					System.out.println();
					
                    System.out.println("2.Add Employee");
					
					System.out.println("7.Go Back To MainMenu");
					
					ch = sc.nextInt();
					
					break;
					
				case 3:
					car[carcounter] = new Car();
					
					car[carcounter].setDetails();
					
					System.out.println();
					
					System.out.println("3.Add Car");
					
                    System.out.println("7.Go Back To MainMenu");
					
					ch = sc.nextInt();
					
					break;
					
				case 4:
					for(int i=0;i<showroomcounter;i++)
					{
						showroom[i].getDetails();
						
						System.out.println();
						
						System.out.println();
					}
					
					System.out.println("7]Go Back To MainMenu");
					
					System.out.println("0]To Exit");
					
					ch = sc.nextInt();
					
					break;
					
				case 5:
                    for (int i = 0; i < employeecounter; i++) 
                    {
                        employee[i].getDetails();
                        
                        System.out.println();
                        
                        System.out.println();
                    }
                    System.out.println();
                    
                    System.out.println("7]Go Back To MainMenu");
                    
                    System.out.println("0]To Exit");
                    
                    ch = sc.nextInt();
                    
                    break;
                    
                case 6:
                    for (int i = 0; i < carcounter; i++) {
                        car[i].getDetails();
                        System.out.println();
                        System.out.println();
                    }
                    System.out.println();
                    
                    System.out.println("7]Go Back To MainMenu");
                    
                    System.out.println("0]To Exit");
                    
                    ch = sc.nextInt();
                    
                    break;
                    
                    default:
                    	System.out.println("Enter valid choice");
                    	
                    	break;
				}
			}
		}
	}

}
