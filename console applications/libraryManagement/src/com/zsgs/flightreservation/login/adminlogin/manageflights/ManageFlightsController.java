package com.zsgs.flightreservation.login.adminlogin.manageflights;

import java.util.ArrayList;

public class ManageFlightsController implements ManageFlightsViewControllerCallBack , ManageFlightsModelControllerCallBack {

    private ManageFlightsControllerViewCallBack manageFlightsView;
    private ManageFlightsControllerModelCallBack manageFlightsModel;

    public ManageFlightsController(ManageFlightsView manageFlightsView){
        this.manageFlightsView = manageFlightsView;
        manageFlightsModel = new ManageFlightsModel(this);
    }

    public void getFlightDetails(){
        manageFlightsModel.getFlightDetails();
    }

    public void getPassengerDetails(){
        manageFlightsModel.getPassengerDetails();
    }

    public void showFlightDetails(ArrayList<String> flightDetails){
        manageFlightsView.showFlightDetails(flightDetails);
    }

    public void showPassengerDetails(ArrayList<String> passengerDetails){
        manageFlightsView.showPassengerDetails(passengerDetails);
    }

}
