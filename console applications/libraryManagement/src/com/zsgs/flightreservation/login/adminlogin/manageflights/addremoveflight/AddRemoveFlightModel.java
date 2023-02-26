package com.zsgs.flightreservation.login.adminlogin.manageflights.addremoveflight;

import com.zsgs.flightreservation.repository.AirlinesRepository;

public class AddRemoveFlightModel implements AddRemoveFlightControllerModelCallBack {

    private AddRemoveFlightModelControllerCallBack addRemoveFlightController;

    public AddRemoveFlightModel(AddRemoveFlightController addRemoveFlightController){
        this.addRemoveFlightController = addRemoveFlightController;
    }

    public void addFlight(int flightID , String flightName , int totalTickets , int ticketPrice , int takkalTickets,
                          int takkalTicketPrice, String departureLocation , String arrivingLocation){
        boolean addFlightInfo = AirlinesRepository.getInstance().addFlight(flightID,flightName,totalTickets,ticketPrice,takkalTicketPrice,takkalTickets,departureLocation,arrivingLocation);
        if(addFlightInfo)
            addRemoveFlightController.flightAddedSuccess("Flight with flight ID - " + flightID + " is added successfully");
        else
            addRemoveFlightController.flightAddedFailure("Flight with flight ID - " + flightID + " is already available");
    }

    public void removeFlight(int flightID){
        boolean removeFlightInfo = AirlinesRepository.getInstance().removeFlight(flightID);
        if(removeFlightInfo)
            addRemoveFlightController.flightremovedSuccess("Flight with flight ID - " + flightID + " is removed successfully");
        else
            addRemoveFlightController.flightremovedFailure("Flight with flight ID - " + flightID + " is not available");
    }
}
