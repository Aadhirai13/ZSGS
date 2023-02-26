package com.zsgs.flightreservation.login.adminlogin.manageflights.updateflight;

public interface UpdateFlightControllerModelCallBack {
    boolean isFlightIDValid(int flightID);

    void updateFlight(boolean flightName, boolean totalTickets, boolean ticketPrice,boolean takkalTickets,boolean takkalTicketPrice, boolean departureLocation, boolean arrivingLocation, int flightID, String updatingValue);
}
