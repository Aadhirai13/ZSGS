package com.zsgs.flightreservation.login.adminlogin.manageflights.updateflight;

import com.zsgs.flightreservation.repository.AirlinesRepository;

public class UpdateFlightModel implements UpdateFlightControllerModelCallBack{

    private UpdateFlightModelControllerCallBack updateFlightController;

    public UpdateFlightModel(UpdateFlightController updateFlightController){
        this.updateFlightController = updateFlightController;
    }

    public boolean isFlightIDValid(int flightID){
        return AirlinesRepository.getInstance().isFlightIDValid(flightID);
    }

    public void updateFlight(boolean flightName,boolean totalTickets,boolean ticketPrice,boolean takkalTickets,boolean takkalTicketPrice,boolean departureLocation,boolean arrivingLocation,int flightID,String updatingValue) {
        AirlinesRepository.getInstance().updateFlight(flightName,totalTickets,ticketPrice,takkalTickets,takkalTicketPrice,departureLocation,arrivingLocation,flightID,updatingValue);
    }

}
