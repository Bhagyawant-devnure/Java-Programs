package com.nit.Exception_Test_24;


public interface TravelRoute {
	
	public  void bookTicket(int seats) throws InvaliRoutedException,SeatNotAvailableException;
	String getRouteDetails();
	int getAvailableSeats();

}
