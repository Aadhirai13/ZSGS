package com.zsgs.flightreservation.login.adminlogin.manageflights;

import java.util.ArrayList;

public interface ManageFlightsControllerViewCallBack {
    void showFlightDetails(ArrayList<String> flightDetails);

    void showPassengerDetails(ArrayList<String> passengerDetails);
}
