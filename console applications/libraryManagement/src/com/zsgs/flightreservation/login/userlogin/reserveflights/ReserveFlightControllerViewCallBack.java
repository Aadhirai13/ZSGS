package com.zsgs.flightreservation.login.userlogin.reserveflights;

import java.util.ArrayList;

public interface ReserveFlightControllerViewCallBack {
    void bookingSuccess(String[] s);

    void cancellingSuccess();

    void viewTicket(String ticketInfo);
    void showFlightDetails(ArrayList<String> flightDetails);
}
