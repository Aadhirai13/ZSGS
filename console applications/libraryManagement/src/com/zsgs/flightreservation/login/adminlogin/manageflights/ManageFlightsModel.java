package com.zsgs.flightreservation.login.adminlogin.manageflights;

import com.zsgs.flightreservation.repository.AirlinesRepository;

import java.util.ArrayList;

public class ManageFlightsModel implements ManageFlightsControllerModelCallBack{

    private ManageFlightsModelControllerCallBack manageFlightsController;

    public ManageFlightsModel(ManageFlightsController manageFlightsController){
        this.manageFlightsController = manageFlightsController;
    }

    public void getFlightDetails(){
        ArrayList<String> flightDetails = AirlinesRepository.getInstance().getFlightDetails();
        manageFlightsController.showFlightDetails(flightDetails);
    }

    public void getPassengerDetails(){
        ArrayList<String> passengerDetails = AirlinesRepository.getInstance().getPassengerDetails();
        manageFlightsController.showPassengerDetails(passengerDetails);
    }
}
