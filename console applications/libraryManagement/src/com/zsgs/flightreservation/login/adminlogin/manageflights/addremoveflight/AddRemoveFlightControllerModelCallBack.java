package com.zsgs.flightreservation.login.adminlogin.manageflights.addremoveflight;

public interface AddRemoveFlightControllerModelCallBack {
    void addFlight(int flightID, String flightName, int totalTickets, int ticketPrice,int takkalTickets,int takkalTicketPrice, String departureLocation, String arrivingLocation);

    void removeFlight(int flightID);
}
