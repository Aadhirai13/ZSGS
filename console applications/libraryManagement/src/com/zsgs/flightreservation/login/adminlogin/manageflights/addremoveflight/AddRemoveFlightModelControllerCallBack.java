package com.zsgs.flightreservation.login.adminlogin.manageflights.addremoveflight;

public interface AddRemoveFlightModelControllerCallBack {
    void flightAddedSuccess(String s);

    void flightAddedFailure(String s);

    void flightremovedSuccess(String s);

    void flightremovedFailure(String s);
}
