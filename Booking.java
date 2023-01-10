package BusReservationSystem;

import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Booking {
	String passengerName;
	int busNo;
	Date date;
	
	Scanner sc = new Scanner(System.in);
	
	public Booking(){
		System.out.println("Enter the name :");
		passengerName = sc.next();
		System.out.println("Enter the Bus number :");
		busNo = sc.nextInt();
		System.out.println("Enter the date dd-mm-yyyy : ");
		String dateInput = sc.next();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		try {
			date = dateFormat.parse(dateInput);		
	    }catch(ParseException e) {
	    	e.printStackTrace();
	 }
}
	

	public boolean isAvailable(ArrayList<Booking> bookings, ArrayList<Bus> buses) {
		// TODO Auto-generated method stub
		int capacity =0;
		for(Bus bus:buses) {      //check the bus capacity
		if(bus.getbusNo()== busNo) {
			capacity = bus.getCapacity();
		}
		}
		int booked =0;             
		for(Booking b : bookings) {      // check the same date and same bus
			if(b.busNo==busNo && b.date.equals(date))
				booked++;
			
		}
		return booked<capacity?true:false;
	}
}