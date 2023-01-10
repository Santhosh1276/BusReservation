package BusReservationSystem;

public class Bus {
	private int busNo;
	private boolean Ac;
	private int capacity;
	
	public Bus(int busNo ,boolean Ac ,int capacity){
		this.busNo=busNo;
		this.Ac =Ac;
		this.capacity = capacity;
	}
	
	public int getbusNo() { //getter method - accessor method
		return busNo;
	}
	public boolean getAc() {
		return Ac;
	}
	public int getCapacity() {
		return capacity;
	}
	// setter method - mutator
	public void setCapacity(int cap) {
		capacity = cap;
		
	}
	public void setAc(boolean val) {
		Ac = val;
	}
	//Bus information for user
	public  void BusInfo() {
		System.out.println("Bus No : "+  busNo  +" |" + "  AC :"  +  Ac + " |" +  "  Capacity :" + capacity);
	}

}
