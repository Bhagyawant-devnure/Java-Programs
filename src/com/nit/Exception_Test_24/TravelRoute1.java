package com.nit.Exception_Test_24;

// Importing custom exceptions


public class TravelRoute1 implements TravelRoute 
{
    private String routeName;
    private int totalSeats;
    private int availableSeats = 10;

    // Constructor: Initializes the route name and total seats
    public TravelRoute1(String routeName, int totalSeats) 
    {
        this.routeName = routeName;
        this.totalSeats = totalSeats;
        // Initially, all seats are available
    }

    public TravelRoute1() {
		// TODO Auto-generated constructor stub
	}

	// bookTicket: Books tickets if valid
    @Override
    public void bookTicket(int seats) throws InvaliRoutedException, SeatNotAvailableException 
    {
        if (seats <= 0) 
        {
            throw new InvaliRoutedException("Invalid number of seats");
        }
        else if (seats > availableSeats) 
        {
            throw new SeatNotAvailableException("Seats not available");
        }
        availableSeats -= seats; // Deduct booked seats from available seats
        System.out.println(seats + " tickets successfully booked for route " + routeName);
        System.out.println("Avalable seats are :"+availableSeats);
    }

    // getRouteDetails: Returns route name and seat availability
    @Override
    public String getRouteDetails() {
        return "Route Name: " + this.routeName + ", Available Seats: " + this.availableSeats;
    }

    // getAvailableSeats: Returns the number of available seats
    @Override
    public int getAvailableSeats() {
        return availableSeats;
    }
}
