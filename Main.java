package BusReservationSystem;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Bus> buses = new ArrayList<Bus>(); //list of buses
		ArrayList<Booking> bookings = new ArrayList<Booking>(); //list of bookings
		
		//create new bus objects
		buses.add(new Bus(1,true,4)); 
		buses.add(new Bus(2,false,2));
		buses.add(new Bus(3,true,8));
		
		int choice =1;
		while(choice == 1) {
			System.out.println("-----Welcome to Bus Reservation----- ");
			System.out.println("        Enter the choice ");
			System.out.println("1 for booking and rest of us for exit");
			choice = sc.nextInt();
			
			System.out.println("           Bus details ");
			//System.out.println("     ___________");
			for(Bus b : buses) {
				b.BusInfo();
			}
			System.out.println();
			if(choice == 1) {
				Booking booking = new Booking();
				if(booking.isAvailable(bookings,buses)) {
					bookings.add(booking);
					System.out.println("Booking is confirmed");
					for(Booking b : bookings) {
				
					}
				}
				else
					System.out.println("Bus is full,try another bus or date");
			}
			else
				System.out.close();
		}

	}

}
