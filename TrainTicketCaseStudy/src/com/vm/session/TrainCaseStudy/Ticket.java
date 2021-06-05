package com.vm.session.TrainCaseStudy;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Date;
import java.time.LocalDate;
import java.util.TreeMap;

public class Ticket 
{
  
	private int counter;
	private String pnr;
	private LocalDate travelDate;
	private Train train;
	static int count=1;
	private static TreeMap<Passenger,Integer> passengers=new TreeMap<Passenger,Integer>();
	
	public Ticket() {
		super();
	}

	public Ticket(LocalDate travelDate, Train train) {
		super();
		this.travelDate = travelDate;
		this.train = train;
	}

	static private String generatePNR()
	{
		
		return " BM_20170101_100";
	}
	
	private Double calcPassengerFare(Passenger passenger)
	{
        
		
		return 0.0;
	}
	public void addPassenger(String s,int i,char ch)
	{
		
		
		passengers.put(new Passenger(s,i,ch),count);
		count++;
	}
  
	private double calculateTotalTicketPrice()
	{
		return 0.0;
	}
	private StringBuilder generateTicket()
	{
		
		StringBuilder ticket=new StringBuilder(generatePNR());
		return ticket;
	}
	public void writeTicket() throws IOException
	{
	
		
		
		File f = new File("generatePNR().txt");
		FileWriter fr = new FileWriter(f,true);
		BufferedWriter br = new BufferedWriter(fr);
		
		
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public String getPnr() {
		return pnr;
	}

	public void setPnr(String pnr) {
		this.pnr = pnr;
	}

	public LocalDate getTravelDate() {
		return travelDate;
	}

	public void setTravelDate(LocalDate travelDate) {
		this.travelDate = travelDate;
	}

	public Train getTrain() {
		return train;
	}

	public void setTrain(Train train) {
		this.train = train;
	}

}
