package com.zsgs.flightreservation.login.userlogin.reserveflights;

public interface ReserveFlightViewControllerCallBack {
    void bookFlight(String passengerName, int passportNumber, int mobileNumber, String location, int flightID, String departureLocation, String arrivingLocation, int ticketsBooked,int takkalTickets, int bookingID, boolean isTakkal);

    void cancelFlight(int bookingID);

    void getTicket(int bookingID);

    void getFlightDetails();

    String getUserName();
}
