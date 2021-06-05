package com.vm.session.TrainCaseStudy;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Scanner;

public class TicketApplication
{

	static Train check(int n,TrainDAO tr)
	{
    
	    
	    Train t=tr.findTrain(n);
	    if(t==null)
	    {
	    	System.out.println("Train with given train number does not exist");
	    	System.exit(1);
	    }
	    return t;
	}
	
	static void addPassengers()
	{
		Scanner sc=new Scanner(System.in);
		Passenger p;
		System.out.println("Enter Number of Passengers");
		int n=sc.nextInt();
		while(n>0)
		{
			Ticket t=new Ticket();
			System.out.println("Enter Passenger Name ");
			String name=sc.next();
			System.out.println("Enter Age ");
			int age=sc.nextInt();
			System.out.println("Enter Gender(M/F) ");
			char gender=sc.next().charAt(0);
			t.addPassenger(name, age, gender);
			n--;
		}
		
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
		
	
		//Checking Train  exists or not
		System.out.println("Enter the Train Number");
	    int n=sc.nextInt();
	    TrainDAO tr=new TrainDAO();
	    
	    Train t=check(n,tr);
	   
	    
	    //Checking Travel date exists or not
	    LocalDate today=LocalDate.now();
		System.out.println("Enter the Travel date in format(yyyy-mm-dd)");
		String str=sc.next();
		LocalDate ld=LocalDate.parse(str);

		if(!ld.isAfter(today))
		{
			System.out.println("Travel Date is before current date");
			System.exit(1);
		}
	
		//Adding Passengers
		addPassengers();	
		
		
	    }
}