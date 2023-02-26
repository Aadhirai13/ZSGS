package com.zsgs.flightreservation.login.adminlogin.manageflights.addremoveflight;

public interface AddRemoveFlightControllerViewCallBack {
    void flightAddedSuccess(String addFlightSuccess);

    void flightAddedFailure(String addFlightFailure);

    void flightremovedSuccess(String removeFlightSuccess);

    void flightremovedFailure(String removeFlightFailure);
}
