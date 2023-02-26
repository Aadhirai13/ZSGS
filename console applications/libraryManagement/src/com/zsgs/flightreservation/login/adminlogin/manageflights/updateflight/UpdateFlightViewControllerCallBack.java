package com.zsgs.flightreservation.login.adminlogin.manageflights.updateflight;

public interface UpdateFlightViewControllerCallBack {
    boolean isFlightIDValid(int flightID);

    void updateFlight(boolean b, boolean b1, boolean b2, boolean b3, boolean b4, boolean b5, boolean b6, int flightID, String flightName);
}
